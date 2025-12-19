package coreProgramming.methods.Level3;

// Program to find shortest, tallest and mean height of football players
class FootballTeamHeightAnalysis {

    // Method to generate random heights (150–250 cm)
    public static int[] generateHeights() {
        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }
        return heights;
    }

    // Method to find sum of heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    // Method to find mean height
    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    // Method to find tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        // Generate heights
        int[] heights = generateHeights();

        // Display heights
        System.out.println("Heights of Football Players:");
        for (int h : heights) {
            System.out.print(h + " ");
        }

        // Calculate results
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        // Display results
        System.out.println("\n\n--- TEAM HEIGHT ANALYSIS ---");
        System.out.println("Sum of Heights     : " + sum + " cm");
        System.out.println("Mean Height        : " + mean + " cm");
        System.out.println("Shortest Height    : " + shortest + " cm");
        System.out.println("Tallest Height     : " + tallest + " cm");
    }
}
