import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RingOfFire {
   

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int C = scan.nextInt();
        int K = scan.nextInt();
        List<Integer> al = new ArrayList<>();
        int m=1;
        while(m!=N+1){
        al.add(m++);
        }    
          
        List<Integer> her = result(al, N, C, K);
        
        for (int i = 0; i < her.size() ; i++) {
            System.out.println(her.get(i));
        }
           scan.close();  
        }
    public static List<Integer> result(List<Integer> al, int n , int C , int K){
        List<Integer> temp = al;
        int left = al.size();
        int place = 1;      
        
        while (left!=K){
           if(place==temp.size())
               place=0;                   
           place = (place+(C-1))%temp.size();
           if(place==0){
               place = temp.size();
           }
                             
           remove(temp, place);
            left--;        
        }
              return temp;
        }
        
       
        public static void remove(List<Integer> N , int place){
            int tempplace = place-1;
            N.remove(tempplace);
    }
        
}
