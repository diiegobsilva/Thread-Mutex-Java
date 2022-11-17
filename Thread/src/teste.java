public class teste {
    public static void main(String[] args) {
        System.out.println("A corrida começou!");
        MinhaThread thread1 = new MinhaThread("#1", 1000);
        MinhaThread thread2 = new MinhaThread("#2", 1300);

        while (thread1.isAlive() || thread2.isAlive()){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Corrida Finalizada!");
    }
}
