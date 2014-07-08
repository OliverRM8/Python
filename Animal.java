package clinica;

import javax.swing.JOptionPane;

public class Animal {
	protected String codigo;
	protected String nombreA;
	protected int raza;
	protected int edad;
	protected double precioIng;
	protected  int diasHosp;
	//--------------->constructores <--------------
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal(String codigo, String nombreA, int raza, int edad,
			double precioIng, int diasHosp) {
		super();
		this.codigo = codigo;
		this.nombreA = nombreA;
		this.raza = raza;
		this.edad = edad;
		this.precioIng = precioIng;
		this.diasHosp = diasHosp;
	}
	//-------------->getter<-------------
	public String getCodigo() {
		return codigo;
	}
	public String getNombreA() {
		return nombreA;
	}
	public int getRaza() {
		return raza;
	}
	public int getEdad() {
		return edad;
	}
	public double getPrecioIng() {
		return precioIng;
	}
	public int getDiasHosp() {
		return diasHosp;
	}
	//-------->setter<--------------
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void setNombreA(String nombreA) {
		this.nombreA = nombreA;
	}
	public void setRaza(int raza) {
		this.raza = raza;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setPrecioIng(double precioIng) {
		this.precioIng = precioIng;
	}
	public void setDiasHosp(int diasHosp) {
		this.diasHosp = diasHosp;
	}
	public double getIncrementoEdad(){
		if(getEdad()>5)return 100*getDiasHosp();
		else return 0;
	}
	//------------>leer<------------------------
	public void Leer(){
		String codigo,nombreA,salida;
		int raza,edad,diasHosp;
		double precioIng;
		
		codigo=JOptionPane.showInputDialog("Codigo del Animal...:");
		nombreA=JOptionPane.showInputDialog("Nombre del Animal...:");
		
		salida="TIPO DE RAZA DE PERROS";
		salida+="\n++++++++++++++++++++++";
		salida+="\nCacri...........(1)";
		salida+="\nTumpi...........(2)";
		salida+="\nRabo de Cabuya..(3)";
		salida+="\nPeor es Nada....(4)";
		salida+="\nVarios..........(5)";
		salida+="\n\nIndique la raza...:";
		
		do{
			try{
				raza=Integer.parseInt
						(JOptionPane.showInputDialog(salida));
				
			}catch(NumberFormatException error){
				JOptionPane.showMessageDialog
								(null, "Raza invalida", "Mensaje de Error", 0);
				continue;
			}
			if((raza>=1)&&(raza<=5)) break;
			
		}while(true);
		
		do{
			try{
				edad=Integer.parseInt
						(JOptionPane.showInputDialog("edad...:"));
				
			}catch(NumberFormatException error){
				JOptionPane.showMessageDialog
								(null, "edad invalida", "Mensaje de Error", 0);
				continue;
			}
			if((edad>=0)) break;
			
		}while(true);
		do{
			try{
				diasHosp=Integer.parseInt
						(JOptionPane.showInputDialog("dias hospitalizados...:"));
				
			}catch(NumberFormatException error){
				JOptionPane.showMessageDialog
								(null, "dias invalidos", "Mensaje de Error", 0);
				continue;
			}
			if((diasHosp>=1)) break;
			
		}while(true);
		
		do{
			try{
				precioIng=Double.parseDouble(
						JOptionPane.showInputDialog("precio Ingreso...:"));
				
			}catch(NumberFormatException error){
				JOptionPane.showMessageDialog
								(null, "precio invalido", "Mensaje de Error", 0);
				continue;
			}
			if((precioIng>0)) break;
			
		}while(true);
		
		this.setCodigo(codigo);
		this.setNombreA(nombreA);
		this.setRaza(raza);
		this.setEdad(edad);
		this.setPrecioIng(precioIng);
		this.setDiasHosp(diasHosp);
		
		
	}
	//--------------> mostrar <--------------------
	public void Mostrar(){
		String salida="DATOS DEL ANIMAL";
			   salida+="\n********************";
		String mensaje;
			
		salida+="\nCodigo.....:"+this.getCodigo();
		salida+="\nNombre.....:"+this.getNombreA();
		salida+="\nRaza.......:"+tipoRaza(getRaza());
		salida+="\nEdad.......:"+this.getEdad();
		salida+="\nPrecio Ing.:"+this.getPrecioIng();
		salida+="\nDias Hosp..:"+this.getDiasHosp();
		
		JOptionPane.showMessageDialog(null, salida);
		
	}
	
	public String tipoRaza(int opcion){
		String mensaje;
		if(opcion==1) mensaje="Cacri";	   
		else if(opcion==2) mensaje="Tumpi";
		else if(opcion==3) mensaje="Rabo de Cabuya";
		else if(opcion==4) mensaje="Peor es Nada";
		else mensaje="Varios";
		
		return mensaje;
		
	}
	public static void main(String[] args) {
		Animal perro=new Animal();
		perro.Leer();
		perro.Mostrar();
	}
	

}
