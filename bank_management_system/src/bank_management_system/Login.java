
package bank_management_system;

import javax.swing.*;
import java.awt.*; //for image class
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JTextField cardTextField,pinTextField;
    JButton login,clear,signup;
    
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        
        // default layout: border layout. by setbounds we r making a custom layout. so make it null
        setLayout(null);
      
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image img2=img.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);        
        ImageIcon img3=new ImageIcon(img2);
        JLabel label=new JLabel(img3); //can give imageicon as parameter. but cant add image, so convert image to imageclass
        label.setBounds(70,10,100,100);//w from left wrt frame, from top wrt frame, length of element
        add(label);
        
        
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
        
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(120,150,150,40);
        add(cardno);
        
        cardTextField=new JTextField();
        cardTextField.setBounds(300,150,230,30);
        add(cardTextField);
        
        pinTextField=new JTextField();
        pinTextField.setBounds(300,220,230,30);
        add(pinTextField);        
        
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(120,220,250,30);
        add(pin);
        
        login=new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        add(login);
        
        clear=new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        add(clear);
        
        signup=new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        getContentPane().setBackground(Color.WHITE); //to select whole frame
        

        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }else if(ae.getSource()==login){
        
        }else if(ae.getSource()==signup){
            setVisible(false);
            new SignUpOne().setVisible(true);
        }
    }
    
    public static void main(String args[]){
        new Login();
    }
    
}
