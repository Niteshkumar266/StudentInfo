package com.info.controller;

import com.info.payload.IdProofDTO;
import com.info.services.IdProofService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/idproof")
public class IdProofController {

    private final IdProofService idProofService;

    @Autowired
    public IdProofController(IdProofService idProofService) {
        this.idProofService = idProofService;
    }
//http://localhost:8080/api/idproof/1/pancardnumber
    @PutMapping("/{id}/pancardnumber")
    public ResponseEntity<IdProofDTO> updatePanCardNumberById(
            @PathVariable Long id,
            @RequestBody IdProofDTO dto) {

        IdProofDTO idProofDTO = idProofService.updatePanCardNumber(id, dto.getPancardnumber());
        return ResponseEntity.ok(idProofDTO);

    }
}
