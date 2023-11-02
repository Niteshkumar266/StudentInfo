package com.info.services;

import com.info.payload.IdProofDTO;

public interface IdProofService {
    public IdProofDTO updatePanCardNumber(Long id, String newPanCardNumber);
}
