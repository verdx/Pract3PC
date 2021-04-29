package pract3;

public class tThreadCons extends Thread{
	Almacen mon;
	int id;
	
	tThreadCons(Almacen mon, int id) {
		this.mon = mon;
		this.id = id;
		System.out.println("Hilo consumidor " + id + " creado.");
	}
	
	public void run() {
		for(int i = 0; i < 1;i++) {
			try {
				mon.extraer(id);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
