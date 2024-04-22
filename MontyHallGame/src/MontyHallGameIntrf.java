import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MontyHallGameIntrf extends JFrame {
    private JLabel titleLabel;
    private JLabel instructionLabel;
    private JButton[] doorsButtons;
    private JButton switchButton;
    private JButton stayButton;

    private int winningDoor;
    private int chosenDoor;
    private int openedDoor;

    public MontyHallGameIntrf() {
        setTitle("Monty Hall Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        titleLabel = new JLabel("Bem-vindo ao jogo Monty Hall!");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(titleLabel);

        instructionLabel = new JLabel("Escolha uma porta:");
        instructionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(instructionLabel);

        doorsButtons = new JButton[3];
        for (int i = 0; i < doorsButtons.length; i++) {
            doorsButtons[i] = new JButton("Porta " + (i + 1));
            doorsButtons[i].addActionListener(new DoorButtonListener());
            panel.add(doorsButtons[i]);
        }

        switchButton = new JButton("Trocar de porta");
        switchButton.addActionListener(new SwitchButtonListener());
        panel.add(switchButton);

        stayButton = new JButton("Manter a porta");
        stayButton.addActionListener(new StayButtonListener());
        panel.add(stayButton);

        add(panel, BorderLayout.CENTER);
        setVisible(true);

        winningDoor = new Random().nextInt(3) + 1;
    }

    private class DoorButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            for (int i = 0; i < doorsButtons.length; i++) {
                if (button == doorsButtons[i]) {
                    chosenDoor = i + 1;
                    break;
                }
            }
            openedDoor = openRandomEmptyDoor();
            instructionLabel.setText("O apresentador abriu a porta " + openedDoor + " que está vazia.");
        }
    }

    private class SwitchButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (chosenDoor == 0) {
                JOptionPane.showMessageDialog(MontyHallGameIntrf.this, "Por favor, escolha uma porta primeiro.");
                return;
            }

            int[] remainingDoors = remainingDoors();
            for (int door : remainingDoors) {
                if (door != chosenDoor && door != openedDoor) {
                    chosenDoor = door;
                    break;
                }
            }
            checkResult();
        }
    }

    private class StayButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (chosenDoor == 0) {
                JOptionPane.showMessageDialog(MontyHallGameIntrf.this, "Por favor, escolha uma porta primeiro.");
                return;
            }
            checkResult();
        }
    }

    private int openRandomEmptyDoor() {
        int[] remainingDoors = remainingDoors();
        int randomIndex = new Random().nextInt(remainingDoors.length);
        return remainingDoors[randomIndex];
    }

    private int[] remainingDoors() {
        int[] remaining = new int[2];
        int index = 0;
        for (int i = 1; i <= 3; i++) {
            if (i != chosenDoor && i != winningDoor) {
                remaining[index++] = i;
            }
        }
        return remaining;
    }

    private void checkResult() {
        String result;
        if (chosenDoor == winningDoor) {
            result = "Você ganhou! Parabéns!";
        } else {
            result = "Você perdeu. A porta premiada era a " + winningDoor + ".";
        }
        instructionLabel.setText(result);
        disableAllDoors();
    }

    private void disableAllDoors() {
        for (JButton doorButton : doorsButtons) {
            doorButton.setEnabled(false);
        }
        switchButton.setEnabled(false);
        stayButton.setEnabled(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MontyHallGameIntrf::new);
    }
}
