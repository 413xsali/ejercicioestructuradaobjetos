import javax.swing.JOptionPane;
import clasesempresa.*;

public class AppEmpresaObjetos {
    public static void main(String[] args) throws Exception {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog())

        Empresa empresa = new Empresa();
        for(int emp = 0; emp < cantidad; emp++) {
            String nombre = JOptionPane.showInputDialog(null,"ingrese el nombre");
            String cargo = JOptionPane.showInputDialog(null,"ingrese el cargo del empleado");
            double salario = Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el salario"));
            
            empresa.contratarEmpleado(new Empleado())
        }
    }
}
