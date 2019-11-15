package com.company.partA;

import java.util.regex.*;



class Aq3
{
    private static final String REGEX = "dog";
    private static final String INPUT = "dog in doggdog";
    
    public static void main(String[] args)
    {

        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);
        System.out.println(p);

        int count =0;

        while(m.find())
        {
            count++;
            System.out.println("Match Number : "+count);
            System.out.println("Start index : "+m.start());
        }

        if(count == 0 )
            System.out.println("No matches found");

        System.out.println(Pattern.matches(".*ab","aefnab"));



    }
}
