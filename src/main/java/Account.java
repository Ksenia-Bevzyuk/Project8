public class Account {

        private final String name;

        public Account(String name) {
            this.name = name;
        }

        public boolean checkNameToEmboss() {
            if(name.length() >= 3 &&
                    name.length() <= 19 &&
                    name.contains(" ") &&
                    !name.startsWith(" ") &&
                    !name.endsWith(" ")) {
                System.out.println("Данное имя можно напечатать на карте");
                return true;
            } else {
                System.out.println("Данное имя не подходит для печати");
                return false;
            }
        }
}
