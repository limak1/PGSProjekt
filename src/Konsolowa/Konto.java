package Konsolowa;

import java.math.BigDecimal;
import java.util.Scanner;


public class Konto extends PasswordGenerator {

    Scanner skaner = new Scanner(System.in);

    private BigDecimal saldo = BigDecimal.ZERO;
    private String imie;
    private String nazwisko;
    private static double ID;
    private String password;
    private BigDecimal kwota = BigDecimal.ZERO;


    protected Konto(String imie, String nazwisko, double ID) {

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.ID = ID;


    }


    public void login() {
        System.out.println("Witamy w systemie bankowym");
        System.out.println("Twoje ID: " + this.ID);
        System.out.println(getOwner());
        System.out.println("Proszę podać hasło: ");
        String pass = skaner.next();
        int x = 0;


            if (password.equals(pass)) {
                System.out.println("Hasło poprawne");
            do{
                System.out.println("Wybierz działanie: 1.wypłata, 2.wpłata, 3.środki na koncie 4.wyloguj");
                x = skaner.nextInt();

                switch (x) {
                    case 1:
                        wyplata();
                        break;
                    case 2:
                        wplata();
                        break;
                    case 3:
                        getSaldo();
                        break;
                    case 4:
                        System.out.println("Zapraszamy ponownie");
                        System.exit(0);
                }
            } while (x < 4);
            } else
                System.out.println("Hasło niepoprawne");

    }


    public void wplata() {
        System.out.println("Podaj wartość wpłaty: ");
        kwota = skaner.nextBigDecimal();
        this.saldo = saldo.add(kwota);
    } //BigDecimal add dodaje wartość

    public void wyplata() {

        System.out.println("Podaj wartość do wypłaty: ");
        kwota = skaner.nextBigDecimal();

       if (saldo.compareTo(BigDecimal.ZERO) > 0 && kwota.compareTo(saldo) < 0) {// sprawdza, czy saldo jest większe od zera i czy kwota podana nie jest większa od salda

            saldo = saldo.subtract(kwota);
            System.out.println("Twoje środki na koncie: " + saldo);
            //
       } else
            System.out.println("Brak środków na koncie");


    } //BigDecimal subtract odejmuje podaną wartość

    public double getID() {
        return ID;
    }

    public void getSaldo() {
        System.out.println("Twoje środki na koncie: " + saldo);

    }

    public String getOwner() {
        return "Konto bankowe użytkownika: " + this.imie + this.nazwisko;
    }

    public void setSaldo(BigDecimal saldo) {
        saldo = new BigDecimal('0');
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setID(double ID) {
        this.ID = ID;
    }

    public void setPassword() {
        System.out.println("Podaj długość hasła: ");
        int length = skaner.nextInt();
        this.password = PasswordGenerator.generate(length);

    }

    public String getPassword() {
        return this.password;
    }

    @Override
    public String toString() {
        return "Konto " +
                "saldo = " + saldo +
                ", imie =' " + imie + '\'' +
                ", nazwisko =' " + nazwisko + '\'' +
                ", ID=" + ID +
                ' ';
    }

}

