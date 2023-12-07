import java.util.ArrayList;
import java.util.Date;

public class FazerReserva extends Usuario {

	//Construtor com a herança da classe Usuario
		public FazerReserva(String nome, int codigo) {
		super(nome, codigo);
	}

		public ArrayList<Reserva> getReservasUsuario() {
    		return ReservasUsuario;
    	}

    	public void reservarLivro(Livro livroReserva){
    		int contadorDeReservas = 0;
    		for (int i = 0; i < ReservasUsuario.size(); i++) {
                if (ReservasUsuario.get(i).dataReserva == new Date()) {
                    contadorDeReservas += 1;
                }
            }

    		if(contadorDeReservas < 3){
    		  ReservasUsuario.add(livroReserva.reservar(codigo));
		  System.out.println("Reserva efetuada com sucesso!");
    		}else{
    		  System.out.println("Não foi possível efetuar reserva");
    		}
    	}
}  
     
