public class Main {
     public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("First message");
        logger2.log("Second message");

        if (logger1 == logger2) {
            System.out.println("Only one instance of Logger is used (Singleton works).");
        } else {
            System.out.println("Different instances exist (Singleton failed).");
        }
    }
}