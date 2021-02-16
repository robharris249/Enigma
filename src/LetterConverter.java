
public class LetterConverter {

    public int[] ConvertToNumbers (String in) {

        int[] out = new int[in.length()];

        for(int i = 0; i < in.length(); i++) {

            char character = in.charAt(i);

            switch(character) {
                case 'a':
                    out[i] = 0;
                    break;

                case 'b':
                    out[i] = 1;
                    break;

                case 'c':
                    out[i] = 2;
                    break;

                case 'd':
                    out[i] = 3;
                    break;

                case 'e':
                    out[i] = 4;
                    break;

                case 'f':
                    out[i] = 5;
                    break;

                case 'g':
                    out[i] = 6;
                    break;

                case 'h':
                    out[i] = 7;
                    break;

                case 'i':
                    out[i] = 8;
                    break;

                case 'j':
                    out[i] = 9;
                    break;

                case 'k':
                    out[i] = 10;
                    break;

                case 'l':
                    out[i] = 11;
                    break;

                case 'm':
                    out[i] = 12;
                    break;

                case 'n':
                    out[i] = 13;
                    break;

                case 'o':
                    out[i] = 14;
                    break;

                case 'p':
                    out[i] = 15;
                    break;

                case 'q':
                    out[i] = 16;
                    break;

                case 'r':
                    out[i] = 17;
                    break;

                case 's':
                    out[i] = 18;
                    break;

                case 't':
                    out[i] = 19;
                    break;

                case 'u':
                    out[i] = 20;
                    break;

                case 'v':
                    out[i] = 21;
                    break;

                case 'w':
                    out[i] = 22;
                    break;

                case 'x':
                    out[i] = 23;
                    break;

                case 'y':
                    out[i] = 24;
                    break;

                case 'z':
                    out[i] = 25;
                    break;

                default:
                    out[i] = 100;
                    break;
            }
        }

        return out;
    }

    public String ConvertToLetters (int[] in) {
        String out = new String();

        for(int i = 0; i < in.length; i++) {
            switch(in[i]) {
                case 0:
                    out = out + "a";
                    break;

                case 1:
                    out = out + "b";
                    break;

                case 2:
                    out = out + "c";
                    break;

                case 3:
                    out = out + "d";
                    break;

                case 4:
                    out = out + "e";
                    break;

                case 5:
                    out = out + "f";
                    break;

                case 6:
                    out = out + "g";
                    break;

                case 7:
                    out = out + "h";
                    break;

                case 8:
                    out = out + "i";
                    break;

                case 9:
                    out = out + "j";
                    break;

                case 10:
                    out = out + "k";
                    break;

                case 11:
                    out = out + "l";
                    break;

                case 12:
                    out = out + "m";
                    break;

                case 13:
                    out = out + "n";
                    break;

                case 14:
                    out = out + "o";
                    break;

                case 15:
                    out = out + "p";
                    break;

                case 16:
                    out = out + "q";
                    break;

                case 17:
                    out = out + "r";
                    break;

                case 18:
                    out = out + "s";
                    break;

                case 19:
                    out = out + "t";
                    break;

                case 20:
                    out = out + "u";
                    break;

                case 21:
                    out = out + "v";
                    break;

                case 22:
                    out = out + "w";
                    break;

                case 23:
                    out = out + "x";
                    break;

                case 24:
                    out = out + "y";
                    break;

                case 25:
                    out = out + "z";
                    break;

                case 100:
                    out = out + " ";
                    break;
            }
        }

        return out;
    }
}
