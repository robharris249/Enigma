
public class Rotor1 extends Rotor{

    //E K  M  F  L  G  D  Q  V  Z  N  T  O  W  Y  H  X  U  S  P  A  I  B  R  C  J
    //4 10 12 5  11 6  3  16 21 25 13 19 14 22 24 7  23 20 18 15 0  8  1  17 2  9

    public Rotor1(int turn) {
        setWiring(new int[]{4,9,10,2,7,1,-3,9,13,16,3,8,2,9,10,-8,7,3,0,-4,-20,-13,-21,-6,-22,-16});
        setTurn(turn);
        setName("Rotor1");
        for(int i = 0; i < turn; i++) {
            rotate();
        }
    }
}
