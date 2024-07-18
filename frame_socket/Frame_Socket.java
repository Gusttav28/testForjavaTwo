package frame_socket;
import pk_cliente.fr_cliente;
import javax.swing.JFrame;
import pk_server.class_server;

/**
 *
 * @author gustavocamacho
 */
public class Frame_Socket {

    public static void main(String[] args) {
        new fr_cliente();
        class_server miMarco = new class_server();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
