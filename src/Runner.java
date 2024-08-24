public enum Runner {
    BEGINNER, INTERMEDIATE, ADVANCED;

    static int minTime = 50;
    static int maxTime = 800;


    private static Runner getFitnessLevel(int timeResult){
        if(timeResult <= minTime - 20 || timeResult <= minTime){
            return Runner.ADVANCED;
        }else if(timeResult >= maxTime){
            return Runner.BEGINNER;
        }else return Runner.INTERMEDIATE;
    }


    public static void main(String[] args) {
        System.out.println(getFitnessLevel(150).name());
    }
}
