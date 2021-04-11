/*this is just a testing page, nothing interesting going on here */
/*this is just a testing page, nothing interesting going on here */
/*this is just a testing page, nothing interesting going on here */

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        public static int func(int x, int n) {
            if (n == 0)
                return 1;
            else if(n%2 == 0)
                return func(x*x, n/2);
            else
                return x*func(x*x, n/2);
        }
    }
}
