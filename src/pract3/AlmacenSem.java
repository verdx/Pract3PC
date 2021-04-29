package pract3;

import java.util.concurrent.Semaphore;

public class AlmacenSem implements Almacen{
	
	private Producto buffer;
	private Semaphore sem;
	private Semaphore lock;
	
	public AlmacenSem() {
		sem = new Semaphore(0);
		lock = new Semaphore(1);
	}
	
	public void almacenar(int id, Producto producto) throws InterruptedException {
		lock.acquire();
		buffer = producto;
		sem.release();
		System.out.println("El productor " + id + " ha almacenado el producto " + producto.n);
		lock.release();
	}
	
	public Producto extraer(int id) throws InterruptedException {
		lock.acquire();
		while(buffer == null) {
			lock.release();
			sem.acquire();
		}
		Producto temp = buffer;
		buffer = null;
		System.out.println("El consumidor " + id + " ha extraido el producto " + temp.n);
		lock.release();
		return temp;
	}
	
	
}
