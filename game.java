
import java.util.*;
class play{
    int cnum;
    int gnum;
    int count=0;

    void setnum(){
        Random r = new Random();
         cnum = r.nextInt(100);
    }
    void getnum(){
        Scanner sc =new Scanner(System.in);
        System.out.println("guess the number between 0 and 100");
        gnum = sc.nextInt();
    }
    void checknum(){
        Scanner sc=new Scanner(System.in);
        do{
           // count=0;
           // count++;
            if(gnum == cnum) {

                System.out.println("wahh! you guess the correct number \nyou won the game\n you guess in "+count+" trial");
                break;
            }
            else if(gnum<cnum){
                System.out.println("your guess is less than actual number");
                count++;
                System.out.println("guess the number between 0 and 100");
                gnum = sc.nextInt();

            }
            else if (gnum>cnum){
                System.out.println("your number is higher than actual number");
                count++;
                System.out.println("guess the number between 0 and 100");
                gnum = sc.nextInt();

            }
        }while(true);
    }
}

public class game {
    public static void main( String[] args) {
        play p = new play();
        p.setnum();
        p.getnum();
        p.checknum();
    }

}










