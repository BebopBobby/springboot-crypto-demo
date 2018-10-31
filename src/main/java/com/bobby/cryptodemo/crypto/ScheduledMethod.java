package com.bobby.cryptodemo.crypto;

import com.bobby.cryptodemo.CryptoDemoApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ScheduledMethod {
    private static final Logger log = LoggerFactory.getLogger(CryptoDemoApplication.class);

    @Scheduled(fixedRate = 5000)
    public void printJoke(){
        RestTemplate restTemplate = new RestTemplate();
        Crypto crypto = restTemplate.getForObject("https://api.cryptonator.com/api/ticker/btc-usd", Crypto.class);
        log.info(crypto.toString());
    }
}
