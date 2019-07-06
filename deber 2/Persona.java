public class Persona{
	
	private String nombre;
	private String apellido;
	private String cedula;
	private String sexo;
	private float  sueldo;
	private String direccion;
	
	public Persona(String nombre, String apellido, String cedula, String sexo, float sueldo, String direccion ){
		this.nombre=nombre;
		this.apellido=apellido;
		this.cedula=cedula;
		this.sexo=sexo;
		this.sueldo=sueldo;
		this.direccion=direccion;
	}
	public void setNombre(String nombre){
		nombre=nombre;
	}
	public void setApellido(String apellido){
		apellido=apellido;
	}
	public void setCedula(String cedula){
		cedula=cedula;
	}
	public void setSexo(String sexo){
		sexo=sexo;
	}
	public void setSueldo(float sueldo){
		sueldo=sueldo;
	}
	public void setDireccion(String direccion){
		direccion=direccion;
	}
	public String getNombre(){
		return nombre;
	}
	public String getApellido(){
		return apellido;
	}
	public String getCedula(){
		return cedula;
	}
	public String getSexo(){
		return sexo;
	}
	public float getSueldo(){
		return sueldo;
	}
	public String getDireccion(){
		return direccion;
	}
	
}