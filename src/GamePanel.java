import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel implements ActionListener {

    private static int WIDTH = 500;
    private static int HEIGHT = 500;

    private int currentPlayer;
    public JButton [][] buttons;

    public GamePanel(){
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setLayout(new GridLayout(3, 3));

        buttons = new JButton[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].setFont(new Font("Arial", Font.BOLD, 50));
                buttons[i][j].addActionListener(this);
                add(buttons[i][j]);
            }
        }

    }
    public void checkWinner(String text){

        for (int i = 0; i < 3; i++) {
            int soucet = 0;
            for (int j = 0; j < 3; j++) {
                if (buttons[i][j].getText().equals(text)) {
                    soucet++;
                    System.out.println("CHANGE");
                }
                if (soucet > 2) {
                    System.out.println("WINNER");
                }
            }
        }

    }



    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();

        if (clickedButton.getText().equals("")) {
            if (currentPlayer == 1) {
                currentPlayer = 0;
                clickedButton.setText("X");
                checkWinner("X");
            } else {
                clickedButton.setText("O");
                checkWinner("0");
                currentPlayer = 1;
            }
        }
    }
    public void launchGame(){}
}
