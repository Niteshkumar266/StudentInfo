package com.info.payload;
 import lombok.Data;

@Data
public class IdProofDTO {
    private Long id;
    private String panCardNumber;

   public String getPancardnumber() {
       return panCardNumber ;

   }

   }
