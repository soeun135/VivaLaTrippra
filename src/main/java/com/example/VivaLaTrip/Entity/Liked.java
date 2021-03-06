package com.example.VivaLaTrip.Entity;

import lombok.Data;
import org.apache.catalina.User;

import javax.persistence.*;

@Entity
public class Liked extends BaseTimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num;

    @ManyToOne
    private UserInfo userInfo;

    @ManyToOne
    private PlanTemp planTemp;

}