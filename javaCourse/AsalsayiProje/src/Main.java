public class Main {
    public static void main(String[] args) {
      int sayı=165;
      boolean asalMi=true;
      for (int i=2;i<sayı;i++){
          if (sayı%i==0){
              asalMi=false;
          }
      }
      if (sayı<2){
          System.out.println(sayı+" gecersiz sayi");
      }
     else if (asalMi){
          System.out.println(sayı+" asal");
      }else {
          System.out.println(sayı+" asal degil");
      }
    }
}