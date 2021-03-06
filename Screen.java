public class Screen {

	private int width, height;
	public int[] pixels;

	int xtime = 0, ytime = 50;
	int counter = 0;

	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height];
	}

	public void clear() {
		for (int i = 0; i < pixels.length; i++) {
			pixels[i] = 0;
		}
	}

	public void render() {
		counter++;
		if (counter % 100 == 0)
			xtime++;
		if (counter % 100 == 0)
			ytime++;

		for (int y = 0; y < height; y++) {
			if (ytime >= height || ytime < 0)
				break;// This breaks the drawing loop when pixel reaches the
			// edge of the screen. in relation to both positive and negative.
			for (int x = 0; x < width; x++) {
				if (xtime >= width || xtime < 0)
					break;
				pixels[xtime + ytime * width] = 0xff00ff;
			}
		}
	}
}
