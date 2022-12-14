
public class main {
	
	public static void main (String[] args){
		Producto p1 = new Producto("cuchara", 150, 400);
		p1.addCategoria("comedor");
		p1.addCategoria("cocina");
		p1.addCategoria("para comer");
		
		Producto p2 = new Producto("tenedor", 150.5, 420);
		p2.addCategoria("comedor");
		p2.addCategoria("cocina");
		p2.addCategoria("utensillos");
		
		Producto p3 = new Producto("cuchillo", 200, 450);
		Producto p4 = new Producto("cucharita", 100, 330);
		Producto p5 = new Producto("espatula", 15, 400);
		
		
		Combo c1 = new Combo("combo cocina", 1.4, 50);
		
		c1.addElemento(p1);
		c1.addElemento(p2);
		c1.addElemento(p3);
		c1.addElemento(p4);
		
		Combo c2 = new Combo("combo general", 1.4, 50);
		c2.addElemento(c1);
		c2.addElemento(p5);
		
		System.out.println(c2.contarProducto());
		System.out.println(c2.getPrecio());
		System.out.println(c2.getPeso());
		System.out.println(c2.getCategoria());
		
		Filtro f1 = new FiltroCategoria("comedor");
		System.out.println(c2.buscar(f1));
		System.out.println(c1.copiaRestringida(f1));
		
		Combo c3 = new ComboPagaUno("combo paga uno", 1.4, 50);
		c3.addElemento(p1);
		c3.addElemento(p3);
		c3.addElemento(c1);		
		System.out.println(c3.getPrecio());
	}
}
