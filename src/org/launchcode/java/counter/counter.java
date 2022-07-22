package org.launchcode.java.counter;

import java.util.ArrayList;

public class counter {

    public static void main(String[] args) {
        String mystring = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = mystring.toCharArray();
        ArrayList<Character> logchar = new ArrayList<>();
        ArrayList<Number> lognumber = new ArrayList<>();

        for (int i = 0; i < charactersInString.length; i++) {
            logchar.add(mystring.charAt(i));
            lognumber.add(i);
            System.out.println(lognumber.get(i) + ", " + logchar.get(i));
        }


    }
}
