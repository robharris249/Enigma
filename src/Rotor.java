
public class Rotor {

    private int[] wiring = new int[26];
    private String name;
    private int turn;

    public int[] getWiring() {
        return wiring;
    }

    public void setWiring(int[] wiring) {
        this.wiring = wiring;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public void rotate() {
        if(getTurn() < 25) {
            setTurn(getTurn()+1);
        } else {
            setTurn(0);
        }

        int[] tempWiring = getWiring();

        for(int i = 0; i < getWiring().length; i++) {

            if((tempWiring[i] + i) <= 24) {
                tempWiring[i]++;
            } else {
                tempWiring[i] = 0 - i;
            }
        }
        setWiring(tempWiring);
    }

    public int InverseRotor(int num) {

        for(int i = 0; i < getWiring().length; i++) {
            if(getWiring()[i] + i == num) {
                //System.out.println("GOTCHA " + getName());
                return i;
            }
            //System.out.println("Failed: " + i);
        }
        //System.out.println("ERROR!!!");
        return num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
