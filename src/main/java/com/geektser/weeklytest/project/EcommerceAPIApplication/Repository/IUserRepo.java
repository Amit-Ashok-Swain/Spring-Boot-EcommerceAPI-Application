package com.geektser.weeklytest.project.EcommerceAPIApplication.Repository;

import com.geektser.weeklytest.project.EcommerceAPIApplication.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User, Integer> {
}
