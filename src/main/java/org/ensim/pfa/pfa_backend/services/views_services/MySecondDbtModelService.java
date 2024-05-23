package org.ensim.pfa.pfa_backend.services.views_services;

import org.ensim.pfa.pfa_backend.model.views.MySecondDbtModel;
import org.ensim.pfa.pfa_backend.repositories.views_repositories.MySecondDbtModelRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MySecondDbtModelService {
    private final MySecondDbtModelRepository mySecondDbtModelRepository;

    public MySecondDbtModelService(MySecondDbtModelRepository mySecondDbtModelRepository) {
        this.mySecondDbtModelRepository = mySecondDbtModelRepository;
    }

    public Page<MySecondDbtModel> getAllMySecondDbtModels(int page, int size) {
        return this.mySecondDbtModelRepository.findAll(PageRequest.of(page, size));
    }
}
