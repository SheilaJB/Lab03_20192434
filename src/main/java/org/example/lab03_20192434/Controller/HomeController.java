package org.example.lab03_20192434.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
public class HomeController {

    //Listas
    private List<Auto> listaAutos = new ArrayList<>();
    private List<Seguro> listaSeguros = new ArrayList<>();
    private List<Sede> listaSedes = new ArrayList<>();

    //Controlador de la pagina inicial
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model) {

        return "home";
   }

    //Ingresar un nuevo auto

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String nuevoAuto(Model model) {
        model.addAttribute("auto", new Auto());
        return "home";
    }

    //Guarda los datos del formulario de Autos
    @PostMapping("/Auto/Guardar")
    public String guardarAuto( Auto auto) {
        listaAutos.add(auto);

        String s = "redirect:/listaAutos";
        return s;
    }
    //Guarda los datos del formulario de Seguros
    @PostMapping("/Seguro/Guardar")
    public String formularioSeguros( Seguro seguro) {
        listaSeguros.add(seguro);
        return "redirect:/listaSeguros";
    }
    //Guarda los datos del formulario de Sedes
    @PostMapping("/Sede/Guardar")
    public String formularioSedes( Sede sede) {
        listaSedes.add(sede);
        return "redirect:/listaSedes";
    }

    //Para mostrar la lista de Autos
    @RequestMapping(value = "/Auto", method = RequestMethod.GET)
    public String listaAuto(Model model) {
        model.addAttribute("listaAutos", listaAutos);
        return "redirect:/listaAuto";
    }

    //Para mostrar la lista de Seguros
    @RequestMapping(value = "/Seguro", method = RequestMethod.GET)
    public String listaSeguros(Model model) {
        model.addAttribute("listaSeguros", listaSeguros);
        return "redirect:/listaSeguros";
    }

    //Para mostrar la lista de Sedes
    @RequestMapping(value = "/Sede", method = RequestMethod.GET)
    public String listaSedes(Model model) {
        model.addAttribute("listaSedes", listaSedes);
        return "redirect:/listaSedes";
    }


}
