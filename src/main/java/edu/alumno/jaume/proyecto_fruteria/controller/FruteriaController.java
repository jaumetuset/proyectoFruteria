package edu.alumno.jaume.proyecto_fruteria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.ModelMap;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.alumno.jaume.proyecto_fruteria.model.dto.FiltroAvanzadoFruta;
import edu.alumno.jaume.proyecto_fruteria.model.dto.FrutasList;
import edu.alumno.jaume.proyecto_fruteria.model.dto.PaginaDto;
import edu.alumno.jaume.proyecto_fruteria.model.ram.Pagina;
import edu.alumno.jaume.proyecto_fruteria.repository.FruteriaRepository;
import edu.alumno.jaume.proyecto_fruteria.srv.FruteriaService;
import edu.alumno.jaume.proyecto_fruteria.util.PaginacionHelper;
import edu.alumno.jaume.proyecto_fruteria.srv.CarritoService;

@Controller
@RequestMapping("")
public class FruteriaController {
    
    private FruteriaRepository fruteriaRepository;

    @Autowired
    private FruteriaService fruteriaService;
    private CarritoService carritoService;

    public FruteriaController(FruteriaService fruteriaService, CarritoService carritoService,FruteriaRepository fruteriaRepository){
        this.fruteriaService=fruteriaService;
        this.carritoService=carritoService;
        this.fruteriaRepository=fruteriaRepository;
    }

    @GetMapping("/")
    public String bienvenida(){
        return "bienvenida";
    } 

    @GetMapping({ "/list-frutas" })
    public String listarFrutas(ModelMap model, @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size, @RequestParam(defaultValue = "nombre,asc") String[] sort,
            @RequestParam(required = false) FiltroAvanzadoFruta filtroAvanzadoFruta) {

        PaginaDto<FrutasList> pageDto = new PaginaDto<FrutasList>();
        
        if (filtroAvanzadoFruta != null)
            model.put("filtroAvanzadoFruta", filtroAvanzadoFruta);
        else {
            FiltroAvanzadoFruta filtro = new FiltroAvanzadoFruta();
            filtro = (FiltroAvanzadoFruta) PaginacionHelper.ConfigurarPaginacionEnFiltroPagina(filtro, page, size,
                    sort);
            model.put("filtroAvanzadoFruta", filtro);
        }

        try {

            Pageable paging = PaginacionHelper.ConfiguraPaginacion(page, size, sort);
            if (filtroAvanzadoFruta != null)
                pageDto = fruteriaService.findAllFrutaList(filtroAvanzadoFruta, paging);
            else
                pageDto = fruteriaService.findAllFrutaList(paging);
            List<FrutasList> frutas = pageDto.getContent();
            model.addAttribute("frutasList", frutas);

            model = PaginacionHelper.ConfiguraPaginaEnModel(model, "/list-frutas", sort, pageDto.getNumber(),
                    pageDto.getSize(), pageDto.getTotalElements(), pageDto.getTotalPages());
            return "list-frutas";
        } catch (Exception e) {
            model.addAttribute("frutasList", new ArrayList<FrutasList>());
            model = PaginacionHelper.ConfiguraPaginaEnModel(model, "/list-frutas", sort, pageDto.getNumber(),
                    pageDto.getSize(), pageDto.getTotalElements(), pageDto.getTotalPages());
        }
        return "list-frutas";
    }
}
    

