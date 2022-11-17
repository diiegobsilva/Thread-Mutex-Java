public class MinhaThreadSoma implements Runnable{
    private String nome;
    private int[] numeros;
    private static Calculadora calc = new Calculadora();


    public MinhaThreadSoma(String nome, int[] numeros){
        this.nome = nome;
        this.numeros = numeros;
        Thread t = new Thread(this, nome);
        t.start();
    }

    public void run() {
        System.out.println(this.nome + " iniciada");
        int soma = calc.somaArray(this.numeros);
        System.out.println("Resultado da soma para thread " + this.nome + " é " + soma);
        System.out.println(this.nome + " terminada");
    }
}
