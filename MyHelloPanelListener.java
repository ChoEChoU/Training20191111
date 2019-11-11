
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
/**
 * 여기에 MyHelloPanelListener 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyHelloPanelListener extends JPanel
{
    public JLabel ml;
    public MyHelloPanelListener(){
        ml = new JLabel("HELLO");
        this.add(ml);
        this.addKeyListener(new myKeyListener(ml));
        this.addMouseListener(new myMouseListener(ml));
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

    class myKeyListener implements KeyListener{
        public JLabel ml;
        private final int FLYING_UNIT = 10;
        public myKeyListener(JLabel ml){
            this.ml = ml;
        }
        public void keyPressed(KeyEvent e){
            int keyCode = e.getKeyCode();
            
            switch(keyCode) {
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

        public void keyReleased(KeyEvent e){

        }

        public void keyTyped(KeyEvent e){

        }
    }
}
