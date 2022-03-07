import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registryMap;

    public VehicleRegistry() {
        this.registryMap = new HashMap<>();
    }

    //containsKey is specific for HashMaps
    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.registryMap.containsKey(licensePlate)) {
            return false;
        }
        this.registryMap.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        if (!(this.registryMap.keySet().contains(licensePlate))) {
            return null;
        }
        return this.registryMap.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        for (LicensePlate plate : this.registryMap.keySet()) {
            if (plate.equals(licensePlate)) {
                this.registryMap.remove(licensePlate);
                return true;
            }
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate plate : this.registryMap.keySet()) {
            System.out.println(plate);
        }
    }

    //created an ArrayList to add the owners during each loop
    //(if) condition prints and adds name to list only if: it is not included on the list already
    public void printOwners() {
        ArrayList<String> ownerList= new ArrayList<>();

        for (String owner : this.registryMap.values()) {
            if (!(ownerList.contains(owner))) {
                System.out.println(owner);
                ownerList.add(owner);
            }
        }
    }

}
