package com.sandesh.prime.odd.impl;

import com.sandesh.prime.odd.OddclassService;
import org.springframework.stereotype.Component;

@Component
public class OddClassServiceImpl implements OddclassService {
    @Override
    public void printOddNumber(int start, int end) {
        for(int i= start; i<end; i++){
            if(i%2 == 1){
                System.out.println(i);
            }
        }
    }
}
