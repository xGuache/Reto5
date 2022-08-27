package MyJDBC;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;


public class MyJDBC {

    // Se establece el string para URL de conexion.

    private String URLTemplate;
    private String URLmain;
    private String DB_name;
    private String UserName;
    private String Password;
    protected Connection JDBC_Conn;
    protected Statement JDCB_Statement;

    public MyJDBC() {
        this.URLTemplate = "jdbc:mysql://localhost:3306";
        this.DB_name = "/ecodosruedas";
        this.UserName = "root";
        this.Password = "Jh0n_9701";
        this.URLmain = URLTemplate + DB_name;
    }

    public boolean DB_Connection (){
        boolean salida = false;
        try{

            JDBC_Conn = DriverManager.getConnection(URLmain, UserName, Password);
            JDCB_Statement = JDBC_Conn.createStatement();
            salida = true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return salida;
    }
}