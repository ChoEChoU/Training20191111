
import java.awt.event.*;
import javax.swing.*;
/**
 * 여기에 MyHelloPanelListener 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyHelloPanelListener extends JPanel implements KeyListener, MouseListener
{
    public JLabel ml;
    public MyHelloPanelListener(){
        ml = new JLabel("HELLO");
        
        this.add(ml);
        
    }
    
    public void keyPressed(KeyEvent e){
    
    }
    
    public void keyReleased(KeyEvent e){
    
    }
    
    public void keyTyped(KeyEvent e){
    
    }
    
    public void mouseClicked(MouseEvent e){
    
    }
    
    public void mouseEntered(MouseEvent e){
    
    }
    
    public void mouseExited(MouseEvent e){
    
    }
    
    public void mousePressed(MouseEvent e){
    
    }
    
    public void mouseReleased(MouseEvent e){
    
    }
}
