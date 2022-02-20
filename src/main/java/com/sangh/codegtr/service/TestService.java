package com.sangh.codegtr.service;

import com.sangh.codegtr.response.TestResponse;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    public TestResponse saveVillage(){
        return new TestResponse("",9,"");
    }
}
