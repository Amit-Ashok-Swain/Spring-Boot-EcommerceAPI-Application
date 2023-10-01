package com.geektser.weeklytest.project.EcommerceAPIApplication.Repository;

import com.geektser.weeklytest.project.EcommerceAPIApplication.Model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends JpaRepository<Orders, Integer> {
}
