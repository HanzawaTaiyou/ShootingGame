
public class SideEnemy extends Enemy{
	public void draw(MyFrame f) {
		f.setColor(10, 10, 200);
		f.fillRect(x, y+12, 30, 6);
		f.fillOval(x+20, y+10, 10, 10);
	}
	public SideEnemy(double x,double y,double vx,double vy) {
		super(x,y,vx,vy);
		life=GameWorld.stage;
	}
	public void move() {
		super.move();
		vx+=GameWorld.stage*0.05;
		vy=0;
		if (x>400) {
				x=0;
				y=300;
		}
		
	}
}
