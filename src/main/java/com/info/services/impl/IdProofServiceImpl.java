package com.info.services.impl;
import com.info.entities.IdProof;
import com.info.exception.IdProofNotFoundException;
import com.info.payload.IdProofDTO;
import com.info.repositories.IdProofRepository;
import com.info.services.IdProofService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.*;
@Service
public class IdProofServiceImpl implements IdProofService {

    private final IdProofRepository idProofRepository;

    @Autowired
    public IdProofServiceImpl(IdProofRepository idProofRepository) {
        this.idProofRepository = idProofRepository;
    }

    @Override
    public IdProofDTO updatePanCardNumber(Long id, String newPanCardNumber) {
        IdProof idProof = idProofRepository.findById(id)
                .orElseThrow(() -> new IdProofNotFoundException("IdProof with ID " + id + " not found"));

        idProof.setPanCardNumber(newPanCardNumber);

        IdProof updatedIdProof = idProofRepository.save(idProof);

        IdProofDTO  dto = new IdProofDTO();

        dto.setId(updatedIdProof.getId());

      dto.setPanCardNumber(updatedIdProof.getPanCardNumber());

        return dto ;

    }
}
