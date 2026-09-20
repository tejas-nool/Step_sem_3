package week7_assignment;

    class Cart {
        private final String cartId;
        private double[] prices;
        private int itemCount;

        public Cart(String cartId, int capacity) {
            this.cartId = cartId;
            this.prices = new double[capacity];
            this.itemCount = 0;
        }

        public String getCartId() {
            return cartId;
        }

        public void addItem(double price) {
            if (itemCount < prices.length) {
                prices[itemCount] = price;
                itemCount++;
            }
        }

        public double getTotal() {
            double total = 0;
            for (int i = 0; i < itemCount; i++) {
                total += prices[i];
            }
            return total;
        }

        public int getItemCount() {
            return itemCount;
        }
    }

