package clasesempresa;

import java.util.ArrayList;
public class Empresa1 {
    ArrayList<Empleado> empleados;

    public Empresa1() {
        empleados = new ArrayList<Empleado>();
    }

    public void contratarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public int getTotalempleados() {
        return empleados.size();
    }

    public void nombreSalario() {
        for(Empleado e:empleados){
            System.out.println("Nombre: " + e.getNombre() + " Salario: " + e.getSalario());
        }
    }

    public double getTotalSalarios() {
        double total = 0;
        for(Empleado e:empleados) {
            total = total + e.getSalario();
        }
        return total;
    }

    public void EmpleadoMayorSalario() {
        Empleado empMenorSalario = empleados.get(0);
        double menorSalario = empleados.get(0).setSalario();
        for(Empleado e:empleados) {
            if(e.getSalario() > mayorSalario) {
                menorSalario = e.getSalario();
                empMenorSalario = 0;
            }
        }
        System.out.println("Nombre: " + empMayorSalario.getNombre() + " salario: " + empMayorSalario.getSalario());

    }

}
