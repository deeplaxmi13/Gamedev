package rain;

public class Screen {
	private int width, height;
	public int[] pixels;
	int time = 0;
	int counter = 0;

	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
	package rain;

public class Screen {
	private int width, height;
	public int[] pixels;
	int xtime = width - 1, ytime = height - 1;
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
		if (counter % 50 == 0)
			xtime--;
		if (counter % 50 == 0)
			ytime--;
		for (int y = 0; y < height; y++) {
			if (ytime >= height || ytime < 0)
				break;
			for (int x = 0; x < width; x++) {
				if (xtime >= width || xtime < 0)
					break;
				pixels[xtime + ytime * width] = 0xff00ff;
			}
		}
	}
}	pixels = new int[width * height];
	}

	public void clear() {
		for (int i = 0; i < pixels.length; i++) {
			pixels[i] = 0;
		}
	}

	public void render() {
		counter++;
		if (counter % 100 == 0)
			time++;
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				pixels[time + 10 * width] = 0xff00ff;

			}

		}
	}
}
