interface Bank
{
 public void setUserMoney(User user, double money);
 public int getUserMoney(User user);
}


class CitiBank implements Bank
{
 public void setUserMoney(User user, double money)
 {
  UserDAO.updateMoney(user, money);
 }

 public int getUserMoney(User user)
 {
  return UserDAO.getMoney(user);
 }
}


class BankSecurityProxy implements Bank
{
 private Bank bank;
 public BankSecurityProxy(Bank bank)
 {
  this.bank = bank;
 }
 public void setUserMoney(User user, double money)
 {
  if (!SecurityManager.authorize(user, BankAccounts.Manager))
  throw new SecurityException("User can’t change money value");

  bank.setUserMoney(user, money);
 }

 public int getUserMoney(User user)
 {
  if (!SecurityManager.authorize(user, BankAccounts.Manager))
  throw new SecurityException("User can’t get money value");

  return bank.getUserMoney(user);
 }
}

//security check turned off
User user = AuthManager.authorize(login, password);
Bank bank = BankFactory.createUserBank(user);
bank.setUserMoney(user, 1000000);

//security check turned on
User user = AuthManager.authorize(login, password);
Bank bank = BankFactory.createUserBank(user);
bank = new BankSecurityProxy(bank);
bank.setUserMoney(user, 1000000);

