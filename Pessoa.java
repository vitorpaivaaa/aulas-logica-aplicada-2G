public class Pessoa {
    // Atributos da classe
    java.lang.String name;
    java.lang.String sobrenome;


    // Métodos da classe
    public void falar(java.lang.String baixo){
        System.out.println("falei");
    }
    public void falar(String volume) {

        System.out.println("falei" + volume);
    }
        public String falar(String volume,
        String tom ){
           return "felei" + volume;
        }
    }

