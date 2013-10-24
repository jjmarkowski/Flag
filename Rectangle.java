public class Rectangle {

	private Point topLeft;
	private int width;
	private int height;

	public void Rectangle(int x, int y, int width, int height) {
		Point topLeft = new Point(x, y);
		setWidth(width);
		setHeight(height);
	}

	public void Stripes() {
		for (int i=0; i<=13; i++) {
			if (i%2=1) {
				g.setColor(Color.red);
			} else {
				g.setColor(Color.white);
			}
			g.fillRect(topLeft, width, height);
		}
	}

	public void createUnion() {
		g.setColor(Color.blue);
		g.fillRect(topLeft, width, height);
	}

	public int setWidth(int width) {
		this.width = width;
	}

	public int setHeight(int height) {
		this.height = height;
	}

	public Point setTopLeft(Point topLeft) {
		this.topLeft = 
	}

	public int width() {
		return width;
	}

	public int height() {
		return height;
	}
	
}