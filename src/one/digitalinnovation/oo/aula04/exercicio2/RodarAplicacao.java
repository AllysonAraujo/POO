package one.digitalinnovation.oo.aula04.exercicio2;

/*
 * Classe de exemplo para o exercício da Aula 4 de Orientação a Objetos (Tema: Herança).
 */

class RodarAplicacao {

    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Gerente gerente = new Funcionario();
        //Vendedor vendedor = (Vendedor) new Funcionario();
    }
    
}
