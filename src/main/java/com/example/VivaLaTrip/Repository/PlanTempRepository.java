package com.example.VivaLaTrip.Repository;

import com.example.VivaLaTrip.Entity.Places;
import com.example.VivaLaTrip.Entity.PlanTemp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlanTempRepository extends JpaRepository<PlanTemp, Integer> {

    //    @Override
    //List<PlanTemp> findById(String word);
    //    @Override

    //PlanTemp save(PlanTemp planTemp);
}
