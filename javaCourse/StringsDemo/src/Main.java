import java.util.Locale;

public class Main {
    public static void main(String[] args) {
      String mesaj="Bugun Hava guzel       ";
//        System.out.println("eleman sayisi : "+mesaj.length());
//        System.out.println("5.eleman : "+mesaj.charAt(4));
//        System.out.println(mesaj.concat(" ahmet"));
//        System.out.println(mesaj.startsWith("B"));
//        System.out.println(mesaj.endsWith("l"));
//        char[] sehir=new char[10];
//        mesaj.getChars(0,10, sehir,0);
//        System.out.println(sehir);
//        System.out.println(mesaj.indexOf("a"));
        System.out.println(mesaj.replace(" ","*"));
        System.out.println(mesaj.substring(2,5));
        for (String kelime:mesaj.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase(Locale.ROOT));
        System.out.println(mesaj.toUpperCase(Locale.ROOT));
        System.out.println(mesaj.trim());
    }
}