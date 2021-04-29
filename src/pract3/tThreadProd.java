package pract3;

public class tThreadProd extends Thread{
	Almacen mon;
	int id;
	
	tThreadProd(Almacen mon, int id) {
		this.mon = mon;
		this.id = id;
		System.out.println("Hilo productor " + id + " creado.");
	}
	
	public void run() {
		for(int i = 0; i < 1;i++) {
			try {
				mon.almacenar(id, new Producto(id));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
