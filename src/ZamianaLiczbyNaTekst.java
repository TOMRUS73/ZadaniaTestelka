public class ZamianaLiczbyNaTekst {
    public static void main(String[] args) {
        int number = 5;
        if (number >= 1 && number < 7) {
            String day;
            switch (number) {
                case 1:
                    day = "poniedziałek";
                    break;
                case 2:
                    day = "wtorek";
                    break;
                case 3:
                    day = "środa";
                    break;
                case 4:
                    day = "czwartek";
                    break;
                case 5:
                    day = "piątek";
                    break;
                case 6:
                case 7:
                    day = "weekend";
                    break;
                default:
                    day = "nie wiadomo co za dzień";
                    break;
            }
            System.out.println("dzisiaj jest: " + day);
        } else {
            System.out.println("wprowadzona liczba jest nieprawidłowa");
        }
    }
}
