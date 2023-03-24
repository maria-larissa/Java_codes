package QuestoesApostilaAlura.TerceiraQuestao;

public class TerceiraQuestao {
    public static void main(String[] args) {
        Conta1 cliente2 = new Conta1();
        cliente2.setDataAbertura("15/02/2001");
        cliente2.setAgencia("326150");
        cliente2.setTitular("Luane");
        cliente2.setNumero(25103);

        cliente2.info();

    }
}
