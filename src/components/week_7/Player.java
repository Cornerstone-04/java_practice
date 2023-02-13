package components.week_7;
// Implementing Multiple Inheritance Using Interface
// First Interface
interface PlayerRun{
    void Run();
}
//Second Interface
interface PlayerRest{
    void Rest();
}

// Class Player implements both Interfaces
class Player implements PlayerRun, PlayerRest{
    public void Run(){
        System.out.println("Player Can Run");
    }
    public void Rest(){
        System.out.println("Player Can Rest");
    }
}
    class Main
{
  public static void main(String[] args) {
    Player Player1 = new Player();
    Player1.Run();
    Player1.Rest();
  }
}
