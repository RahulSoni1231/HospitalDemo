import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class HospitalEx extends JFrame {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l18,l19,l20;
    JPanel p1,p2;
    JButton j1,j2,j3,j4,j5,j6,j7,j8,j9,j10;
    ImageIcon img1,img2,img3;
    public HospitalEx()
    {
        setLayout(null);
        p1 = new JPanel();
        p1.setBackground(Color.green);
      //  p1.setSize(500,900);
        p1.setLayout(null);
        l1 = new JLabel();
        l1.setBounds(170,30,80,80);
        l1.setIcon(new ImageIcon("hospital.png"));
        p1.add(l1);

        l2 = new JLabel();
        l2.setBounds(20,160,50,50);
        l2.setIcon(new ImageIcon("medical.png"));
        p1.add(l2);

        l3 = new JLabel();
        l3.setBounds(20,240,50,50);
        l3.setIcon(new ImageIcon("doctor.png"));
        p1.add(l3);

        l4 = new JLabel();
        l4.setBounds(20,320,50,50);
        l4.setIcon(new ImageIcon("receptinist.png"));
        p1.add(l4);

        l5 = new JLabel();
        l5.setBounds(20,400,50,50);
        l5.setIcon(new ImageIcon("lab.png"));
        p1.add(l5);

        l5 = new JLabel();
        l5.setBounds(20,480,50,50);
        l5.setIcon(new ImageIcon("labo.png"));
        p1.add(l5);

        l6 = new JLabel();
        l6.setBounds(20,560,50,50);
        l6.setIcon(new ImageIcon("labos.png"));
        p1.add(l6);

        l7 = new JLabel();
        l7.setBounds(20,680,70,50);
        l7.setIcon(new ImageIcon("exit.png"));
        p1.add(l7);

        l8 = new JLabel("Patient");
        l8.setBounds(90,160,200,50);
        l8.setFont(new Font("Arial",Font.ITALIC,25));
        p1.add(l8);

        l9 = new JLabel("Doctor");
        l9.setBounds(90,240,200,50);
        l9.setFont(new Font("Arial",Font.ITALIC,25));
        p1.add(l9);

        l10 = new JLabel("Reception");
        l10.setBounds(90,320,200,50);
        l10.setFont(new Font("Arial",Font.ITALIC,25));
        p1.add(l10);

        l11 = new JLabel("Lab Test");
        l11.setBounds(90,400,200,50);
        l11.setFont(new Font("Arial",Font.ITALIC,25));
        p1.add(l11);

        l12 = new JLabel("Prescriptions");
        l12.setBounds(90,480,200,50);
        l12.setFont(new Font("Arial",Font.ITALIC,25));
        p1.add(l12);

        l13 = new JLabel("Laboratories");
        l13.setBounds(90,560,200,50);
        l13.setFont(new Font("Arial",Font.ITALIC,25));
        p1.add(l13);

        l14 = new JLabel("Log Out");
        l14.setBounds(90,680,200,50);
        l14.setFont(new Font("Arial",Font.ITALIC,25));
        p1.add(l14);
        p1.setBounds(0,0,400,900);
        add(p1);


        p2=new JPanel();
        p2.setLayout(null);
        l15 = new JLabel("Manage Patients");
        l15.setBounds(100,30,200,50);
        l15.setFont(new Font("Arial",Font.BOLD,25));
        l15.setForeground(Color.green);
        p2.add(l15);

        j1 = new JButton();
        j1.setBounds(20,110,250,30);
        p2.add(j1);

        j2=new JButton("Patient Gender");
        j2.setBounds(300,110,250,30);
        p2.add(j2);


        j3=new JButton();
        l18 = new JLabel();
        l18.setBounds(800,110,25,25);
        l18.setIcon(new ImageIcon("button.png"));
        j3.add(l18);
        j3.setBounds(580,110,220,32);
        p2.add(j3);


        j3=new JButton("Patient Address");
        j3.setBounds(860,110,250,30);
        p2.add(j3);

        j4=new JButton("Patient Phone");
        j4.setBounds(70,190,220,30);
        p2.add(j4);

        j5=new JButton("HIV?");
        j5.setBounds(330,190,220,30);
        p2.add(j5);


        j6=new JButton("Allergies");
        j6.setBounds(590,190,220,30);
        p2.add(j6);

        j7=new JButton();
        j7.setBounds(850,190,220,30);
        p2.add(j7);
        
        img1= new ImageIcon("deleteData.png");
        j8=new JButton("Delete Patient",img1);
       // j8.setVerticalAlignment(5);//TextPosition(SwingConstants.LEFT);
        j8.setBounds(120,270,200,40);
        j8.setFont(new Font("Arial",Font.BOLD,20));
        j8.setBackground(Color.red);
        j8.setForeground(Color.WHITE);

        p2.add(j8);

        img2 = new ImageIcon("addData.png");
        j9=new JButton("Add patient",img2);
        j9.setBounds(400,270,200,40);
        j9.setFont(new Font("Arial",Font.BOLD,20));
        j9.setBackground(Color.GREEN);
        j9.setForeground(Color.WHITE);
        p2.add(j9);

        img3 = new ImageIcon("updataData.png");
        j10=new JButton("Update Patient",img3);
        j10.setBounds(680,270,210,40);
        j10.setFont(new Font("Arial",Font.BOLD,20));
        j10.setBackground(Color.magenta);
        j10.setForeground(Color.WHITE);
        p2.add(j10);


        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        j8.setCursor(c);
        j9.setCursor(c);
        j10.setCursor(c);

        //Border b =BorderFactory.createLineBorder(Color.red,5);
        //j9.setBorder(b);
       // j8.setBorder(b);

        l19 = new JLabel("Recorded Patient Details");
        l19.setBounds(60,360,300,50);
        l19.setFont(new Font("Arial",Font.BOLD,25));
        l19.setForeground(Color.red);
        p2.add(l19);

        l20 = new JLabel();
        l20.setBounds(50,380,1300,400);
        l20.setIcon(new ImageIcon("data.png"));
        p2.add(l20);


        p2.setBounds(400,0,1300,900);
        p2.setBackground(Color.YELLOW);
        add(p2);
        setVisible(true);
        setSize(1700,900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);



    }
    public static void main(String[] args)
    {

        HospitalEx obj = new HospitalEx();
    }
}
