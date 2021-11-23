package br.com.api.product.service.mapper;

import br.com.api.product.model.request.ProductRequest;
import br.com.api.product.persistence.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductRequestMapper implements Mapper<ProductRequest, Product>{
    @Override
    public Product map(ProductRequest input) {
        if (input == null){
            return null;
        }
        Product product = new Product();
        product.setName(input.getName());
        product.setPrice(input.getPrice());

        return product;
    }
}
