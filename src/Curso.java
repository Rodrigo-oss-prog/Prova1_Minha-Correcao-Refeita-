public class Curso {

    private String nome;
    private Categoria categoria;
    private double valor;
    private int cargaHoraria;


    public Curso(String nome, Categoria categoria, double valor, int cargaHoraria) {
        this.nome = nome;
        this.categoria = categoria;
        this.valor = valor;
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", categoria=" + categoria.getNome() +
                ", valor=" + valor +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
