public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Abhishek : Docker Demo");
        for(int i=1;i<=10;i++){
            System.out.println("Count: "+i+"...10");
            Thread.sleep(5000);
        }
    }
}