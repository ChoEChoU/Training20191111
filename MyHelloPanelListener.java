
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            
            switch(keyCode) {
=======
=======
>>>>>>> 861e27fefb89de1773c69d35e2dce1816a4b883d
=======
>>>>>>> 861e27fefb89de1773c69d35e2dce1816a4b883d
            switch (keyCode) {
>>>>>>> a5bf69049c8d7693c254bf2358a8624245b9c7c2
                case KeyEvent.VK_UP:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                    ml.setLocation(ml.getX(), ml.getY()-FLYING_UNIT); break;
=======
                    ml.setLocation(ml.getX(), ml.getY()-10); break;
>>>>>>> a5bf69049c8d7693c254bf2358a8624245b9c7c2
=======
                    ml.setLocation(ml.getX(), ml.getY()-10); break;
>>>>>>> 861e27fefb89de1773c69d35e2dce1816a4b883d
=======
                    ml.setLocation(ml.getX(), ml.getY()-10); break;
>>>>>>> 861e27fefb89de1773c69d35e2dce1816a4b883d
                case KeyEvent.VK_DOWN:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                    ml.setLocation(ml.getX(), ml.getY()+FLYING_UNIT); break;
=======
                    ml.setLocation(ml.getX(), ml.getY()+10); break;
>>>>>>> a5bf69049c8d7693c254bf2358a8624245b9c7c2
=======
                    ml.setLocation(ml.getX(), ml.getY()+10); break;
>>>>>>> 861e27fefb89de1773c69d35e2dce1816a4b883d
=======
                    ml.setLocation(ml.getX(), ml.getY()+10); break;
>>>>>>> 861e27fefb89de1773c69d35e2dce1816a4b883d
                case KeyEvent.VK_LEFT:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                    ml.setLocation(ml.getX()-FLYING_UNIT, ml.getY()); break;
=======
                    ml.setLocation(ml.getX()-10, ml.getY()); break;
>>>>>>> a5bf69049c8d7693c254bf2358a8624245b9c7c2
=======
                    ml.setLocation(ml.getX()-10, ml.getY()); break;
>>>>>>> 861e27fefb89de1773c69d35e2dce1816a4b883d
=======
                    ml.setLocation(ml.getX()-10, ml.getY()); break;
>>>>>>> 861e27fefb89de1773c69d35e2dce1816a4b883d
                case KeyEvent.VK_RIGHT:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                    ml.setLocation(ml.getX()+FLYING_UNIT, ml.getY()); break;
=======
                    ml.setLocation(ml.getX()+10, ml.getY()); break;
>>>>>>> a5bf69049c8d7693c254bf2358a8624245b9c7c2
=======
                    ml.setLocation(ml.getX()+10, ml.getY()); break;
>>>>>>> 861e27fefb89de1773c69d35e2dce1816a4b883d
=======
                    ml.setLocation(ml.getX()+10, ml.getY()); break;
>>>>>>> 861e27fefb89de1773c69d35e2dce1816a4b883d
            }
        }
    }
}
