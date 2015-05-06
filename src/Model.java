import tank.Tank;

/**
 * Created by R2 on 29.04.2015.
 */
public class Model {
    int [][]pole;
    Tank tank;
    int x;
    int y;

    Model (int n, int m, int x, int y){
        pole = new int[n][m];
        tank = new Tank(x, y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
