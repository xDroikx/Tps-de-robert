package Parcialtp5;


class Empleado {
	
	String nombre;
	int sueldobasico;
	int propina;
	int total;
	Empleado(){
	
}

	public Empleado(String n,int sb, int p, int t){
	nombre =n;
	sueldobasico = sb;
	propina = p;
	total = t;
}

	public int getTotal() {
		return total;
	}

	public void setTotal(int t) {
		this.total = t;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String n) {
		this.nombre = n;
	}

	public int getSueldobasico() {
		return sueldobasico;
	}

	public void setSueldobasico(int sb) {
		this.sueldobasico = sb;
	}

	public int getPropina() {
		return propina;
	}

	public void setPropina(int p) {
		this.propina = p;
	}
	
	void Averiguasueldo(){//sobreescritura
		total= propina + sueldobasico;
		
	}
		
};


class Cajero extends Empleado {//herencia
 
	 public Cajero(String n, int sb){
		 nombre=n;
		 sueldobasico=sb;
}
	 void Averiguasueldo(){//sobreescritura
			total= sueldobasico;
			System.out.println("Cajero: " + nombre + ", Salario: " + total);
			
		}
}

class Mozo extends Empleado {//herencia
	 
	 public Mozo(String n, int sb, int p){
		nombre=n;
		sueldobasico=sb;
		propina=p;

}
	 void Averiguasueldo(){//sobreescritura
			total= propina + sueldobasico;
			System.out.println("Mozo: " + nombre + ", Salario: " + total);
		}
}



public class TP5 {
	
		public static void calcularsalario(Empleado i) { // funcion puente donde se da el polimorfismo
		  i.Averiguasueldo();
		}
		
	public static void main(String[] args) {
		
		Cajero cajero = new Cajero("Juan", 1500);
        Mozo mozo = new Mozo("Manuel", 1400, 400);
		
		//System.out.println("El salario del mozo " + mozo.getNombre() + " es: $" + mozo.Averiguasueldo();
       //System.out.println("El salario del cajero " + cajero.getNombre() + " es: $" + cajero.Averiguasueldo();
		calcularsalario(mozo);
        calcularsalario(cajero);
	}


}