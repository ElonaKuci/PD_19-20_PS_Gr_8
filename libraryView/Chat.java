package libraryView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Chat extends JPanel {
    private static final long serialVersionUID = 1L;
    private Box mainBox,hBox1;
    private JButton bClient, bServer;

    public Chat() {
        super(new FlowLayout());
        intWidgets();
        addWidgets();
        setBackground(new Color(194, 230, 248));
    }

    private void intWidgets() {

        mainBox = Box.createVerticalBox();
        hBox1 = Box.createHorizontalBox();

        bClient= new JButton("Client");
        bServer= new JButton("Server");
    }


private void addWidgets(){


    hBox1.add(bClient);
    hBox1.add(bServer);
    mainBox.add(hBox1);
    add(mainBox);


}
    public void addActionListener(ActionListener a) {
       bClient.addActionListener(a);
       bServer.addActionListener(a);

    }
    public JButton getClient(){
        return bClient;
    }
    public JButton getServer(){
        return bServer;
    }
}