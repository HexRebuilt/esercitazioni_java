import calcolatriceModel.Calcolatrice;

import java.awt.*;
import javax.swing.*;

public class ButtonFrame extends JFrame{
    public ButtonFrame(){
        Calcolatrice calc=new Calcolatrice();

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth/2,screenHeight/2);
        setLocation(screenWidth/4,screenHeight/4);
        setTitle("Calculator");

        //DisplayPanel pann = new DisplayPanel();
        PanelLayout panel = new PanelLayout(calc); //bottoni
        lable areaTesto = new lable(calc);
        ImagePanel img = new ImagePanel();
        Container contentPane = getContentPane();
        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout());
        contentPane.add(jp);
        areaTesto.setFont(new Font("Serif", Font.ITALIC,40) );


        //jp.add(pann, BorderLayout.NORTH);
        jp.add(panel);
        jp.add(img, BorderLayout.SOUTH);
        jp.add(areaTesto, BorderLayout.NORTH);
    }
}

class lable extends JLabel {
    public lable(Calcolatrice calc) {
        setPreferredSize(new Dimension(350, 150));
        setBackground(Color.blue);
    }

}

//TODO metto nell'action listener e performed   this.setText(calc.getDisplay())

class DisplayPanel extends JPanel {
    public DisplayPanel() {
        setPreferredSize(new Dimension(350, 190));
        setBackground(Color.darkGray);
    }
}

class PanelLayout extends JPanel{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;

    public PanelLayout(Calcolatrice calc) {
        super();
        b1 = new JButton("AC");
        b1.setBackground(Color.lightGray);
        b1.setFont(new Font("Arial", Font.PLAIN, 40));
        b2 = new JButton("+/-");
        b2.setBackground(Color.lightGray);
        b2.setFont(new Font("Arial", Font.PLAIN, 40));
        b3 = new JButton("%");
        b3.setBackground(Color.lightGray);
        b3.setFont(new Font("Arial", Font.PLAIN, 40));
        b4 = new JButton("/");
        b4.setBackground(Color.orange);
        b4.setFont(new Font("Arial", Font.PLAIN, 40));
        b5 = new JButton("7");
        b5.setFont(new Font("Arial", Font.PLAIN, 40));
        b6 = new JButton("8");
        b6.setFont(new Font("Arial", Font.PLAIN, 40));
        b7 = new JButton("9");
        b7.setFont(new Font("Arial", Font.PLAIN, 40));
        b8 = new JButton("*");
        b8.setBackground(Color.orange);
        b8.setFont(new Font("Arial", Font.PLAIN, 40));
        b9 = new JButton("4");
        b9.setFont(new Font("Arial", Font.PLAIN, 40));
        b10 = new JButton("5");
        b10.setFont(new Font("Arial", Font.PLAIN, 40));
        b11 = new JButton("6");
        b11.setFont(new Font("Arial", Font.PLAIN, 40));
        b12 = new JButton("-");
        b12.setBackground(Color.orange);
        b12.setFont(new Font("Arial", Font.PLAIN, 40));
        b13 = new JButton("1");
        b13.setFont(new Font("Arial", Font.PLAIN, 40));
        b14 = new JButton("2");
        b14.setFont(new Font("Arial", Font.PLAIN, 40));
        b15 = new JButton("3");
        b15.setFont(new Font("Arial", Font.PLAIN, 40));
        b16 = new JButton("+");
        b16.setBackground(Color.orange);
        b16.setFont(new Font("Arial", Font.PLAIN, 40));
        b17 = new JButton("DELETE");
        b17.setFont(new Font("Arial", Font.PLAIN, 40));
        b18 = new JButton("0");
        b18.setFont(new Font("Arial", Font.PLAIN, 40));
        b19 = new JButton(".");
        b19.setFont(new Font("Arial", Font.PLAIN, 40));
        b20 = new JButton("=");
        b20.setBackground(Color.orange);
        b20.setFont(new Font("Arial", Font.PLAIN, 40));

        setLayout(new GridLayout(5,4));

        add(b1); add(b2); add(b3); add(b4);
        add(b5); add(b6); add(b7); add(b8);
        add(b9); add(b10); add(b11); add(b12);
        add(b13); add(b14); add(b15); add(b16);
        add(b17); add(b18); add(b19); add(b20);
    }
}

class ImagePanel extends JPanel{
    private Image image;

    public ImagePanel() {
        Toolkit kit = getToolkit();
        image = kit.getImage("hero2_section_D-min.jpg");
        setPreferredSize(new Dimension(350, 30));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
}
