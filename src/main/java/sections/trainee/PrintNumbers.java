package sections.trainee;

public class PrintNumbers {

    public static void main(String[] args) {

        //String camelCase = "The_Stealth-Warrior";
        String camelCase = "The_Stealth-Warrior-";
        //String camelCase = "the-stealth-warrior_";
        StringBuilder myNewString = new StringBuilder();
        for (int i = 0; i < camelCase.length(); i++) {

            if (!(camelCase.charAt(i) == '_') && !(camelCase.charAt(i) == '-')){
                myNewString.append(camelCase.charAt(i));
            }

            if (camelCase.charAt(i) == '_' || camelCase.charAt(i) == '-') {
                if (i < camelCase.length() - 1) {
                    String stringToUppercase = String.valueOf(camelCase.charAt(i + 1)).toUpperCase();
                    myNewString.append(stringToUppercase);
                    i++;
                }
            }

        }
        System.out.println(myNewString.toString());
        System.out.println(myNewString.toString().getClass().getName());

    }

  }
