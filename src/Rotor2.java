
public class Rotor2 extends Rotor{

    //A  J  D  K  S  I  R  U  X  B  L  H  W  T  M  C  Q  G  Z  N  P  Y  F  V  O  E
    //0  9  3  10 18 8  17 20 23 1  11 7  22 19 12 2  16 6  25 13 15 24 5  21 14 4

    public Rotor2(int turn) {
        setWiring(new int[]{0,8,1,7,14,3,11,13,15,-8,1,-4,10,6,-2,-13,0,-11,7,-6,-5,3,-17,-2,-10,-21});
        setTurn(turn);
        setName("Rotor2");
        for(int i = 0; i < turn; i++) {
            rotate();
        }
    }
}
