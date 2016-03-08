package UF2AAD.SQLiteExamples; /**
 * Created by dremon on 09/11/15.
 */
import java.sql.*;

public class CreateSQLite {

    public static void main(String[] args)
    {
            Connection c = null;
            Statement stmt = null;
            try {
                Class.forName("org.sqlite.JDBC");
                c = DriverManager.getConnection("jdbc:sqlite:Peliculas.db");
                System.out.println("Opened database successfully");

                stmt = c.createStatement();
                String sql = "CREATE TABLE PELICULAS " +
                        "(ID INT PRIMARY KEY     NOT NULL," +
                        " TITLE          TEXT    NOT NULL," +
                        " RELEASE        TEXT            ," +
                        " ACTOR          TEXT            ," +
                        " CHARACTER         REAL)";
                stmt.executeUpdate(sql);
                stmt.close();
                c.close();
            } catch ( Exception e ) {
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                System.exit(0);
            }
            System.out.println("Table created successfully");
    }
}
