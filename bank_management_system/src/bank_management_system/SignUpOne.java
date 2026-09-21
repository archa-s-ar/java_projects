
package bank_management_system;

import java.awt.*;
import javax.swing.*;
import java.util.*; // random in util class
import com.toedter.calendar.JDateChooser;

public class SignUpOne extends JFrame{
    
    SignUpOne(){
        
        setLayout(null);
        
        Random ran= new Random();
        long random=Math.abs(ran.nextLong()%9000L)+1000L; //%9000 to give nos roughly btwn -8999 to +8999, L means long
        //Math.abs(ran.nextLong() % 9000L) gives btwn 0 to 8999, so +1000 to give 4 digit, ie 1000 to 9999
        
        JLabel formno = new JLabel("Application Form No. "+random );
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personDetails= new JLabel("Page 1: Personal Details");
        personDetails.setFont(new Font("Raleway",Font.BOLD,20));
        personDetails.setBounds(300,70,400,40);
        add(personDetails);
        
        
        //NAME
        JLabel name=new JLabel("Name: ");
        name.setFont(new Font("Raleway",Font.BOLD,16));
        name.setBounds(140,120,100,30);
        add(name);
        
        JTextField nameTextField=new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,120,400,30);
        add(nameTextField);
        
        //FATH NAME
        JLabel fname=new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway",Font.BOLD,16));
        fname.setBounds(140,160,150,30);
        add(fname);
        
        JTextField fnameTextField=new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(300,160,400,30);
        add(fnameTextField);
        
        //DOB
        JLabel dob=new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway",Font.BOLD,16));
        dob.setBounds(140,200,150,30);
        add(dob);
        
        JDateChooser dateChooser=new JDateChooser();
        dateChooser.setBounds(300,200,400,30);
       dateChooser.setForeground(new Color(105,105,105)); //for black color
        add(dateChooser);
        
        //GENDER
        JLabel gender=new JLabel("Gender: ");
        gender.setFont(new Font("Raleway",Font.BOLD,16));
        gender.setBounds(140,240,150,30);
        add(gender);
        
        JRadioButton male= new JRadioButton("Male");
        male.setBounds(300,240,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        JRadioButton female= new JRadioButton("Female");
        female.setBounds(380,240,80,30);
        female.setBackground(Color.WHITE);
        add(female);

        //to avoid more than one selection, group both the buttons
        ButtonGroup gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        //EMAIL
        JLabel email=new JLabel("E-mail Address: ");
        email.setFont(new Font("Raleway",Font.BOLD,16));
        email.setBounds(140,280,150,30);
        add(email);
        
        JTextField emailTextField=new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300,280,400,30);
        add(emailTextField);
        
        
        //MARITAL
        JLabel marital=new JLabel("Marital Status: ");
        marital.setFont(new Font("Raleway",Font.BOLD,16));
        marital.setBounds(140,320,150,30);
        add(marital);
        
        JRadioButton unmarried= new JRadioButton("Unmarried");
        unmarried.setBounds(300,320,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        JRadioButton married= new JRadioButton("Married");
        married.setBounds(420,320,80,30);
        married.setBackground(Color.WHITE);
        add(married);
        
        JRadioButton other= new JRadioButton("Other");
        other.setBounds(520,320,60,30);
        other.setBackground(Color.WHITE);
        add(other);

        //to avoid more than one selection, group both the buttons
        ButtonGroup status=new ButtonGroup();
        status.add(unmarried);
        status.add(other);
        status.add(married);
        
        
        //ADDERESS
        JLabel address=new JLabel("Address: ");
        address.setFont(new Font("Raleway",Font.BOLD,16));
        address.setBounds(140,360,150,30);
        add(address);
        
        JTextField addressTextField=new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextField.setBounds(300,360,400,30);
        add(addressTextField);
        
        //CITY
        JLabel city=new JLabel("City: ");
        city.setFont(new Font("Raleway",Font.BOLD,16));
        city.setBounds(140,400,150,30);
        add(city);
        
        JTextField cityTextField=new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300,400,400,30);
        add(cityTextField);
        
        //STATE
        JLabel state=new JLabel("State: ");
        state.setFont(new Font("Raleway",Font.BOLD,16));
        state.setBounds(140,440,150,30);
        add(state);
        
        JTextField stateTextField=new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(300,440,400,30);
        add(stateTextField);
        
        //pincode
        JLabel pin=new JLabel("Pin Code: ");
        pin.setFont(new Font("Raleway",Font.BOLD,16));
        pin.setBounds(140,480,150,30);
        add(pin);
        
        JTextField pinTextField=new JTextField();
        pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pinTextField.setBounds(300,480,400,30);
        add(pinTextField);
        
        JButton next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD,16));
        next.setBounds(600,550,100,50);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);//Color to whole frame. select whole frame to give color
        
        
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public static void main (String args[]){
        
        new SignUpOne();
    }
}
