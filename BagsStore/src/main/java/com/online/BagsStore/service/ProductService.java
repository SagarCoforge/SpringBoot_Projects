package com.online.BagsStore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

import com.online.BagsStore.model.Product;
import com.online.BagsStore.repository.ProductRepository;

@Service
public class ProductService {
	 @Autowired
	    private ProductRepository productRepository;

	    public List<Product> getAllProducts() {
	        return productRepository.findAll();
	    }

	    public Product addProduct(Product product) {
	        return productRepository.save(product);
	    }
}
