public class lab8 {
    public static void main(String[] args) {
        String textVariant8 = """
                На мові Java здійснюється програмування серверів, а також
                створення сервлетів (servlets) - прогрпмних процедур, які викону-
                ються в межах серверів для опрацювання запитів клієнта і   
                динамічної генерації відповідей на них.
                """;
        BasicEncoder basicEncoder = new BasicEncoder("Marko Khomulyak Tarasovych");
        String encodedText = basicEncoder.encode(textVariant8);
        System.out.print("Text: \n\n");
        System.out.print(textVariant8 + "\n");
        System.out.print("Encoded: \n\n");
        System.out.print(encodedText + "\n");
        System.out.print("Decoded: \n\n");
        System.out.println(basicEncoder.decode(encodedText));
    }

}
