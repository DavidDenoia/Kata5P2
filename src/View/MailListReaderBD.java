package View;

import Model.Mail;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;


public class MailListReaderBD {
    public static List<Mail> read(){
        List<Mail> lista = new ArrayList<>();
        String url = "jdbc:sqlite:Kata5.db";
        String sql = "SELECT * FROM direcc_email";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()) {
                lista.add(new Mail(rs.getString("direccion") + "\t"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }
}
