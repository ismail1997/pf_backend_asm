package org.ensim.pfa.pfa_backend.controllers.security;


import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.jose.jws.MacAlgorithm;
import org.springframework.security.oauth2.jwt.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/auth")
public class SecurityController {

    private AuthenticationManager authenticationManager;
    private JwtEncoder jwtEncoder;
    public SecurityController(AuthenticationManager authenticationManager, JwtEncoder jwtEncoder) {
        this.authenticationManager = authenticationManager;
        this.jwtEncoder = jwtEncoder;
    }

    @GetMapping("/profile")
    public Authentication authentication(Authentication authentication){
        return authentication;
    }


    @PostMapping("/login")
    public Map<String,String> login(String username , String password){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));

        Instant instant = Instant.now();
        String scope = authentication.getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(Collectors.joining(" "));
        JwtClaimsSet jwtClaimsSet = JwtClaimsSet.builder()
                .issuedAt(instant)
                .expiresAt(instant.plus(20, ChronoUnit.MINUTES)) // le token va expiré dans 20 minutes
                .subject(username)
                .claim("scope",scope)
                .build();

        JwtEncoderParameters jwtEncoderParameters =
                JwtEncoderParameters.from(
                        JwsHeader.with(MacAlgorithm.HS256).build(),
                        jwtClaimsSet
                );
        Jwt jwt = jwtEncoder.encode(jwtEncoderParameters);

        return Map.of("access-token",jwt.getTokenValue());
    }

}
