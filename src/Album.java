public class Album {
    private String genero;

    public String getGenero() {
        return genero;
    }

    public int getAno() {
        return ano;
    }

    public String getNome() {
        return nome;
    }

    public String getArtista() {
        return artista;
    }

    public String getMusicas() {
        return musicas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setMusicas(String musicas) {
        this.musicas = musicas;
    }


    public static void mostraTodosOsDados(){

    }

    private int ano;
    private String nome;
    private String artista;
    private String musicas;
}


