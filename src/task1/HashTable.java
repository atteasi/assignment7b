package task1;

public class HashTable {

        private DataItem[] hashArray;    // array holds hash table
        private int arraySize;
        private DataItem nonItem;        // for deleted items

        public HashTable(int size)       // constructor
        {
            arraySize = size;
            hashArray = new DataItem[arraySize];
            nonItem = new DataItem(-1);   // deleted item key is -1
        }

        public void displayTable() {
            System.out.print("Table: ");
            for (int j = 0; j < arraySize; j++) {
                if (hashArray[j] != null)
                    System.out.print(hashArray[j].getKey() + " ");
                else
                    System.out.print("** ");
            }
            System.out.println("");
        }

        public int hashFunc(int key) {
            return key % arraySize;       // hash function
        }

        public void insert(DataItem item) // insert a DataItem
        // (assumes table not full)
        {
            int key = item.getKey();      // extract key
            int hashVal = hashFunc(key);  // hash the key
            int step = 0;                 // start with step 0

            while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {
                step++;                    // increment step
                hashVal = (hashVal + step*step) % arraySize;  // calculate next probe index
            }

            hashArray[hashVal] = item;    // insert item
        }

        public DataItem delete(int key)  // delete a DataItem
        {
            int hashVal = hashFunc(key);  // hash the key
            int step = 0;                 // start with step 0

            while (hashArray[hashVal] != null) {  // until empty cell,
                if (hashArray[hashVal].getKey() == key) {  // found the key
                    DataItem temp = hashArray[hashVal];  // save item
                    hashArray[hashVal] = nonItem;        // delete item
                    return temp;                         // return item
                }
                step++;                    // increment step
                hashVal = (hashVal + step*step) % arraySize;  // calculate next probe index
            }

            return null;                  // can't find item
        }

        public DataItem find(int key)    // find item with key
        {
            int hashVal = hashFunc(key);  // hash the key
            int step = 0;                 // start with step 0

            while (hashArray[hashVal] != null) {  // until empty cell,
                if (hashArray[hashVal].getKey() == key)  // found the key
                    return hashArray[hashVal];   // yes, return item
                step++;                    // increment step
                hashVal = (hashVal + step*step) % arraySize;  // calculate next probe index
            }

            return null;                  // can't find item
        }
}

