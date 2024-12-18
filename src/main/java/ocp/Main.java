package ocp;
public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        // Enviar notificaciones usando diferentes implementaciones
        service.sendNotification(new EmailNotification(), "Hello via Email!");
        service.sendNotification(new SMSNotification(), "Hello via SMS!");
        service.sendNotification(new PushNotification(), "Hello via Push Notification!");

        // Agregar nuevos tipos de notificaciones simplemente creando nuevas clases
        // (No es necesario modificar el código existente en NotificationService)
    }
}
