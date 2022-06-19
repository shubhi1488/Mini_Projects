import java.awt.*;
class MyNotepad{
Frame f;
TextArea ta;
MenuBar mb;
Menu mFile,mEdit,mView;
MenuItem a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,c1,c3;
CheckboxMenuItem cmi;

MyNotepad(){
f=new Frame("Notepad");
ta=new TextArea();
mb=new MenuBar();
mFile=new Menu("File");
mEdit=new Menu("Edit");
mView=new Menu("View");

a1=new MenuItem("New");
a2=new MenuItem("New Window");
a3=new MenuItem("Open");
a4=new MenuItem("Save");
a5=new MenuItem("Save As");
a6=new MenuItem("-");
a7=new MenuItem("Page SetUp");
a8=new MenuItem("Print");
a9=new MenuItem("-");
a10=new MenuItem("Exit");

b1=new MenuItem("Undo");
b2=new MenuItem("-");
b3=new MenuItem("Cut");
b4=new MenuItem("Copy");
b5=new MenuItem("Paste");
b6=new MenuItem("Delete");
b7=new MenuItem("-");
b8=new MenuItem("Find");
b9=new MenuItem("FindNext");
b10=new MenuItem("Find Previous");
b11=new MenuItem("Replace");
b12=new MenuItem("GoTo");
b13=new MenuItem("-");
b14=new MenuItem("SelectAll");
b15=new MenuItem("Time/Date");
b16=new MenuItem("-");
b17=new MenuItem("Font");

c1=new MenuItem("Zoom");

c3=new MenuItem("Word wrap");



cmi=new CheckboxMenuItem("Status bar");

mFile.add(a1);
mFile.add(a2);
mFile.add(a3);
mFile.add(a4);
mFile.add(a5);
mFile.add(a6);
mFile.add(a7);
mFile.add(a8);
mFile.add(a9);
mFile.add(a10);

mEdit.add(b1);
mEdit.add(b2);
mEdit.add(b3);
mEdit.add(b4);
mEdit.add(b5);
mEdit.add(b6);
mEdit.add(b7);
mEdit.add(b8);
mEdit.add(b9);
mEdit.add(b10);
mEdit.add(b11);
mEdit.add(b12);
mEdit.add(b13);
mEdit.add(b14);
mEdit.add(b15);
mEdit.add(b16);
mEdit.add(b17);



mView.add(c1);
mView.add(cmi);
mView.add(c3);
mb.add(mFile);
mb.add(mEdit);
mb.add(mView);
ta.setBackground(Color.black);
ta.setForeground(Color.white);

Font ft=new Font("Lucida Console",0,12);
f.setFont(ft);
f.setMenuBar(mb);
f.add(ta);
f.setSize(400,400);
f.setVisible(true);
}
public static void main(String ar[]){
MyNotepad n=new MyNotepad();
}
}
