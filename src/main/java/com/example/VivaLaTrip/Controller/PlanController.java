package com.example.VivaLaTrip.Controller;

import antlr.build.Tool;
import com.example.VivaLaTrip.Entity.Places;
import com.example.VivaLaTrip.Form.PlanResponseDto;
import com.example.VivaLaTrip.Form.PlanSaveRequestDto;
import com.example.VivaLaTrip.Form.PlanTempRequestDto;
import com.example.VivaLaTrip.Form.PlanUpdateRequestDto;
import com.example.VivaLaTrip.Service.PlanService;
import com.example.VivaLaTrip.Service.PlanTempService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.exceptions.UnirestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Controller
public class PlanController {
    private final PlanService planService;
    private final PlanTempService planTempService;

    @Autowired
    public PlanController(PlanService planService, PlanTempService planTempService) {
        this.planService = planService;
        this.planTempService = planTempService;
    }

    @PostMapping("/plan_savepro")
    public String save(PlanSaveRequestDto requestDto){
//        PlanSaveRequestDto requestDto = new PlanSaveRequestDto(title, content, author, place_list);
//        System.out.println("@RequestParam으로 받은 content"+content);
        planService.save(requestDto);
        return "public_plan";
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PlanUpdateRequestDto requestDto){
        return planService.update(id,requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PlanResponseDto findById (@PathVariable Long id){
        return  planService.findById(id);
    }

    @DeleteMapping("/api/v1/posts/{id}")
    public Long delete(@PathVariable Long id){
        planService.delete(id);
        return id;
    }

    @PostMapping("/api/makeSchedule")
    public long makeSchedule(@RequestBody List<Places> a){
        //db에 넣어줘야함
        PlanTempRequestDto planTempRequestDto = new PlanTempRequestDto();
        log.info("front에서 받은 값"+ a.get(0));


        planTempRequestDto.
        planTempRequestDto.setUser_id(123);
        planTempRequestDto.setStart_date("20200401");
        planTempRequestDto.setEnd_date("20200404");

        return planTempService.save(planTempRequestDto);
    }

    @PostMapping("/api/mySchedule")
    public long mySchedule(){
        //db의 데이터를 front로 쏴야함
        return 0;
    }
}
