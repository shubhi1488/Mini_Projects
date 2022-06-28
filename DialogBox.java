import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class DialogBox
{
Frame f;
TextArea ta;
Button b1,b2;
Panel p;
DialogBox()
{
f=new Frame();
ta=new TextArea();
b1=new Button("Font Color");
b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
JColorChooser jc=new JColorChooser();
Color c=jc.showDialog(null,"Pick Font Color",Color.red);
ta.setForeground(c);

}
});
b2=new Button("Back Color");
b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
JColorChooser jc=new JColorChooser();
Color c=jc.showDialog(f,"Pick Back Color",Color.yellow);
ta.setBackground(c);
}
});
ta.setFont(new Font("Arial",1,34));
p=new Panel();
p.add(b1);
p.add(b2);
f.add(ta);
f.add(p,BorderLayout.SOUTH);
f.setVisible(true);
f.setSize(400,400);
}
public static void main(String ar[])
{
DialogBox x1=new DialogBox();
}
}
