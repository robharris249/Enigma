
public class Rotor5 extends Rotor{

    //V  Z  B  R  G  I  T  Y  U  P  S  D  N  H  L  X  A  W  M  J  Q  O  F  E  C  K
    //22 26 2  18 7  9  20 25 21 16 19 4  14 8  12 24 1  23 13 10 17 15 6  5  3  11

    public Rotor5(int turn) {
        setWiring(new int[]{21,24,-1,14,2,3,13,17,12,6,8,-8,1,-6,-3,8,-16,5,-6,-10,-4,-7,-17,-19,-22,-15});
        setTurn(turn);
        for(int i = 0; i < turn; i++) {
            rotate();
        }
    }
}