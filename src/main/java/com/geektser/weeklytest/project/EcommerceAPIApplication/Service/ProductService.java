package com.geektser.weeklytest.project.EcommerceAPIApplication.Service;

import com.geektser.weeklytest.project.EcommerceAPIApplication.Model.Product;
import com.geektser.weeklytest.project.EcommerceAPIApplication.Model.ProductCategory;
import com.geektser.weeklytest.project.EcommerceAPIApplication.Repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    IProductRepo iProductRepo;

    public String addAProduct(Product product){
        iProductRepo.save(product);
        return "Product added :) !";
    }

    public List<Product> getProducts(){
       return (List<Product>) iProductRepo.findAll();
    }

    public Optional<Product> getProduct(Integer id){
        return iProductRepo.findById(id);
    }

    public List<Product> getProductByCategory(ProductCategory category){
        return iProductRepo.findByProductCategory(category);
    }

    public String addListOfProducts(List<Product> products){
        iProductRepo.saveAll(products);
        return "Products are added :) !";
    }

    public String deleteProductById(Integer id){
        iProductRepo.deleteById(id);
        return "Product removed !";
    }

}
