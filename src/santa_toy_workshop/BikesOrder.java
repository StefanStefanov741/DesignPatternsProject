package santa_toy_workshop;

public class BikesOrder implements OrderCommand{

    private static MagicalBoard magic_board;

    public BikesOrder(MagicalBoard magicalBoard){
        this.magic_board = magicalBoard;
    }

    @Override
    public void MakeOrder() {
        magic_board.SetNeededТoy("Колело");
    }
}
