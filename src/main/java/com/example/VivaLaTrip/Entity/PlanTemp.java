package com.example.VivaLaTrip.Entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class PlanTemp extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plan_id")
    private Long plan_id;

    @OneToOne(mappedBy = "plan")
    private PublicPlan publicPlan;

    @ManyToOne
    private UserInfo userInfo;

    @Column(name = "is_public",nullable = false)
    private boolean is_public;

    @Column(name = "total_count",nullable = false)
    private int total_count;

    @Column(name = "start_date",nullable = false)
    private String start_date;

    @Column(name = "end_date",nullable = false)
    private String end_date;

    @Builder
    public PlanTemp( boolean is_public, int total_count, String start_date, String end_date)
    {
        this.is_public = is_public;
        this.total_count = total_count;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public PlanTemp() {

    }
}
