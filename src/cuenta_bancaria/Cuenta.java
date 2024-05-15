package cuenta_bancaria;

public class Cuenta {
    protected Float saldo;
    protected Integer numero_consignaciones = 0;
    protected Integer numero_retiros = 0;

    public Cuenta (float saldo){
        this.saldo = saldo;
    }
    public void consignar (float cantidad) {
        saldo =  saldo + cantidad;
        numero_consignaciones += 1;
    }
    public void retirar (float cantidad) {
        float nuevo_saldo = saldo-cantidad;
        if(nuevo_saldo >= 0){
            saldo = nuevo_saldo;
            numero_retiros += 1;
        } else {
            System.out.println("El monto que pretende retirar excede el saldo disponible actualmente");
        }
    }
}
