class NamedCow extends Cow
{
  String myName;
  NamedCow(String type, String name, String sound)
  {
    mySound = sound;
    myName = name;
    myType = type;
  }

  String getName() {return myName;}
}