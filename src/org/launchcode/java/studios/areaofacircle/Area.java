package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static Double GetAreaMethod (Double radius){
        return radius*radius*3.14;

    }

    public static void main(String[] args) {
        double radius;

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter a radius to get the area of that circle");

        if (Input.hasNextDouble()) {
            radius = Input.nextDouble();
            System.out.println("The area of your circle: " + GetAreaMethod(radius));
        } else {
            System.out.println("Please type a number");
        }

        Input.close();
    }
}
