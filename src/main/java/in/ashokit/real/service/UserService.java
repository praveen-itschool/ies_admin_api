package in.ashokit.real.service;

import in.ashokit.real.binding.DasboardCard;
import in.ashokit.real.binding.LoginForm;

public interface UserService {
	public String Login(LoginForm loginform);

	public boolean recoverPwd(String email);

	public DasboardCard getDasboardInfo();

}
