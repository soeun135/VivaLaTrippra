package com.example.VivaLaTrip.Form;

import com.example.VivaLaTrip.Entity.Plan;
import com.example.VivaLaTrip.Entity.PlanTemp;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PlanTempRequestDto {
    private int plan_id;
    private int user_id;
    private boolean is_public;
    private int total_count;
    private String start_date;
    private String end_date;

    @Builder
    public PlanTempRequestDto(int user_id, boolean is_public, int total_count, String start_date, String end_date) {
        this.user_id = user_id;
        this.is_public = is_public;
        this.total_count = total_count;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public PlanTemp toEntity() {
        return PlanTemp.builder()
                .user_id(user_id)
                .is_public(is_public)
                .total_count(total_count)
                .start_date(start_date)
                .end_date(end_date)
                .build();
    }
}