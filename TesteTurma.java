import javax.swing.JOptionPane;

public class TesteTurma {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Nome da Turma");
		String curso = JOptionPane.showInputDialog("Curso");
		int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Alunos"));
		int serie = Integer.parseInt(JOptionPane.showInputDialog("Série"));
		
		Turma turma = new Turma(nome, curso, quantidadeDeAlunos, serie);
		
		String mensagem = "Nome da Turma: " + turma.getNome() + "\nNome do Curso: " + turma.getCurso() +
				"\nQuantidade de alunos: " + turma.getQuantidadeDeAlunos() + "\nSérie: " + turma.getSerie(); 
		
		JOptionPane.showMessageDialog(null, mensagem);
		
		quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Nova quantidade de Alunos"));
		
		turma.setQuantidadeDeAlunos(quantidadeDeAlunos);
		
		mensagem = "Nome da Turma: " + turma.getNome() + "\nNome do Curso: " + turma.getCurso() +
				"\nQuantidade de alunos: " + turma.getQuantidadeDeAlunos() + "\nSérie: " + turma.getSerie();
		
		JOptionPane.showMessageDialog(null, mensagem);
	}
}
