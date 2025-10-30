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

    public String remixRoutine() {
        
        StringBuilder buildRoutine = new StringBuilder(this.buildRoutine());
        buildRoutine.insert(0, "---REMIX---\n");
        buildRoutine.delete(buildRoutine.length() - 1, buildRoutine.length());
        buildRoutine.append("\nBackwards Boohbah Shuffle!");
        buildRoutine.reverse();

        return buildRoutine.toString();
    }
}

