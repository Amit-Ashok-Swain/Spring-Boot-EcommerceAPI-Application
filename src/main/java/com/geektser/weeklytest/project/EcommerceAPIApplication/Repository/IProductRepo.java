package com.geektser.weeklytest.project.EcommerceAPIApplication.Repository;

import com.geektser.weeklytest.project.EcommerceAPIApplication.Model.Product;
import com.geektser.weeklytest.project.EcommerceAPIApplication.Model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IProductRepo extends JpaRepository<Product, Integer> {
    List<Product> findByProductCategory(ProductCategory category);
}
