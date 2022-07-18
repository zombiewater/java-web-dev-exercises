package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter a radius to get the area of that circle");

        radius = Input.nextDouble();
        Input.close();
        System.out.println("The area of your circle: " + radius*radius*3.14);
    }
}
