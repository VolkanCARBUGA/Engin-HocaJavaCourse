public class Main {
    public static void main(String[] args) {
        char not = 'A';
        switch (not) {
            case 'A':
                System.out.println("Cok iyi : " + not);
                break;
            case 'B':
                System.out.println("İyi : " + not);
                break;
            case 'C':
                System.out.println("Normal : " + not);
                break;
            case 'D':
                System.out.println("Fena Değil : " + not);
                break;
            case 'F':
                System.out.println("Kaldınız : " + not);
                break;
            default:
                System.out.println("Hatali not");
        }
    }
}