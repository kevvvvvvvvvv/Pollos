
package ejercicioinig;

import ejercicioinig.Vista.Sucursal;
import ejercicioinig.Vista.VistaMenu;
import ejercicioinig.controlador.RConnection;
import ejercicioinig.controlador.Repositorio;
import ejercicioinig.controlador.getDataSucursal;
import ejercicioinig.controlador.repositorioSucursal;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author thero
 */
public class EjercicioInIG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, IOException {
        RConnection cone = new RConnection();
        cone.conectar();
        VistaMenu vm = new VistaMenu();
        vm.setVisible(true);
        
    }
    
}
