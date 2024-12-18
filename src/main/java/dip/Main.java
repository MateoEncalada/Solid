package dip;
public class Main {
    public static void main(String[] args) {
        // Usar diferentes implementaciones de PaymentMethod
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod payPal = new PayPalPayment();
        PaymentMethod crypto = new CryptoPayment();

        PaymentProcessor creditCardProcessor = new PaymentProcessor(creditCard);
        PaymentProcessor payPalProcessor = new PaymentProcessor(payPal);
        PaymentProcessor cryptoProcessor = new PaymentProcessor(crypto);

        // Procesar pagos con diferentes métodos
        creditCardProcessor.makePayment(100.0);
        payPalProcessor.makePayment(200.0);
        cryptoProcessor.makePayment(300.0);
    }
}
