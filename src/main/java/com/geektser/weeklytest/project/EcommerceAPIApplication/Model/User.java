package com.geektser.weeklytest.project.EcommerceAPIApplication.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String userName;
    private String UserEmail;

    private String userPassword;

    private String userPhoneNo;

    @OneToOne
    @JoinColumn(name = "fk_Address_Id")
    private Address address;
}
/*User Model:
   Id:integer
    name:string
    email:string
   password:string
   phoneNumber:string*/