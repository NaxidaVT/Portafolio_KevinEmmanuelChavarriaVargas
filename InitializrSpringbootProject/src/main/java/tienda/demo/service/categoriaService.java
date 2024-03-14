package tienda.demo.service;

import tienda.demo.domain.Categoria;
import java.util.List;

public interface categoriaService {
    // Se obtiene un listado de categorias en un List
    public List<Categoria> getCategorias(boolean activos);

   // Se obtiene un Categoria, a partir del id de un Categoria
    public Categoria getCategoria(Categoria categoria);
    
    // Se inserta un nuevo Categoria si el id del Categoria esta vacío
    // Se actualiza un Categoria si el id del Categoria NO esta vacío
    public void save(Categoria categoria);
    
    // Se elimina el Categoria que tiene el id pasado por parámetro
    public void delete(Categoria categoria);
}
