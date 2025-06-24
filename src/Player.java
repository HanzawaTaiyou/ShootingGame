import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player extends Character implements KeyListener{
	public void draw(MyFrame f) {
		f.setColor(0, 128, 0);
		f.fillRect(x+8, y+16, 2, 10);
		f.fillRect(x+20, y+16, 2, 10);
		f.fillRect(x+6, y+18, 2, 10);
		f.fillRect(x+22, y+18, 2, 10);
		f.fillRect(x+4, y+21, 2, 9);
		f.fillRect(x+24, y+21, 2, 9);
		f.setColor(100, 100,100);
		f.fillRect(x+13, y, 4, 25);
		f.fillRect(x+11, y+2, 2, 25);
		f.fillRect(x+17, y+2, 2, 25);
		f.fillRect(x+10, y+5, 1, 25);
		f.fillRect(x+19, y+5, 1, 25);
	}
	public Player(double x, double y,double vx,double vy) {
		//Characterクラスのコンストラクタ呼び出し
		super(x,y,vx,vy);
	}
	public void keyPressed(KeyEvent e) {
		//キーボードが押された時の処理
		if (e.getKeyCode()==KeyEvent.VK_LEFT) {
			vx=-5;
		}
		if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
			vx=5;
		}
		if (e.getKeyCode()==KeyEvent.VK_SPACE) {
			if (GameWorld.playerBullets.size()<19) {
				GameWorld.playerBullets.add(new PlayerBullet(x,y,-3,-10));
				GameWorld.playerBullets.add(new PlayerBullet(x,y,0,-10));
				GameWorld.playerBullets.add(new PlayerBullet(x,y,3,-10));
				System.out.println("弾の数＝"+GameWorld.playerBullets.size());
				GameWorld.Bullet = 21 - GameWorld.playerBullets.size();
			}
		}
		if (e.getKeyCode()==KeyEvent.VK_SHIFT) {
			if (GameWorld.playerBullets.size()<20) {
				GameWorld.playerBullets.add(new PlayerBullet(x-20,y-15,0,-10));
				GameWorld.playerBullets.add(new PlayerBullet(x+20,y-15,0,-10));
				GameWorld.Bullet = 21 - GameWorld.playerBullets.size();
			}
		}
		if (e.getKeyCode()==KeyEvent.VK_CONTROL) {
			if (GameWorld.playerBullets.size()<20) {
				GameWorld.playerBullets.add(new PlayerBullet(x-15,y,-10,0));
				GameWorld.playerBullets.add(new PlayerBullet(x+15,y,10,0));
				GameWorld.Bullet = 21 - GameWorld.playerBullets.size();
			}
		}
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
			System.out.println("ENTERキーが押されました");
			GameWorld.enterPressed=true;
		}
	}
	public void keyReleased(KeyEvent e) {
		//キーボードが離された時の処理
		if (e.getKeyCode()==KeyEvent.VK_LEFT) {
			vx=0;
		}
		if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
			vx=0;
		}
	}
	public void keyTyped(KeyEvent e) {
	}
	public void move() {
		super.move();
		if (x<0) x=0;
		if (x>370) x=370;
	}
}
