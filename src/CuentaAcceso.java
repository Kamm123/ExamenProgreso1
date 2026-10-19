public class CuentaAcceso {
    //Atributos
    private int identificador;
    private String nombreUsuario;
    private int contIncorrectos;
    private static int contCuentas = 0;


    //Constructor
    public CuentaAcceso(int identificador, String nombreUsuario) {
        //contIncorrectos = 0;
        if(identificador < 0){
            System.out.println("Error el identificcador debe ser mayor a 0.");
        }else{
            this.identificador = identificador;
            this.nombreUsuario = nombreUsuario;
        }
    }

    //Get()

    public int getIdentificador() {
        return identificador;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public int getContIncorrectos() {
        return contIncorrectos;
    }

    public static int getContCuentas() {
        return contCuentas;
    }

    //Set()
    public void setNombreUsuario(String nombreUsuario) {
        if(nombreUsuario == null || nombreUsuario.isBlank()){
            System.out.println("Error, el nombre no puede estar en blanco o estar vacio.");
        } else {
            this.nombreUsuario = nombreUsuario;
        }
    }

    //Metodos
    public static int contCreados(){
        return contCuentas;
    }

    public void registrarIntento(boolean correcto){
        if(contIncorrectos >= 0 && contIncorrectos <=3){
            //System.out.println("Intento: "+contIncorrectos);
            System.out.println("Cuenta NO bloqueada.");
            if (correcto){
                contIncorrectos = 0;
                //System.out.println("Cuenta NO bloqueada.");
                System.out.println("True");
            } else {
                contIncorrectos++;
                System.out.println("False");
            }

            if(contIncorrectos >= 3 ){
                System.out.println("Cuenta bloqueada.");
            }
        }

    }

    public void estaBloqueada(){
        if(contIncorrectos >= 3 ){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

}
