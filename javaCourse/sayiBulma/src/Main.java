public class Main {
    public static void main(String[] args) {
       int[] sayılar=new int[]{1,6,3,8,7,5};
       int aranacak =5;
        int i;
       boolean varMı=false;
       for (i=0;i< sayılar.length;i++);{
            if (sayılar[i]==aranacak){
                varMı=true;
                return;

            }
        }
       if (varMı){
           System.out.println("sayi bulundu");
       }else {
           System.out.println("bulunamadı");
       }
    }
}