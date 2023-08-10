package org.launchcode;
import java.util.Scanner;
public class Area {
        public static void main(String[] args){
            double radius;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a radius");
             radius = input.nextDouble();
        }
        public static double getArea(double radius){
            return 3.14 * radius * radius;
        }
}
