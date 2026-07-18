import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/employee_db";
        String user = "root";
        String password = "Lavanya0910";

        try {

            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL Successfully!");

            // CREATE (INSERT)
            String insert = "INSERT INTO employee (id, name, department, salary) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(insert);

            ps.setInt(1, 3);      // ஒவ்வொரு run-க்கும் புதிய ID கொடுங்க (3,4,5...)
            ps.setString(2, "Lavanya");
            ps.setString(3, "IT");
            ps.setDouble(4, 25000);

            ps.executeUpdate();
            System.out.println("Employee inserted successfully!");

            // READ (SELECT)
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM employee");

            System.out.println("\nEmployee Records:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getString("department") + " " +
                        rs.getDouble("salary"));
            }

            // UPDATE
            String update = "UPDATE employee SET salary=? WHERE id=?";
            PreparedStatement ps2 = con.prepareStatement(update);

            ps2.setDouble(1, 35000);
            ps2.setInt(2, 3);

            ps2.executeUpdate();
            System.out.println("Employee updated successfully!");

            // DELETE
            String delete = "DELETE FROM employee WHERE id=?";
            PreparedStatement ps3 = con.prepareStatement(delete);

            ps3.setInt(1, 3);

            ps3.executeUpdate();
            System.out.println("Employee deleted successfully!");

            rs.close();
            st.close();
            ps.close();
            ps2.close();
            ps3.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
