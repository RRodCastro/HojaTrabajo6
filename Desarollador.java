public class Desarollador   {

	
	public String nombrePersona;
	public String devJava;
	public String devWeb;
	public String devCel;
	
	
	public Desarollador(String nombrePersona, String devJava, String devWeb,
			String devCel)
	{
		super();
		this.nombrePersona = nombrePersona;
		this.devJava = devJava;
		this.devWeb = devWeb;
		this.devCel = devCel;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public String getDevJava() {
		return devJava;
	}

	public void setDevJava(String devJava) {
		this.devJava = devJava;
	}

	public String getDevWeb() {
		return devWeb;
	}
	public void setDevWeb(String devWeb) {
		this.devWeb = devWeb;
	}


	public String getDevCel() {
		return devCel;
	}

	public void setDevCel(String devCel) {
		this.devCel = devCel;
	}


	public String toString(){
		return ( "Nombre: " + nombrePersona);
	}
	
	
	
	}


