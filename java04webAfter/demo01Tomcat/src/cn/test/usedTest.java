package cn.test;


import cn.dao.userDao;
import cn.user.User;


//θΏθ‘εζ
public class usedTest {
  @org.junit.Test
  public void testLogin()
  {
    User login=new User();
    login.setUsername("zhangsan");
    login.setPassword("1123");

    userDao dao=new userDao();
    User user=dao.login(login);
    System.out.println(user);
  }

}
