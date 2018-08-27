/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeoverload;

import java.util.Scanner;

/**
 *
 * @author parke
 */
public class ShapeOverload {
     
        
     public double calcArea (double base,double height){
        
   return 0.5 * base * height;
        
    }
    
     
     public double calcArea(double r){
         
         
         return (22/7)*r*r;
     }
     
     
     public double calcArea(double length, double width , String x){
         
         return length * width;
     }
     
     
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double height;
        double base;
        double length;
        double width;
        double r;
        
        System.out.println("Please enter the height of the shape");
        height = input.nextDouble();
        System.out.println("Please enter the base of the shape");
        base = input.nextDouble();
        System.out.println("Please enter the length of the shape");
        length = input.nextDouble();
        System.out.println("Please enter the width of the shape");       
        width = input.nextDouble();
        System.out.println("Please enter the radius of the shape");
        r = input.nextDouble();
        
        ShapeOverload shape = new ShapeOverload();
        
        System.out.println("The area of a triangle is:"+ shape.calcArea(base, height));
        System.out.println("The area of a rectangle is:"+shape.calcArea(length, width, null));
        System.out.println("The area of the circle is:"+shape.calcArea(r));
        
        
    }
    
}
