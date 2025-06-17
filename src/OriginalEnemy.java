
public class OriginalEnemy extends Enemy{
	public void draw(MyFrame f) {
		f.setColor(200, 200, 0);
		f.fillOval(x+10, y+10, 10, 10);
		f.setColor(255,255,255);
		f.fillOval(x+12, y+12,2,2);
	}
	public OriginalEnemy(double x,double y,double vx,double vy) {
		super(x,y,vx,vy);
		life=2+GameWorld.stage;
	}
	public void move() {
		super.move();
		vy+=GameWorld.stage*0.1;
		if (y>350) {
			vy-=GameWorld.stage*0.4;
		}
	}
}
