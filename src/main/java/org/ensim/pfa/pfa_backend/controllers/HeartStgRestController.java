package org.ensim.pfa.pfa_backend.controllers;

import org.ensim.pfa.pfa_backend.model.HeartStg;
import org.ensim.pfa.pfa_backend.services.HeartStgService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/heart_stg")
public class HeartStgRestController {

    private final HeartStgService heartStgService;

    public HeartStgRestController(HeartStgService heartStgService) {
        this.heartStgService = heartStgService;
    }

    @GetMapping
    public Page<HeartStg> getAll(@RequestParam(name = "page", defaultValue = "0") int page,
                                 @RequestParam(name = "size", defaultValue = "20") int size) {
        return heartStgService.getAll(page, size);
    }
}
