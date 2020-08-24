package utility;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HRDetails {
	public static int RetrieveHR() throws SQLException, IOException {
		String sql = "SELECT * FROM HR";
		Statement st = ConnectionManager.getConnection().createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println("\t"+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
		}
		System.out.println("\n");
		return 1;

}
}
