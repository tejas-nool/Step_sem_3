package week7_assignment;

    class TrafficLight {
        private final String id;
        private String color;

        public TrafficLight(String id) {
            this.id = id;
            this.color = "RED"; // Default initial state
        }

        public String getId() {
            return id;
        }

        public String getColor() {
            return color;
        }

        public void next() {
            if (color.equals("RED")) {
                color = "GREEN";
            } else if (color.equals("GREEN")) {
                color = "YELLOW";
            } else if (color.equals("YELLOW")) {
                color = "RED";
            }
        }
    }

