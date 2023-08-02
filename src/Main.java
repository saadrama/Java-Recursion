public class Main {
//    Recursion is a technique of making a function call itself
//    Recursion example; adding two numbers together is easy to do, but adding a range of numbers is more complicated.
    // Here we are using recursion to add all the numbers up to 10
public static int sum(int k) {
    if (k>0){
        return k+sum(k-1);
    }
    else {
        return 0;
    }
}
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);

    }
}