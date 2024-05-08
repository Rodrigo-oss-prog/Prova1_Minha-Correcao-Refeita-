import java.time.LocalDate;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

    public class Main {
        public static void main(String[] args) {
            Categoria categoria1 = new Categoria("Programação");
            Curso curso1 = new Curso("Java", categoria1, 250, 60 );
            Curso curso2 = new Curso("POO", categoria1, 250, 60);
            Curso curso3 = new Curso("Python", categoria1, 250, 60);
            categoria1.incluirCurso(curso1, curso2, curso3);
            System.out.println("\nCursos da categoria " + categoria1.getNome() + ": ");
            categoria1.excibirCursosPorCategoria();
            Categoria categoria2 = new Categoria("Banco de Dados");
            Curso curso4 = new Curso("PostgreSQL",categoria2 ,450.00, 40);
            Curso curso5 = new Curso("MySQL", categoria2,450.00, 40);
            categoria2.incluirCurso(curso4, curso5);
            System.out.println("\nCursos da categoria " + categoria2.getNome() + ": ");
            categoria2.excibirCursosPorCategoria();
            Instrutor instrutor1 = new Instrutor("11111111111", "Celso", "123", "9999-9999");
            Instrutor instrutor2 = new Instrutor("22222222222", "Joaquim", "456", "8888-8888");
            Turma turma1 = new Turma(instrutor1, curso1,"T1",
                    LocalDate.of(2024, 4, 5),
                    LocalDate.of(2024, 4, 10));
            Turma turma2 = new Turma(instrutor1, curso4,"T2",
                    LocalDate.of(2024, 4, 5),
                    LocalDate.of(2024, 4, 12));
            Turma turma3 = new Turma(instrutor2, curso2,"T3",
                    LocalDate.of(2024, 3, 10),
                    LocalDate.of(2024, 4, 10));
            instrutor2.incluirTurma(turma3);
            instrutor1.incluirTurma(turma1, turma2);
            Aluno aluno = new Aluno("33333333333", "Maria", "maria@maria.com");
            Matricula mat1 = new Matricula(aluno, turma1,9.0, 100);
            Matricula mat2 = new Matricula(aluno, turma3,9.5, 100 );
            aluno.incluirMatricula(mat1, mat2);
            System.out.println("\nCursos realizados pelo aluno " + aluno.getNome() + ": ");
            for (Curso c : aluno.obterCursos())
                System.out.println(c.getNome());

            System.out.println("\nCursos ministrados pelo instrutor " + instrutor1.getNome() + ": ");
            for (Curso c : instrutor1.obterCursos())
                System.out.println(c.getNome());

            System.out.println("\nCursos ministrados pelo instrutor " + instrutor2.getNome());
            for (Curso c : instrutor2.obterCursos())
                System.out.println(c.getNome());


            List<Pessoa> pessoas = new ArrayList<>();
            pessoas.add(instrutor1);
            pessoas.add(instrutor2);
            pessoas.add(aluno);
            for (Pessoa p : pessoas) {
                System.out.println("\nCursos do(a) " + p.getNome() + ": ");
                for (Curso c : p.obterCursos())
                    System.out.println(c.getNome());
            }

            System.out.println("\nTotal gasto por " + aluno.getNome() + ": R$ " + aluno.calcularGastos());

        }
    }
