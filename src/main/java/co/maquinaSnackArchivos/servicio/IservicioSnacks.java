package co.maquinaSnackArchivos.servicio;

import co.maquinaSnackArchivos.dominio.Snack;

import java.util.List;

public interface IservicioSnacks {

    // public abstract por defecto
    void agregarSnack(Snack snack);
    void mostrarSnack();
    List<Snack> getSnackList();
}
