package Konsolowa;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BigDecimal saldo = new BigDecimal(15000);
        List<Konto> lista= new ArrayList<>();

        Konto uzytkownik1 = new Konto("Andrzej","Grabowski",1234567);
        Konto uzytkowni2 = new Konto("Tomasz", "Karolak",987654);
        Konto uzytkownik3 = new Konto("Marek","Mostowiak",412412);

        uzytkownik1.setPassword();
        System.out.println(uzytkownik1.getPassword());
        uzytkownik1.login();




      // uzytkowni2.login();
        //uzytkownik3.login();
       System.out.println(uzytkownik1.getOwner());
        uzytkownik1.setSaldo(saldo);
        uzytkownik1.wplata();
        //System.out.println(uzytkownik1.getSaldo());
        //uzytkownik1.wyplata();

    }
}
