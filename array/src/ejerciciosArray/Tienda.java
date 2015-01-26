package ejerciciosArray;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
	private List<Producto> lista;

	public Tienda() {
		this.lista = new ArrayList<Producto>();
	}
	
	public void addProducto (Producto p){
		if (lista.contains(p)){
			//System.out.println("el producto ["+p+"] ya esta incluido");
		}else{
			lista.add(p);
		}
	}

	public List<Producto> getLista() {
		return lista;
	}
	
	public void eliminarProducto(Producto p){
		if (lista.contains(p)){
			lista.remove(p);
		/*}else{
			System.out.println("El producto ["+p+"] no esta incluido en la lista");*/
		}	
	}

	public Producto productoMasCaro(){
		double precio = 0.0;
		Producto p=new Producto(0, "",lista.get(0).getPrecioProducto());
		for (Producto producto : lista) {
			if (precio <producto.getPrecioProducto()){
				precio=producto.getPrecioProducto();
				p = producto;
			}
		}
		return p;
	}
	
	public Producto productoMasBarato(){
		double precio = lista.get(0).getPrecioProducto();
		Producto p=lista.get(0);
		for (Producto producto : lista) {
			if (precio >producto.getPrecioProducto()){
				precio=producto.getPrecioProducto();
				p = producto;
			}
		}
		return p;
	}
	@Override
	public String toString() {
		return "Tienda lista=" + lista;
	}
}
