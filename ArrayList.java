import java.util.*;
public class Main {
    public static void display(ArrayList<String> insertedName) {
        for (int i = 0; i < insertedName.size(); i++) {
            System.out.println(insertedName.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<String> insertedName = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        String options = "y";

        System.out.print("Select a process 1-Add Names, 2-Edit Names, 3-Remove Names, 4-Display Names: ");
        int process = input.nextInt();
        input.nextLine();

        do {
            switch (process) {
                case 1:
                    do {

                        System.out.print("Enter a name (Enter stop to end): ");
                        String name = input.nextLine();

                        if (name.equals("stop")) {
                            break;
                        } else {
                            insertedName.add(name);
                        }
                    } while (options.equals("y"));

                    display(insertedName);


                case 2:
                    System.out.print("What name do you want to edit? (Enter stop to end): ");
                    String edit = input.nextLine();

                    if (edit.equals("stop")) {
                        System.out.println("Inserted Names: ");
                        display(insertedName);
                    } else {
                        System.out.print("Input new name: ");
                        String editedName = input.nextLine();

                        for (int i = 0; i < insertedName.size(); i++) {
                            if (insertedName.get(i).equals(edit)) {
                                insertedName.set(i, editedName);
                            }
                        }
                    }

                        do {
                            if (edit.equals("stop")) {
                                System.out.println("Inserted Names: ");
                                display(insertedName);
                                break;
                            } else {
                                System.out.print("What name do you want to edit? (Enter stop to end): ");
                                edit = input.nextLine();

                                if (edit.equals("stop")) {
                                    System.out.println("Inserted Names: ");
                                    display(insertedName);
                                    break;
                                }

                                System.out.print("Input new name: ");
                                String editedName = input.nextLine();

                                for (int i = 0; i < insertedName.size(); i++) {
                                    if (insertedName.get(i).equals(edit)) {
                                        insertedName.set(i, editedName);
                                    }
                                }
                            }
                        } while (options.equals("y"));


                        case 3:
                            do {
                                System.out.print("Enter name you want to delete (type stop to end): ");
                                String delete = input.nextLine();

                                for (int i = 0; i < insertedName.size(); i++) {
                                    if (insertedName.get(i).equals(delete)) {
                                        insertedName.remove(i);
                                    }
                                }

                                if (delete.equals("stop")) {
                                    System.out.println("Inserted Names: ");
                                    display(insertedName);
                                    break;
                                }

                            } while (options.equals("y"));

                        case 4:
                            System.out.print("Do you want to continue? y/n: ");
                            options = input.nextLine();

                            if (options.equals("n")) {
                                System.out.println("Thank you for your time!");
                                System.out.println("Inserted Names: ");
                                display(insertedName);
                                break;
                            }

                    }
            }while (options.equals("y")) ;
    }
}


