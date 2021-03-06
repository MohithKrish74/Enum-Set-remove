package com.keyword;


import java.util.EnumSet;

enum Sports{CRICKET,HOCKEY,BASEBALL,FOOTBALL,VOLLEYBALL}

public class EnumSetRemove
{

    public static void main(String[] args)
    {
        EnumSet<Sports> set = EnumSet.allOf(Sports.class);
        System.out.println("Before :");
        System.out.println("The Set is "+set);
        System.out.println("---------------------------------------------");
        set.remove(Sports.HOCKEY);
        System.out.println("After :");
        System.out.println("The Set is "+set);
        System.out.println("---------------------------------------------");
    }
}
