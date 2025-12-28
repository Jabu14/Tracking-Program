import _worker.WorkerManager;

public class Main {
    public static void main(String[] args) {
        TrackingProgram trackingPackage = new TrackingProgram();
        WorkerManager workerConnection = new WorkerManager();

//        workerConnection.WorkerUniqueID();
        trackingPackage.mainMenu();
    }
}