import java.util.Arrays;

public class ZadanieWyborNajwiekszejLiczby {
    public static void main(String [] args) {
        int a = 2;
        int b = 4;
        int c = 7;

        int[] numbers  = {a,b,c};
        Arrays.sort(numbers);
        System.out.println("Największa liczba to: " + numbers[numbers.length -1]);
    }
}
