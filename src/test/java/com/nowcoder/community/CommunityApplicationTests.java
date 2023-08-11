package com.nowcoder.community;

import com.nowcoder.community.data.AlphaData;
import com.nowcoder.community.service.AlphaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
class CommunityApplicationTests implements ApplicationContextAware {
	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Test
	public void testApplicationContext(){
		System.out.println(applicationContext);

		AlphaData alphadata = applicationContext.getBean(AlphaData.class);
		System.out.println(alphadata.select());
	}

	@Test
	public void testBeanManagement(){
		AlphaService alphaservice = applicationContext.getBean(AlphaService.class);
		System.out.println(alphaservice);
	}

	@Test
	public void testBeanConfig(){
		SimpleDateFormat simpleDateFormat = applicationContext.getBean(SimpleDateFormat.class);
		System.out.println(new Date());
	}

	@Autowired
	private AlphaData alphaData;

	@Test
	public void testDI(){
		System.out.println(alphaData);
	}

	public String find() {
		return alphaData.select();
	}
}
