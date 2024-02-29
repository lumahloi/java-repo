public class teste2 {
    public static void main(String[] args){
        Cachorro c1 = new Cachorro();
        c1.tamanho = 10;
        c1.latir();
    }
}

class Cachorro {
    int tamanho;
    String raça;
    String nome;

    void latir(){
        System.out.println("au au !");
    }
}
