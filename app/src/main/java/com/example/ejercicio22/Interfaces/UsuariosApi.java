package com.example.ejercicio22.Interfaces;

import com.example.ejercicio22.Models.Usuarios;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface UsuariosApi
{
    String Ruta0 = "/posts";
    String Ruta1= "/posts/{valor}";

    @GET(Ruta0)
    Call<List<Usuarios>> getUsuarios();

    @GET(Ruta1)
    Call<Usuarios> getUsuario(@Path("valor") String valor);
}
