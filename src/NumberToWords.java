public class NumberToWords {

    public static void main(String[] args) {
//        digitCount(802123);
        reverse(943);
    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }
    }

    //    Gives the number of digits in a number , working properly :)
    public static int digitCount(int number) {
        int digitCount = 0;

        for (int i = number; number > 0; number /= 10) {
            digitCount += 1; } return digitCount; }
    //    digitCount method completed :)



    //    Gives the reverse of given number
    public static int reverse (int number ){

        int lastDigit = number % 10 ;
        int reverseNumber = 0 ;

        while (number > 0){
            int digit = number / 10 ;
            System.out.println(digit);
            number /= 10;
        }

        return number;
    }

}
