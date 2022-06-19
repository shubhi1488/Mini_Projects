import java.awt.*;
class Calculator{
Frame f;
MenuBar mb;
Menu m1,m2,m3;

TextField t1;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28;
Calculator(){
f=new Frame("calculator");

t1=new TextField();
mb=new MenuBar();
m1=new Menu("View");
m2=new Menu("Edit");
m3=new Menu("Help");
t1=new TextField();
t1.setBackground(Color.LIGHT_GRAY);
t1.setBounds(50,80,330,60);
b1=new Button("MC");
b1.setBounds(50,150,50,50);
b2=new Button("MR");
b2.setBounds(120,150,50,50);
b3=new Button("MS");
b3.setBounds(190,150,50,50);
b4=new Button("M+");
b4.setBounds(260,150,50,50);
b5=new Button("M-");
b5.setBounds(330,150,50,50);
b6=new Button("\uB260");
b6.setBounds(50,220,50,50);
b7=new Button("CE");
b7.setBounds(120,220,50,50);
b8=new Button("C");
b8.setBounds(190,220,50,50);
b9=new Button("\u00B1");
b9.setBounds(260,220,50,50);
b10=new Button("\u221A");
b10.setBounds(330,220,50,50);
b11=new Button("7");
b11.setBounds(50,290,50,50);
b12=new Button("8");
b12.setBounds(120,290,50,50);
b13=new Button("9");
b13.setBounds(190,290,50,50);
b14=new Button("/");
b14.setBounds(260,290,50,50);
b15=new Button("%");
b15.setBounds(330,290,50,50);
b16=new Button("4");
b16.setBounds(50,360,50,50);
b17=new Button("5");
b17.setBounds(120,360,50,50);
b18=new Button("6");
b18.setBounds(190,360,50,50);
b19=new Button("*");
b19.setBounds(260,360,50,50);
b20=new Button("\u2093");
b20.setBounds(330,360,50,50);
b21=new Button("1");
b21.setBounds(50,430,50,50);
b22=new Button("2");
b22.setBounds(120,430,50,50);
b23=new Button("3");
b23.setBounds(190,430,50,50);
b24=new Button("-");
b24.setBounds(260,430,50,50);
b25=new Button("=");
b25.setBounds(330,430,50,120);
b26=new Button("0");
b26.setBounds(50,500,120,50);
b28=new Button(".");
b28.setBounds(190,500,50,50);
b27=new Button("+");
b27.setBounds(260,500,50,50);
mb.add(m1);
mb.add(m2);
mb.add(m3);
f.setMenuBar(mb);
f.add(t1);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
f.add(b6);
f.add(b7);
f.add(b8);
f.add(b9);
f.add(b10);
f.add(b11);
f.add(b12);
f.add(b13);
f.add(b14);
f.add(b15);
f.add(b16);
f.add(b17);
f.add(b18);
f.add(b19);
f.add(b20);
f.add(b21);
f.add(b22);
f.add(b23);
f.add(b24);
f.add(b25);
f.add(b26);
f.add(b27);
f.add(b28);

f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}
public static void main(String ar[]){
Calculator c=new Calculator();
}
}


