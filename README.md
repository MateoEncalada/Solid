Capturas de ejercicios
## SRP
Usamos SRP para dividir responsabilidades en clases específicas, asegurando que cada clase tenga una única razón para cambiar.\
En el codigo inicial la clase de User Manager combinaba lógica de validación, persistencia y notificaciones.
Al aplicar el principio dividió estas responsabilidades en clases como UserValidator, UserRepository y NotificationService, logrando una alta cohesión y mejorando la legibilidad.
![image](https://github.com/user-attachments/assets/d209bf1c-0a65-491a-9bb8-ce1638983ea4)
## OCP
Aplicamos OCP para separar la lógica de métodos de notificación en clases específicas que implementan una interfaz común. 
Inicialmente, NotificationService dependía de condicionales para gestionar diferentes tipos de notificaciones, lo que violaba OCP al requerir modificaciones para agregar nuevos métodos.
OCP introdujo una estructura extensible basada en polimorfismo, donde nuevas notificaciones se implementan como clases que extienden la interfaz.
![image](https://github.com/user-attachments/assets/35d44534-b4fa-4af4-8f78-3efb4e31be14)
## LSP
Aplicamos LSP al rediseñar la jerarquía de clases para garantizar que las subclases sean completamente sustituibles por sus clases base sin alterar la lógica.
En el caso resuelto, Penguin heredaba el método fly() de Bird, lo que generaba inconsistencias porque los pingüinos no vuelan. La solución segregó las aves que vuelan (FlyingBird) de las que no, asegurando que cada clase implemente únicamente los métodos aplicables.
![image](https://github.com/user-attachments/assets/f691b72e-7368-4ac7-9c09-f1f9dc21cc59)
## ISP
Aplicamos ISP al dividir una interfaz general en varias específicas. Inicialmente, la interfaz Device contenía métodos que no eran aplicables a todos los dispositivos.
ISP introdujo interfaces específicas (Powerable y Rechargeable), permitiendo que cada clase implemente únicamente los métodos que realmente necesita.
![image](https://github.com/user-attachments/assets/a4768e04-763e-44c2-8806-57f50d099d44)
## DIP
El principio DIP fue aplicado al abstraer el comportamiento de los métodos de pago mediante la interfaz PaymentMethod. Inicialmente, PaymentProcessor dependía directamente de la implementación concreta CreditCardPayment, lo que dificultaba agregar nuevos métodos de pago. 
DIP introdujo una dependencia hacia la abstracción, permitiendo que PaymentProcessor utilice cualquier implementación de PaymentMethod.
![image](https://github.com/user-attachments/assets/a74c525e-51a8-4c24-98ee-948332c98c84)

