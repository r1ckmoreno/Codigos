public abstract class Projeto {
    private String nomeProjeto;
    private String descricao;
    private String endereco;
    private String dataInicio;
    private String dataFim;

    public Projeto(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim) {
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
        this.endereco = endereco;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    // Getters and Setters
    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
}

public class DistribuicaoAlimento extends Projeto {
    private String descAlimento;
    private float qtde;

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim,
                                String descAlimento, float qtde) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public boolean validaProjeto(String nomeProjeto) {
        return getDataFim().isEmpty();
    }

    public String imprimeProjeto() {
        return "Nome do Projeto: " + getNomeProjeto() + "\nDescrição: " + getDescricao() +
                "\nData de Início: " + getDataInicio() + "\nData de Fim: " + getDataFim() +
                "\nDescrição do Alimento: " + descAlimento + "\nQuantidade: " + qtde;
    }
}

public class TrabalhoVoluntario extends Projeto {
    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim,
                               String tipoTrabalho, int duracaoTrabalho) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public boolean validaProjeto(String nomeProjeto) {
        return duracaoTrabalho > 2;
    }

    public String imprimeProjeto() {
        return "Nome do Projeto: " + getNomeProjeto() + "\nDescrição: " + getDescricao() +
                "\nData de Início: " + getDataInicio() + "\nData de Fim: " + getDataFim() +
                "\nTipo de Trabalho: " + tipoTrabalho + "\nDuração do Trabalho: " + duracaoTrabalho;
    }
}

public class ProjetoSocial {
    public static void main(String[] args) {
        DistribuicaoAlimento distribuicao = new DistribuicaoAlimento("Projeto Alimentação", "Distribuição de alimentos para pessoas necessitadas",
                "Rua das Flores, 123", "01/05/2024", "", "Cesta Básica", 100);
        System.out.println("Validação do Projeto de Distribuição de Alimentos: " + distribuicao.validaProjeto("Projeto Alimentação"));
        System.out.println(distribuicao.imprimeProjeto());

        TrabalhoVoluntario trabalho = new TrabalhoVoluntario("Voluntariado na Comunidade", "Ajudar na limpeza e organização da comunidade",
                "Avenida Principal, 456", "10/06/2024", "15/06/2024", "Limpeza", 3);
        System.out.println("\nValidação do Projeto de Trabalho Voluntário: " + trabalho.validaProjeto("Voluntariado na Comunidade"));
        System.out.println(trabalho.imprimeProjeto());
    }
}