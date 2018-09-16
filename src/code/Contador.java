package code;

public class Contador extends Thread {

	private int suma;
	private float frame;

	public Contador() {
		suma = 0;
		frame = 0;
	}

	@Override
	public void run() {
		while (true) {
			try {
				sumar();
				sleep(30);
				frame++;

			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

	private void sumar() {

		if (frame % 60 == 0) {
			suma++;
		}
		System.out.println(suma);
	}

}
