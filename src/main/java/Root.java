import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Root {
    private LinkedHashMap<String, Content> branches = new LinkedHashMap<String, Content>();
    private HashMap<String, Object> cloneHashMap = new HashMap<String, Object>();

    public void addBranch(String name) throws Exception {
        if (branches.containsKey(name)) {
            throw new Exception("Branch is exists");
        } else branches.put(name, new Content(name));
    }

    public void removeBranch(String branchName) throws Exception {
        if (branches.containsKey(branchName)) {
            branches.remove(branchName);
        } else throw new Exception("Branch is exists");
    }

    public void addInContentObjects(Content content, Documents documents) throws Exception {
        try {
            if (branches.containsKey(content.getBranchName())) {
                for (int i = 0; i < content.getArrayList().size(); i++) {
                    Documents getAllDocumets = content.getArrayList().get(i);
                    if (getAllDocumets.hashCode() != documents.hashCode()) {
                        content.getArrayList().add(documents);
                        return;
                    }
                }
                if (content.getArrayList().size() == 0) {
                    content.getArrayList().add(documents);
                    return;
                }
            } else throw new Exception("Branch is exists");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return;
    }

    public void allInfo() {
        for (String keys : branches.keySet()) {
            Content content = branches.get(keys);
            System.out.println(keys);
            for (int i = 0; i < content.getArrayList().size(); i++) {
                Documents documents = content.getArrayList().get(i);
                System.out.println("   " + documents.objectName);
            }

        }

    }

    public String getAllBrances() throws Exception {
        String result = null;
        for (String keys : branches.keySet()) {
            if (result != null) {
                result = result + keys + "\n";
            } else result = keys + "\n";
            if (result == null) {
                throw new Exception("Branches is empty");
            }
        }
        return result;
    }

    public void removeCommit(String branch, Documents nameDocument) throws Exception {
            String name = nameDocument.getObjectName();
            Content content = branches.get(branch);
            if(content == null){
                throw new Exception("Branch is exists");
            }
                for (int i = 0; i < content.getArrayList().size(); i++) {
                    if(content.getArrayList().get(i).objectName.equals(name)){
                        content.getArrayList().remove(i);
                        return;
                    }
                }
                throw new Exception("File not found");
            }
    public void updateCommit(String branch, Documents nameDocument, Object object)throws Exception {
        String name = nameDocument.getObjectName();
        Content content = branches.get(branch);
        try{
        if (content == null) {
            throw new Exception("Branch is exists");
        }
        for (int i = 0; i < content.getArrayList().size(); i++) {
            if (content.getArrayList().get(i).objectName.equals(name)
                    && content.getArrayList().get(i).hashCode() == object.hashCode()) {
                return;
            } else if (content.getArrayList().get(i).objectName.equals(name)) {
                content.getArrayList().set(i, new Documents(name,new Object()));
            }
        }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public LinkedHashMap<String, Content> getBranches() {
        return branches;
    }
}



