//i create interface which name is Playable
interface Playable {
    void play(); // This method will be implemented by classes that use the interface
}

// create a class called Song that implements the Playable interface
class Song implements Playable {
    public void play() {
        // implement the play method for Song
        System.out.println("Playing a song");
    }
}

// create a class called Video that implements the Playable interface
class Video implements Playable {
    public void play() {
        // Implement the play method for Video
        System.out.println("Playing a video");
    }
}

// Main class
public class PlayableExample {
    public static void main(String[] args) {
        // Create an object of the Song class
        Song song = new Song();
        
        // Create an object of the Video class
        Video video = new Video();

        // Call the play method for the Song object
        song.play(); // output is playing a song
        
        // Step 7: Call the play method for the Video object
        video.play(); // output is Playing a video
    }
}
