import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
 
class SimpleCalculator implements ActionListener{
    JFrame f;
    JTextField t;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdiv, bmul, bsub, badd, bdec, beq, bdel, bclr, bmod;
    
    static double a=0,b=0,result=0;
    static int operator=0;
 
SimpleCalculator(){
    f=new JFrame("Simple Calculator By Trupti Tayde");
    t=new JTextField();

    b1 = new JButton("1");
    b2 = new JButton("2");
    b3 = new JButton("3");
    b4 = new JButton("4");
    b5 = new JButton("5");
    b6 = new JButton("6");
    b7 = new JButton("7");
    b8 = new JButton("8");
    b9 = new JButton("9");
    b0 = new JButton("0");
    badd = new JButton("+");
    bsub = new JButton("-");
    bmul = new JButton("*");
    bdiv = new JButton("/");
    bdec = new JButton(".");
    beq = new JButton("=");
    bdel = new JButton("Dlt");
    bclr = new JButton("Clr");
    bmod = new JButton("%");

    //set Background color for buttons
    b1.setBackground(Color.white);
    b2.setBackground(Color.white);
    b3.setBackground(Color.white);
    b4.setBackground(Color.white);
    b5.setBackground(Color.white);
    b6.setBackground(Color.white);
    b7.setBackground(Color.white);
    b8.setBackground(Color.white);
    b9.setBackground(Color.white);
    b0.setBackground(Color.white);
    badd.setBackground(Color.white);
    bsub.setBackground(Color.white);
    bmul.setBackground(Color.white);
    bdiv.setBackground(Color.white);
    bdec.setBackground(Color.white);
    beq.setBackground(Color.white);
    bdel.setBackground(Color.white);
    bclr.setBackground(Color.white);
    bmod.setBackground(Color.white);

    //set text color for operator buttons
    badd.setForeground(Color.red);
    bsub.setForeground(Color.red);
    bmul.setForeground(Color.red);
    bdiv.setForeground(Color.red);
    bdec.setForeground(Color.red);
    beq.setForeground(Color.red);
    bmod.setForeground(Color.red);

    //set font size for text buttons
    t.setFont(new Font("Serif",Font.BOLD,15));
    b1.setFont(new Font("Serif",Font.BOLD,15));
    b2.setFont(new Font("Serif",Font.BOLD,15));
    b3.setFont(new Font("Serif",Font.BOLD,15));
    b4.setFont(new Font("Serif",Font.BOLD,15));
    b5.setFont(new Font("Serif",Font.BOLD,15));
    b6.setFont(new Font("Serif",Font.BOLD,15));
    b7.setFont(new Font("Serif",Font.BOLD,15));
    b8.setFont(new Font("Serif",Font.BOLD,15));
    b9.setFont(new Font("Serif",Font.BOLD,15));
    b0.setFont(new Font("Serif",Font.BOLD,15));
    badd.setFont(new Font("Serif",Font.BOLD,20));
    bsub.setFont(new Font("Serif",Font.BOLD,20));
    bmul.setFont(new Font("Serif",Font.BOLD,20));
    bdiv.setFont(new Font("Serif",Font.BOLD,20));
    bdec.setFont(new Font("Serif",Font.BOLD,20));
    bdel.setFont(new Font("Serif",Font.BOLD,15));
    bclr.setFont(new Font("Serif",Font.BOLD,15));
    bmod.setFont(new Font("Serif",Font.BOLD,15));
    
    //set bounds
    //bounds for textfield
    t.setBounds(30,40,280,30);

    //bounds for buttons
    b1.setBounds(40,80,50,30);
    b2.setBounds(110,80,50,30);
    b3.setBounds(180,80,50,30);
    bdiv.setBounds(250,80,50,30);
    b4.setBounds(40,120,50,30);
    b5.setBounds(110,120,50,30);
    b6.setBounds(180,120,50,30);
    bmul.setBounds(250,120,50,30);
    b7.setBounds(40,160,50,30);
    b8.setBounds(110,160,50,30);
    b9.setBounds(180,160,50,30);
    bsub.setBounds(250,160,50,30);
    bdec.setBounds(40,200,50,30);
    b0.setBounds(110,200,50,30);
    beq.setBounds(180,200,50,30);
    badd.setBounds(250,200,50,30);
    bdel.setBounds(40,240,80,30);
    bclr.setBounds(135,240,80,30);
    bmod.setBounds(230,240,70,30);

    //add to frame
    f.add(t); f.add(b1); f.add(b2);
    f.add(b3); f.add(b4); f.add(b5);
    f.add(b6); f.add(b7); f.add(b8);
    f.add(b9); f.add(b0); f.add(badd); 
    f.add(bsub); f.add(bmul); f.add(bdiv);
    f.add(bdec); f.add(beq); f.add(bmod);
    f.add(bdel); f.add(bclr);

    //set size, layout, visibility
    f.setLayout(null);
    f.setVisible(true);
    f.setSize(400,350);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.getContentPane().setBackground(Color.lightGray);

    //add action listener
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b0.addActionListener(this);
    badd.addActionListener(this);
    bdiv.addActionListener(this);
    bmul.addActionListener(this);
    bsub.addActionListener(this);
    bdec.addActionListener(this);
    bmod.addActionListener(this);
    beq.addActionListener(this);
    bdel.addActionListener(this);
    bclr.addActionListener(this);
}
 
public void actionPerformed(ActionEvent e){
    if(e.getSource()==b1)
        t.setText(t.getText().concat("1"));

    if(e.getSource()==b2)
        t.setText(t.getText().concat("2"));
    
    if(e.getSource()==b3)
        t.setText(t.getText().concat("3"));
    
    if(e.getSource()==b4)
        t.setText(t.getText().concat("4"));
    
    if(e.getSource()==b5)
        t.setText(t.getText().concat("5"));

    if(e.getSource()==b6)
        t.setText(t.getText().concat("6"));

    if(e.getSource()==b7)
        t.setText(t.getText().concat("7"));

    if(e.getSource()==b8)
        t.setText(t.getText().concat("8"));
    
    if(e.getSource()==b9)
        t.setText(t.getText().concat("9"));
    
    if(e.getSource()==b0)
        t.setText(t.getText().concat("0"));
    
    if(e.getSource()==bdec)
        t.setText(t.getText().concat("."));
    
    if(e.getSource()==badd){
        a=Double.parseDouble(t.getText());
        operator = 1;
        t.setText("");
    }

    if(e.getSource()==bsub){
        a=Double.parseDouble(t.getText());
        operator = 2;
        t.setText("");
    }

    if(e.getSource()==bmul){
        a=Double.parseDouble(t.getText());
        operator = 3;
        t.setText("");
    }

    if(e.getSource()==bdiv){
        a=Double.parseDouble(t.getText());
        operator = 4;
        t.setText("");
    }

     if(e.getSource()==bmod){
        a=Double.parseDouble(t.getText());
        operator = 5;
        t.setText("");
    }

    if(e.getSource()==beq){
        b=Double.parseDouble(t.getText());
        
        switch(operator){
            case 1: 
                result = a+b;
                break;
            
            case 2: 
                result = a-b;
                break;

            case 3: 
                result = a*b;
                break;

            case 4: 
                result = a/b;
                break;

            case 5: 
                result = a%b;
                break;

            default: 
                result = 0;
        }
        t.setText(""+result);
    }

    if(e.getSource()==bclr)
        t.setText("");

    if(e.getSource()==bdel){

        String s=t.getText();
        t.setText("");
        
        for(int i=0;i<s.length()-1;i++)
        t.setText(t.getText()+s.charAt(i));
    }
}
 
    public static void main(String[] args){
        new SimpleCalculator();
    }
}
