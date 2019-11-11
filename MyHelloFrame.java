
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * 여기에 MyHelloFrame 클래스 설명을 작성하십시오.
 * 
 * @author (2018315033 태영준. 2018315017 임민택) 
 * @version (2019.11.11)
 */
public class MyHelloFrame extends JFrame
{
    public JPanel mp;
    public JLabel ml;
    public MyHelloFrame(){
        this.setTitle("실습#3(2019.11.11)");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mp = new JPanel();
        this.add(mp);
        
        ml = new JLabel("HELLO");
        mp.add(ml);
        
        this.setSize(300, 400);
        this.setVisible(true);
    }
}
