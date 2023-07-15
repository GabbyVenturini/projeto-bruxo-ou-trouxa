public class Trouxa extends Personagem{
    private String profissao;

    public String realizarMagia() {
        return "Não possuo habilidades mágicas, mas sou muito inteligente";

    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
