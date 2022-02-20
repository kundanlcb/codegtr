package com.sangh.codegtr.controller;

import com.sangh.codegtr.entity.Village;
import com.sangh.codegtr.entity.panchayat;
import com.sangh.codegtr.request.User;
import com.sangh.codegtr.response.TestResponse;
import com.sangh.codegtr.service.VillageService;
import com.sangh.codegtr.service.panchayatService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class MainController {

    private final VillageService villageService;
    private final panchayatService panchayatService;

    @GetMapping("/test")
    public TestResponse testApp(){
        System.out.println("i am called");
        return new TestResponse("",0,"Hello i am working");
    }

    @PostMapping("/save")
    public TestResponse testPost(@RequestBody User user){
        return new TestResponse("",0,user.getName()+" has been created");
    }

    @PostMapping("/savevillage")
    public TestResponse saveVillage(@RequestBody Village village){
        return villageService.addVillage(village);
    }

    @PostMapping("/savevillages")
    public TestResponse saveVillages(@RequestBody List<Village> villages){
        return villageService.addVillages(villages);
    }

    @PostMapping("/savepanchayat")
    public TestResponse savepanchayat(@RequestBody panchayat panchayat){
        return panchayatService.addpanchayat(panchayat);
    }

    @PostMapping("/savepanchayats")
    public TestResponse savepanchayats(@RequestBody List<panchayat> panchayats){
        return panchayatService.addpanchayats(panchayats);
    }


}
