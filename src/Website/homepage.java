package Website;

import java.util.Scanner;
import Website.base.Data_base;
public class homepage {
    public static void main(String[] cdcs) {

        Scanner scan = new Scanner(System.in);

        System.out.println(
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░┌───┬───┐░┌┬───┐┌──┐┌───┬─┐┌─┬┐░░┌┬──┬─┐░┌┬───┬───┐░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░│┌─┐│┌──┘░││┌─┐││┌┐││┌──┤│└┘││└┐┌┘├┤├┤│└┐│├┐┌┐│┌─┐│░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░│└──┤└──┐░│││░│││└┘└┤└──┤┌┐┌┐├┐││┌┘│││┌┐└┘││││││░││░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░└──┐│┌──┼┐││└─┘││┌─┐│┌──┤││││││└┘│░││││└┐│││││││░││░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░│└─┘│└──┤└┘│┌─┐││└─┘│└──┤│││││└┐┌┘┌┤├┤│░││├┘└┘│└─┘│░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░└───┴───┴──┴┘░└┘└───┴───┴┘└┘└┘░└┘░└──┴┘░└─┴───┴───┘░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("*--=-= -=- =-= DIGITE 1 -> LOGIN =-= DIGITE 2 -> CRIAR CONTA =-= -=- =-=--*");
        System.out.println("---------------------------------------------------------------------------");
        String Dados_escolha = scan.nextLine();

        if(Dados_escolha.equals("1")) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("*--=-= -=- =-= DIGITE ABAIXO O NOME DE USUARIO =-= -=- =-=--*");
            System.out.println("-------------------------------------------------------------");

            String user_name = scan.nextLine();

            System.out.println("-------------------------------------------------------------");
            System.out.println("*--=-= -=- =-=    DIGITE ABAIXO A SUA SENHA    =-= -=- =-=--*");
            System.out.println("-------------------------------------------------------------");

            String user_pass = scan.nextLine();

            if(user_name.equals(Data_base.user) && user_pass.equals(Data_base.pass)) {
                System.out.println("Login efetuado com sucesso!");
                System.out.println("Digite 10 para voltar a tela inicial");
                String user_choice = scan.nextLine();

                if(user_choice.equals("10")) {
                    homepage.main(cdcs);
                }
            }else if(user_pass != Data_base.pass && user_name.equals("eae")) {

                System.out.println("Senha incorreta! Aperte 10 para voltar");
                String user_choice = scan.nextLine();

                if(user_choice.equals("10")) {
                    homepage.main(cdcs);
                }

            } else if(user_name != Data_base.user && user_pass.equals("eae123")) {
                System.out.println("O usuario " + user_name + " não foi encontrado :( " +
                        "Aperte 10 para voltar");
                String user_choice = scan.nextLine();

                if(user_choice.equals("10")) {
                    homepage.main(cdcs);
                }
            } else if(user_name != Data_base.user && user_pass != Data_base.pass) {
                System.out.println("O usuario " + user_name + " não foi encontrado :( " +
                        "Aperte 10 para voltar");

                String user_choice = scan.nextLine();

                if(user_choice.equals("10")) {
                    homepage.main(cdcs);
                }
            }


        } else if(Dados_escolha.equals("2")) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("*--=-= -=- =-= -= -= CRIAR UMA CONTA -=- -=-= -=- =-= =-=---*");
            System.out.println("-------------------------------------------------------------");

            System.out.println("Nome de usuário:");
            String user_name_register = scan.nextLine();
            System.out.println("Senha:");
            String user_pass_register = scan.nextLine();

            Data_base.user = user_name_register;
            Data_base.pass = user_pass_register;

            System.out.println("**- - - - CONTA CRIADA COM SUCESSO! - - - -**");
            System.out.println("Aperte 10 para efetuar o seu login");

            String user_choice = scan.nextLine();

            if(user_choice.equals("10")) {
                homepage.main(cdcs);
            }
        }
    }
}
