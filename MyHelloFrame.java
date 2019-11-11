
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * 여기에 MyHelloFrame 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyHelloFrame extends JFrame
{
    public MyHelloFrame(){
        this.setTitle("실습#3(2019.11.11)"); // 제목을 실습#3(2019.11.11)으로 설정
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //종료할때 시스템도 같이 종료
        
        this.setSize(300, 400); // 300, 400으로 크기 설정
        this.setVisible(true); 
    }
}
