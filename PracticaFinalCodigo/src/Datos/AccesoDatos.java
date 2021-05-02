package Datos;

import Dominio.Publicacion;
import Excepciones.ExcepcionesAccesoDatos;
import java.util.List;

public interface AccesoDatos {

    void insertaPublicacion(Publicacion p) throws ExcepcionesAccesoDatos;

    List<Publicacion> leerPublicaciones() throws ExcepcionesAccesoDatos;

    Publicacion buscarPublicacion(Publicacion p) throws ExcepcionesAccesoDatos;

    boolean eliminarPublicacion(Publicacion p, String isbn) throws ExcepcionesAccesoDatos;
}
