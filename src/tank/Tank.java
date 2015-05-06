package tank;

import java.awt.*;
import java.util.Random;

/**
 * Created by R2 on 29.04.2015.
 */
public class Tank {
    int x ;
    int y ;

    public Rectangle getRectangle() {
        return rectangle;
    }

    Rectangle rectangle;

    public boolean isFlag() {
        return flag;
    }

    boolean flag;

    public Tank(int x, int y, boolean flag) {
        this.x = x;
        this.y = y;
        this.flag = flag;
        Rectangle rectangle = new Rectangle(x, y, 15, 15);
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
        this.flag = false;
        Rectangle rectangle = new Rectangle(x, y, 15, 15);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void move(int x, int y) {
        setX(x);
        setY(y);


    }

    public void moveEnemy(int x, int y) {
        Random random = new Random();
        int direction = random.nextInt(4);

        switch (direction){
            case 0:
                setY(getY() - 15);
                this.rectangle.translate(getX(), getY());
                break;
            case 1:
                setX(getX() + 15);
                this.rectangle.translate(getX(),getY());
                break;
            case 2:
                setY(getY() + 15);
                this.rectangle.translate(getX(),getY());
                break;
            case 3:
                setX(getX() - 15);
                this.rectangle.translate(getX(),getY());
                break;
                default:break;
        }

    }
}