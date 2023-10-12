import javax.swing.*;
import java.awt.*;

public  class rainbow extends JFrame{
    JLabel lbl_red;
    JLabel lbl_orange;
    JLabel lbl_yellow,lbl_green,lbl_blue,lbl_indigo,lbl_violet;
    public rainbow(){


        rainbo();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("rainbow");
        setSize(500,500);
        setVisible(true);
        setLayout(new GridLayout(7,1,20,0));

        //setLocationRelativeTo(null);


    }
    public void rainbo(){
        lbl_red=new JLabel("red");
        lbl_red.setBackground(Color.red);
        lbl_red.setOpaque(true);
       // lbl_red.setForeground(Color.white);


        lbl_orange=new JLabel("orange");
        lbl_orange.setBackground(Color.orange);
        lbl_orange.setOpaque(true);


        lbl_yellow=new JLabel("yellow");
        lbl_yellow.setBackground(Color.yellow);
        lbl_yellow.setOpaque(true);


        lbl_green=new JLabel("green");
        lbl_green.setBackground(Color.green);
        lbl_green.setOpaque(true);


        lbl_blue=new JLabel("blue");
        lbl_blue.setBackground(Color.blue);
        lbl_blue.setOpaque(true);
        lbl_blue.setForeground(Color.white);


        lbl_indigo=new JLabel("indigo");
        lbl_indigo.setBackground(new Color(0x4B0082));
        lbl_indigo.setOpaque(true);
        lbl_indigo.setForeground(Color.white);


        lbl_violet=new JLabel("violet");
        lbl_violet.setBackground(new Color(0x8F00FF));
        lbl_violet.setOpaque(true);
        lbl_violet.setForeground(Color.white);


        add(lbl_red);add(lbl_orange);add(lbl_yellow);add(lbl_green);add(lbl_blue);add(lbl_indigo);add(lbl_violet);



    }

    public static void main(String[] args) {
        new rainbow();
    }




}
