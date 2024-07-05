abstract class GamePerson{}

class Warrior extends GamePerson{}

class Mag extends GamePerson{}

class Troll extends GamePerson{}

class Elv extends GamePerson{}

public enum PersonType
{
 UNKNOWN,
 WARRIOR,
 MAG,
 TROLL,
 ELV,
}

public class PersonFactory
{
 public static GamePerson createPerson(PersonType personType)
 {
  switch(personType)
  {
   WARRIOR:
   return new Warrior();
   MAG:
   return new Mag();
   TROLL:
   return new Troll();
   ELV:
   return new Elv();
   default:
   throw new GameException();
  }
 }
}

class HumanWarrior extends Warrior{}

class HumanArcher extends Archer{}

class HumanMag extends Mag{}



class ElvWarrior extends Warrior{}

class ElvArcher extends Archer{}

class ElvMag extends Mag{}



class DaemonWarrior extends Warrior{}

class DaemonArcher extends Archer{}

class DaemonMag extends Mag{}



class HumanArmy extends Army{
 public Warrior createWarrior(){
  return new HumanWarrior();
 }
 public Archer createArcher(){
  return new HumanArcher();
 }
 public Mag createMag(){
  return new HumanMag();
 }
}


class ElvArmy extends Army{
 public Warrior createWarrior(){
  return new ElvWarrior();
 }
 public Archer createArcher(){
  return new ElvArcher();
 }
 public Mag createMag(){
  return new ElvMag();
 }
}



class DaemonArmy extends Army{
 public Warrior createWarrior(){
  return new DaemonWarrior();
 }
 public Archer createArcher(){
  return new DaemonArcher();
 }
 public Mag createMag(){
  return new DaemonMag();
 }
}