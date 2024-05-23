package org.ensim.pfa.pfa_backend.controllers.views_controllers;

import org.ensim.pfa.pfa_backend.model.views.MySecondDbtModel;
import org.ensim.pfa.pfa_backend.services.views_services.MySecondDbtModelService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/my_second_dbt_model")
public class MySecondDbtModelRestController {
    private final MySecondDbtModelService mySecondDbtModelService;

    public MySecondDbtModelRestController(MySecondDbtModelService mySecondDbtModelService) {
        this.mySecondDbtModelService = mySecondDbtModelService;
    }

    @GetMapping
    public Page<MySecondDbtModel> getAllMySecondDbtModels(@RequestParam(name = "page", defaultValue = "0") int page,
                                                          @RequestParam(name = "size", defaultValue = "20") int size) {
        return this.mySecondDbtModelService.getAllMySecondDbtModels(page, size);
    }
}
