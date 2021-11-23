package br.com.api.product.service.mapper;

import br.com.api.product.model.response.ProductResponse;
import br.com.api.product.persistence.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductResponseMapper implements Mapper<Product, ProductResponse>{
    @Override
    public ProductResponse map(Product input) {
        if (input == null){
            return null;
        }
        ProductResponse productResponse = new ProductResponse();

        productResponse.setId(input.getId());
        productResponse.setName(input.getName());
        productResponse.setPrice(input.getPrice());

        return productResponse;
    }
}
