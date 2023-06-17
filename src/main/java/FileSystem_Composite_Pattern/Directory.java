package FileSystem_Composite_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    String name;
    List<FileSystem> list;

    public Directory(String name) {
        this.name = name;
        this.list = new ArrayList<>();
    }

    public void add(FileSystem fs)
    {
        list.add(fs);
    }

    public void ls()
    {
        System.out.println("Directory name: "+ name);
        for(FileSystem obj: list)
        {
            obj.ls();
        }
    }
}
