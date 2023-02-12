public class For {
    public static void main(String[] args) {
        /*
           1 2 3 4
           5 6 7 8
           9 10 11 12
           13 14 15 16
         */

        int input=4;
        for (int i = 1; i<=4 ; i++) {
            for (int j = 1; j <=4; j++) {
                System.out.print(j*i +" ");
            }
            System.out.println("");
        }

        /*
         * * * * * * * *
         * * * * * * * *
         * * * * * * * *
         * * * * * * * *
         * * * * * * * *
         */
        
        String x="*";
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=8 ; j++) {
                System.out.print(x + " ");
            }
            System.out.println(" ");
        }

        /*
        1
        12
        123
        1234
        12345
         */

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }

        //

        for (int i = 5; i >=1 ; i--) {
            for (int j = 1; j<=i ; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
