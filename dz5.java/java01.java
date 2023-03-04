public class java01 {
    
    
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");
        Phonebook phonebook = new Phonebook();
        phonebook.showPhonebook();
        System.out.println("=================================");
        phonebook.add("Иванов", 3456782);
        phonebook.add("Иванов", 4568978);
        phonebook.add("Петров", 3452222);
        phonebook.add("Сидаров", 1328978);
        phonebook.showPhoneNumber("Иванов");
        System.out.println("=================================");
        phonebook.showPhoneNumber("Сидаров");
        System.out.println("=================================");
        phonebook.showPhoneNumber("Агапитова");
        System.out.println("=================================");
        phonebook.showPhonebook();
}
}