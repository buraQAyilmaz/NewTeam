package day9;

public class ex2 {

    public static void main(String[] args) {

        //*Write all letters(lower case))with their order numbers. Example:
        //1 a
        //2 b
        //3 c
        //.
        //.
        //.

        int counter = 0;

        for (char i = 'a'; i <= 'z'; i++) {
            counter++;

            System.out.println(counter + " " + i);

        }

    }
}
