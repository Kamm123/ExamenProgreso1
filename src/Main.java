//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    CuentaAcceso CA1 = new CuentaAcceso(1, "Usuario A");
    CuentaAcceso CA2 = new CuentaAcceso(2, "Usuario B");

    System.out.println("---------- Cuentas de Acceso ----------");
    //System.out.println("Cuentas creadas: "+getcontCuentas);
    CA1.registrarIntento(false);
    CA1.registrarIntento(true);
    CA1.registrarIntento(false);
    CA1.registrarIntento(false);
    CA1.registrarIntento(false);
    CA1.estaBloqueada();
    System.out.println();
    CA2.registrarIntento(true);
    CA2.registrarIntento(false);
    CA2.registrarIntento(false);
    CA2.registrarIntento(false);
    CA2.estaBloqueada();

}
