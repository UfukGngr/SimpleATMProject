import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,passWord;
        int right=3;
        int balance=1500;
        int select;
        int price;
        Scanner scan=new Scanner(System.in);

        while (right>0){
            System.out.print("Kullanıcı adınızı giriniz: ");
            userName=scan.nextLine();
            System.out.print("Parolanızı giriniz: ");
            passWord=scan.nextLine();
            if(userName.equals("patika") && passWord.equals("dev123")){
                System.out.println("Başarılı bir giriş yaptınız.");
                System.out.println("Bankamıza hoşgeldiniz:");
                do{
                    System.out.println("1-Para Çekme\n"+
                            "2-Para Yatırma \n"+
                            "3-Bakiye Sorgulama\n"+
                            "4-Çıkış Yap\n");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçin: ");
                    select=scan.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                            price=scan.nextInt();
                            if (price>balance){
                                System.out.println("Bakiye yetersiz.");
                            }else {
                                balance-=price;
                            }
                            break;
                        case 2:
                            System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                            price=scan.nextInt();
                            balance+=price;
                            break;
                        case 3:
                            System.out.println("Bakiyeniz :"+balance);
                            break;
                    }
                }while (select!=4);
                System.out.println("Tekrar görüşmek üzere...");
                break;
            }else{
                System.out.println("Hatalı kullanıcı adı ya da parola girdiniz. Lütfen tekrar deneyiniz.");
                right--;
                if(right==0){
                    System.out.println("Hesabınız bloke edilmiştir.Lütfen banka ile iletişime geçiniz");
                }else {
                    System.out.println("Kalan hakkınız: " + right);
                }
            }
        }
    }
}