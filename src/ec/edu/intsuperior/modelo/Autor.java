
package ec.edu.intsuperior.modelo;


public class Autor {
String id;
String nombre;
String apellido;
String profesion;
String FechaNacimiento;
public Autor(){
}
public Autor(String id, String nombre, String apellido, String profesion, String FechaNacimiento){
 this. id = id;
 this. nombre = nombre;
 this. apellido = apellido;
 this. profesion = profesion;
 this. FechaNacimiento = FechaNacimiento;
}
public String getId(){
    return id;
}
public void setId(String id) {
    this. id = id;
}
public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
    this. nombre = nombre;
}
public String getApellido(){
    return apellido;
}
public void setApellido(String apellido){
    this. apellido = apellido;
}
public String getProfecion(){
    return profesion;
}
public void setProfecion(String apellido){
    this. profesion = profesion;
}
public String getFechaNacimiento(){
    return FechaNacimiento;
}
public void setFechaNacimiento(String FechaNacimiento){
    this. FechaNacimiento = FechaNacimiento;
}


}
