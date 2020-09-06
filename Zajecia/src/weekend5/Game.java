package weekend5;

public interface Game {
    // - int start(Movable movable)
    // - int start(Pawn pawn)
    // - int start(Pawn pawn, Playable playable, Movable movable, Beatable beatable)
    void start(Movable movable);                //metody sa przeciazone

    void start(Pawn pawn);

    void start(Pawn pawn, Playable playable, Movable movable, Beatable beatable);


}
