package Test2;

import java.util.Scanner;

public class BasicRecursion {
    
    private Integer print(Integer n){

        if(n<=0){
            return 0;
        }
        System.out.println(n);
        return(print(n-1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n=scanner.nextInt();
        BasicRecursion m=new BasicRecursion();
        
      
            System.out.println(m.print(n));
          
        
        
    }
}