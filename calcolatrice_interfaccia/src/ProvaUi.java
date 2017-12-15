import javax.swing.*;
import java.awt.*;

public class CalcUi extends JFrame {

    public CalcUi () {
        /*
        setSize(screenWidth, screenHeight);
    }

    public static final int WIDTH = 300;
    public static final int HEIGHT= 200;
*/
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth / 2, screenHeight / 2);
        setLocation(screenWidth/8,screenHeight/4);
        Image img= kit.getImage("Keisuke's_FD_(5th_Stage).jpg");
        setIconImage(img);
        setTitle("Un po' di Java qua?");

        GifMode rx=new GifMode();
        Container container=getContentPane();
        container.add(rx);
    }



    public class GifMode extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawString("Brappappappa",getWidth()/2,getHeight()/8);


        }
    }

}
