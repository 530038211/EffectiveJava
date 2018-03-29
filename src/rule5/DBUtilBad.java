package rule5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 该类提供的getConnection方法获取JDBC数据库连接对象，每次调用该方法都会新建一个conn实例，
 * 而我们知道在平时的开发中数据库连接对象往往只需要一个，也不会总是去修改它，
 * 没必要每次都去新创建一个连接对象，每次都去创建一个实例不知道程序会不会出现什么意外情况，
 * 这个我不知道，但有一点是肯定的，这种方式影响程序的运行性能，增加了Java虚拟机垃圾回收器的负担。
 */
public class DBUtilBad {
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/imooc";
    private static final String UNAME = "root";
    private static final String PWD = "root";

    public static Connection getConnection() {
        Connection conn = null;
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
        return conn;
    }
}

