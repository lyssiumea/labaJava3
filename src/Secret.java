//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//public class Secret {       // сущ-ть секрет
//    private final String text;
//    private final String keeperName;
//    private final List<String> previousKeepers = new ArrayList<>();
//    private boolean isShared = false;
//
//    public Secret(String keeperName, String text) {
//        this.keeperName = keeperName;
//        this.text = text;
//    }
//
//    // передача секрета другому хранителю
//    public Secret(Secrets previousSecret, String newKeeperName) {
//        if (previousSecret.isShared) {
//            throw new IllegalStateException("Секрет уже был передан другому хранителю.");
//        }
//        this.keeperName = newKeeperName;
//        this.previousKeepers.add(previousSecret.keeperName);
//        previousSecret.isShared = true; // флаг, что секрет был передан
//        System.out.println(previousSecret.keeperName + " сказал что: " + previousSecret.text);
//        int N = (int) (previousSecret.text.length() * 0.1);
//        this.text = addRandomCharacters(previousSecret.text, N);
//        this.isShared = true; //  флаг для нового секрета
//    }
//
//    // глухой телефон
//    private String addRandomCharacters(String originalText, int numberOfChars) {
//        Random random = new Random();
//        StringBuilder modifiedText = new StringBuilder(originalText);
//        for (int i = 0; i < numberOfChars; i++) {
//            int position = random.nextInt(modifiedText.length() + 1); // +1 чтобы вставить в конец
//            char randomChar = (char) ('a' + random.nextInt(26)); // Генерация случайного символа от 'a' до 'z'
//            modifiedText.insert(position, randomChar);
//        }
//        return modifiedText.toString();
//    }
//
//    @Override
//    public String toString() {
//        return keeperName + ": это секрет!";
//    }
//
//    public String getCurrentKeeper() {
//        return keeperName;
//    }
//    public int getNumberOfPeopleWhoHeard() {
//        return previousKeepers.size();
//    }
//
//    // получение имени N-го человека, узнавшего секрет
//    public String getNthKeeper(int n) {
//        if (n > 0 && n <= previousKeepers.size()) {
//            return previousKeepers.get(n - 1);
//        } else if (n < 0 && Math.abs(n) <= previousKeepers.size()) {
//            return previousKeepers.get(previousKeepers.size() + n);
//        } else {
//            throw new IndexOutOfBoundsException("Недопустимый индекс хранителя.");
//        }
//    }
//
//    // разница в длине текста секрета с N-м человеком
//    public int getLengthDifferenceWithNthKeeper(int n) {
//        if (n > 0 && n <= previousKeepers.size()) {
//            Secrets previousSecret = new Secrets(previousKeepers.get(n - 1), this.text);
//            return this.text.length() - previousSecret.text.length();
//        } else if (n < 0 && Math.abs(n) <= previousKeepers.size()) {
//            Secrets previousSecret = new Secrets(previousKeepers.get(previousKeepers.size() + n), this.text);
//            return this.text.length() - previousSecret.text.length();
//        } else {
//            throw new IndexOutOfBoundsException("Недопустимый индекс хранителя.");
//        }
//    }
//}