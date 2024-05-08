import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Instrutor extends Pessoa{

    private String matricula;
    private  String telefone;

    private List<Turma> turmasList = new ArrayList<>();

    public Instrutor(String cpf, String nome, String matricula, String telefone) {
        super(cpf, nome);
        this.matricula = matricula;
        this.telefone = telefone;
        this.turmasList = turmasList;
    }
    public void incluirTurma(Turma...turmas){
        Collections.addAll(turmasList, turmas);

    }

    public void removerTurmas(Turma turma){
        turmasList.remove(turma);

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Turma> getTurmasList() {
        return turmasList;
    }

    public void setTurmasList(List<Turma> turmasList) {
        this.turmasList = turmasList;
    }


    @Override
    public List<Curso> obterCursos() {
        System.out.println("Nome: " + this.getNome() + "\nMatricula: "+ this.getMatricula() +
                "\nTelefône: " + getTelefone() );
        List<Curso> result = new ArrayList<>();
        for (Turma t : turmasList){
            System.out.println("\nTurma: " + t.getCodigo() + "\nCurso: " + t.getCurso().getNome() + "\nData início: "
                    + t.getDataInicio().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                    "\nData Final: " + t.getDtaTermino().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        }
        return result;

    }
}
