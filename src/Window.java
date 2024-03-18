import javax.swing.*;

public class Window extends JFrame {

    public Window(){

        JFrame window = new JFrame("Piskvorky");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        GamePanel gamePanel = new GamePanel();
        JOptionPane.showMessageDialog(null, "First player start with O","Message", JOptionPane.INFORMATION_MESSAGE);
        window.add(gamePanel);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamePanel.launchGame();
    }
}
