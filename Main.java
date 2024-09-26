public class Main{
    
    private String greeting;

    public Main (){
        greeting = "Hello World!";
    }

    public void printGreeting(){
        System.out.println(greeting);
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.printGreeting();
    }






}