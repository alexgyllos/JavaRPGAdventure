package rooms;

import java.util.ArrayList;
import java.util.Random;

public class Quest {

    private ArrayList<Room> rooms;
    private boolean completed;

    public Quest() {
        this.rooms = new ArrayList<Room>();
        this.completed = false;
        populateRooms();
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void populateRooms() {
        Random num = new Random();
        int randomNum = num.nextInt((4 - 1) + 1) + 1;
        for (int var = 0; var < randomNum; var ++) {
            Room room = new Room();
            this.rooms.add(room);
        }
    }

    public boolean isCompleted() {
        return completed;
    }

    public void progressQuest() {
        if (this.rooms.size() > 0) {
            this.rooms.remove(0);
        } else {
            this.completed = true;
        }

    }
}
