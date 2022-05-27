import javax.swing.JFrame;
public class AppFrame extends JFrame {
  AppFrame() {
    this.add(new SnakeGame());
    this.setTitle("Snake Game");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.pack();
    this.setVisible(true);
    this.setLocationRelativeTo(null);
  }
}
