package com.example.VivaLaTrip.Service;

import com.example.VivaLaTrip.Entity.Places;
import com.example.VivaLaTrip.Entity.PlanTemp;
import com.example.VivaLaTrip.Form.PlanTempRequestDto;
import com.example.VivaLaTrip.Repository.PlanTempRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service //스프링빈 컨테이너에 등록
public class PlanTempService {
    private final PlanTempRepository planTempRepository;

   /* public List<PlanTemp> checkedListParsing(String word) {
        return List<?>;
    }*/
    @Transactional
    public long save(PlanTempRequestDto planTempRequestDto)
    {
        return planTempRepository.save(planTempRequestDto.toEntity()).getPlan_id();

    }
   // public List<PlanTemp> MapParsingDB(String word) {

        //List<PlanTemp> bodyJson = planTempRepository.findById(word);
//      log.info("데베에서 뽑아온 Places값 :"+bodyJson.toString());

      //  return bodyJson;
   // }
}
