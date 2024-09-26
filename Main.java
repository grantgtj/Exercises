public class Main{
    
    private String greeting;
    private String altgreeting;

    public Main (){
        greeting = "Hello World!";
        altgreeting = "Hello Alternative World";
    }

    public void printGreeting(){
        System.out.println(greeting);
    }

    public void printAltGreeting(){
        System.out.println(altgreeting);
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.printGreeting();
        main.printAltGreeting();
    }






}