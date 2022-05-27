package org.balicki.RegistroPorPasos.controller;

import org.balicki.RegistroPorPasos.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

@Controller
@RequestMapping("/registro")
public class Controlador {
    private Usuario usuario;

    @GetMapping("personales")
    public ModelAndView devuelveDatosPersonales(HttpServletRequest solicitud) {
        ModelAndView mAV = new ModelAndView();
        if (solicitud.getSession().getAttribute("usuario") != null) {
            usuario = (Usuario) solicitud.getSession().getAttribute("usuario");
        } else {
            usuario = new Usuario();
        }
        mAV.addObject("usuario", usuario);
        mAV.addObject("listaNavegacion", Colecciones.listaNavegacion);
        mAV.addObject("listaGenerosOrdenada", Colecciones.listaGenerosOrdenada);
        mAV.addObject("listaNacionalidadesOrdenada", Colecciones.listaNacionalidadesOrdenada);
        mAV.addObject("listaEstadoOrdenada", Colecciones.listaEstadoOrdenada);
        mAV.setViewName("personales");
        return mAV;
    }

    @PostMapping("personales")
    public ModelAndView recibeDatosPersonales(Usuario usuario, HttpServletRequest solicitud) {
        ModelAndView mAV = new ModelAndView();
        this.usuario.setNombre(usuario.getNombre());
        this.usuario.setApellidos(usuario.getApellidos());
        this.usuario.setFechaNac(usuario.getFechaNac());
        this.usuario.setSiglasGenero(usuario.getSiglasGenero());
        this.usuario.setEstado(usuario.getEstado());
        this.usuario.setNacionalidades(usuario.getNacionalidades());
        solicitud.getSession().setAttribute("usuario", usuario);
        mAV.addObject("usuario", this.usuario);
        mAV.addObject("listaNavegacion", Colecciones.listaNavegacion);
        mAV.addObject("listaGenerosOrdenada", Colecciones.listaGenerosOrdenada);
        mAV.addObject("listaNacionalidadesOrdenada", Colecciones.listaNacionalidadesOrdenada);
        mAV.addObject("listaEstadoOrdenada", Colecciones.listaEstadoOrdenada);
        mAV.setViewName("redirect:profesionales");
        return mAV;
    }

    @GetMapping("profesionales")
    public ModelAndView devuelveDatosProfesionales(HttpServletRequest solicitud) {
        ModelAndView mAV = new ModelAndView();
        if (solicitud.getSession().getAttribute("usuario") != null) {
            usuario = (Usuario) solicitud.getSession().getAttribute("usuario");
        } else {
            usuario = new Usuario();
        }
        mAV.addObject("usuario", usuario);
        mAV.addObject("listaNavegacion", Colecciones.listaNavegacion);
        mAV.addObject("listaDepartamentoOrdenada", Colecciones.listaDepartamentoOrdenada);
        mAV.setViewName("profesionales");
        return mAV;
    }

    @PostMapping("profesionales")
    public ModelAndView recibeDatosProfesionales(Usuario usuario, HttpServletRequest solicitud) {
        ModelAndView mAV = new ModelAndView();
        this.usuario.setDepartamentos(usuario.getDepartamentos());
        this.usuario.setSalario(usuario.getSalario());
        this.usuario.setComentarios(usuario.getComentarios());
        solicitud.getSession().setAttribute("usuario", this.usuario);
        mAV.addObject("usuario", usuario);
        mAV.addObject("listaNavegacion", Colecciones.listaNavegacion);
        mAV.addObject("listaDepartamentoOrdenada", Colecciones.listaDepartamentoOrdenada);
        mAV.setViewName("redirect:bancarios");
        return mAV;
    }

    @GetMapping("bancarios")
    public ModelAndView devuelveDatosBancarios(HttpServletRequest solicitud) {
        ModelAndView mAV = new ModelAndView();
        if (solicitud.getSession().getAttribute("usuario") != null) {
            usuario = (Usuario) solicitud.getSession().getAttribute("usuario");
        } else {
            usuario = new Usuario();
        }
        mAV.addObject("listaNavegacion", Colecciones.listaNavegacion);
        mAV.addObject("usuario", usuario);
        mAV.setViewName("bancarios");
        return mAV;
    }

    @PostMapping("bancarios")
    public ModelAndView recibeDatosBancarios(Usuario usuario, HttpServletRequest solicitud) {
        ModelAndView mAV = new ModelAndView();
        this.usuario.setCuenta(usuario.getCuenta());
        solicitud.getSession().setAttribute("usuario", this.usuario);
        mAV.addObject("usuario", usuario);
        mAV.addObject("listaNavegacion", Colecciones.listaNavegacion);
        mAV.setViewName("redirect:resumen");
        return mAV;
    }

    @GetMapping("resumen")
    public ModelAndView devuelveDatosResumen(HttpServletRequest solicitud) {
        ModelAndView mAV = new ModelAndView();
        if (solicitud.getSession().getAttribute("usuario") != null) {
            usuario = (Usuario) solicitud.getSession().getAttribute("usuario");
        } else {
            usuario = new Usuario();
        }
        mAV.addObject("listaNavegacion", Colecciones.listaNavegacion);
        mAV.addObject("usuario", usuario);
        mAV.setViewName("resumen");
        return mAV;
    }

    @PostMapping("resumen")
    public ModelAndView recibeDatosResumen(HttpServletRequest solicitud) {
        ModelAndView mAV = new ModelAndView();
        solicitud.getSession().invalidate();
        mAV.setViewName("redirect:personales");
        return mAV;
    }
}
