import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class UI {
    GameManager gm;
    JFrame window;
    public JTextArea messageText;
    public JPanel bgPanel[] = new JPanel[15];
    public JLabel bgLabel[] = new JLabel[15];

    public UI(GameManager gm) {
        this.gm = gm;

        createMainField();
        createBackground();
        window.setVisible(true);
    }
    public void createMainField(){
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);

        messageText = new JTextArea("This is a sample");
        messageText.setBounds(50,410,700,150);
        messageText.setBackground(new Color(0, 0, 0));
        messageText.setForeground(Color.white);
        messageText.setEditable(false);
        messageText.setLineWrap(true);
        messageText.setWrapStyleWord(true);
        window.add(messageText);
        messageText.setFont(new Font("Georgia", Font.PLAIN, 20));
        window.add(messageText);
    }
    public void createBackground() {
        bgPanel[1] = new JPanel();
        bgPanel[1].setBounds(50, 50, 700, 350);
        bgPanel[1].setBackground(Color.blue);
        bgPanel[1].setLayout(null);
        window.add(bgPanel[1]);

        bgLabel[1] = new JLabel();
        bgLabel[1].setBounds(0, 0, 700, 350);

        
    }
}
