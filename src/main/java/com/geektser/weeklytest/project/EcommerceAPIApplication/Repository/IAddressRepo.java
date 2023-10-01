package com.geektser.weeklytest.project.EcommerceAPIApplication.Repository;

import com.geektser.weeklytest.project.EcommerceAPIApplication.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IAddressRepo extends JpaRepository<Address, Integer> {
}
