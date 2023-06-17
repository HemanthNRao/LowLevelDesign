package FileSystem_Composite_Pattern;

public class File implements FileSystem{
    String name;
    File(String name)
    {
        this.name = name;
    }

    public void ls() {
        System.out.println("File name is "+ name);
    }
}
