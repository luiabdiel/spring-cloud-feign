package com.example.demo.client;

import com.example.demo.model.State;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "ibge-client", url = "https://servicodados.ibge.gov.br/api/v1")
public interface IbgeClient {

    @RequestMapping(method = RequestMethod.GET, value = "/localidades/estados")
    List<State> getStats();
}
