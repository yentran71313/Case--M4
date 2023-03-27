package com.spbproductmanagementjwt.customer;

import com.spbproductmanagementjwt.locationregion.LocationRegionDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.math.BigDecimal;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class CustomerResponseDTO {

    private Long id;

    private String fullName;

    private String email;

    private String phone;

    private LocationRegionDTO locationRegion;

    private BigDecimal balance;
}
