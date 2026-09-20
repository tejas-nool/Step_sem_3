package week7_assignment;

    import java.util.Arrays;

    class Playlist {
        private String[] songs;
        private int count;

        public Playlist(int capacity) {
            this.songs = new String[capacity];
            this.count = 0;
        }

        public void addSong(String song) {
            if (count < songs.length) {
                songs[count] = song;
                count++;
            }
        }
        public String[] getSongs() {
            return Arrays.copyOf(songs, count);
        }

        public int getSongCount() {
            return count;
        }
    }

