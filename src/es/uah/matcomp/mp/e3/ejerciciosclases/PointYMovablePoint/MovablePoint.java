package es.uah.matcomp.mp.e3.ejerciciosclases.PointYMovablePoint;

public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(){
        xSpeed=0.0f;
        ySpeed=0.0f;
    }
    public float getxSpeed() {
        return xSpeed;
    }
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getySpeed() {
        return ySpeed;
    }
    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] coord= new float[2];
        coord[0]=xSpeed;
        coord[1]=ySpeed;
        return coord;
    }
    @Override
    public String toString(){
        return super.toString()+",speed=("+xSpeed+","+ySpeed+")";
    }
    public MovablePoint Move(){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this;
    }
}
