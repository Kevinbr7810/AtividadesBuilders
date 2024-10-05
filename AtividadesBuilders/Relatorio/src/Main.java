import builders.RelatorioBuilder;
import entidades.Relatorio;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        executarRefatorado();
    }

    private static void executarRefatorado() {
        Relatorio Relatorio1 = new RelatorioBuilder().setTitulo("Relatório Simples de Atividades").setCorpo("om sucesso em 30 de setembro...").build();
        Relatorio Relatorio2 = new RelatorioBuilder().setTitulo("Relatório Simples de Atividades").setCorpo("om sucesso em 30 de setembro...").setRodape("Relatório elaborado por: [Seu Nome]\n" +
                "Data de emissão: 04 de outubro de 2024").build();
        System.out.println(Relatorio1.toString());
        System.out.println(Relatorio2.toString());
    }
}