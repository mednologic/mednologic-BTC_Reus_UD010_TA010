package Class;

public class PasswordClass {
	//Values to check the integrity of password
	public static String NUMEROS = "0123456789";
	public static String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
	//All values to generate the password
	public static String VALORES = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public int longitud = 8;
	public String contrasenya = "";
	
//Constructors
	public PasswordClass() {
		
	}

	public PasswordClass(int longitud) {
		this.longitud = longitud;
			contrasenya = generarPassword(longitud);
	}
	
//Methods
	//Method for check the integrity of the recived password
	public static boolean esFuerte(String contrasenya) {
		boolean flag 	= false;
		int mayusculas 	= 0;
		int minusculas 	= 0;
		int numeros		= 0;
		
		for(int i=0; i<contrasenya.length();i++) {
			char caracter = contrasenya.charAt(i);
			for(int x=0;x<NUMEROS.length();x++) {
				if(NUMEROS.charAt(x)==caracter) {
					numeros++;
				}
			}
			for(int y=0;y<MAYUSCULAS.length();y++) {
				if(MAYUSCULAS.charAt(y)==caracter) {
					mayusculas++;
				}
			}
			for(int z=0;z<MAYUSCULAS.length();z++) {
				if(MINUSCULAS.charAt(z)==caracter) {
					minusculas++;
				}
			}
		}
		//Check the integrity of the password
		if(mayusculas>2&&minusculas>1&&numeros>5) {
			flag = true;
		}
		return flag;
}
	//Method for generate the passwords
	public static String generarPassword(int longitud) {
		String contrasenyaG = "";
		 
		for (int i = 0; i < longitud; i++) {
			contrasenyaG+=(VALORES.charAt((int)(Math.random() * VALORES.length())));
		}
 
		return contrasenyaG;		
	}
//Getters and Setters

	/**
	 * @return the longitud
	 */
	public int getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	/**
	 * @return the contrasenya
	 */
	public String getContrasenya() {
		return contrasenya;
	}

	/**
	 * @param contrasenya the contrasenya to set
	 */
	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}
	
}
