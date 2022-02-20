package com.sangh.codegtr.service;

import com.sangh.codegtr.entity.Village;
import com.sangh.codegtr.repo.VillageRepo;
import com.sangh.codegtr.response.TestResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class VillageService {

    private final VillageRepo villageRepo;


    public TestResponse addVillage(Village village){
       Village responseViilage= villageRepo.save(village);
        return new TestResponse(responseViilage,1,responseViilage.getName()+" Village added!");
    }

    public TestResponse addVillages(List<Village> villages){
        List<Village> responseViilage= villageRepo.saveAll(villages);
        return new TestResponse(responseViilage,1,"Village added!");
    }
}
