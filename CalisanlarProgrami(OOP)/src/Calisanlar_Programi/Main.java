package Calisanlar_Programi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Çalışanlar Programına Hoşgeldiniz....");
        String islemler = "İşlemler...\n"
                         +"1. Yazılımcı işlemleri\n"
                         +"2. Yönetici işlemleri\n"
                         +"3. Çıkış için q'ya basın.";
        System.out.println("***************************************");
        System.out.println(islemler);
        System.out.println("****************************************");

        while (true){
            System.out.print("İşlemi seçiniz: ");
            String islem = scan.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor....");
                break;
            }
            else if (islem.equals("1")){
                Yazilimci yazilimci = new Yazilimci("İrem", "Yiğit",352,"Java, Go, SpringBoot");
                String yazilimci_islemler = "Yazılımcı İşlemleri\n"
                                           +"1. Format at \n"
                                           +"2. Bilgileri Göster\n"
                                           +"3. Çıkış için q'ya basın.\n";
                System.out.println(yazilimci_islemler);

                while (true){
                    System.out.print("işlem seçiniz: ");
                    String y_islem = scan.nextLine();

                    if (y_islem.equals("q")){
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor....");
                        break;
                    }
                    else if (y_islem.equals("1")){
                        System.out.print("İşletim sistemini giriniz: ");
                        String isletim_sistemi = scan.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    }
                    else if (y_islem.equals("2")){
                        yazilimci.bilgilerigoster();
                    }
                    else {
                        System.out.println("Geçersiz Yazılımcı İşlemi....");
                    }
                }
            }
            else if (islem.equals("2")){
                Yonetici yonetici = new Yonetici("Ayça", "Ece",865,10);
                String yonetici_islemler = "Yönetici İşlemleri\n"
                                            +"1. Zam yap\n"
                                            +"2. Bilgileri Göster\n"
                                            +"3. Çıkış için q'ya basın.\n";
                System.out.println(yonetici_islemler);

                while (true){
                    System.out.print("İşlem seçiniz: ");
                    String y_islem = scan.nextLine();
                    if (y_islem.equals("q")){
                        System.out.println("Yönetici Sisteminden Çıkılıyor....");
                        break;
                    }
                    else if (y_islem.equals("1")){
                        System.out.print("Yöneticinin ne kadar zam yapmasını istiyorsunuz? : ");
                        int zam_miktari=scan.nextInt();
                        scan.nextLine();
                        yonetici.zamYap(zam_miktari);
                    }
                    else if (y_islem.equals("2")){
                        yonetici.bilgilerigoster();
                    }
                    else {
                        System.out.println("Geçersiz Yönetici İşlemi....");
                    }
                }
            }
            else {
                System.out.println("Geçersiz işlem....");
            }
        }
    }
}
