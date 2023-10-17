package futbol;

public abstract class Futbolista implements Comparable<Object> {
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista(String nombre, int edad, String pocision) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.posicion = pocision;
	}
	
	public Futbolista() {
		this("Maradona", 30, "delantero");
	}
	@Override
	public String toString() {
		String texto= "El futbolista "+nombre+" tiene "+edad+", y juega de "+ posicion;
		return texto;
	}
	
	public boolean equals(Futbolista f) {
		if (this == f) {
			return true;
		}
		else {
			return false;
		}
	}
	public int compareTo(Futbolista k) {
		return 0;
		}
	
	public abstract boolean jugarConLasManos();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPosicion() {
		return posicion;
	}
}
