// link of the problem https://codingbat.com/prob/p169213

public class LastDigit {

    public boolean lastDigit(int a, int b, int c) {
        return(a%10 == c%10 || b%10 == c%10 || a%10 == b%10);
    }
      
}
