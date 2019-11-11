
import java.awt.event.*;
import javax.swing.*;
/**
 * Panel 클래스와 Listener 클래스를 구현한 MyHelloPanelListener 클래스
 * 
 * @author (2018315033 태영준, 2018315017 임민택) 
 * @version (2019.11.11)
 */
public class MyHelloPanelListener extends JPanel implements MouseListener, KeyListener
{
    public JLabel ml = new JLabel("HELLO");

    public MyHelloPanelListener(){
        this.add(ml);
    }

    public void mouseClicked(MouseEvent e){
    }

    public void mouseEntered(MouseEvent e){   
    }

    public void mouseExited(MouseEvent e){   
    }

    public void mousePressed(MouseEvent e){
        ml.setLocation(e.getX(),e.getY());
    }

    public void mouseReleased(MouseEvent e){   
    }

    public void keyPressed(KeyEvent e){
        int x = ml.getX();
        int y = ml.getY();
        if ((e.getKeyCode()) == (e.VK_RIGHT)){
            ml.setLocation(ml.getX()+10, ml.getY());
        }
<<<<<<< HEAD

        public void mouseClicked(MouseEvent e){}

        public void mouseEntered(MouseEvent e){}

        public void mouseExited(MouseEvent e){}

        public void mousePressed(MouseEvent e){
            ml.setLocation(e.getX(), e.getY());
=======
        else if ((e.getKeyCode()) == (e.VK_DOWN)){
            ml.setLocation(ml.getX(), ml.getY()+10);
>>>>>>> 4c06ed5b1d5f4d98edbd9d35c4b9a6cd5cc01c4d
        }
        else if ((e.getKeyCode()) == (e.VK_LEFT)){
            ml.setLocation(ml.getX()-10, ml.getY());
        }
        else if ((e.getKeyCode()) == (e.VK_UP)){
            ml.setLocation(ml.getX(), ml.getY()-10);
        }
    }

<<<<<<< HEAD
    class myKeyListener extends KeyAdapter{
        public JLabel ml;
        public myKeyListener(JLabel ml){
            this.ml = ml;
        }

        public void keyPressed(KeyEvent e){
            int keyCode = e.getKeyCode();
            public final int FLYING_UNIT = 10;
            switch (keyCode) {

                case KeyEvent.VK_UP:
                ml.setLocation(ml.getX(), ml.getY()-FLYING_UNIT); break;
                case KeyEvent.VK_DOWN:
                ml.setLocation(ml.getX(), ml.getY()+FLYING_UNIT); break;
                case KeyEvent.VK_LEFT:
                ml.setLocation(ml.getX()-FLYING_UNIT, ml.getY()); break;
                case KeyEvent.VK_RIGHT:
                ml.setLocation(ml.getX()+FLYING_UNIT, ml.getY()); break;

            }
        }
=======
    public void keyReleased(KeyEvent e){
    
    }

    public void keyTyped(KeyEvent e){
    
>>>>>>> 4c06ed5b1d5f4d98edbd9d35c4b9a6cd5cc01c4d
    }
}
