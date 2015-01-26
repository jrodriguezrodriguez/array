package ejerciciosArray;

public class Producto {
	private int id;
	private String nombreProducto;
	private double precioProducto;
	
	public Producto(int id, String nombreProducto, double precioProducto) {
		this.id = id;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
	}

	public int getId() {
		return id;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public double getPrecioProducto() {
		return precioProducto;
	}

	@Override
	public String toString() {
		return "Producto: id=" + id + ", nombreProducto=" + nombreProducto
				+ ", precioProducto=" + precioProducto;
	}
	
	
	
	

}
