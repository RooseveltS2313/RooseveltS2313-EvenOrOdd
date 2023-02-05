public class Lab {
    /**
     * Your challenge is to implement a method to determine if an int is even or odd. The method should return
     * the String "Even" if the number is even, and "Odd" if it is odd.
     *
     * There is a special operator in programming languages called modulus, which provides the remainder
     * after a division, represented by %.
     * For instance, 7%4=3, 7%3=1, 4%2=0, 5%2=1, etc.
     *
     * That operator, could be used to tell if a number is even or odd - a number that has a remainder of 0 when
     * divided by 2 is naturally even.
     *
     * @param n a number.
     * @return a String "Even" if n is even, and "Odd" of in is odd. The test cases are case-sensitive.
     */
    public String decide(int n){
        /* you could use these arrays but...
        int[] evens = {0,2,4,6,8}; 
        int[] odds = {1,3,5,7,9}; 
        */

        int modResult = n % 2;
        // thank the test cases for me including the -1 catch which i do not think i need if I switch 1 and -1 with 0
        if (modResult == 1 || modResult == -1)
        return "Odd";
        // else if (modResult == 0 )
        return "Even";

        // return null;
        
    }
}
