package Parcialtp6;



class Habilidades{
char habilidad1 =15;
char habilidad2 =15;

Habilidades(){
}
Habilidades(char h1,char h2){
	 habilidad1=h1;
	 habilidad2=h2;
}
}

class Empleado{
		
	
	void imprime_cargo(){//sobreescritura
System.out.println("Cargo no definido");

}
}

class Medico extends Empleado{ // Aca se aplica herencia
String nombre;
int matricula;
Medico(){
	
}
Medico(String n, int m){
	nombre=n;
	matricula=m;
}	
public String getNombre() {
	return nombre;
}
public void setNombre(String n) {
	this.nombre = n;
}
public int getMatricula() {
	return matricula;
}
public void setMatricula(int m) {
	this.matricula = m;
}
void imprime_cargo(){//sobreescritura
System.out.println("Es un Medico");
}
}

class Directivo extends Empleado{// Aca se aplica herencia
Habilidades uno;
void imprime_cargo(){//sobreescritura
System.out.println("Es un directivo");
}
}

class Operario extends Empleado{ // Aca se aplica herencia
Habilidades dos;
void imprime_cargo(){//sobreescritura
System.out.println("Es un operario");
}
}

class Oficial extends Operario{ // Aca se aplica herencia
Habilidades tres;
void imprime_cargo(){//sobreescritura
System.out.println("Es un operario oficial");
}
}

class Tecnico extends Operario{ // Aca se aplica herencia
Habilidades cuatro;
void imprime_cargo(){//sobreescritura
System.out.println("Es un operario tecnico");
}
}


class TP6{
	static void imprimir(Empleado i){ //Polimorfismo, no se da upcasting ya que se anula por el polimorfismo
		i.imprime_cargo();
		}
	public static void main(String[] args) {
		Oficial oficial = new Oficial();
		Tecnico tecnico = new Tecnico();
		Directivo directivo = new Directivo();
		Medico medico = new Medico();
		Medico medico2 = new Medico();
		medico.setNombre("Cosme");
		medico.setMatricula(1534);
		medico2.setNombre("Damian");
		medico2.setMatricula(1712);
		
System.out.println("Rafael");
imprimir(oficial); 
System.out.println("Gabriel");
imprimir(tecnico);
System.out.println("Miguel");
imprimir(directivo);
System.out.println(medico.getNombre()+" con matricula nº "+medico.getMatricula());
imprimir(medico);
System.out.println(medico2.getNombre()+" con matricula nº "+medico2.getMatricula());
imprimir(medico2);

}
}
