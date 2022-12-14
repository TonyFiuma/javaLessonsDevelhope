package it.develhope.finalModifier;

import lombok.Data;

@Data
public class Factory {

    public final User ceo;
    public final User cto;
    public final User cfo;

    public Factory(User ceo,User cto,User cfo){
        this.ceo = ceo;
        this.cto = cto;
        this.cfo = cfo;

    }

    public void startWorking(){
        System.out.println("Working.....");
    }
}
