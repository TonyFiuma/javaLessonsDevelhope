package it.develhope.accesibilty.entities;

public class User {

       public String name;
       public String surname;
       public String type;

    private boolean isAdmin = true;


    public User(){}

       /*public User(String name,String surname,boolean isAdmin){
              this.name=name;
              this.surname = surname;
              this.isAdmin = isAdmin;

       }

        */

    public String evaluateType(){
        return this.type;
    }
    public String getType(User user){
        if(this.type == null) return "No type";
            return this.type;



            //classe ausiliaria che posso metterere in un'altra classe ma si usa poche volte
}
}


