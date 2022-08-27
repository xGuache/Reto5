package CRUD;
import  MyJDBC.MyJDBC;

public class Create extends MyJDBC {

    private String CreateString;

    public Create(String CreateString) {

        this.CreateString = CreateString;
    }

    public void Create_Statement (){

        try {
            JDCB_Statement.executeLargeUpdate(CreateString);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

}
