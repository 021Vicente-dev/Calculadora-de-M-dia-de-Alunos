import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // --- Aluno 1 ---
        String nome1 = JOptionPane.showInputDialog("Digite o nome do aluno 1:");
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota de " + nome1 + ":"));

        if (nota1 >= 7)
            JOptionPane.showMessageDialog(null, "Parabéns " + nome1 + ", você foi aprovado!");
        else if (nota1 == 6)
            JOptionPane.showMessageDialog(null, "Atenção " + nome1 + ", você está de recuperação.");
        else
            JOptionPane.showMessageDialog(null, "Que pena " + nome1 + ", você foi reprovado.");

        // --- Aluno 2 ---
        String nome2 = JOptionPane.showInputDialog("Digite o nome do aluno 2:");
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota de " + nome2 + ":"));

        if (nota2 >= 7)
            JOptionPane.showMessageDialog(null, "Parabéns " + nome2 + ", você foi aprovado!");
        else if (nota2 == 6)
            JOptionPane.showMessageDialog(null, "Atenção " + nome2 + ", você está de recuperação.");
        else
            JOptionPane.showMessageDialog(null, "Que pena " + nome2 + ", você foi reprovado.");

        // --- Aluno 3 ---
        String nome3 = JOptionPane.showInputDialog("Digite o nome do aluno 3:");
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota de " + nome3 + ":"));

        if (nota3 >= 7)
            JOptionPane.showMessageDialog(null, "Parabéns " + nome3 + ", você foi aprovado!");
        else if (nota3 == 6)
            JOptionPane.showMessageDialog(null, "Atenção " + nome3 + ", você está de recuperação.");
        else
            JOptionPane.showMessageDialog(null, "Que pena " + nome3 + ", você foi reprovado.");

        // --- Cálculo da média final ---
        double media = (nota1 + nota2 + nota3) / 3;
        JOptionPane.showMessageDialog(null, "A média da turma é: " + media);
    }
}
