import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

class Awt{
    Awt(){
        Frame f=new Frame("Login Apge");
        f.setVisible(true);
        f.setSize(600,600);
        f.setLayout(null);
        Label l1=new Label("userid");
        l1.setBounds(100,100,100,30);
        TextField t1=new TextField("enter a id");
        t1.setBounds(140,80,80,50);
        Label l2=new Label("pass");
        l2.setBounds(100,150,100,30);
        TextField t2=new TextField("enter a password");
        t2.setBounds(140,130,130,25);
        Button b=new Button("submit");
        b.setBounds(100,200,100,30);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);

    }
    public static void main(String[] args) {
        Awt obj=new Awt();
    }
}