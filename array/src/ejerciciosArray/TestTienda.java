package ejerciciosArray;

public class TestTienda {
	public static void main(String[] args) {
		
		Producto p1 = new Producto(1, "Patatas fritas OYA", 0.85);
		Producto p2 = new Producto(2, "Pan de molde BIMBO", 1.45);
		Producto p3 = new Producto(3, "Galletas chocolate PRINCIPE", 1.99);
		Producto p4 = new Producto(4, "Gel de ducha STYLUS", 2.35);
		Producto p5 = new Producto(5, "Desodorante AXE", 5.85);
		Producto p6 = new Producto(6, "whisky J&B", 11.85);
		
		Tienda t1 = new Tienda();
		
		t1.addProducto(p1);
		t1.addProducto(p2);
		t1.addProducto(p3);
		t1.addProducto(p4);
		t1.addProducto(p5);
		t1.addProducto(p2);
		
		System.out.println(t1);
		System.out.println("Producto mas caro: "+t1.productoMasCaro());
		System.out.println("Producto mas barato: "+t1.productoMasBarato());
		
		t1.eliminarProducto(p1);
		t1.eliminarProducto(p5);
		t1.addProducto(p6);
		
		System.out.println("================================================================");
		System.out.println(t1);
		System.out.println("Producto mas caro: "+t1.productoMasCaro());
		System.out.println("Producto mas barato: "+t1.productoMasBarato());
		
	}

}
