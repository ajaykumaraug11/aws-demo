package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

	Product findOne(Long id);

	void delete(Long id);


}