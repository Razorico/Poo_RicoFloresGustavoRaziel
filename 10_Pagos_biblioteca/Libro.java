public class Libro
{
	private String nombre;
	private String autor;
	private String genero;
	private float costo;
	private int existencias;

	public Libro(String nombre, String autor, String genero, float costo, int existencias) 
	{
		this.nombre = nombre;
		this.autor = autor;
		this.genero = genero;
		this.costo = costo;
		this.existencias = existencias;
	}

	public String getNombre()
	{
		return this.nombre;
	}

	public String getAutor()
	{
		return this.autor;
	}

	public String getGenero()
	{
		return this.genero;
	}

	public float getCosto()
	{
		return this.costo;
	}

	public int getExistencias()
	{
		return this.existencias;
	}

	public void setExistencias(int existencias)
	{
		this.existencias = existencias;
	}
}