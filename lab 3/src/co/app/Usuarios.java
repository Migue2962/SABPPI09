package co.app;
/*
@autor: Miguel Altamiranda
@version: 1.0
*/
    public class Usuarios {
    private String id;
    private String correo;
    private String nombre;
    private String clave;
    private int perfil;
    /*
    0=usuario estandar
    1=cliente
    2=administrados
    3=web master
    */
    private String estado;
    public Usuarios() {

    }//constructor
    
    public Usuarios(int perfil) {
        this.perfil = perfil;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public int getPerfil() {
        return perfil;
    }
    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setGenerarNumero(int i){
    System.out.println("estos son los numeros generados"+ this.nombre);
    System.out.println("__________________________________________");
    for(int j=0;j<i;j++){
    System.out.println("j< "+i+"numero generado ->"+i);
    }//fin dle metodo para
    }
}//fin de la clase