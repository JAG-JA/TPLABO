package entidades;

public class localidad {
	
	private int id_localidad;
	private String localidad;
	/**
	 * @return the id_localidad
	 */
	public int getId_localidad() {
		return id_localidad;
	}
	/**
	 * @param id_localidad the id_localidad to set
	 */
	public void setId_localidad(int id_localidad) {
		this.id_localidad = id_localidad;
	}
	/**
	 * @return the localidad
	 */
	public String getLocalidad() {
		return localidad;
	}
	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	@Override
	public String toString() {
		return "localidad [id_localidad=" + id_localidad + ", localidad=" + localidad + "]";
	}
	public localidad(int id_localidad, String localidad) {
		super();
		this.id_localidad = id_localidad;
		this.localidad = localidad;
	}

	
	
	
}
