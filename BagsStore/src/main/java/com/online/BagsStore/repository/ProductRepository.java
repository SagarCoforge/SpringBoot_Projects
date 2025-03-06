package com.online.BagsStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.BagsStore.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
