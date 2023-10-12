import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouse_Listener extends JFrame implements MouseListener {
    JLabel lbl;
    private int clickCount = 0;
    public Mouse_Listener(){

        lbl=new JLabel("click me & learn the rainbow song");
        lbl.setBounds(100,20,300,40);
        lbl.setBackground(Color.white);
        lbl.setOpaque(true);
        lbl.setForeground(Color.black);


        lbl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                handleClick();
            }
        });


        setTitle("Mouse Listener");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        setSize(500,500);
        setVisible(true);

        add(lbl);

    }



    @Override
    public void mouseClicked(MouseEvent e) {
        //triggered when u click the mouse on an object->press and release
    System.out.println("you have clicked me");}

    //handle click method

        private void handleClick() {
            clickCount++;

            //clickcount ==7 like colors of the rainbow

            if (clickCount % 7 == 1) {
                lbl.setBackground(Color.red);
                lbl.setText("Richard        (RED)");
                lbl.setForeground(Color.black);

            } else if (clickCount % 7 == 2) {
                lbl.setBackground(Color.orange);
                lbl.setText("Of     (ORANGE)");
                lbl.setForeground(Color.black);


            } else if (clickCount % 7 == 3) {
                lbl.setBackground(Color.yellow);
                lbl.setText("York       (YELLOW)");
                lbl.setForeground(Color.black);

            } else if (clickCount % 7 == 4) {
                lbl.setBackground(Color.green);
                lbl.setText("Gained     (GREEEN)");
                lbl.setForeground(Color.black);

            } else if (clickCount % 7 == 5) {
                lbl.setBackground(Color.blue);
                lbl.setText("Battle     (BLUE)");
                lbl.setForeground(Color.white);
            }
            else if (clickCount % 7 == 6) {
                lbl.setBackground(new Color(0x4B0082));
                lbl.setText("In     (INDIGO)");
                lbl.setForeground(Color.white);
            }
            else {


                lbl.setBackground(new Color(0x8F00FF));
                lbl.setText("Vain       (VIOLET)");
                lbl.setForeground(Color.white);
                
                new rainbow();
            }



        }

    @Override
    public void mousePressed(MouseEvent e) {
        //triggered when u press the mouse on an object->press
      // System.out.println("you have pressed me");
       // lbl.setBackground(Color.green);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //triggered when u release the mouse on an object->press
      //
       // System.out.println("you have released me");
        //lbl.setBackground(Color.yellow);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //triggered when u enter the mouse within a component
     // System.out.println("you have entered me");
        //lbl.setBackground(Color.red);


    }

    @Override
    public void mouseExited(MouseEvent e) {
        //triggered when u exit the mouse within a component
         //System.out.println("you have exited me");
      //  lbl.setBackground(Color.black);

    }

    public static void main(String[] args) {
        new Mouse_Listener();
    }
}
