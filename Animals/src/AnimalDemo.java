import javax.swing.*;

/**
 * created by Benjamin Brankovic
 * Date: 2020-09-27
 * Time: 19:14
 * Project: Animals
 * Copyright:
 */


public class AnimalDemo {
    private AnimalDemo() {

        //Initiate AnimalNameList
        AnimalNameList.init();

        while (true) {
            var animalName = JOptionPane.showInputDialog(null, "Vad heter husdjuret!",
                    "Välkommen", JOptionPane.INFORMATION_MESSAGE);

            //User clicked on X or Cancel
            if (animalName == null)
                System.exit(0);

            var animal = AnimalNameList.getByName(animalName);

            //User entered a non-existing name
            if (animal == null) {
                JOptionPane.showMessageDialog(null, "Hittade inga husdjur med det specifika namnet. Försök igen!",
                        "Not Found", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            JOptionPane.showMessageDialog(null, animal.getAnimalProperties(animal),
                    "Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        AnimalDemo ad1 = new AnimalDemo();
    }
}
