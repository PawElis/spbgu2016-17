package com.exigenservices.lectures.tags;

import java.util.Random;

/**
 * Created by master on 29.11.2016.
 */
public class Check  {

    public static boolean check(String number){
        Random x = new Random();
        int x1=x.nextInt(99)+1;
        if (Integer.parseInt(number)!=x1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public static boolean correct(String number){
        int i=Integer.parseInt(number);
        if ((i>=1)&&(i<=100))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
