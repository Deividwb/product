package br.com.api.product.service;

import br.com.api.product.model.request.ProductRequest;
import br.com.api.product.model.response.ProductResponse;
import br.com.api.product.persistence.entity.Product;
import br.com.api.product.persistence.repository.ProductRepository;
import br.com.api.product.service.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import static org.springframework.util.Assert.*;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private Mapper<ProductRequest, Product> requestMapper;

    @Autowired
    private Mapper<Product,ProductResponse> responseMapper;

    @Override
    public ProductResponse create(ProductRequest productRequest) {
        notNull(productRequest,"Request Inválida");
        Product product = this.requestMapper.map(productRequest);
        return productRepository.saveAndFlush(product).map((Product input) -> this.responseMapper.map(input));
    }
}
