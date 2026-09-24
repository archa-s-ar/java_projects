
package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUpTwo extends JFrame implements ActionListener{
    
    JComboBox religBox,catBox,incBox,eduBox,occuBox;
    JTextField panTextField, aadharTextField;
    JRadioButton syes, sno,eyes,eno;
    JButton next;
    String formno;
    
    SignUpTwo(String formno){
        
        this.formno=formno;
        
        setLayout(null);
        
        //TITLE
        setTitle("NEW ACCOUNT APPLICATION - FORM 2");
        
        JLabel additionalDetails=new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,30));
        additionalDetails.setBounds(300,50,400,40);
        add(additionalDetails);
        
        //religion
        JLabel religion=new JLabel("Religion:");
        religion.setFont(new Font("Raleway",Font.BOLD,16));
        religion.setBounds(140,100,100,30);
        add(religion);
        
        String valReligion[]={"Hindu","Muslim","Christian","Sikh","Other"};
        religBox=new JComboBox(valReligion);
        religBox.setBounds(300,100,400,30);
        religBox.setBackground(Color.WHITE);
        add(religBox);
        
        //category
        JLabel category=new JLabel("Category: ");
        category.setFont(new Font("Raleway",Font.BOLD,16));
        category.setBounds(140,150,150,30);
        add(category);
        
        String valcat[]={"General","OBC","SC","ST","Other"};
        catBox=new JComboBox(valcat);
        catBox.setBackground(Color.WHITE);
        catBox.setBounds(300,150,400,30);
        add(catBox);
        
        //income
        JLabel income=new JLabel("Income: ");
        income.setFont(new Font("Raleway",Font.BOLD,16));
        income.setBounds(140,200,150,30);
        add(income);
        
        String valinc[]={"Null","<1,50,000","<2,50,000","<5,50,000","Upto 10,00,000"};
        incBox=new JComboBox(valinc);
        incBox.setBackground(Color.WHITE);
        incBox.setBounds(300,200,400,30);
        add(incBox);
        
        //edu
        JLabel edu=new JLabel("Educational ");
        edu.setFont(new Font("Raleway",Font.BOLD,16));
        edu.setBounds(140,240,150,40);
        add(edu);
        
        JLabel quali=new JLabel("Qualification: ");
        quali.setFont(new Font("Raleway",Font.BOLD,16));
        quali.setBounds(140,260,150,40);
        add(quali);
        
        String valedu[]={"Non-Graduation","Under Graduate","Post Graduate","Doctorate","Others"};
        eduBox=new JComboBox(valedu);
        eduBox.setBackground(Color.WHITE);
        eduBox.setBounds(300,250,400,30);
        add(eduBox);
        
        //occu
        JLabel occu=new JLabel("Occupation: ");
        occu.setFont(new Font("Raleway",Font.BOLD,16));
        occu.setBounds(140,300,150,30);
        add(occu);
        
        String valoccu[]={"Salaried","Self-Employed","Bussiness","Student","Retired","Others"};
        occuBox=new JComboBox(valoccu);
        occuBox.setBackground(Color.WHITE);
        occuBox.setBounds(300,300,400,30);
        add(occuBox);
        
        //pan
        JLabel pan=new JLabel("PAN Number: ");
        pan.setFont(new Font("Raleway",Font.BOLD,16));
        pan.setBounds(140,350,150,30);
        add(pan);
        
        panTextField=new JTextField();
        panTextField.setFont(new Font("Raleway",Font.BOLD,14));
        panTextField.setBounds(300,350,400,30);
        add(panTextField);
        
        //aadhar
        JLabel aadhar=new JLabel("Aadhar Number: ");
        aadhar.setFont(new Font("Raleway",Font.BOLD,16));
        aadhar.setBounds(140,400,150,30);
        add(aadhar);
        
        aadharTextField=new JTextField();
        aadharTextField.setFont(new Font("Raleway",Font.BOLD,14));
        aadharTextField.setBounds(300,400,400,30);
        add(aadharTextField);
        
        //senior?
        JLabel senior=new JLabel("Senior Citizen: ");
        senior.setFont(new Font("Raleway",Font.BOLD,16));
        senior.setBounds(140,450,150,30);
        add(senior);
        
        syes=new JRadioButton("Yes");
        syes.setFont(new Font("Raleway",Font.BOLD,14));
        syes.setBounds(300,450,70,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno=new JRadioButton("No");
        sno.setFont(new Font("Raleway",Font.BOLD,14));
        sno.setBounds(400,450,70,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup sgroup=new ButtonGroup();
        sgroup.add(syes);
        sgroup.add(sno);
        
        //existing?
        JLabel exist=new JLabel("Existing Account: ");
        exist.setFont(new Font("Raleway",Font.BOLD,16));
        exist.setBounds(140,500,150,30);
        add(exist);
        
        eyes=new JRadioButton("Yes");
        eyes.setFont(new Font("Raleway",Font.BOLD,14));
        eyes.setBounds(300,500,70,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno=new JRadioButton("No");
        eno.setFont(new Font("Raleway",Font.BOLD,14));
        eno.setBounds(400,500,70,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup egroup=new ButtonGroup();
        egroup.add(eyes);
        egroup.add(eno);
        
        //button
        next=new JButton("Next");
        next.setBounds(650,600,60,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        //frame
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        String religion=(String)religBox.getSelectedItem();//get... returns obj
        String category=(String) catBox.getSelectedItem();
        String income=(String)incBox.getSelectedItem();
        String education=(String)eduBox.getSelectedItem();
        String occupation=(String)occuBox.getSelectedItem();
        
        String panno=panTextField.getText();
        String aadharno=aadharTextField.getText();
    
        String seniorcitizen=null;
        
        if(syes.isSelected()){
           seniorcitizen="Yes";
        }
        else if(sno.isSelected()){
            seniorcitizen="No";
        }
    
        String existingaccount=null;
        
        if(eyes.isSelected()){
            existingaccount="Yes";
        }
        else if(eno.isSelected()){
            existingaccount="No";
        }
        
        try{
        Conn c=new Conn();
        String query="INSERT INTO signuptwo values ('"
                        +formno+"','"
                        +religion+"','"
                        +category+"','"
                        +income+"','"
                        +education+"','"
                        +occupation+"','"
                        +panno+"','"
                        +aadharno+"','"
                        +seniorcitizen+"','"
                        +existingaccount+"')";
        
        c.s.executeUpdate(query);
        
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }


public static void main(String args[]){
    new SignUpTwo("");//pass an empty string instead of formno
}
}