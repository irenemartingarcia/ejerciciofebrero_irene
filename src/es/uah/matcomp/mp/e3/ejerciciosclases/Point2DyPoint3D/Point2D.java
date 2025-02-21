package es.uah.matcomp.mp.e3.ejerciciosclases.Point2DyPoint3D;

public class Point2D {
    private float x;
    private float y;
    public Point2D(){
        x=0.0f;
        y=0.0f;
    }
    public Point2D(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float[] coord=new float[2];
        coord[0]=x;
        coord[1]=y;
        return coord;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}
