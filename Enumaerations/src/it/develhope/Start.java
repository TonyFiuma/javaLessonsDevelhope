package it.develhope;

public class Start{
    public static void main(String[] args){
        User antonio = new User(UserTypeEnum.MEGA_ADMIN, "Antonio", "Fiuma", "axel85");
        User giulio  = new User(UserTypeEnum.ADMIN, "Giulio", "Firo", "fire45");
        User mario   = new User(UserTypeEnum.EDITOR, "Mario", "Red", "mario1990");
        User elena   = new User(UserTypeEnum.LOGGED, "Elena", "Bianchi", "ele1994");

        System.out.println("----------------------");
        printUserType(giulio);
        printUserType(antonio);
        printUserType(mario);
        printUserType(elena);
        System.out.println("----------------------");

        System.out.println("Giulio " + giulio.type.isAdmin());
        System.out.println("Antonio " + antonio.type.isAdmin());
        System.out.println("Mario " + mario.type.isAdmin());
        System.out.println("Elena " + elena.type.isAdmin());

        System.out.println("-----------------------");

        System.out.println(antonio.type.equals(giulio.type));

        UserTypeEnum[] values     = UserTypeEnum.values();//singleTon non posso istanziarlo nuovamente ma solo cambiargli i valori
        UserTypeEnum   adminValue = UserTypeEnum.valueOf("ADMIN");

        System.out.println(adminValue);


    }

    public static void printUserType(User user){
        System.out.println("UserName " + user.getCompleteName());
        System.out.println("User permission are " + user.type);
        switch(user.type){
            case ADMIN:
                System.out.println("The user is admin");
                break;
            case EDITOR:
                System.out.println("The user is editor");
                break;
            case GUEST:
                System.out.println("The user is a guest");
                break;
            case LOGGED:
                System.out.println("The user is logged");
                break;
            default:
                System.out.println("you written wrong");
                break;
        }
    }
}
