package ejerciciointegrador;

public abstract class Pokemon {
    
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;
    
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
    
    //caracteristicas de clase abstracta
    //especializacion que hace algo es interfaz
    //cuando me pregunto el que es? son abstractas
}
