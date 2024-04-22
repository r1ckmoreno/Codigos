public class Principal {
    public static void main(String[] args) {

        Disciplina d1 = new Disciplina("Matematica", 60);

        Aluno aluno1 = new Aluno("Henrique", 12345, 10.0, 8.0, 7.5, 9.5, 9.0, d1);

        double media = aluno1.calcularMedia();
        String situacao = aluno1.situacaoAluno();

        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Matricula: " + aluno1.matricula);
        System.out.println("Disciplina: " + aluno1.disciplina.nome);
        System.out.println("Carga Horaria: " + aluno1.disciplina.cargaHoraria);
        System.out.println("Media: " + media);
        System.out.println("Situacao: " + situacao);
    }
}
