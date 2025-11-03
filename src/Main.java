import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* // Birinci Çalışma
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kullnaıcı adını giriniz :");
        String userName =scanner.nextLine();
        System.out.println("Şifreyi Giriniz: ");
        String password =scanner.nextLine();
        if ("admin".equals(userName)&&"1234".equals(password)){
            System.out.println("Giriş Başarılı!!");
        }else{
            System.out.println("Hatalı Giriş!");
        }*/

        // İkinci Çalışma
        twoNumber();



    }
    // İkinci Çalışma
    public static void twoNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("First Number:");
        int firstNum=scanner.nextInt();
        System.out.println("Second Number:");
        int secondNum=scanner.nextInt();
        int sum =firstNum+secondNum;
        System.out.println("Sum :"+sum);
        int mult=firstNum*secondNum;
        System.out.println("Mult:"+mult);
        if (mult>5000||sum<4000){
            System.out.println("Koşul sağlandı  :"+mult);

        }

    }
}
