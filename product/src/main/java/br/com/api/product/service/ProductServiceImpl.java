package br.com.api.product.service;

import br.com.api.product.model.request.ProductRequest;
import br.com.api.product.model.response.ProductResponse;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
    @Override
    public ProductResponse create(ProductRequest productRequest) {
        return null;
    }
}
