public class Musica {
    private String titulo;
    private int duracao;
    private String composicao;

    public static void tocarMusica(){
        String[] Musicas =  {"Happy Song", "Sad song", "Mary on a Cross", "Pump Up Kick", "Yellow", "All Black", "Carry On"};
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getComposicao() {
        return composicao;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }
}