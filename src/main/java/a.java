
import java.util.Scanner;

public class a {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x=0,y=0,count=0;
        int a;

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                a = in.nextInt();
                if(a==1){
                  x=i;
                  y=j;


                }
            }
        }

      while (!(y==2) && !(x==2)||x!=2||y!=2){
          if (x>2){
              count+=1;
              x--;

          }
          if (y>2){
              count+=1;
              y--;
          }if (x<2){
              count+=1;
              x++;
          }if (y<2){
              count+=1;
              y++;
          }

      }

        System.out.println(count);
    }
}
