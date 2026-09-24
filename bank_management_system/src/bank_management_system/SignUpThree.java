
package bank_management_system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;


public class SignUpThree extends JFrame{
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    
    SignUpThree(){
        
        
        setTitle("ACCOUNT DETAILS");
        
        JLabel head=new JLabel("Page 3: Account Details");
        head.setFont(new Font("Raleway",Font.BOLD,22));
        head.setBounds(300,70,400,30);
        add(head);
        
        //type
        JLabel type = new JLabel("Account Type:");
        type.setFont(new Font("Raleway",Font.BOLD,16));
        type.setBounds(140,140,200,30);
        add(type);
        
        r1 = new JRadioButton("Savings Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(140,180,160,30);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(320,180,200,30);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(140,220,160,30);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(320,220,250,30);
        add(r4);
        
        ButtonGroup typegrp= new ButtonGroup();
        typegrp.add(r1);
        typegrp.add(r2);
        typegrp.add(r3);
        typegrp.add(r4);
        
        //card details
        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("Raleway",Font.BOLD,16));
        card.setBounds(140,270,200,30);
        add(card);
        
        JLabel cnumber = new JLabel("XXXX-XXXX-XXXX-4184"); //dummy
        cnumber.setFont(new Font("Raleway",Font.BOLD,22));
        cnumber.setBounds(300,270,250,30); //540
        add(cnumber);
        
        JLabel cdetails = new JLabel("Your 16 digit card number"); //dummy
        cdetails.setFont(new Font("Raleway",Font.BOLD,12));
        cdetails.setBounds(140,295,250,30); //540
        add(cdetails);
        
        //pinnum
        JLabel pin = new JLabel("Pin:"); 
        pin.setFont(new Font("Raleway",Font.BOLD,16));
        pin.setBounds(140,320,250,30);
        add(pin);
        
        JLabel pnumber = new JLabel("XXXX"); //dummy
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(300,320,250,30);
        add(pnumber);
        
        JLabel pdetails = new JLabel("Your 4 digit pin number");
        pdetails.setFont(new Font("Raleway",Font.BOLD,12));
        pdetails.setBounds(140,345,250,30); //540
        add(pdetails);
        
        //services
        JLabel services = new JLabel("Services Required:"); 
        services.setFont(new Font("Raleway",Font.BOLD,16));
        services.setBounds(140,390,250,30); 
        add(services);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBackground(Color.WHITE);
        c1.setBounds(140,430,130,30);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBackground(Color.WHITE);
        c2.setBounds(300,430,160,30);
        add(c2);
        
        c3 = new JCheckBox("E-mail & SMS Alerts");
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBackground(Color.WHITE);
        c3.setBounds(490,430,200,30);
        add(c3);
        
        c4 = new JCheckBox("Mobile Banking");
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBackground(Color.WHITE);
        c4.setBounds(140,470,150,30);
        add(c4);
        
        c5 = new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBackground(Color.WHITE);
        c5.setBounds(300,470,130,30);
        add(c5);
        
        c6 = new JCheckBox("E-statement");
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBackground(Color.WHITE);
        c6.setBounds(490,470,130,30);
        add(c6);
        
        c7 = new JCheckBox("I hereby declares that the above mentioned details are correct to the best of my knowledge");
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(140,550,500,30);
        c7.setBackground(Color.WHITE);
        add(c7);
        
        //buttons
        submit= new JButton("SUBMIT");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(300,600,100,30);
        add(submit);
                
        cancel= new JButton("CANCEL");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(450,600,100,30);
        add(cancel);
        
        //frame
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setSize(850,820);
        setLocation(350,10);
        setVisible(true);
        
    }
    
    public static void main (String args[]){
        new SignUpThree();
}
}

