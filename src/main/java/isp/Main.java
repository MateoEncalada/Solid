package isp;
public class Main {
    public static void main(String[] args) {
        // Crear instancias de dispositivos
        Powerable phone = new Phone();
        Powerable camera = new DisposableCamera();

        // Usar métodos comunes
        phone.turnOn();
        ((Rechargeable) phone).charge(); // El teléfono puede cargarse
        phone.turnOff();

        camera.turnOn();
        camera.turnOff();
        // ((Rechargeable) camera).charge(); // No permitido, evita errores en tiempo de ejecución
    }
}
