package view;

import presenter.Presenter;

import java.io.IOException;
import java.util.Scanner;

public class UserUI implements View {

    private Presenter presenter;
    private Scanner scanner;
    private boolean work;
    private UserMenu userMenu;

    public UserUI(Presenter presenter) {
        scanner = new Scanner(System.in);
        work = true;
        userMenu = new UserMenu(this);
        this.presenter = presenter;
    }

    @Override
    public void start() throws IOException, ClassNotFoundException {
        System.out.println("Превет!");
        while (work) {
            System.out.println(userMenu.printMenu());
            inputChoice();
        }
    }
    private void inputChoice() throws IOException, ClassNotFoundException {
        String line = scanner.nextLine();
        if (checkLine(line)) {
            userMenu.execute(Integer.parseInt(line));
        } else {
            System.out.println("Ошибка ввода!");
        }
    }
    private boolean checkLine(String line) {
        if (!line.matches("[0-9]+")) {
            return false;
        }
        int choice = Integer.parseInt(line);
        return choice > 0 && choice <= userMenu.sizeMenu();
    }

    public void getAnimals() {
        System.out.println(presenter.getAnimals());
    }

    public void addAnimal() {
        System.out.println("Укажите тип животного:");
        System.out.println(presenter.getListOfType());
        String type = scanner.nextLine();
        if (!type.matches("[1-6]{1}")) {
            System.out.println("Нет типа с таким номером!\n");
            return;
        }
        System.out.println("Введите имя животного");
        String name = scanner.nextLine();
        System.out.println("Укажите дату рождения животного");
        String birthDate = scanner.nextLine();
        if (!birthDate.matches("([0-9]{4}).([0-9]{2}).([0-9]{2})")) {
            System.out.println("Неверный формат даты (yyyy.MM.dd)!\n");
            return;
        }
        presenter.addAnimal(Integer.parseInt(type), name, birthDate);
    }

    public void finishWork() {
        work = false;
        System.out.println("Работа закончена!");
    }

    public void showPetCommands() {
        System.out.println("Введите имя животного");
        String name = scanner.nextLine();
        if (!presenter.isAnimalExist(name)) {
            System.out.println("Такого питомца нет!\n");
            return;
        }
        System.out.println(presenter.showCommands(name));
    }

    public void learnCommand() {
        System.out.println("Введите имя животного");
        String name = scanner.nextLine();
        if (!presenter.isAnimalExist(name)) {
            System.out.println("Такого питомца нет!\n");
            return;
        }
        System.out.println("Выберите команду:");
        System.out.println(showAllCommands());
        String choice = scanner.nextLine();
        if (!choice.matches("[1-6]{1}")) {
            System.out.println("Нет команды с таким номером!\n");
            return;
        }
        if (presenter.isCommandContains(name, Integer.parseInt(choice))) {
            System.out.println("Питомец уже знает эту команду!\n");
            return;
        }
        presenter.learnCommand(name, Integer.parseInt(choice));
    }

    private String showAllCommands() {
        return presenter.showAllCommands();
    }

    public void executeCommand() {
        System.out.println("Введите имя животного");
        String name = scanner.nextLine();
        if (!presenter.isAnimalExist(name)) {
            System.out.println("Такого питомца нет!\n");
            return;
        }
        System.out.println(presenter.showCommands(name));
        if (presenter.doCommandsExist(name))
            return;
        System.out.println("Введите номер команды или 0 если исполнять команды не нужно");
        String choice = scanner.nextLine();
        try {
            if (!presenter.executeCommand(name, Integer.parseInt(choice)))
                System.out.println("Команды под таким номером нет!\n");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода, нужно ввести число!\n");
        }
    }
}
