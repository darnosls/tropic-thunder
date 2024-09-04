package com.store.texugoTshirts.repository;

import com.store.texugoTshirts.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>
{
}
