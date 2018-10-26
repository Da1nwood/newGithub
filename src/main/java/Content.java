
import java.util.ArrayList;

public class Content {
    private String branchName;
    private ArrayList<Documents> arrayList = new ArrayList<Documents>();


    public Content(String branchName) {
        this.branchName = branchName;
    }


    public ArrayList<Documents> getArrayList() { return arrayList; }

    public String getBranchName() {
        return branchName;
    }

}
