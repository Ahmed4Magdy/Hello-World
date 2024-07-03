package com.mycompany.project1;


import java.util.*;
public class HelloWorld {
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
 
       
         
     int sum=0; 
    int n =input.nextInt();
     int a=0;
     int [][] x = new int [n][3]; 
      
     for(int i=0; i<n; i++){
         a=0;
         for(int j=0;j<3;j++){
               
             x[i][j] = input.nextInt();
             
             if(x[i][j]==1){
              a+=1;
             
         }
         }
             if(a>=2){
                 
                 sum+=1;
             }
             
   
         
         
     }
     
     System.out.println(sum);
     }
}
