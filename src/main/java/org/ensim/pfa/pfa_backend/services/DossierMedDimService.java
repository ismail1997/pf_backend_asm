package org.ensim.pfa.pfa_backend.services;

import org.ensim.pfa.pfa_backend.model.CardioTrain;
import org.ensim.pfa.pfa_backend.model.DossierMedDim;
import org.ensim.pfa.pfa_backend.repositories.CardioTrainRepository;
import org.ensim.pfa.pfa_backend.repositories.DossierMedDimRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DossierMedDimService {
    private DossierMedDimRepository dossierMedDimRepository;

    public DossierMedDimService(DossierMedDimRepository dossierMedDimRepository) {
        this.dossierMedDimRepository = dossierMedDimRepository;
    }


    public Page<DossierMedDim> getAll(int page , int size){
        return this.dossierMedDimRepository.findAll(PageRequest.of(page,size));
    }
}
