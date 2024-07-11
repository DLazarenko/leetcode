class User
{
 private UserImpl realUser;

 public User(UserImpl impl)
 {
  realUser = impl;
 }

 public void run() 
 {
  realUser.run();
 }

 public void fly() 
 {
  realUser.fly();
 }
}

class UserImpl
{
 public void run()
 {
 }

 public void fly()
 {
 }
}

class User
{
 private UserImpl realUser;

 public User(UserImpl impl)
 {
  realUser = impl;
 }

 public void transformToDonkey()
 {
  realUser = new UserDonkeyImpl();
 }

 public void transformToDragon()
 {
  realUser = new UserDragonImpl();
 }
}

User user = new User(new UserDonkey()); 
user.transformToDragon(); 
