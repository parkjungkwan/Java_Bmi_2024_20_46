package user;

import java.util.List;

public class UserController {
	
	private UserService userService;
	
	public UserController() {
		userService = new UserServiceImpl();
	}
	
	public void postJoin(UserDto user) {
		userService.joinUs(user);
	}

	public UserDto postLogin(UserDto user) {
		UserDto result = new UserDto();
		
		return result;
	}

	public void putPassword(UserDto user) {

	}

	public void delete(UserDto user) {

	}

	public boolean getExistId(UserDto user) {
		boolean result = false;
		return result;
	}

	public UserDto getUser(UserDto user) {
		UserDto result = new UserDto();
		return result;
	}

	public UserDto[] getUserList(UserDto user) {
		UserDto[] result = new UserDto[10];
		return result;
	}

	public UserDto getById(UserDto user) {
		UserDto result = new UserDto();
		return result;
	}

	public UserDto[] getByName(UserDto user) {
		UserDto[] result = new UserDto[10];
		return result;
	}

	public int getCount(UserDto user) {
		int result = 0;
		return result;
	}

}
