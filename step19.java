/**
 *
 * @author Constantinos Georgiou <www.constantinosgeorgiou.com>
 */
public class AcousticTester {
    public static void main(String[] args) {
        AcousticModem hayes = new AcousticModem();
        hayes.speed = 300;
        System.out.println("Trying the acoustic modem:");
        hayes.displaySpeed();
        hayes.connect();
    }
}