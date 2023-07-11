package com.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author Will
 * @project LoginAssignment
 * @date 7/9/2023
 */
@AllArgsConstructor
@Getter
@ToString
@Setter
@Data
@NoArgsConstructor
@Entity
public class Student implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String studentName;
    private String password;
    private String emailAddress;
    private String phoneNumber;
    private String address;
    private Boolean gender;
    private Timestamp created_at;


    public Student(String studentName, String password, String emailAddress, String phoneNumber, String address, Boolean gender, Timestamp created_at) {
        this.studentName = studentName;
        this.password = password;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
        this.created_at = created_at;
    }



}
