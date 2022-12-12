public class Book {
    String NameOfStantion;
    String Adress;
    String NameOfAuto;
    String TypeOfRepairWork;
    String DateOfComing;
    String DateOfIncoming;
    String ResultOfWork;
    String WorkerName;
    String Cost;

    public Book(String NameOfStantion, String Adress, String NameOfAuto, String TypeOfRepairWork, String DateOfComing,
            String DateOfIncoming, String ResultOfWork, String WorkerName, String Cost) {
        this.NameOfStantion = NameOfStantion;
        this.Adress = Adress;
        this.NameOfAuto = NameOfAuto;
        this.TypeOfRepairWork = TypeOfRepairWork;
        this.DateOfComing = DateOfComing;
        this.DateOfIncoming = DateOfIncoming;
        this.ResultOfWork = ResultOfWork;
        this.WorkerName = WorkerName;
        this.Cost = Cost;
    }

    public String getNameOfStantion() {
        return this.NameOfStantion;
    }

    public void setNameOfStantion(String NameOfStantion) {
        this.NameOfStantion = NameOfStantion;
    }

    public String getAdress() {
        return this.Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public String getNameOfAuto() {
        return this.NameOfAuto;
    }

    public void setNameOfAuto(String NameOfAuto) {
        this.NameOfAuto = NameOfAuto;
    }

    public String getTypeOfRepairWork() {
        return this.TypeOfRepairWork;
    }

    public void setTypeOfRepairWork(String TypeOfRepairWork) {
        this.TypeOfRepairWork = TypeOfRepairWork;
    }

    public String getDateOfComing() {
        return this.DateOfComing;
    }

    public void setDateOfComing(String DateOfComing) {
        this.DateOfComing = DateOfComing;
    }

    public String getDateOfIncoming() {
        return this.DateOfIncoming;
    }

    public void setDateOfIncoming(String DateOfIncoming) {
        this.DateOfIncoming = DateOfIncoming;
    }

    public String getResultOfWork() {
        return this.ResultOfWork;
    }

    public void setResultOfWork(String ResultOfWork) {
        this.ResultOfWork = ResultOfWork;
    }

    public String getWorkerName() {
        return this.WorkerName;
    }

    public void setWorkerName(String WorkerName) {
        this.WorkerName = WorkerName;
    }

    public String getCost() {
        return this.Cost;
    }

    public void setCost(String Cost) {
        this.Cost = Cost;
    }

    @Override
    public String toString() {
        return "{" +
                "NameOfStantion='" + getNameOfStantion() + "'" +
                ", Adress='" + getAdress() + "'" +
                ", NameOfAuto='" + getNameOfAuto() + "'" +
                ", TypeOfRepairWork='" + getTypeOfRepairWork() + "'" +
                ", DateOfComing='" + getDateOfComing() + "'" +
                ", DateOfIncoming='" + getDateOfIncoming() + "'" +
                ", ResultOfWork='" + getResultOfWork() + "'" +
                ", WorkerName='" + getWorkerName() + "'" +
                ", Cost='" + getCost() + "'" +
                "}";
    }

}
