public class DanceRoutine {
    
    private Boohbah[] boohbahs;

    public DanceRoutine(Boohbah[] boohbahs) {
        this.boohbahs = boohbahs;
    }

    public String buildRoutine() {
        StringBuilder routine = new StringBuilder();

        for (Boohbah boohbah : boohbahs) {
            routine.append(boohbah.performMove() + "\n");
        }

        return routine.toString();
    }

    public String modifyRoutine() {
        return buildRoutine().replace("performs", "dances to");
    }
}

