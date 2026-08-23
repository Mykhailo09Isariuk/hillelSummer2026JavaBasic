package homeWork14;

public class ConsolePrinter implements Printer {

    // Статичний внутрішній клас
    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }

    @Override
    public void print(Message message) {
        boolean isTextEmpty = message.getText() == null || message.getText().trim().isEmpty();
        boolean isSenderEmpty = message.getSender() == null || message.getSender().trim().isEmpty();

        // 1. Якщо обидва поля пусті або null
        if (isTextEmpty && isSenderEmpty) {
            Printer emptyHandler = new Printer() {
                @Override
                public void print(Message msg) {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };
            emptyHandler.print(message);

            // 2. Якщо відправник пустий або null, але текст є
        } else if (isSenderEmpty) {
            System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());

            // 3. Якщо відправник присутній
        } else {
            System.out.println("Користувач " + message.getSender() + " відправив повідомлення: " + message.getText());
        }
    }
}