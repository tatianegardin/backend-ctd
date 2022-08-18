import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    private static final String createTable = "DROP TABLE IF EXISTS Dentistas; CREATE TABLE Dentistas "
            + "("
            + "ID INT PRIMARY KEY,"
            + "Primeiro_Nome varchar(100) NOT NULL, "
            + "Sobrenome varchar(100) NOT NULL, "
            + "Email varchar(100) NOT NULL, "
            + "Idade INT NOT NULL "
            + ")";

    private static String sqlInsert = "INSER INTO Dentistas VALUES()"
    public static void main(String[] args) throws Exception {
        Connection connection = getConnection();
        try{

        }catch (SQLException ex){
            ex.printStackTrace();
        }

    }

    public static save(){

    }
    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "root", "");
    }
}