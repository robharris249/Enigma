
public class Rotor4 extends Rotor{

    //E  S  O  V  P  Z  J  A  Y  Q  U  I  R  H  X  L  N  F  T  G  K  D  C  M  W  B
    //5  19 15 22 16 26 10 1  25 17 21 9  18 8  24 12 14 6  20 7  11 4  3  13 23 2

    public Rotor4(int turn) {
        setWiring(new int[]{4,17,12,18,11,20,3,-7,16,7,10,-3,5,-6,9,-4,-3,-12,1,-13,-10,-18,-20,-11,-2,-24});
        setTurn(turn);
        for(int i = 0; i < turn; i++) {
            rotate();
        }
    }
}
