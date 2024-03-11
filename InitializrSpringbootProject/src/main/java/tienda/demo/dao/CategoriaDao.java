package tienda.demo.dao;

import tienda.demo.domain.categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository <categoria,Long>{
    
}
