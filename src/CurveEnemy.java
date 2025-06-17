
public class CurveEnemy extends Enemy{
	public void draw(MyFrame f) {
		f.setColor(0, 0, 0);
		f.fillOval(x, y, 30, 30);
		f.setColor(255, 255,255);
		f.fillOval(x+5, y, 20, 30);
	}
	public CurveEnemy(double x,double y,double vx,double vy) {
		super(x,y,vx,vy);
		life=2+GameWorld.stage;
	}
	public void move() {
		super.move();
		if (x<GameWorld.player.x) {
			//自分がプレイヤーより左にいたら右に移動する
			x+=GameWorld.stage;
		}
		if (x>GameWorld.player.x) {
			//自分がプレイヤーより右にいたら左に移動する
			x-=GameWorld.stage;
		}
	}
}
