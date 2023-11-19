class MessagePrinter {
    // Synchronized method to print the message with square braces
    synchronized void printMessage(String message) {
        System.out.print("[" + message + "]");
    }
}

class ChildThread extends Thread {
    private MessagePrinter messagePrinter;
    private String message;

    public ChildThread(MessagePrinter messagePrinter, String message) {
        this.messagePrinter = messagePrinter;
        this.message = message;
    }

    public void run() {
        // Calling the synchronized method
        messagePrinter.printMessage(message);
    }
}

public class program8 {

    public static void main(String[] args) throws InterruptedException {
        // Create an instance of MessagePrinter
        MessagePrinter messagePrinter = new MessagePrinter();

        // Create three child threads with different messages
        ChildThread thread1 = new ChildThread(messagePrinter, "Learn");
        ChildThread thread2 = new ChildThread(messagePrinter, "Java");
        ChildThread thread3 = new ChildThread(messagePrinter, "Programming");

        // Without synchronization (may produce interleaved output)
        System.out.println("Output without synchronization:");
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();
        System.out.println(); // To separate outputs

        // With synchronization (produces synchronized output)
        System.out.println("Output with synchronization:");
        thread1 = new ChildThread(messagePrinter, "Learn");
        thread2 = new ChildThread(messagePrinter, "Java");
        thread3 = new ChildThread(messagePrinter, "Programming");

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();
    }
}
