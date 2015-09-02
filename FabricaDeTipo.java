
public class FabricaDeTipo   {
	
	protected String tipo;
	
	public FabricaDeTipo(String t){
		tipo = t;
	}
	
	public TiposDeSet crearTipo(){
		if (tipo.equalsIgnoreCase("HashSet")){
			return new TipoHashSet();
		}
		else if (tipo.equalsIgnoreCase("TreeSet")){
			return new TipoTreeSet();
		}
		else {
			return new TipoLinkedHashSet();
		}
	}

}
