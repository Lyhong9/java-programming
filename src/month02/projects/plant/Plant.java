package month02.projects.plant;

public class Plant {
    String name;
    String type;
    int waterLevel;
    double height;

    public void displayInfo(Plant plant1, Plant plant2, Plant plant3) {
        System.out.println("1. Plant One");
        System.out.println("  - name: " + plant1.name);
        System.out.println("  - Type: " + plant1.type);
        System.out.println("  - WaterLevel: " + plant1.waterLevel);
        System.out.println("  - Height: " + plant1.height);

        System.out.println();
        System.out.println("2. Plant Two");
        System.out.println("  - name: " + plant2.name);
        System.out.println("  - Type: " + plant2.type);
        System.out.println("  - WaterLevel: " + plant2.waterLevel);
        System.out.println("  - Height: " + plant2.height);

        System.out.println();
        System.out.println("3. Plant Two");
        System.out.println("  - name: " + plant3.name);
        System.out.println("  - Type: " + plant3.type);
        System.out.println("  - WaterLevel: " + plant3.waterLevel);
        System.out.println("  - Height: " + plant3.height);
    }

    public void displayInfoAgain(Plant plant1, Plant plant2, Plant plant3,
                                 int wOne, int wTwo, int wThree,
                                 double hOne, double hTwo, double hThree) {

//        boolean healthy;
//        if (wOne >= 50) {
//            healthy = true;
//        }else {
//            healthy = false;
//        }

//        String checkHealthy = checkHealthy(wOne);

            System.out.println("1. Plant One");
            System.out.println("  - name: " + plant1.name);
            System.out.println("  - Type: " + plant1.type);
            System.out.println("  - WaterLevel: " + wOne + checkHealthy(wOne));
            System.out.println("  - Height: " + hOne);

            System.out.println();
            System.out.println("2. Plant Two");
            System.out.println("  - name: " + plant2.name);
            System.out.println("  - Type: " + plant2.type);
            System.out.println("  - WaterLevel: " + wTwo + checkHealthy(wTwo));
            System.out.println("  - Height: " + hTwo);

            System.out.println();
            System.out.println("3. Plant Two");
            System.out.println("  - name: " + plant3.name);
            System.out.println("  - Type: " + plant3.type);
            System.out.println("  - WaterLevel: " + wThree  + checkHealthy(wThree));
            System.out.println("  - Height: " + hThree);
    }

    public String checkHealthy(int waterLevel){
        if (waterLevel >= 50) {
            return " Healthy Status : Healthy";
        }else {
            return " Healthy Status : Needs Water";
        }
    }

    public int waterPlant(int waterLevel){
        waterLevel += 20;
        return waterLevel;
    }

    public double growPlant(double height){
        height+= 5;
        return height;
    }

    public static void main(String[] args) {
        System.out.println("---------------------- Smart Plant Care System ----------------------");
        System.out.println("-----------------------");

        Plant plantOne = new Plant();
        Plant plantTwo = new Plant();
        Plant plantThree = new Plant();
        Plant allPlants = new Plant();

        plantOne.name = "Rose";
        plantOne.type = "Flower";
        plantOne.waterLevel = 60;
        plantOne.height = 15.5;
        System.out.println("Start Plant");


        plantTwo.name = "Mango";
        plantTwo.type = "Tree";
        plantTwo.waterLevel = 40;
        plantTwo.height = 120;

        plantThree.name = "Cactus";
        plantThree.type = "Desert Plant";
        plantThree.waterLevel = 20;
        plantThree.height = 35;

        plantOne.displayInfo(plantOne, plantTwo, plantThree);

        System.out.println();
        System.out.println("---------------------- After check again ----------------------");
        int afterWaterPlanOne = plantOne.waterPlant(plantOne.waterLevel);
        double afterHeightOne = plantOne.growPlant(plantOne.height);

        int afterWaterPlanTwo = plantTwo.waterPlant(plantTwo.waterLevel);
        double afterHeightTwo = plantTwo.growPlant(plantTwo.height);

        int afterWaterPlanThree = plantThree.waterPlant(plantThree.waterLevel);
        double afterHeightThree = plantThree.growPlant(plantThree.height);

        allPlants.displayInfoAgain(plantOne,
                plantTwo,
                plantThree,
                afterWaterPlanOne,
                afterWaterPlanTwo,
                afterWaterPlanThree,
                afterHeightOne,
                afterHeightTwo,
                afterHeightThree);
    }
}
