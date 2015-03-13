package za.ac.cput.week5;

/**
 * Created by student on 2015/03/13.
 */
public class HumanNature {
    String human_habbit;
    Human human;

    public HumanNature(String human_habbit,Human human)
    {
        this.human_habbit=human_habbit;
        this.human=human;
    }

    public void setHuman(Human human)
    {
        this.human=human;
    }
    public String getHuman_habbit()
    {
        return human_habbit;
    }

    public String getbehavior()
    {
        return human.walk(human_habbit);
    }
}
