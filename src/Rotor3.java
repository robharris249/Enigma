
public class Rotor3 extends Rotor{

    //B  D  F  H  J  L  C  P  R  T  X  V  Z  N  Y  E  I  W  G  A  K  M  U  S  Q  O
    //1  3  5  7  9  11 2  15 17 19 23 21 25 13 24 4  8  22 6  0  10 12 20 18 16 14

    public Rotor3(int turn) {
        setWiring(new int[]{1,2,3,4,5,6,-4,8,9,10,13,10,13,0,10,-11,-8,5,-12,-19,-10,-9,-2,-5,-8,-11});
        setTurn(turn);
        setName("Rotor3");
        for(int i = 0; i < turn; i++) {
            rotate();
        }
    }
}
