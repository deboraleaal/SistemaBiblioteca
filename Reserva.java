import java.util.Date;
public class Reserva {
    
   public Livro livroReservado;
   public Date dataReserva;
   public int codUsuarioReserva;

   public Reserva(Livro livro, Date data, int codUsuario){
    livroReservado = livro;
    dataReserva = data;
    codUsuarioReserva = codUsuario;
  }
}
