
import java.awt.event.*;
import javax.swing.*;
/**
 * Panel 클래스와 Listener 클래스를 구현한 MyHelloPanelListener 클래스
 * 
 * @author (2018315033 태영준, 2018315017 임민택) 
 * @version (2019.11.11)
 */
public class MyHelloPanelListener extends JPanel
{
    public JLabel ml;
    public MyHelloPanelListener(){
        this.setLayout(null);
        ml = new JLabel("HELLO");
        ml.setSize(50,20);
        ml.setLocation(30,30);
        this.add(ml);
        this.addKeyListener(new myKeyListener(ml));
        this.addMouseListener(new myMouseListener(ml));
        ml.addKeyListener(new myKeyListener(ml));
    }

    class myMouseListener implements MouseListener{
        public JLabel ml;
        public myMouseListener(JLabel ml){
            this.ml = ml;
        }
        public void mouseClicked(MouseEvent e){}

        public void mouseEntered(MouseEvent e){}

        public void mouseExited(MouseEvent e){}

        public void mousePressed(MouseEvent e){
            ml.setLocation(e.getX(), e.getY());
        }

        public void mouseReleased(MouseEvent e){

        }
    }

    class myKeyListener extends KeyAdapter{
        public JLabel ml;
        public myKeyListener(JLabel ml){
            this.ml = ml;
        }
        public void keyPressed(KeyEvent e){
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_UP:
                    ml.setLocation(ml.getX(), ml.getY()-10); break;
                case KeyEvent.VK_DOWN:
                    ml.setLocation(ml.getX(), ml.getY()+10); break;
                case KeyEvent.VK_LEFT:
                    ml.setLocation(ml.getX()-10, ml.getY()); break;
                case KeyEvent.VK_RIGHT:
                    ml.setLocation(ml.getX()+10, ml.getY()); break;
            }
        }
    }
}
