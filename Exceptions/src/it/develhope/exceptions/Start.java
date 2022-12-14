package it.develhope.exceptions;



public class Start {
    public static void main(String[] args) throws Exception {
        String a = null;
        String b = "Antonio";

        /*try {
            System.out.println(a.toLowerCase(Locale.ROOT));//
            // java.lang.NullPointerException si ha fondamentalmente quando si
            //va a lavorare su un valore nullo
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("An exception has occurred");
        }finally {
            System.out.println("This runs everytime");
        }

         */
        System.out.println("------------------------------");

        User user = new User();
        try {
            user.setAge(-15);
            System.out.println("Success!");
        }catch (ZeroAgeException e){
            System.out.println("Validation error, age is zero");
        }
        catch (AgeException e){
            System.out.println("Validation error, you put: " +e.inputAge);
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("An exception has occurred in setting age user.setAge");//printare sempre il metodo che richiama l'eccezzione
        }
        System.out.println("-------------------------------");
        try {
            user.validateData();
        } catch (AgeException e) {
            System.out.println("Validation error, you put: " +e.inputAge);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println();
        }
    }
}
