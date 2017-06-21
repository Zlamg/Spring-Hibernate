/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Usuarios;
import model.UsuarioModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;


@Controller
public class UsuarioController {
    @RequestMapping("index")
    public ModelAndView redireccio() {
        ModelAndView MV = new ModelAndView();
        MV.setView("index");        
        return MV;
    }

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public String getAll(Model m) {
        UsuarioModel model = new UsuarioModel();
        m.addAttribute("lst", model.getAll());
        return "data";
    }

    @RequestMapping(value = "edit", method = RequestMethod.GET)
    public String edit(@RequestParam(value = "id") int id, Model m) {
        java.math.BigDecimal bd = new java.math.BigDecimal(String.valueOf(id));
        UsuarioModel model = new UsuarioModel();
        Usuarios u = new Usuarios();
        UsuarioModel umodel = new UsuarioModel();
        u = model.getUsuario(id);
        m.addAttribute("u", u);
        return "edita";

    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String update(@ModelAttribute(value = "Usuarios") Usuarios u) {
        UsuarioModel model = new UsuarioModel();
        Usuarios aux = new Usuarios();
        int id = u.getId();
        aux = model.getUsuario(id);
        aux.setCedula(u.getCedula());
        aux.setNombre(u.getNombre());
        aux.setApellidos(u.getApellidos());
        model.edit(aux);
        return "redirect:getAll.html";
    }

    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String removedp(@RequestParam(value = "id") int id, Model m) {
        UsuarioModel model = new UsuarioModel();
        Usuarios u = new Usuarios();
        u = model.getUsuario(id);
        model.remove(u);
        return "redirect:getAll.html";
    }

    @RequestMapping(value = "crear", method = RequestMethod.GET)
    public String createdp(Model m) {

        Usuarios u = new Usuarios();

        m.addAttribute("u", u);

        return "create";
    }
    @RequestMapping(value = "add",method=RequestMethod.POST)
    public String createdp(@ModelAttribute(value="Usuarios") Usuarios us)    {
        
        Usuarios u=new Usuarios();
        UsuarioModel usuario=new UsuarioModel();
        u.setId(us.getId());
        u.setCedula(us.getCedula());
        u.setNombre(us.getNombre());
        u.setApellidos(us.getApellidos());             
        usuario.create(u);
        return "redirect:getAll.html";
    }
}
