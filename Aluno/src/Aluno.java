public class Aluno {
    String nome;
    int matricula;
    double nota_mat;
    double nota_por;
    double nota_fis;
    double nota_geo;
    double nota_quim;
    Disciplina disciplina;

    public Aluno(String alunoNome, int alunoMatricula, double alunoNota_mat, double alunoNota_por, double alunoNota_fis, double alunoNota_geo, double alunoNota_quim, Disciplina alunoDisciplina) {

        nome = alunoNome;
        matricula = alunoMatricula;
        nota_mat = alunoNota_mat;
        nota_por = alunoNota_por;
        nota_fis = alunoNota_fis;
        nota_geo = alunoNota_geo;
        nota_quim = alunoNota_quim;
        disciplina = alunoDisciplina;
    }

    public double calcularMedia() {
        return (nota_mat + nota_por + nota_fis + nota_geo + nota_quim) / 5;
    }

    public String situacaoAluno() {
        double media = calcularMedia();

        if (media >= 6.0) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }
}
