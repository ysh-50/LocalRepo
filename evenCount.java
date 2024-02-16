//FIND ALL THE EVEN NOS & GIVE THEIR COUNT

package GITDEMO.LocalRepo;

public class evenCount {
    
    public static void main(String[] args) {
        int count=0;
        for(int i=0;i<=10;i++){
            if(i%2==0){               //will verift the even no. or not 
                count++;
            System.out.println(i);
            }
        }
        System.out.println("Total no.s: "+count);
        
    }
}

