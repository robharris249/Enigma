
public class Machine {

    private Rotor[] rotors = new Rotor[3];
    Plugboard plugboard = new Plugboard();
    int[] reflector = new int[] {24,17,20,7,16,18,11,3,15,23,13,6,14,10,12,8,4,1,5,25,2,22,21,9,0,19};

    public Machine(int[] selectedRotors, int[] rotorSettings, int[] plugboardSettings) {

        plugboard.setSettings(plugboardSettings);

        for(int i = 0; i < rotors.length; i++) {
            switch(selectedRotors[i]) {
                case 1:
                    rotors[i] = new Rotor1(rotorSettings[i]);
                    break;

                case 2:
                    rotors[i] = new Rotor2(rotorSettings[i]);
                    break;

                case 3:
                    rotors[i] = new Rotor3(rotorSettings[i]);
                    break;

                case 4:
                    rotors[i] = new Rotor4(rotorSettings[i]);
                    break;

                default:
                    rotors[i] = new Rotor5(rotorSettings[i]);
            }
        }
    }

    public int takeNumber (int num) {

        if(num == 100) {
            return 100;
        }
        //System.out.println("Before Plugboard: " + num);
        num = plugboard.getSettings()[num];
        //System.out.println("After Plugboard: " + num);

        for(int i = 0; i < rotors.length; i++) {
            //System.out.println("\nBefore Rotor"+ (i+1)+ ": " + num);
            num = rotors[i].getWiring()[num] + num;
            //System.out.println("After Rotor"+ (i+1)+ ": " + num);
        }

        //System.out.println("\nBefore Reflector: " + num);
        num = reflector[num];
        //System.out.println("After Reflector: " + num);

        for(int i = rotors.length - 1; i > -1; i--) {
            //System.out.println("\nBefore InvertedRotor"+ (i+1)+ ": " + num);
            num = rotors[i].InverseRotor(num);
            //System.out.println("After InvertedRotor"+ (i+1)+ ": " + num);
        }

        //System.out.println("\nBefore Plugboard: " + num);
        num = plugboard.getSettings()[num];
        //System.out.println("After Plugboard: " + num);
        rotateRotors();
        return num;
    }

    public void rotateRotors() {
        rotors[0].rotate();
        if(rotors[0].getTurn() == 0){
            rotors[1].rotate();
            if(rotors[1].getTurn() == 0) {
                rotors[2].rotate();
            }
        }

    }

    public Rotor[] getRotors() {
        return rotors;
    }

    public void setRotors(Rotor[] rotors) {
        this.rotors = rotors;
    }

    public Plugboard getPlugboard() {
        return plugboard;
    }

    public void setPlugboard(Plugboard plugboard) {
        this.plugboard = plugboard;
    }
}
