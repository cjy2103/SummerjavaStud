import java.util.Scanner;

public class test5 {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
     /* if(b<45){
            if(a<1){
                a=23;
                b+=15;
            }
            else{
                a--;
                b+=15;
            }
        }
        else{
            b-=45;
        }*/
     if(b-45<0){
         if(a<1){
             a=23;
             b=b+15;
         }
         else{
             a--;
             b=b+15;
         }
     }
     else{
         b=b-45;
     }
        System.out.println(a+" "+b);
    }
}
