import java.util.ArrayList;
import java.util.HashMap;

import javax.lang.model.type.UnionType;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageList;

    public StorageFacility() {
        this.storageList = new HashMap<>();
    }

    //creates a List for the key if it doesn't exist yet
    //it adds the string to the list
    public void add(String unit, String item) {
        this.storageList.putIfAbsent(unit, new ArrayList<>());
        this.storageList.get(unit).add(item);
    }

    //shows the contents of the storage unit, if it wasn't added to the list then it RETURNS A NEW, EMPTY ONE.
    public ArrayList<String> contents(String storageUnit) {
        return this.storageList.getOrDefault(storageUnit, new ArrayList<>());
    }

    //removes an item from the list, it can be on multiple times and the others do not get deleted
    //if the list size becomes 0 from deleting, THEN THE STORAGE UNIT IS DELETED FROM HASHMAP
    public void remove(String storageUnit, String item) {
        this.storageList.get(storageUnit).remove(item);

        //.isEmpty is boolean to let me know if there are anye values, better than (.size() == 0)
        if (this.storageList.get(storageUnit).size() == 0) {
            this.storageList.remove(storageUnit);
        }
    }

    //create a new arrayList to contain only the units that are in use
    //for loop through to each of list, to make sure that they are not empty list, and ADD THE ONES IN USE
    public ArrayList<String> storageUnits() {
        ArrayList<String> storageInUse = new ArrayList<>();

        for (String storage : this.storageList.keySet()) {
            if (this.storageList.get(storage).size() > 0) {
                storageInUse.add(storage);
            }
        }
        return storageInUse;
    }
}
