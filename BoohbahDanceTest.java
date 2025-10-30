public class BoohbahDanceTest {

    public static void main(String[] args) {
        

        Boohbah Zing = new Boohbah("Zing Zing Zingbah", "the ZINGIE");
        Boohbah Humbah = new Boohbah("Humbah", "the Humaburgah");
        Boohbah Jumbah = new Boohbah("Jumbah", "the Jumpah");
        
        Boohbah[] boohbahs = {Zing, Humbah, Jumbah};
        DanceRoutine Routine = new DanceRoutine(boohbahs);

        System.out.println("Original Routine:\n" + Routine.buildRoutine());
        System.out.println("Modified Routine:\n" + Routine.modifyRoutine());
        System.out.println("Remixed Routine:\n" + Routine.remixRoutine());
    }
}
