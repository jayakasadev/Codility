package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kasa2 on 3/7/2016.
 */
public class Password {
    public String password(String password){
        if(password.length() > 200){
            return null;
        }
        System.out.println("Start: " + password);

        //TODO password must have no numbers and atleast 1 uppercase letter
        //reg. expr ({Upper}+|({Alpha}{Punct})*
        //Pattern pattern = Pattern.compile("[\\p{Alpha}\\p{Punct}]*");
        //Pattern pattern = Pattern.compile("[A-Z]{1,}[\\p{Alpha}\\p{Punct}]*");
        Pattern pattern = Pattern.compile("\\D*[A-Z]{1,}\\D*");
        Matcher matcher = pattern.matcher(password);

        while(matcher.find()){
            System.out.println("Match: \"" + matcher.group() + "\"");
        }

        return null;
    }
}
