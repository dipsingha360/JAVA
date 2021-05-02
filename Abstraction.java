package JAVA;


abstract class computer{
    String processor;
    String mainBoard;
    String ramCapacity;
    String storageCapacity;
    abstract void show();
}


class Asus extends computer {

    private String computerModel;

    public Asus(String computerModel) {
        this.computerModel = computerModel;
        this.processor = "R5 3600";
        this.mainBoard = "MSI B450 mortar max";
        this.ramCapacity = "16 GB";
        this.storageCapacity = "250 GB m.2 nvme";
        show();
    }

    void show() {
        System.out.println("Computer Model : " + this.computerModel+ "\n" + "Processor : " + this.processor + "\n" +
                "Main Board : " + this.mainBoard + "\n" + "Ram Capacity : " + this.ramCapacity + "\n" + "Storage Capacity : " + this.storageCapacity + "\n"
                );
    }


}

