public class InstrukcjaSwitch {
    public static void main(String[] args) {

        int number = -1;
        switch (number) {
            case 1:
                System.out.println("Jeden");
                break;
            case 2:
                System.out.println("Dwa");
                break;
            case 3:
                System.out.println("Trzy");
                break;
            default:
                System.out.println("Liczba jest inna niż przewidywana");
        }
    }
}
