interface Turning
{
    void turn();
}
class Leaf implements Turning
{
    @Override
    public void turn()
    {
        System.out.println("Changing colors");
    }
}
class Page implements Turning
{
    @Override
    public void turn()
    {
        System.out.println("Going to next page");
    }
}
class Pancake implements Turning
{
    @Override
    public void turn()
    {
        System.out.println("Flipping");
    }
}
class Wheels implements Turning
{
    @Override
    public void turn()
    {
        System.out.println("Rolling");
    }
}
class Ball implements Turning
{
    @Override
    public void turn()
    {
        System.out.println("Spinning");
    }
}
class Turners
{
    public static void main(String[] args)
    {
        Leaf leaf = new Leaf();
        leaf.turn();
        Page page = new Page();
        page.turn();
        Pancake pancake = new Pancake();
        pancake.turn();
        Wheels wheels = new Wheels();
        wheels.turn();
        Ball ball = new Ball();
        ball.turn();
    }
}