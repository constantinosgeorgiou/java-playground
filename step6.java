/**
 * 
 * @author Constantinos Georgiou <www.constantinosgeorgiou.com>
 */
class Variable {
    public static void main(String[] args) {
        //VIRIABLE TYPES
        int tops;
        float gradePointAverage;
        char key = 'C';
        String productName = "Larvets";
        byte escapeKey = 27;
        short roomNumber = 222;
        long salary = 264_400_000;
        boolean gameOver = false;
        double pi = 3.14;
        //CONSTANTS
        final int TOUCHDOWN = 6;
        final int FIELDGOAL = 3;
        final int PAT = 1;
        //OPERATORS
        double weight = 205;
        weight = weight + 10;
        weight = weight - 15;
        weight = weight / 3;
        int remainder = 245 % 3;
        //INCREMENTING, DECREMENTING A VARIABLE
        int x = 10;
        x++; //postfixing
        ++x; //prefixing
        int y = 10;
        y--; //postfixing
        --y; //prefixing
        int a = 3;
        int answerA = a++ *10;
        System.out.println("Answer = " + answerA);
        System.out.println("A = " + a);
        int b = 3;
        int answerB = ++b *10;
        System.out.println("Answer = " + answerB);
    }
}
