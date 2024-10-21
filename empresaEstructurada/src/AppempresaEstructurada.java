
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppempresaEstructurada {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<String> cargos = new ArrayList<>();
        ArrayList<Double> salarios = new ArrayList<>();

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de empleados:"));

        for(int emp = 0; emp < cantidad; emp++) {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado ");
            String cargo = JOptionPane.showInputDialog(null, "Ingrese el cargo del empleado ");
            double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el salario del empleado"));

            //almacenamiento de datos
            nombres.add(nombre);
            cargos.add(cargo);
            salarios.add(salario);


        }

        System.out.println("la cantidad de empleados es:" + cantidad);

        System.out.println("los nombres y salarios de los empleados son: ");
        for(int emp = 0; emp < cantidad; emp++) {
            System.out.println("Nombre: " + nombres.get(emp) + " salario: " + salarios.get(emp));
        }
        double total = 0;
        for(int emp = 0; emp < cantidad; emp++) {
            total = total + salarios.get(emp);
        }
        System.out.println("El total del salario pagado es: " + total);

        System.out.println("el empleado que mas duebri gna es: ");
        double mayorSalario = salarios.get(0);
        int posicion = 0;
        for(int emp = 1; emp < cantidad; emp++) {
            if(salarios.get(emp) > mayorSalario) {
                mayorSalario = salarios.get(emp);
                posicion = emp;
            }
        }
        System.out.println("Nombre: " + nombres.get(posicion) + " Cargo: "
         + cargos.get(posicion) + "Salario: " + salarios.get(posicion));

         System.out.println("el empleado que menos dinero gana es: ");
         double menorSalario = salarios.get(0);
         int posicion1 = 0;
         for(int emp = 1; emp < cantidad; emp++) {
             if(salarios.get(emp) > menorSalario) {
                 menorSalario = salarios.get(emp);
                 posicion1 = emp;
             }
         }
         System.out.println("Nombre: " + nombres.get(posicion1) + " Cargo: "
          + cargos.get(posicion1) + "Salario: " + salarios.get(posicion1 ));
    }
}
