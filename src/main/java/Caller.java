/**
 * Created by Koko on 06.05.2016.
 */
public class Caller {

    private Executer executer;

    public Caller(Executer executer){
        this.executer = executer;
    }

    public String callExecute(String str1,String str2){
        return executer.execute(str1,str2);
    }

}
