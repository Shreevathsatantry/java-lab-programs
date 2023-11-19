import java.util.Random;

class RandomNumberGenerator extends Thread {
    private volatile boolean isRunning = true;
    private int lastGeneratedNumber;

    @Override
    public void run() {
        Random random = new Random();
        while (isRunning) {
            lastGeneratedNumber = random.nextInt(100); // Generate a random integer between 0 and 99
            System.out.println("Generated Number: " + lastGeneratedNumber);

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getLastGeneratedNumber() {
        return lastGeneratedNumber;
    }

    public void stopThread() {
        isRunning = false;
    }
}

class SquareCalculator extends Thread {
    private RandomNumberGenerator randomNumberGenerator;

    public SquareCalculator(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
    }

    @Override
    public void run() {
        while (true) {
            int number = randomNumberGenerator.getLastGeneratedNumber();
            int square = number * number;
            System.out.println("Square: " + square);

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class CubePrinter extends Thread {
    private RandomNumberGenerator randomNumberGenerator;

    public CubePrinter(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
    }

    @Override
    public void run() {
        while (true) {
            int number = randomNumberGenerator.getLastGeneratedNumber();
            int cube = number * number * number;
            System.out.println("Cube: " + cube);

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class program5 {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        SquareCalculator squareCalculator = new SquareCalculator(randomNumberGenerator);
        CubePrinter cubePrinter = new CubePrinter(randomNumberGenerator);

        randomNumberGenerator.start();
        squareCalculator.start();
        cubePrinter.start();

        // Let the threads run for 5 seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stop the threads
        randomNumberGenerator.stopThread();
        squareCalculator.interrupt();
        cubePrinter.interrupt();
    }
}
