import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aluno extends Pessoa {

    private String email;
    private List<Matricula> matriculas = new ArrayList<>();

    public Aluno(String cpf, String nome, String email) {
        super(cpf, nome);
        this.email = email;
        this.setMatriculas(matriculas);

    }

    public void incluirMatricula(Matricula... matricula) {
        Collections.addAll(matriculas, matricula);

    }

    public void removerMatricula(Matricula matricula) {
        matriculas.remove(matricula);

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public void calcularGastos(){
        double gastos = 0;
        for (Matricula m : matriculas) {
            gastos += m.getTurma().getCurso().getValor();
        }
        System.out.println("Gastos: " + gastos);
    }


    @Override
    public List<Curso> obterCursos() {
        System.out.println("Nome: " + this.getNome() + "\nCPF: " + this.getCpf());

        List<Curso> result = new ArrayList<>();
        for (Matricula m : matriculas) {
            System.out.println("\nTurma: " + m.getTurma().getCodigo() + "\nCurso: " + m.getTurma().getCurso() +
                    "\nNota: " + m.getNota() + "\nFrequencia: " + m.getFrequencia());


        }
        return result;
    }
}