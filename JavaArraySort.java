/*
 * Intro to Java Assignment 5
 * Brett Gagnon
 * 10/13/2018
 * Source Code
 */
package javaarraysort;


//Import the java scanner utility
import java.util.Scanner;

public class JavaArraySort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        //variable to hold the size of the array
        int size;
        
        do{
             //Prompt user to enter a size between 3-10
             System.out.println("Enter the size of the array (3-10):");
            
             //Assign the value entered to variable size
             size = sc.nextInt();
            
             //if the size is less than 3 or geater than 10, prompt error message
             if (size < 3 || size > 10)
             {
                System.out.println("Invalid Entry!!"); 
            
             }
            
          // While the size is less than 1 or greater than 10, repeat the do-while  
        } while (size < 3 || size > 10);
        
            
       // Creates a local integer array of the requested size    
       int [ ]  newarray = new int [ size ];   
       
       //Call the fillArray method to read values into the array
       fillArray(newarray);
        
       //Call printArray to print the array (unsorted)
       System.out.println("\nThe unsorted values...");
       printArray(newarray);
       
        
       //Call the sortArray method to sort the array
       sortArray(newarray);
       
       //Call printArray to print the array (sorted)
       System.out.println("\nThe sorted values...");
       printArray(newarray);
        
    }
    
    //This method prompts the user to fill the array with values
    public static void fillArray(int[] array)
    {
        //Create a local scanner object
        Scanner sc = new Scanner(System.in);
        
        //Prompt user to enter the number of values within the array
        System.out.println("Enter " + array.length + " values");
        
        //Loop through array and assign a value to each individual element
        for (int n=0; n  < array.length; ++n) 
        {
            
            System.out.println("Enter a value for element " + n + ":");
         
            array[n] = sc.nextInt();
         
            
          
        }
        
    
    }
    
    //This method prints all the values in the parameter array
    public static void printArray(int[] array)
    {
    //Loop through array and print each individual element
        for (int n=0; n  < array.length; ++n)
        {
           System.out.println(array [n]); 
            
        }
    
    }
    
    //This method sorts the array
    public static void sortArray(int[] array)
    {
        //create boolean variable to compare array values
        boolean swapped;
        //loop through the entire array
        for (int n=0; n  < array.length; ++n)
             {
                 do
                 {
                     //set boolean variable swapped to false
                     swapped = false;
                 
                 //nested loop compares each pair of adjacent elements starting at array[n]
            for (int x = n + 1; x < array.length; x++) 
            {
                //if the element in the array is greater than the following element
                if (array[n] > array[x]) 
                {
                    //initialize a temp variable to hold an array element value
                    int temp;
                    
                    //swap the elements
                    temp = array[n];
                    array[n] = array[x];
                    array[x] = temp;
                    //set boolean variable swapped to true
                    swapped = true;
                }
            }
                 }while (swapped == true);
        }

        
        }
    
    }
    
    

