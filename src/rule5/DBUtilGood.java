package rule5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * 我们使用了静态代码块来创建conn实例，改进后只有在类加载初始化的时候创建了conn实例一次，
 * 而不是在每次调用getConnection方法的时候都去创建conn实例。
 * 如果getConnection方法被频繁的调用和使用，这种方式将会显著的提高我们程序的性能。
 * 除了提高性能之外，代码的含义也更加的清晰了，使得代码更易于理解。
 *
 */
public class DBUtilGood {
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/imooc";
    private static final String UNAME = "root";
    private static final String PWD = "root";

    private static Connection conn = null;

    static {
        try {
            // 1.加载驱动程序
            Class.forName("com.mysql.jdbc.Driver");
            // 2.获得数据库的连接
            conn = DriverManager.getConnection(URL, UNAME, PWD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return conn;
    }
}
