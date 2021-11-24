package br.com.api.product.ws.v1;

import br.com.api.product.model.request.ProductRequest;
import br.com.api.product.model.response.ProductResponse;
import br.com.api.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<ProductResponse> create(@RequestBody ProductRequest productRequest){
        return ResponseEntity.ok(productService.create(productRequest));
    }
}
