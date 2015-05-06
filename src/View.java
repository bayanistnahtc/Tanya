import tank.Tank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by R2 on 29.04.2015.
 */

public class View extends JFrame{
    int n;
    int m;

    Tank ourTank = new Tank(15, 15, true);
    Tank tankEnemy = new Tank(30, 30);

    JLabel f;

     public View (int n, int m){
            super("swing");
         this.n = n;
         this.m = m;


      setDefaultCloseOperation(EXIT_ON_CLOSE);

      final JPanel pole = new JPanel();

      pole.setLayout(new BorderLayout(n,m));
      pole.setFocusable(true);


      f = new JLabel();
      f.setFont(new Font("Calibri", Font.PLAIN, 20));
      f.setHorizontalAlignment(JLabel.CENTER);
         setSize(n, m);

         SwingComponent sc = new SwingComponent(ourTank.getX(), ourTank.getY());
         SwingComponent enemy = new SwingComponent(tankEnemy.getX(), tankEnemy.getY());



      pole.addKeyListener(new KeyAdapter() {
          @Override
          public void keyPressed(KeyEvent e) {

              super.keyPressed(e);

              System.out.println("bla bla");
              switch (e.getKeyCode()) {
                  case KeyEvent.VK_RIGHT:
                      //int size = ourTank.getX();
                    //  System.out.println(size);
                    //  ourTank.setX(size+=15);
                      System.out.println(ourTank.getX());
                     ourTank.move(ourTank.getX() + 15, ourTank.getY() + 15);
                      sc.repaint();
                      break;
                  case KeyEvent.VK_LEFT:
                    //  ourTank.setX(15-size);
                      System.out.println(getX());
                    //  ourTank.move(ourTank.getX(), ourTank.getY());
                      sc.repaint();
                      break;
                  case KeyEvent.VK_UP:
                    ///  ourTank.setY(-size);
                      System.out.println(getY());
                      ourTank.move(ourTank.getX(), ourTank.getY());
                      sc.repaint();
                      break;
                  case KeyEvent.VK_DOWN:
                     // ourTank.setY(1);
                      System.out.println(getY());
                      ourTank.move(ourTank.getX(), ourTank.getY());

                     // sc.repaint();
                      break;
                  default:
                      break;
              }
          }
      });

      getContentPane().add(pole, BorderLayout.CENTER);

      ;
         //pole.add(Rectangle(0,0,15,15));
     pole.add(sc);
     pole.add(enemy);
     setVisible(true);
  }


    class SwingComponent extends JComponent{
        int i,j;
        public SwingComponent(int i,int j)
        {
            this.i=i;
            this.j=j;
        }
        // прорисовка компонента
        public void paintComponent(Graphics g) {
        //    Rectangle rectangle = new Rectangle(0,0,15,15);
            g.setColor(Color.getHSBColor(0, 1, 1));
              // g.drawRect((int)ourTank.getRectangle().getX(), (int)ourTank.getRectangle().getY(), 15, 15);
        Graphics2D g2 = (Graphics2D)g;
            Rectangle r = ourTank.getRectangle();

//            r.translate(ourTank.getX(), ourTank.getY());
            g2.fill(r);
         //  g.drawRect((int)ourTank.getRectangle().getX(), (int)ourTank.getRectangle().getY(), (int)ourTank.getRectangle().getWidth(), (int)ourTank.getRectangle().getHeight());
        }
    }
}
