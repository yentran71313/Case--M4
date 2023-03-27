package com.spbproductmanagementjwt.product;

import com.spbproductmanagementjwt.service.IGeneralService;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

public interface IProductService extends IGeneralService<Product> {

    Optional<Product> findByIdAndDeletedIsTrue(Long id);

    List<ProductResponseDTO> findAllProductResponseDTOByDeleteIsFalse();

    List<ProductResponseDTO> findAllProductResponseDTOByDeleteIsTrue();

    Product createWithMedia(ProductCreateDTO productCreateDTO, MultipartFile file);

    Product createWithOutMedia(ProductCreateDTO productCreateDTO);

    List<ProductResponseDTO> findAllProductResponseDTO();
}
