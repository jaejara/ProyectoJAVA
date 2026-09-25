
public class Main {

    public static void main(String[] args) {

        Dispositivo dispositivo = new Dispositivo("Celular", true);

        dispositivo.mostrarEstado();
        dispositivo.ejecutarDiagnostico();
    }
}