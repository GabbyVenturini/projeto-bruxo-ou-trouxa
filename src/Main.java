//Todo:No método `main()`, crie instâncias dos seguintes personagens:
// Um bruxo chamado "Harry Potter", da casa "Grifinória", com uma varinha de "Azevinho e pena de fênix".
// Um trouxa chamado "Hermione Granger", da casa "Terra dos Trouxas", com a profissão de "Estudante".
// Para cada personagem criado, chame o método `apresentar()` e `realizarMagia()` para demonstrar o polimorfismo.

public class Main {
    public static void main(String[] args) {

Bruxo bruxo = new Bruxo();
bruxo.apresentar();
bruxo.setNome("Harry Potter");
bruxo.setCasa("Sou da Grifinória");
bruxo.setVarinha("Minha varinha é de Azevinho e pena de fênix");

System.out.println(bruxo.getNome());
System.out.println(bruxo.getCasa());
System.out.println(bruxo.getVarinha());

bruxo.realizarMagia();
System.out.println(bruxo.realizarMagia());

        System.out.println();

Trouxa trouxa = new Trouxa();
trouxa.apresentar();

trouxa.setNome("Petúnia");
trouxa.setCasa("Terra dos trouxas");
trouxa.setProfissao("Sou dona de casa");

System.out.println(trouxa.getNome());
System.out.println(trouxa.getCasa());
System.out.println(trouxa.getProfissao());

trouxa.realizarMagia();
System.out.println(trouxa.realizarMagia());
}
}