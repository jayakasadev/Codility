package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by kasa2 on 3/7/2016.
 */
public class RandomRules {
    private static final String R1 = "AB";
    private static final String R2 = "BA";
    private static final String R3 = "CB";
    private static final String R4 = "BC";
    private static final String R5 = "AA";
    private static final String R6 = "CC";

    public String matches (String s){
        //System.out.println(s);
        List<Integer> list  = Arrays.asList(1,2,3,4,5,6);
        Collections.shuffle(list);
        int noMatch = 0;

        while(noMatch < 6){
            noMatch = 0;
            if(s.indexOf(R1) > -1){
                //System.out.println(R1);
                s = s.replace(R1, "AA");
            }
            else
                noMatch++;
            if(s.indexOf(R2) > -1){
                //System.out.println(R2);
                s = s.replace(R2, "AA");
            }
            else
                noMatch++;
            if(s.indexOf(R3) > -1){
                //System.out.println(R3);
                s = s.replace(R3, "CC");
            }
            else
                noMatch++;
            if(s.indexOf(R4) > -1){
                //System.out.println(R4);
                s = s.replace(R4, "CC");
            }
            else
                noMatch++;
            if(s.indexOf(R5) > -1){
                //System.out.println(R5);
                s = s.replace(R5, "A");
            }
            else
                noMatch++;
            if(s.indexOf(R6) > -1){
                //System.out.println(R6);
                s = s.replace(R6, "C");
                break;
            }
            else
                noMatch++;
        }
        return s;
    }

}
