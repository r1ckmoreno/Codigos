public class Aluno {
    private String nome;
    private int idade;
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
            this.nome = nome;
            this.idade = idade;
            this.matricula = matricula;
    }

    public String getNome() {
            return nome;
    }

    public void setNome(String nome) {
            this.nome = nome;
    }

    public int getIdade() {
            return idade;
    }

    public void setIdade(int idade) {
            this.idade = idade;
    }


    public String getMatricula() {
            return matricula;
    }

    public void setMatricula(String matricula) {
            this.matricula = matricula;
    }

    public static void main(String[] args) {
            Aluno aluno = new Aluno("Henrique", 19, "12345");

            System.out.println("\nNome do aluno: " + aluno.getNome());
            System.out.println("Idade do aluno: " + aluno.getIdade());
            System.out.println("Matrícula do aluno: " + aluno.getMatricula());

            aluno.setNome("Gabriel");
            aluno.setIdade(23);
            aluno.setMatricula("54321");

            System.out.println("\nValores modificados:");
            System.out.println("\nNome do aluno: " + aluno.getNome());
            System.out.println("Idade do aluno: " + aluno.getIdade());
            System.out.println("Matrícula do aluno: " + aluno.getMatricula());
    }

}
