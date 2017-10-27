package com.jike.usermanage.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;

import com.jike.usermanage.exception.UserNotFound;

import com.jike.usermanage.model.Interest;
import com.jike.usermanage.model.User;
import com.jike.usermanage.service.UserService;


public class Client {
	

	public static void printUser(User user){
		StringBuilder sb = new StringBuilder();
		sb.append("id="+user.getId()).append("|");
		sb.append("name="+user.getName()).append("|");
		sb.append("old="+user.getOld()).append("|");
		sb.append("inCome="+user.getInCome()).append("|");
		sb.append("phone="+user.getPhone()).append("|");
		List<Interest> interestList = user.getInterests();
		if (interestList!=null){
			String interestStr = "";
			for (int i=0; i<interestList.size();i++)
				interestStr = interestStr.concat(interestList.get(i).getName()).concat(",");
			sb.append("interests="+interestStr);
		}
		System.out.println(sb.toString());
		
		
	}
	
	public static void printObject(Object object){
		StringBuilder sb = new StringBuilder();
		if (object instanceof Object[]){
			Object[] arr = (Object[]) object;
			for(int i=0; i<arr.length;i++){
				sb.append(arr[i]).append("|");
			}
		}else
			sb.append(object.toString());
			
		System.out.println(sb.toString());		
		
	}	
	
	public static void testList(UserService userService){
		List<User> users = userService.getUsers();
		if (users!=null){
			for (int i=0; i<users.size();i++){
				printUser(users.get(i));
				
			}
			
			
		}
		
	}

	
	public static <T> void printPageInfo(Page<T> pageInfo){
		StringBuilder sb = new StringBuilder();
		sb.append("��ǰ�ǵڼ�ҳ="+pageInfo.getNumber()).append("\n");
		sb.append("��ǰҳ��õļ�¼��="+pageInfo.getNumberOfElements()).append("\n");
		sb.append("ÿҳ��Ҫ��ѯ������="+pageInfo.getSize()).append("\n");
		sb.append("�ܹ����������ļ�¼��="+pageInfo.getTotalElements()).append("\n");
		sb.append("�ܹ���ҳ����="+pageInfo.getTotalPages()).append("\n");
		System.out.println(sb.toString());
		
	}
	

	public static void testUpate(UserService userService) throws UserNotFound{
		User user = new User();
		user.setId(18);
		userService.updateUser(user);
		testList(userService);
		
	}
	
	public static void testAdd(UserService userService){
		User user = new User();
		user.setName("С��");
		user.setPhone("130000000");
		userService.addUser(user);
		System.out.println(user.getId());
		testList(userService);
		
		
	}	
	
	public static void testDelete(UserService userService) throws UserNotFound{
		userService.deleteUser(9);
		testList(userService);
		
	}
	
	
	
	public static void main(String[] arg) throws UserNotFound{

		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) ac.getBean("userService");
		testList(userService);
		//testObjectList(userService);
	
	}
}
