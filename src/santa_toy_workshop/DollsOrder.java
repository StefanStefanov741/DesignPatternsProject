package santa_toy_workshop;

public class DollsOrder implements OrderCommand{
    private static MagicalBoard magic_board;

    public DollsOrder(MagicalBoard magicalBoard){
        this.magic_board = magicalBoard;
    }

    @Override
    public void MakeOrder() {
        magic_board.SetNeededТoy("Кукла");
    }
}
