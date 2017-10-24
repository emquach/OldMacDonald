class Chick implements Animal
{
  private String myType;
  private String mySound;
  private String mySound2;
  public Chick(String type, String sound, String sound2)
  {
    myType = type;
    mySound = sound;
    mySound2 = sound2;
  }
  public Chick()
  {
    myType = "Chick";
    mySound = "cluck";
    mySound2 = "cheep";
  }
  public String getSound()
  {
    int bg = (int)(Math.random() * 2);
    if(bg == 1)
    {
      return mySound;
    }
    else
    {
      return mySound2;
    }
  }     
    public String getType()
    {
      return myType;
    }
}