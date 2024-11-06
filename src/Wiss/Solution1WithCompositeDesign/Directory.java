package Wiss.Solution1WithCompositeDesign;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    String directoryName;
    List<FileSystem> fileSystemList;
    int size;

    public Directory(String name){
        this.directoryName = name;
        fileSystemList = new ArrayList<>();
        this.size=fileSystemList.size();
    }

    public void add(FileSystem fileSystemObj) {
        fileSystemList.add(fileSystemObj);
    }

    public void ls(){
        System.out.println("Directory name " + directoryName);

        for(FileSystem fileSystemObj : fileSystemList){
            fileSystemObj.ls();
        }
    }

    @Override
    public int size() {
        int size=0;
        for(FileSystem fileSystemObj : fileSystemList){
            size=size+fileSystemObj.size();
        }
        return size;
    }
}
