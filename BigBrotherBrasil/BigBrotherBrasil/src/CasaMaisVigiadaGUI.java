import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class CasaMaisVigiadaGUI {

    public static void main(String[] args) {
        // Cadastro dos jogadores
        ArrayList<Jogador> jogadores = new ArrayList<>();
        jogadores.add(new Jogador("Alane Dias"));
        jogadores.add(new Jogador("Beatriz Reis"));
        jogadores.add(new Jogador("Davi Brito"));
        jogadores.add(new Jogador("Deniziane Ferreira"));
        jogadores.add(new Jogador("Fernanda Bande"));
        jogadores.add(new Jogador("Giovanna Lima"));
        jogadores.add(new Jogador("Giovanna Pitel"));
        jogadores.add(new Jogador("Isabelle Nogueira"));
        jogadores.add(new Jogador("Juninho"));
        jogadores.add(new Jogador("Leidy Elin"));
        jogadores.add(new Jogador("Lucas Henrique"));
        jogadores.add(new Jogador("Lucas Luigi"));
        jogadores.add(new Jogador("Lucas Pizane"));
        jogadores.add(new Jogador("Marcus Vinicius"));
        jogadores.add(new Jogador("Matteus Amaral"));
        jogadores.add(new Jogador("Maycon Cosmer"));
        jogadores.add(new Jogador("MC Bin Laden"));
        jogadores.add(new Jogador("Michel Nogueira"));
        jogadores.add(new Jogador("Nizam"));
        jogadores.add(new Jogador("Raquele Cardozo"));
        jogadores.add(new Jogador("Rodriguinho"));
        jogadores.add(new Jogador("Thalyta Alves"));
        jogadores.add(new Jogador("Vanessa Lopes"));
        jogadores.add(new Jogador("Vinicius Rodrigues"));
        jogadores.add(new Jogador("Wanessa Camargo"));
        jogadores.add(new Jogador("Yasmin Brunet"));

        // Frame principal
        JFrame frame = new JFrame("Casa Mais Vigiada");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null); // Centraliza a janela

        // Painel para botões
        JPanel buttonPanel = new JPanel(new FlowLayout());

        // Botão para votar
        JButton voteButton = new JButton("Votar");
        voteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String voto;
                do {
                    voto = JOptionPane.showInputDialog(null, "Em quem você vota para sair da casa? ");
                    if (voto != null && !voto.equalsIgnoreCase("sair")) {
                        boolean encontrado = false;
                        for (Jogador jogador : jogadores) {
                            if (jogador.getNome().equalsIgnoreCase(voto)) {
                                jogador.incrementaUmVoto();
                                encontrado = true;
                                JOptionPane.showMessageDialog(null, "Voto computado com sucesso!");
                                break;
                            }
                        }
                        if (!encontrado) {
                            JOptionPane.showMessageDialog(null, "Jogador não encontrado na lista.");
                        }
                    }
                } while (voto != null && !voto.equalsIgnoreCase("sair"));
            }
        });

        // Botão para apurar resultado
        JButton resultButton = new JButton("Apurar resultado");
        resultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Apuração dos votos e discurso de eliminação
                Jogador eliminado = jogadores.get(0);
                for (Jogador jogador : jogadores) {
                    if (jogador.getVotos() > eliminado.getVotos()) {
                        eliminado = jogador;
                    }
                }

                JOptionPane.showMessageDialog(null, "Se eu conseguir mover montanhas, se eu conseguir surfar um tsunami,\n" +
                        "se eu conseguir domar o sol, se eu conseguir fazer o mar virar sertão,\n" +
                        "e o sertão virar mar, se eu conseguir dizer o que eu nunca vou conseguir dizer,\n" +
                        "aí terá chegado o dia em que eu vou conseguir te eliminar com alegria.\n" +
                        "Com " + eliminado.getVotos() + " votos, é você quem sai " + eliminado.getNome());
            }
        });

        // Adicionar botões ao painel
        buttonPanel.add(voteButton);
        buttonPanel.add(resultButton);

        // Adicionar painel de botões ao frame
        frame.add(buttonPanel, BorderLayout.CENTER);

        // Exibir frame
        frame.setVisible(true);
    }
}
