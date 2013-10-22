public class AmericanFlag {

	private int x;
	private int y;
	private int scale;

	public void AmericanFlag(int x, int y, int scale) {
		this.x = x;
		this.y = y;
		this.scale = scale;
		this.color = color;
	}

	public void draw(Graphics g) {
		int y = 0;
		for (int i=0; i<=13; i++) {
			if (i % 2 == 1) {
				stripe(0, y, 1);
			}
			y += 5;
		}
	}

	public void stripe(int x, int y, int scale, Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, 50*scale, 5*scale);
	}

	public void union(int x, int y, int width, int height) {
		g.setColor(Color.blue);
		g.fillRect(x, y, width, height);
	}


}