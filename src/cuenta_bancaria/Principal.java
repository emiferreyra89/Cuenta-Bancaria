package cuenta_bancaria;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                ---------- Bienvenido a su Cuenta de Ahorros -----------
                -- Para comenzar, por favor ingrese su saldo inicial  --
                """);
        float saldo_inicial = sc.nextFloat();

        CuentaAhorros cuenta1 = new CuentaAhorros(saldo_inicial);

        System.out.println("Ingrese la cantidad a depositar:");
        float deposito = sc.nextFloat();
        cuenta1.consignar(deposito);

        System.out.println("Ingrese la cantidad a retirar:");
        float retiro = sc.nextFloat();
        cuenta1.retirar(retiro);

        cuenta1.imprimirDetalleCuenta();
    }
}
