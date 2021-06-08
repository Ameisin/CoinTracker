package com.mbac.springboot.web.app.controllers;

import com.mbac.springboot.web.app.dto.CoinDTO;
import com.mbac.springboot.web.app.exception.NotFoundException;
import com.mbac.springboot.web.app.service.CoinsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@RestController
public class CoinsController {

    @Autowired
    CoinsService service;

    @GetMapping(value = "/getCoin", produces = MediaType.APPLICATION_JSON_VALUE)
    public CoinDTO getCoin(@RequestParam Integer id) throws NotFoundException, ExecutionException, InterruptedException {
        return service.getCoin(id);
    }

    @PostMapping(value = "/addCoin", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String addCoin(@RequestBody CoinDTO coin) throws ExecutionException, InterruptedException {
        return service.addCoin(coin);
    }

    @PutMapping(value = "/updateCoin", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String updateCoin(@RequestBody CoinDTO coin) throws NotFoundException, ExecutionException, InterruptedException {
        return service.updateCoin(coin);
    }

    @DeleteMapping(value = "/deleteCoin")
    public String deleteCoin(@RequestParam Integer id) throws NotFoundException, ExecutionException, InterruptedException {
        return service.deleteCoin(id);
    }

}