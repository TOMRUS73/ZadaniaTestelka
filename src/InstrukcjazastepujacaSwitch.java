public class InstrukcjazastepujacaSwitch {
    public static void main(String[] args) {

        int number = 9;
        String[] words = {"zero", "jeden", "dwa", "trzy",
                "cztery", "pięć", "sześć",
                "siedem", "osiem", "dziewięć"};
        if (number >= 0 && number <10);
        {
            String numbersInWords = words[number];
            System.out.println("Podana liczba to: " + numbersInWords);
        }
       // else
        {
            System.out.println("Wprowadzona liczba jest nieprawidłowa");
        }
    }
}

