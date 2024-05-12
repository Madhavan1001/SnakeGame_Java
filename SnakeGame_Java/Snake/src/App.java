import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        SnakeGame game = new SnakeGame(600, 600);

        // Create a restart button
        JButton restartButton = new JButton("Restart");
        restartButton.setPreferredSize(new Dimension(400, 30)); // Adjust size here
        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.restart();
            }
        });

        // Create a panel for the restart button
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(restartButton);

        // Add the game panel and button panel to the frame
        frame.add(game, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
