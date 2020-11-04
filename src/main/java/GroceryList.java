public class GroceryList {
    private String[] arr;

    public GroceryList() {
        this.arr = new String[10]; 
    }

    public void add(String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = item;
                break;
            }
        }
    }

    public void remove(String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                for (int x = 0; x < arr.length - 1; x++) {
                    arr[i] = arr[x+1];
                }
            }
        }
    }

    public String toString() {
        String str = "Grocery List: ";
        for (int i = 0; i < this.arr.length - 1; i++) {
            if (this.arr[i] != null){
                str += this.arr[i] + ", ";
            }
            else if (this.arr[i+1] == null) {
                break;
            }
        }
        return str;
    }
}   
