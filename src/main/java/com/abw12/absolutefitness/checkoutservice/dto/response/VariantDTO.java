package com.abw12.absolutefitness.checkoutservice.dto.response;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VariantDTO {

    @Id
    private String productId;
    private String variantId;
    private String variantName;
    private String variantValue;
    private String variantType;
//    private Long variantInventoryQuantity;
    private List<String> imageUrlList;
    private BigDecimal buyPrice;
    private BigDecimal onSalePrice;
    private OfferDTO offer;
}
