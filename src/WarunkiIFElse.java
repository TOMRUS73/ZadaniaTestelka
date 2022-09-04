public class WarunkiIFElse {
    public static void main(String[] args) {
        int side = 4;
        int area = side * side;
        int perimeter = 4 * side;
        if (side < 0) {
            System.out.println("Długość boku kwadratu nie może być ujemna");
        } else if (side == 0) {
            System.out.println("Długość boku kwadratu nie może być równa zero");
        } else {
            System.out.println("Pole kwadratu o boku " + side + " jednostek wynosi " + area + " jednostek kwadratowych a obwód "
                    + perimeter + " jednostek");
        }
    }
}
