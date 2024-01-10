package org.iesvdm.controlador;

import org.iesvdm.modelo.Comercial;
import org.iesvdm.service.ComercialService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class ComercialController {

    private ComercialService comercialService;

    // Inyeccion por constructor, se omite @Autowired
    public ComercialController(ComercialService comercialService){

        this.comercialService = comercialService;
    }

    @GetMapping("/comerciales")
    public String listar(Model model){

        List<Comercial> listaComerciales = comercialService.listAll();
        model.addAttribute("listaComerciales", listaComerciales);

        return "comerciales";
    }
}
