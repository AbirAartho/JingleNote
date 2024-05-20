
package jinglenote;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class About extends JFrame {
    
    About(){
        setBounds(100,100,500,400);
        setTitle("About Notepad Application");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ImageIcon icon = new ImageIcon(getClass().getResource("JingleNote.png"));
        setIconImage(icon.getImage());
        setLayout(null);
        
        JLabel iconLabel = new JLabel(new ImageIcon(getClass().getResource("JingleNote.png")));
        iconLabel.setBounds(100,50,80,80);
        add(iconLabel);
        
        JLabel textLabel = new JLabel("<html>Welcome to JingleNote.<br>JingleNote is a basic text-editing application programme and is used to write and read word documents.<br>Please use JingleNote as your daily notebook.");
        textLabel.setBounds(100,70,1000,300);
        textLabel.setFont(new Font(Font.SERIF, Font.PLAIN, 24));
        add(textLabel);
    }
    
    public static void main(String[] args){
        new About().setVisible(true);
    }
}
