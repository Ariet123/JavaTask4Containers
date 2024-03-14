import java.util.Random;

public class Ariet {
    public static void main(String[] args) {
        // Generate a random odd number between 51 and 100 for the amount of bricks
        Random random = new Random();
        int amountOfBricks = random.nextInt(24) * 2 + 51;
        System.out.println("Amount of bricks: " + amountOfBricks);

        // Generate a random even number between 6 and 10 for the container capacity
        int containerCapacity = random.nextInt(2) * 2 + 6;
        System.out.println("Container capacity: " + containerCapacity);

        // Calculate the number of full containers
        int fullContainers = amountOfBricks / containerCapacity;
        // Calculate the number of blocks in the last container
        int notFullBlocks = amountOfBricks % containerCapacity;

        // Check if the last container is completely full
        if (notFullBlocks == 0) {
            System.out.println("Number of blocks in the container that is not full: " + notFullBlocks);
            System.out.println("Number of full containers: " + fullContainers);
            System.out.println("Total number of containers: " + fullContainers);
        } else {
            System.out.println("Number of blocks in the container that is not full: " + notFullBlocks);
            System.out.println("Number of full containers: " + fullContainers);
            System.out.println("Total number of containers: " + (fullContainers + 1));
        }
    }
}
