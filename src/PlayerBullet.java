
public class PlayerBullet extends Character{
	public void draw(MyFrame f) {
		f.setColor(200, 10,10);
		f.fillRect(x+13, y, 5, 30);
	}
	public PlayerBullet(double x,double y,double vx,double vy) {
		//Characterクラスのコンストラクタ呼び出し
		super(x,y,vx,vy);
	}
}
