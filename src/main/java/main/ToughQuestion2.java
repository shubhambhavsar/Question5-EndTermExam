package main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class ToughQuestion2 {
            public static void main(String[] args) throws NumberFormatException, IOException {
                       Integer bread;
                        Integer butter;
                       Integer jam;
                        double energy;
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        Calories cal=new Calories();
                        System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
                        System.out.println("Enter the choice");
                        Integer choice = Integer.parseInt(br.readLine());
                        switch(choice)
                        {
                        case 1 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	Calories obj = new Calories();
                        	energy = obj.calculateCalories(bread) * 4.18;
                        	//call the function which calculate the calories for only bread
                        	System.out.println(energy+" kJ of energy generated from "+obj.calculateCalories(bread)+" calories");
                        	break;
                        case 2 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	Calories obj1 = new Calories();
                        	energy = obj1.calculateCalories(bread,jam) * 4.18;
                        	//call the function which calculate the calories for only bread & jam
                        	System.out.println(energy+" kJ of energy generated from "+obj1.calculateCalories(bread,jam)+" calories");
                        	break;
                        case 3 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Butter");
                        	butter = Integer.parseInt(br.readLine());
                        	Calories obj2 = new Calories();
                        	energy = obj2.calculateCalories(bread,jam,butter) * 4.18;
                        	//call the function which calculate the calories for  bread,jam & butter
                        	System.out.println(energy+" kJ of energy generated from "+obj2.calculateCalories(bread,jam,butter)+" calories");
                        	break;
                        }
                        //System.out.printf("%.3f",ca.calculateEnergy());
                        //System.out.println(" kJ of energy generated from "+ca.returnCalories()+" calories");
            }
}
class Calories {
            
            int calculateCalories(int bread) {
            //you have to overload this function for three parameters refer the question
            	  int m = bread*74;
            	 
            	return m;	
            }
            int calculateCalories(int bread,int jam) {
            	int n = (bread*74) + ( jam*26) ;
            	return n;
            }
            int calculateCalories(int bread,int jam,int butter) {
            	int s = (bread*74) + (jam*26) + (butter*102) ;
            	return s;
            }
            
            
            
            
}