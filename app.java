import java.io.*;
import java.awt.*;
class App 
{
Frame f;
TextField t1,t2;
Label l1,l2;
App()
{
f=new Frame("names");
f.setLayout(new FlowLayout());
f.setSize(100,100);
f.setVisible(true);
l1=new Label("name");
l2=new Label("rollno");
t1=new TextField(10);
t2=new TextField(10);
f.add(l1);
f.add(t1);
f.add(l2);
f.add(t2);
}
public static void main(String args[])
{
new App();
}
}
