package menu;

import computers.PC;
import java.util.Scanner;

public class ITDepartmentProject {

    public static void main(String[] args) {

         //deixar o painel em thread
        //ajeitar a logica no switch
        //vou criar uma excecao quando o usuario digitar algo errado no menu
        //comentar o codigo
        //incluir o preco do software pack para todos PCs e laptops
        //elaborar os metodos da interface e o metodo que cobra insurance de todos aparelhos over 1000 euros
        Scanner kb = new Scanner(System.in);

        int count;

        do {
            Menu.class.getConstructors();
            Menu.displayMenu();
            count = kb.nextInt();
            switch (count) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;

                default:
                    System.out.println("INVALID OPTION!!! SELECT A NUMBER, PLEASE!");
            }

        } while (count != 9);
        count++;
    }

}
