import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicsAwt {
    public static void main(String[] args){
        Frame f=new Frame("Simple Graphics Components");
        Button b=new Button("SUBMIT");
        b.setBounds(170,300,50,20);
        Label lab=new Label("Enter your Name");
        lab.setBounds(50,80,150,20);
        TextField tf=new TextField("name");
        tf.setBounds(200,80,50,20);
        Label lab1=new Label("Enter your Age");
        lab1.setBounds(50,130,150,20);
        TextField tf1=new TextField("age");
        tf1.setBounds(200,130,50,20);
        Label lab2=new Label("Enter Your Income");
        lab2.setBounds(50,180,150,20);
        TextField tf2=new TextField("income");
        tf2.setBounds(200,180,50,20);
        f.add(b);
        f.add(lab);
        f.add(tf);
        f.add(lab1);
        f.add(tf1);
        f.add(lab2);
        f.add(tf2);
        f.setSize(400,400);
        ActionListener submitAction=new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.out.println(tf.getText());
                System.out.println(tf1.getText());
                System.out.println(tf2.getText());
            }
        };
        b.addActionListener(submitAction);
        f.setLayout(null);
        f.setVisible(true);


    }
}
