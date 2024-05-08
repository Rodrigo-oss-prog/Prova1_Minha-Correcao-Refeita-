import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Categoria {

    private String  nome;
    private List<Curso> cursosList = new ArrayList<>();

    public Categoria(String nome) {
        this.nome = nome;
        this.cursosList = cursosList;
    }

    public void excibirCursosPorCategoria(){
        for (Curso c : cursosList){
            System.out.println("Nome do curso: " + c.getNome() + "\nCategoria: " + c.getCategoria().getNome() +
                    "\nValor: "  + c.getValor() + "\nCarga horária: " + c.getCargaHoraria() + "\n");
        }


    }

    public void incluirCurso(Curso...cursos){
        Collections.addAll(cursosList, cursos);

    }

    public void removerCurso(Curso curso){
        cursosList.remove(curso);

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Curso> getCursos() {
        return cursosList;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursosList = cursos;
    }
}
