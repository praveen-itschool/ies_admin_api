package in.ashokit.real.service;

import java.util.List;

import in.ashokit.real.binding.UnLockAccountForm;
import in.ashokit.real.binding.UserAccountForm;

public interface AccountService {
	public String createAccount(UserAccountForm accForm);

	public List<UserAccountForm> getUserAccounts();

	public UserAccountForm geteditUserAccountById(Integer accId);

	public String changeAccountStatus(Integer accId, String status);

	public String unlockUserAccount(UnLockAccountForm unlockAccForm);

}
