import java.io.IOException;

public class TrueOrFalse {
    int value;

    TrueOrFalse(int value) {
        try {

            this.value = value;

            if(Integer.toString(value).length() != 4)
                throw new IOException("Length of the number less than 4");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    boolean checkValue() {
        String str = Integer.toString(value);

        if(Integer.parseInt(Character.toString(str.charAt(0))) +
                Integer.parseInt(Character.toString(str.charAt(1))) ==
                        Integer.parseInt(Character.toString(str.charAt(2))) +
                                Integer.parseInt(Character.toString(str.charAt(3))))
            return true;
        else
            return false;
    }
}


