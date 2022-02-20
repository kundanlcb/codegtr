package com.sangh.codegtr.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class TestResponse {
    Object data;
    int status;
    String msg;
}
