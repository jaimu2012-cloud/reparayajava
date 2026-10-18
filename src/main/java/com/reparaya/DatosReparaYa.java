package com.reparaya;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public final class DatosReparaYa {
    private static final Map<String, String> USUARIOS = new HashMap<>();
    private static final List<Solicitud> SOLICITUDES = new ArrayList<>();
    private static int siguiente = 1;

    static { USUARIOS.put("demo", "1234"); }
    private DatosReparaYa() { }

    public static synchronized boolean validarUsuario(String usuario, String clave) {
        return clave.equals(USUARIOS.get(usuario.trim().toLowerCase()));
    }

    public static synchronized void registrarUsuario(String nombre, String cedula) {
        USUARIOS.put(nombre.trim().toLowerCase(), cedula.trim());
    }

    public static synchronized Solicitud registrarSolicitud(String nombre, String documento,
            String telefono, String direccion, String tipo, String descripcion) {
        Solicitud s = new Solicitud(String.format("REP-%03d", siguiente++), nombre, documento,
                telefono, direccion, tipo, descripcion, "PENDIENTE");
        SOLICITUDES.add(s);
        return s;
    }

    public static synchronized List<Solicitud> listado() {
        return new ArrayList<>(SOLICITUDES);
    }

    public static synchronized void cambiarEstado(String codigo, String estado) {
        for (Solicitud s : SOLICITUDES) {
            if (s.codigo.equals(codigo)) { s.estado = estado; return; }
        }
    }

    public static class Solicitud {
        public final String codigo, nombre, documento, telefono, direccion, tipo, descripcion;
        public String estado;
        public Solicitud(String codigo, String nombre, String documento, String telefono,
                String direccion, String tipo, String descripcion, String estado) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.documento = documento;
            this.telefono = telefono;
            this.direccion = direccion;
            this.tipo = tipo;
            this.descripcion = descripcion;
            this.estado = estado;
        }
    }
}
