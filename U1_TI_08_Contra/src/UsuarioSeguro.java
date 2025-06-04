public class UsuarioSeguro {

    private String nombreUsuario;
    private String password;

    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public String getPassword(){
        return password;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        if (nombreUsuario == null) {
            System.out.println("Usuario no encontrado");
        }
    }
    public void setPassword(String password) {
        boolean verificarMay=false;
        boolean verificarMin= false;
        boolean verificarDig= false;
        int longitud = password.length();
        if (password.length() >= 8) {
            System.out.println("Password con longitud correcta");
        }
        else {
            for (int i = 0; i<password.length(); i++) {
                if( Character.isUpperCase(password.charAt(i))){
                    verificarMay=true;
                }
                else if(Character.isLowerCase(password.charAt(i))){
                    verificarMin=true;
                    }
                    else if (Character.isDigit(password.charAt(i))){
                        verificarDig=true;
                        }
                    }
                }
        if (verificarMay==true && verificarMin==true && verificarDig==true) {
            this.password = password;
        }
        else {
            System.out.println("Ingrese al menos una mayuscula,minuscula y un digito");
        }
            }

            public boolean validarPassword(String internpassword) {
            if (internpassword.equals(this.password)) {
                return true;
            }
            else {
                return false;
            }
            }
        }





