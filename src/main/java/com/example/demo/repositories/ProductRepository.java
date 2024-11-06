package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	@Query("SELECT obj FROM Product obj JOIN FETCH obj.categories WHERE obj IN :products")
	List<Product> findProductsCategories(List<Product> products);
}
