package ad;
abstract class ab{
    abstract void abst();
}
class disp extends ab{
    void abst(){
        System.out.println("running");
    }
}
class cs extends ab{
    void abst(){
        System.out.println("ok");
    }
}

public class abs {
    public  static void main(String[] args){
        ab obj = new cs();
        obj.abst();
    }
}

