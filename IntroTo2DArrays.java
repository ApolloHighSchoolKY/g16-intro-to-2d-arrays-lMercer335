import java.util.Arrays;

public class IntroTo2DArrays{
  public static void main(String[] args)
  {
    int[][] ray = new int[2][3];
                       //row,col//
    ray[0][0] = 1;
    ray[0][1] = 2;
    ray[0][2] = 3;
    ray[1][0] = 4;
    ray[1][1] = 5;
    ray[1][2] = 6;

    /*
      1 2 3 
      4 5 6
     */
    System.out.println(Arrays.toString(ray));

    //Print the first array in the array ray

    System.out.println(Arrays.toString(ray[0]));
    System.out.println(Arrays.toString(ray[1]));

    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }

    //change every value in the 2D array to 7
    //you must use loops(S)

    //ray[#].length represnts the number of columns in each array in the array
    //  or what size is the 

    for(int row=0; row<ray.length; row++)
      for(int col=0; col<ray[row].length; col++)
      {
        ray[row][col] = 7;
      }
    
      //fill the array with random number from 0-10 incusive

      for(int row=0; row<ray.length; row++)
        for(int col=0; col<ray[row].length; col++)
          {
           ray[row][col] = (int)(Math.random()*11 + 0);
          }


    //find the sum of each row 
    //you must use loops(S)
    int sum=0;
    for(int row=0; row<ray.length; row++)
      {
        //start our sum at 0 before adding up the columns
       sum =0;

        for(int col=0; col<ray[row].length; col++)
          {
           sum += ray[row][col];
          }

       System.out.println("the sum of row" + row + " is " + sum);
      }
        
          
     System.out.println("\n\n\nHomework Assignment");
     //Add up all the values of the array using for each loops
     
     
     int sum2=0;
     for(int row=0; row<ray.length; row++)// for each loop not traditional
       {
         //start our sum at 0 before adding up the columns
        sum2 =0;
 
         for(int col=0; col<ray[row].length; col++)// for each loop not traditional
           {
            sum2 += ray[row][col];
           }
 
        System.out.println("the sum of row" + row + " is " + sum2);
       }
      
   
  }
}
