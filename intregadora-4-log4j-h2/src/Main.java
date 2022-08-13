import org.apache.log4j.Logger;
import org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException;

import java.sql.*;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    private static final String createTable = "DROP TABLE IF EXISTS Usuario; CREATE TABLE Usuario "
            + "("
            + "ID INT PRIMARY KEY,"
            + "Primeiro_Nome varchar(100) NOT NULL, "
            + "Sobrenome varchar(100) NOT NULL, "
            + "Email varchar(100) NOT NULL, "
            + "Idade INT NOT NULL "
            + ")";
    private static final String insert1 =  "INSERT INTO Usuario VALUES (1, 'Maria', 'Aparecida','maria@email.com', 50)";
    private static final String insert2 =  "INSERT INTO Usuario VALUES (2, 'Maria', 'José','mariaj@email.com', 70)";
    private static final String insert3 =  "INSERT INTO Usuario VALUES (1, 'José', 'Antonio','jose@email.com', 60)";

    private static final String deleteById =  "DELETE FROM Usuario WHERE ID=1";
    private static final String deleteByEmail =  "DELETE FROM Usuario WHERE Email='mariajose@email.com'";
    private static final String updateById =  "UPDATE Usuario SET Email = 'mariajose@email.com' WHERE ID=2";

    private static final String findById = "SELECT EMAIL FROM Usuario WHERE ID=1";

    public static void main(String[] args) throws Exception {
        Connection connection = null;
        try{
            connection = getConnection();
            Statement statement = connection.createStatement();

            statement.execute(createTable);
            logger.info("Tabela Usuario criada");

            statement.execute(insert1);
            logger.info("Usuário 1 inserido!");

            statement.execute(insert2);
            logger.info("Usuário 2 inserido!");

            try{
                statement.execute(insert3);
                logger.info("Usuário 3 inserido!");
            }catch (JdbcSQLIntegrityConstraintViolationException ignore){
                logger.error("Primary Key repitida!");
            }

            statement.executeUpdate(updateById);
            ResultSet busca = statement.executeQuery(findById);

            //TODO verificar pq não está dando para buscar o valor do dado, consigo só retornar a referência do ResultSet
            //String busca = statement.executeQuery(findById).getString(1).toString();

            logger.debug("Usuário 2 atualizado" +  busca);

            statement.executeUpdate(deleteById);
            logger.info("Usuário deletado pelo id");

            statement.executeUpdate(deleteByEmail);
            logger.info("Usuário deletado pelo email");

        }catch (Exception ex){
            logger.error(ex.getMessage());

        }finally {
            if(connection != null){
                connection.close();
            }
        }
    }
    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "root", "");
    }

}