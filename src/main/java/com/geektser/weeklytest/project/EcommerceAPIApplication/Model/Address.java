package com.geektser.weeklytest.project.EcommerceAPIApplication.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    private String addressName;
    private String addressLandMark;
    private String addressState;
    private String addressPhoneNumber;
    private String addressZipCode;

    @ManyToOne()
    @JoinColumn(name = "fk_user_id")
    private User user;



}
   /* Address Model:
        id:integer
        name:string
        landmark:string
        phoneNumber:string
        zipcode:string
        state:string
        UserID : foreign key mapping*/