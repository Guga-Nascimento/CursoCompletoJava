package parte6EnumeracaoComposicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import parte6EnumeracaoComposicaoEntities.Comentario;
import parte6EnumeracaoComposicaoEntities.Post;

public class ProgramRedeSocial {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Faça boa viagem!");
		Comentario c2 = new Comentario("Uau, isso é incrível!");
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:44"), 
				"Viajar para a Nova Zelândia", 
				"Vou visitar este país maravilhoso!", 
				12);
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		Comentario c3 = new Comentario("Boa Noite ");
		Comentario c4 = new Comentario("Que a força esteja com você");
		Post p2 = new Post(
				sdf.parse("28/07/2018 23:14:19"), 
				"Boa noite, galera", 
				"Vejo vocês  amanhã", 
				5);
		p2.addComentario(c3);
		p2.addComentario(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
