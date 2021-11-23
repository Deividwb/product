package br.com.api.product.service;

import br.com.api.product.model.request.ProductRequest;
import br.com.api.product.model.response.ProductResponse;

public interface ProductService {

    ProductResponse create(ProductRequest productRequest);
}
