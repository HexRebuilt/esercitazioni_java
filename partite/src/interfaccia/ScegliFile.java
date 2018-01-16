package interfaccia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScegliFile extends JFrame{
    public String file;

    public void ScegliFile(String file) throws HeadlessException {
        this.file = file;
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        size.setSize(size.getWidth() / 8, size.getHeight() / 8);
        frame.setSize(size);
        frame.setTitle("Tabellone segnapunti");
        frame.setLocation(toolkit.getScreenSize().width / 4, toolkit.getScreenSize().height / 4);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        JButton calcio = new JButton("Calcio");
        JButton pallavvolo = new JButton("Pallavvolo");

        add(calcio);
        add(pallavvolo);

        ActionListener football = new fileCalcio();
        ActionListener volleyball = new filePallavvolo();

        calcio.addActionListener(football);
        pallavvolo.addActionListener(volleyball);

    }

    public class fileCalcio implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            file="calcio.txt";

        }

    }
    public class filePallavvolo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            file= "volley.txt";
        }

    }

}
