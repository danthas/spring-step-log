package org.balicki.RegistroPorPasos.model;

import java.util.LinkedHashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Colecciones {
    public static SortedMap<String, String> listaNacionalidadesOrdenada = new TreeMap<>();
    public static SortedMap<String, String> listaGenerosOrdenada = new TreeMap<>();
    public static SortedMap<String, String> listaEstadoOrdenada = new TreeMap<>();
    public static SortedMap<String, String> listaDepartamentoOrdenada = new TreeMap<>();
    public static LinkedHashMap<String, String[]> listaNavegacion = new LinkedHashMap<>();

    static {
        // Lista de generos
        listaGenerosOrdenada.put("H", "Hombre");
        listaGenerosOrdenada.put("M", "Mujer");
        listaGenerosOrdenada.put("O", "Otro");
        // Lista de nacionalidades
        listaNacionalidadesOrdenada.put("ES", "Española");
        listaNacionalidadesOrdenada.put("PT", "Portuguesa");
        listaNacionalidadesOrdenada.put("FR", "Francesa");
        listaNacionalidadesOrdenada.put("IT", "Italiana");
        // Lista de estado civil
        listaEstadoOrdenada.put("CS", "Casado o Pareja de hecho");
        listaEstadoOrdenada.put("HJ", "Hijos");
        // Lista de departamento
        listaDepartamentoOrdenada.put("MK", "Marketing");
        listaDepartamentoOrdenada.put("CT", "Contabilidad");
        listaDepartamentoOrdenada.put("IF", "Informatica");
        // Lista de navegacion
        listaNavegacion.put("1", new String[]{"personales", "Number-1-icon.png", "/registro/personales"});
        listaNavegacion.put("2", new String[]{"profesionales", "Number-2-icon.png", "/registro/profesionales"});
        listaNavegacion.put("3", new String[]{"bancarios", "Number-3-icon.png", "/registro/bancarios"});
        listaNavegacion.put("4", new String[]{"resumen", "checkered-flag-icon.png", "/registro/resumen"});
    }
}

