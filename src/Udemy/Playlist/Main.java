package Udemy.Playlist;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Vishe", "Nusha");
        album.addSong("Vishe", 3.6);
        album.addSong("Nije", 4.6);
        album.addSong("Stanno", 4.5);
        album.addSong("Yura", 5.0);
        album.addSong("Krid", 5.6);
        album.addSong("Laja", 3.2);
        album.addSong("Straja", 6.7);
        album.addSong("Maja", 6.4);
        album.addSong("Vaja", 3.2);
        album.addSong("Vishe", 6.5);

        albums.add(album);
        album = new Album("Budilnik", "Krid");
        album.addSong("Ti menya lubi6", 6.54);
        album.addSong("Samaya samaya", 4.2);
        album.addSong("Budilnik", 3.5);
        album.addSong("Potrachy", 2.4);
        album.addSong("Mne nravitsa", 3.23);
        album.addSong("Beregu", 6.3);
        album.addSong("Papina dochka", 5.4);
        album.addSong("Hkoklostak", 2.2);
        album.addSong("Malo", 4.5);
        albums.add(album);


        LinkedList<Song> playLisy = new LinkedList<Song>();
        albums.get(0).addtoPlayList("Straja", playLisy);
        albums.get(0).addtoPlayList("Beregu", playLisy);
        albums.get(0).addtoPlayList("Huyna", playLisy);
        albums.get(0).addtoPlayList("Huyna2", playLisy);
        albums.get(0).addtoPlayList(8, playLisy);

        albums.get(1).addtoPlayList(1, playLisy);
        albums.get(1).addtoPlayList(3, playLisy);
        albums.get(1).addtoPlayList(2, playLisy);
        albums.get(1).addtoPlayList(43, playLisy);

        play(playLisy);
    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing" + listIterator.next().toString());
            printMenu();

        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextInt();


            switch (action) {
                case 0:
                    System.out.println("Playlisy complete.");
                    quit=true;
                    break;
                case 1:
                    if(!forward){
                        if(!listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward=true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Niw playing" + listIterator.next().toString());
                    }else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                        break;
                    }
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward=false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying " + listIterator.previous().toString());
                        }else {
                            System.out.println("We are at the start of the list");
                        }
                    }else {
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next().toString());
                            forward = true;
                        } System.out.println("We have reached the end of the list");
                    }

                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;


            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\n press");
        System.out.println("0 - to quit\n" +
                            "1 - to play next song\n" +
                            "2 - to play previous song\n" +
                            "3 - to replay the current song\n" +
                            "4 - list songs in the playlist\n" +
                            "5 - print available actions.n");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("=========================");
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        System.out.println("=========================");
    }


}



