import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Start_Button {

JFrame Frame;
Image Image1;
Image Image2;
Jbutton button;
Jlable lable;
}

public Start_Button() {

button = new Jbutton("CLICK TO START");
button.setBounds(150,50,1000,1000)


Frame = new Jframe("CLICK TO START");
Frame.setsize(new Dimension (420,420,));
Frame.setlayout(null);
Frame.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
Frame.add(button);
Frame.setVisible(true);

}
