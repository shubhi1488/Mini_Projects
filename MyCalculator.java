import java.awt.*;
import java.awt.event.*;
class MyCalculator  extends WindowAdapter implements ActionListener {
Frame f;
MenuBar mb;
Menu m1,m2,m3;
TextField t1;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,bclr,bneg,bback;
double xd;
double num1,num2,check;
Panel p;

MyCalculator(){
f=new Frame("calculator");
f.addWindowListener(this);
mb=new MenuBar();



p=new Panel();

p.setBounds(20,80,300,500);
p.setBackground(Color.black);
m1=new Menu("File");
m2=new Menu("View");
m3=new Menu("Edit");
mb.add(m1);
mb.add(m2);
mb.add(m3);
t1=new TextField();
t1.setBounds(20,60,260,60);
b1=new Button("7");
b1.addActionListener(this);
b1.setBounds(20,160,50,50);
b2=new Button("8");
b2.addActionListener(this);
b2.setBounds(90,160,50,50);
b3=new Button("9");
b3.addActionListener(this);
b3.setBounds(160,160,50,50);
b4=new Button("\u00F7");
b4.addActionListener(this);
b4.setBounds(230,160,50,50);
b5=new Button("4");
b5.addActionListener(this);
b5.setBounds(20,230,50,50);
b6=new Button("5");
b6.addActionListener(this);
b6.setBounds(90,230,50,50);
b7=new Button("6");
b7.addActionListener(this);
b7.setBounds(160,230,50,50);
b8=new Button("*");
b8.addActionListener(this);
b8.setBounds(230,230,50,50);
b9=new Button("1");
b9.addActionListener(this);
b9.setBounds(20,300,50,50);
b10=new Button("2");
b10.addActionListener(this);
b10.setBounds(90,300,50,50);
b11=new Button("3");
b11.addActionListener(this);
b11.setBounds(160,300,50,50);
b12=new Button("-");
b12.addActionListener(this);
b12.setBounds(230,300,50,50);
b13=new Button("0");
b13.addActionListener(this);
b13.setBounds(20,370,50,50);
b14=new Button(".");
b14.addActionListener(this);
b14.setBounds(90,370,50,50);
b15=new Button("+");
b15.addActionListener(this);
b15.setBounds(160,370,50,50);
b16=new Button("=");
b16.addActionListener(this);
b16.setBounds(230,370,50,120);
bclr=new Button("CE");
bclr.addActionListener(this);
bclr.setBounds(20,440,50,50);
bneg=new Button("+/-");
bneg.addActionListener(this);
bneg.setBounds(90,440,50,50);
bback=new Button("back");
bback.addActionListener(this);
bback.setBounds(160,440,50,50);
f.setLayout(null);
p.setLayout(null);

p.add(b1);
p.add(b2);
p.add(b3);
p.add(b4);
p.add(b5);
p.add(b6);
p.add(b7);
p.add(b8);
p.add(b9);
p.add(b10);
p.add(b11);
p.add(b12);
p.add(b13);
p.add(b14);
p.add(b15);
p.add(b16);
p.add(bclr);
p.add(bneg);
p.add(bback);
p.add(t1);
f.add(p);

f.setMenuBar(mb);
f.setSize(400,400);
f.setVisible(true);
}
public static void main(String ar[]){
MyCalculator b=new MyCalculator();
}
public void actionPerformed(ActionEvent e){

String z,zt;

if(e.getSource()==b1){
zt=t1.getText();
z=zt+"7";
t1.setText(z);
}
if(e.getSource()==b2){
zt=t1.getText();
z=zt+"8";
t1.setText(z);
}
if(e.getSource()==b3){
zt=t1.getText();
z=zt+"9";
t1.setText(z);
}
if(e.getSource()==b5){
zt=t1.getText();
z=zt+"4";
t1.setText(z);
}
if(e.getSource()==b6){
zt=t1.getText();
z=zt+"5";
t1.setText(z);
}
if(e.getSource()==b7){
zt=t1.getText();
z=zt+"7";
t1.setText(z);
}
if(e.getSource()==b9){
zt=t1.getText();
z=zt+"1";
t1.setText(z);
}
if(e.getSource()==b10){
zt=t1.getText();
z=zt+"2";
t1.setText(z);
}
if(e.getSource()==b11){
zt=t1.getText();
z=zt+"3";
t1.setText(z);
}
if(e.getSource()==b13){
zt=t1.getText();
z=zt+"0";
t1.setText(z);
}
if(e.getSource()==b14){  
  zt=t1.getText();
  z=zt+".";
  t1.setText(z);
}
if(e.getSource()==bneg){ //FOR NEGATIVE
  zt=t1.getText();
  z="-"+zt;
  t1.setText(z);
}
if(e.getSource()==bback){  // FOR  BACKSPACE
  zt=t1.getText();
  try{
    z=zt.substring(0, zt.length()-1);
    }catch(StringIndexOutOfBoundsException f){return;}
  t1.setText(z);
}




                
if(e.getSource()==b15){                     
  try{
    num1=Double.parseDouble(t1.getText());
    }catch(NumberFormatException f){
      t1.setText("Invalid Format");
      return;
    }
  z="";
  t1.setText(z);
  check=1;
}
if(e.getSource()==b12){                    
  try{
    num1=Double.parseDouble(t1.getText());
    }catch(NumberFormatException f){
      t1.setText("Invalid Format");
      return;
    }
  z="";
  t1.setText(z);
  check=2;
}
if(e.getSource()==b8){                   
  try{
    num1=Double.parseDouble(t1.getText());
    }catch(NumberFormatException f){
      t1.setText("Invalid Format");
      return;
    }
  z="";
  t1.setText(z);
  check=3;
}

if(e.getSource()==b4){                   
  try{
    num1=Double.parseDouble(t1.getText());
    }catch(NumberFormatException f){
      t1.setText("Invalid Format");
      return;
    }
  z="";
  t1.setText(z);
  check=4;
}
                         
if(e.getSource()==b16){          
  try{
    num2=Double.parseDouble(t1.getText());
    }catch(Exception f){
      t1.setText("ENTER NUMBER FIRST ");
      return;
    }
  if(check==1)
    xd =num1+num2;
  if(check==2)
    xd =num1-num2;
  if(check==3)
    xd =num1*num2;
  if(check==4)
    xd =num1/num2; 
  if(check==5)
    xd =num1%num2;    
  t1.setText(String.valueOf(xd));
}
if(e.getSource()==bclr){
  num1=0;
  num2=0;
  check=0;
  xd=0;
   z="";
   t1.setText(z);
   } 
                        




}
public void windowClosing(WindowEvent e){
f.dispose();
}
}


