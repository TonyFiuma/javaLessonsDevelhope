package it.develhope.exceptions;

public class AgeException extends Exception{

    public int inputAge;

    public AgeException(int inputAge){
        this.inputAge=inputAge;}

        @Override
        public String getMessage(){
        return "The age set wasn't correct, you put: " + inputAge;
        }


}
