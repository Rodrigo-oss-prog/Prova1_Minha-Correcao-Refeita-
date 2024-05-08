import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Turma {
    private Instrutor instrutor;
    private Curso curso;
   // private Matricula matricula;
    private String codigo;
    private LocalDate dataInicio;
    private LocalDate dtaTermino;

    public Turma(Instrutor instrutor, Curso curso,String codigo,
                 LocalDate dataInicio, LocalDate dtaTermino) {
        this.instrutor = instrutor;
        this.curso = curso;
        //this.matricula = matricula;
        this.codigo = codigo;
        this.dataInicio = dataInicio;
        this.dtaTermino = dtaTermino;
    }

    public void mostraDados(){
        System.out.println("Dados da Turma:\n " +
                "Intrutor: "+ this.instrutor.getNome() + "\nCurso: " + this.curso.getNome()+
                "Código: " + codigo +
                "\nData início: " + this.getDataInicio().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                  "\nData Final: " + this.getDtaTermino().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    }


    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDtaTermino() {
        return dtaTermino;
    }

    public void setDtaTermino(LocalDate dtaTermino) {
        this.dtaTermino = dtaTermino;
    }
}
