import java.util.ArrayList;
import java.util.Date;

public class FazerReserva extends Usuario {
    
		public FazerReserva(String nome, int codigo) {
		super(nome, codigo);
		// TODO Auto-generated constructor stub
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
//Precisa dar uma olhada nessa parte que ainda está apresentando erro

    		if(contadorDeReservas < 3){
    		  ReservasUsuario.add(livroReserva.tentarReserva(codigo));
    		}else{
    			System.out.println("Não foi possível efetuar reserva");
    		}
    	}
}  
    
