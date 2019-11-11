
import java.awt.event.*;
import javax.swing.*;
/**
 * 여기에 MyHelloPanelListener 클래스 설명을 작성하십시오.
 * 
 * @author (2018315033 태영준, 2018315017 임민택) 
 * @version (2019.11.11)
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

    class myKeyListener extends KeyAdapter{
        public JLabel ml;
        public myKeyListener(JLabel ml){
            this.ml = ml;
        }
        public void keyPressed(KeyEvent e){
            int keyCode = e.getKeyCode();
            ml.setText(String.valueOf(keyCode));
            switch (keyCode) {
                case KeyEvent.VK_UP:
                    ml.setLocation(ml.getX(), ml.getY()-10);
                case KeyEvent.VK_DOWN:
                    ml.setLocation(ml.getX(), ml.getY()+10);
                case KeyEvent.VK_LEFT:
                    ml.setLocation(ml.getX()-10, ml.getY());
                case KeyEvent.VK_RIGHT:
                    ml.setLocation(ml.getX()+10, ml.getY());
            }
        }
    }
}
