package semana6;

public class PessoaTester {

	public static void main(String[] args) 
	{
         Pessoa p1= new Pessoa();

         p1.setNome("Daniel");
         p1.setIdade(25);
         p1.setSexo("Masculino");
         //System.out.println(p1.toString());
         
         Aluno a1 = new Aluno();
         a1.setNome("Izabella");
         a1.setIdade(24);
         a1.setSexo("Feminino");
         a1.setMatricula("0050010533");
         a1.setCurso("Radiologia");
         //System.out.println(a1.toString()); 
         
         Professor prof = new Professor();
         prof.setEspecialidade("Mestre");
         prof.setIdade(40);
         prof.setNome("Alex");
         prof.setSalario(7000);
         prof.setSexo("Masculino");
         prof.receberAumento(450);
         //System.out.println(prof.toString()); 
         
         Funcionario func = new Funcionario();
         func.setIdade(22);
         func.setNome("Luiz");
         func.setSetor("RH");
         func.setSexo("Masculino");
         func.setTrabalhando(true);
         func.mudarTrabalho();
         //System.out.println(func.toString());
         
         Visitante vis = new Visitante();
         
         
         Bolsista bol = new Bolsista();
         bol.setBolsa(100);
         bol.setNome("Maria");
         bol.setIdade(22);
         
         System.out.println("------------------------------------------------");
         
         System.out.println(p1.toString());
         System.out.println(a1.toString());
         System.out.println(prof.toString());
         System.out.println(func.toString());
         System.out.println(bol.toString());
         
         a1.pagarMensalidade(1000);
         bol.pagarMensalidade(900);
	}

}
