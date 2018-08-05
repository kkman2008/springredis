import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.cn.bean.User;
import com.cn.service.UserService;


@ContextConfiguration(locations="classpath:spring-mvc.xml")
public class Test extends AbstractJUnit4SpringContextTests {

	@Autowired
	private UserService userService;
	
	
	
	@org.junit.Test
	public void  add(){
		User user=new User();
		user.setName("wen");
		user.setId("1");
		userService.insertSelective(user);
	}
	
	
	@org.junit.Test
	public void  query(){
		User user=userService.selectByPrimaryKey(1);
		System.out.println(user.toString());
	}
}
