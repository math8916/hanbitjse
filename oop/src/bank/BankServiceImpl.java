package bank;

import java.util.ArrayList;
import java.util.List;

public class BankServiceImpl implements BankService {
	List<AccountBean> list = new ArrayList<AccountBean>();

	@Override
	public void openAccount(AccountBean bean) {
		// TODO Auto-generated method stub
		list.add(bean);

	}

	@Override
	public List<AccountBean> list() {
		return list;

		// TODO Auto-generated method stub

	}

	@Override
	public AccountBean findByAccountNo(String account) {
		AccountBean acc = new AccountBean();
		int i = 0;
		for (; i < list.size(); i++) {
			if (account.equals(String.valueOf(list.get(i).getName()))) {
			acc =	list.get(i);
				break;
			}

		}
		return acc;

		// TODO Auto-generated method stub

	}


	@Override
	public int count() {
		return list.size();
		// TODO Auto-generated method stub

	}

	@Override
	public void showAccount() {
		// TODO Auto-generated method stub

	}

	@Override
	public String deleteAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateAccount() {
		// TODO Auto-generated method stub

	}

	@Override
	public String findByName() {
		// TODO Auto-generated method stub
		return null;
	}

}
