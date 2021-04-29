package pract3;

public interface Almacen {

	/*** Almacena (como ultimo) un producto en el almacen. Si no hay
	 *   hueco el proceso que ejecute el m ́etodo bloquear ́a hasta que lo
	 *   haya.
	 * @throws InterruptedException */
	public void almacenar(int id, Producto producto) throws InterruptedException;
	/*** Extrae el primer producto disponible. Si no hay productos el
	 *   proceso que ejecute el método bloquear ́hasta que se almacene un
	 *   dato.
	 * @throws InterruptedException */
	public Producto extraer(int id) throws InterruptedException;
}
