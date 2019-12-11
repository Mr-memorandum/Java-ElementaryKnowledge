import java.sql.*;
public class TestMysql {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/SalaryManagementSystem";
        String user = "root";
        String passWord = "Liangqian1994";
        Connection myConnection = DriverManager.getConnection(url,user,passWord);

        //向数据库中插入数据(增)
        String insertData = "insert into staff (name,sex,salary) values(?,?,?)";
        System.out.println("正在执行插入操作...");
        PreparedStatement prepareInsert = myConnection.prepareStatement(insertData);
        prepareInsert.setString(1,"Bill");
        prepareInsert.setString(2,"male");
        prepareInsert.setInt(3,11000);
        prepareInsert.executeUpdate();

        //更改数据库中的数据(改)
        System.out.println("正在执行更改操作...");
        int index = 4;
        String changeData = "Update staff set salary = ? where id = ?";
        PreparedStatement prepareChange = myConnection.prepareStatement(changeData);
        prepareChange.setInt(1,8000);
        prepareChange.setInt(2,index);
        prepareChange.executeUpdate();

        //删除数据库中的元素(删)
        System.out.println("正在执行删除操作...");
        String name = "Mike";
        String deleteData = "delete from staff where name = ?";
        PreparedStatement prepareDelete = myConnection.prepareStatement(deleteData);
        prepareDelete.setString(1,name);
        prepareDelete.executeUpdate();

        //查询使用Statement对象的excuteQuery()方法(查)
        System.out.println("正在执行查询操作...");
        Statement s = myConnection.createStatement();
        ResultSet result = s.executeQuery("select * from staff");
        while(result.next())
        {
            String t1 = result.getString("id");
            String t2 = result.getString("name");
            String t3 = result.getString("sex");
            String t4 = result.getString("salary");
            System.out.println(t1+" "+t2+" "+t3+" "+t4);
        }

        myConnection.close();
    }
}
