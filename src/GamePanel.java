import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel {

    private static int WIDTH = 500;
    private static int HEIGHT = 500;
    public JButton [][] buttons;

    public GamePanel(){
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setLayout(new GridLayout(3, 3));

        buttons = new JButton[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].setFont(new Font("Arial", Font.BOLD, 50));
                add(buttons[i][j]);
            }
        }

    }

    public void launchGame(){}
}
