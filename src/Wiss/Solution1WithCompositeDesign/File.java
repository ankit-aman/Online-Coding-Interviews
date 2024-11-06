package Wiss.Solution1WithCompositeDesign;

public class File implements FileSystem{
    String fileName;
    int size;

    public File(String name, int size){
        this.fileName = name;
        this.size=size;
    }

    public void ls(){
        System.out.println("file name " + fileName);
    }

    @Override
    public int size() {
        System.out.println("file size " + size);
        return size;
    }
}
