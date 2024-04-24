package org.ensim.pfa.pfa_backend.controllers;

import org.ensim.pfa.pfa_backend.model.Heart;
import org.ensim.pfa.pfa_backend.services.HeartService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/heart")
public class HeartRestController {

    private final HeartService heartService;

    public HeartRestController(HeartService heartService) {
        this.heartService = heartService;
    }

    @GetMapping
    public Page<Heart> getAll(@RequestParam(name = "page", defaultValue = "0") int page,
                              @RequestParam(name = "size", defaultValue = "20") int size) {
        return heartService.getAll(page, size);
    }
}
