public class Matricula {

    private Aluno aluno;
    private Turma turma;
    private double nota;
    private int frequencia;

    public Matricula(Aluno aluno, Turma turma, double nota, int frequencia) {
        this.aluno = aluno;
        this.turma = turma;
        this.nota = nota;
        this.frequencia = frequencia;
    }

    public void mostrarDados(){
        System.out.println("Dados da Matrícula:\n " + this.aluno.getNome() + "\nTurma: " + turma.getCodigo() +
                "\nNota: " + nota + "\nFrequência: " + frequencia);
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }
}
