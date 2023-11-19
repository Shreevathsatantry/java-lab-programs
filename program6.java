import java.util.InputMismatchException;
import java.util.Scanner;
public class program6{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int n=scanner.nextInt();
        int[] array =new int[n];
        try{
        System.out.println("Enter the elements into the array:");
        for (int i=0;i<n;i++){
            array[i]=scanner.nextInt();
        }
        //divide by smallest element
        int smallestnum=SmallestNumber(array);
        System.out.println("dividing by the smallest element:");
        for (int i=0;i<n;i++){
            System.out.println(array[i]/smallestnum);
        }
        //printing index of elements
        System.out.println("Enter the index to print"); 
        int index=scanner.nextInt();
        System.out.println("Element printed is :"+array[index]);



    }
    catch(InputMismatchException e){
        System.out.println("Enter valid key from keyboard ");

    }catch(ArithmeticException e){
        System.out.println("Cannot divide by zero");
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("index out of reach");

    }
    scanner.close();
}

        
private static int SmallestNumber(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
}

}

