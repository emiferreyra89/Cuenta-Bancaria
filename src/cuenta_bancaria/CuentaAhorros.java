package cuenta_bancaria;

public class CuentaAhorros extends Cuenta {

    private Boolean activa;

    public CuentaAhorros(float saldo){
        super(saldo);
        if(saldo >= 10000){
            activa = true;
        }
    }

    @Override
    public void consignar(float cantidad) {
        super.consignar(cantidad);
    }

    @Override
    public void retirar(float cantidad) {
        super.retirar(cantidad);
    }

    public void imprimirDetalleCuenta() {
        System.out.println("\n" +
                "Su saldo es: $"+saldo+"\n"+
                "Cantidad de movimientos: "+(numero_consignaciones+numero_retiros)+"\n"+
                "Cantidad de depositos: "+numero_consignaciones+"\n"+
                "Cantidad de retiros: "+numero_retiros
        );
    }
}
