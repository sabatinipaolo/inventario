public class Prodotto {
    private String nome;
    private double prezzo;
    private int quantita;

    public Prodotto() {
        this.nome = "";
        this.prezzo = 0;
        this.quantita = 0;
    }

    public Prodotto(String nome, double prezzo, int quantita) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    @Override
    public String toString() {
        return "Prodotto{" + "nome='" + nome + '\'' + ", prezzo=" + prezzo + ", quantita=" + quantita + '}';
    }
}
