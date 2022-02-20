package com.sangh.codegtr.service;

import com.sangh.codegtr.entity.Village;
import com.sangh.codegtr.entity.panchayat;
import com.sangh.codegtr.repo.VillageRepo;
import com.sangh.codegtr.repo.panchayatRepo;
import com.sangh.codegtr.response.TestResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class panchayatService {
    private  final panchayatRepo panchayatRepo;


    public  TestResponse addpanchayat(panchayat panchayat) {
        panchayat responsepanchayat = panchayatRepo.save(panchayat);
        return new TestResponse(responsepanchayat, 1, responsepanchayat.getName() + " panchayat added!");
    }

    public TestResponse addpanchayats(List<panchayat> panchayats) {
        List<panchayat> responsepanchayat = panchayatRepo.saveAll(panchayats);
        return new TestResponse(responsepanchayat, 1, "panchayat added!");
    }


}
