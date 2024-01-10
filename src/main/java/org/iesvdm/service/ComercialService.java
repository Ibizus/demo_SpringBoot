package org.iesvdm.service;


import org.iesvdm.dao.ComercialDAO;
import org.iesvdm.modelo.Comercial;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComercialService {

    private ComercialDAO comercialDAO;

    // Inyección de ComercialDAO en el constructor (se omite @Autowired)
    public ComercialService(ComercialDAO comercialDAO){

        this.comercialDAO = comercialDAO;
    }

    public List<Comercial> listAll(){

        return comercialDAO.getAll();
    }
}
