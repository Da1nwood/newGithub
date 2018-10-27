
public class Documents {
    int fileId;
    String objectName;
    Object object;

    public Documents(String objectName, Object object) {
        this.object = object;
        this.objectName = objectName;
        fileId = object.hashCode();
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
