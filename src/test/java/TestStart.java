import org.junit.Test;

public class TestStart {
    @Test
    public void testMain()throws Exception{
        Root root = new Root();
        root.addBranch("not");
        root.addBranch("Kek");
        root.addBranch("Lol");
        root.addBranch("Root");
        Content content = root.getBranches().get("not");
        Content content2 = root.getBranches().get("Kek");
        Content content3 = root.getBranches().get("Lol");
        Content content4 = root.getBranches().get("Root");
        Documents file = new Documents("file", new Object());
        Documents files1 = new Documents("files1", new Object());
        Documents files2 = new Documents("files2", new Object());
        Documents files3 = new Documents("files3", new Object());
        Documents files4 = new Documents("files4", new Object());
        Documents files5 = new Documents("files5", new Object());
        Documents files6 = new Documents("files6", new Object());
        root.addInContentObjects(content, file);
        root.addInContentObjects(content, files1);
        root.addInContentObjects(content2, files2);
        root.addInContentObjects(content2, files3);
        root.addInContentObjects(content3, files4);
        root.addInContentObjects(content3, files5);
        root.addInContentObjects(content4, files6);
        root.updateCommit("not",file,new Object());
        root.allInfo();
    }

}
