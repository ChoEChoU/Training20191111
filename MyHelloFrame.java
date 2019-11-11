
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * Frame을 구현한 MyHelloFrame 클래스
 * 
 * @author (2018315033 태영준. 2018315017 임민택) 
 * @version (2019.11.11)
 */
public class MyHelloFrame extends JFrame
{
    public MyHelloFrame()
    {
        this.setTitle("실습_3(2019.11.11)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyHelloPanelListener mypl = new MyHelloPanelListener();
        this.add(mypl);
        
        mypl.setFocusable(true);
        mypl.requestFocus();
        
        mypl.addMouseListener(mypl);
        mypl.addKeyListener(mypl);
        
        this.setSize(300, 400);
        setVisible(true);
    }
}

