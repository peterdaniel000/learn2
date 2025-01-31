package queue;

public class PrintService {
    private queue<String> printQueue;

    public PrintService(){
        printQueue = new queue<String>();
    }

    public void summitPrintRequest(String document){
        printQueue.enqueue(document);
        System.out.println("Print request submmited" + document);
    }

    public void processPrintRequest(){
        while (!printQueue.isEmpty()){
            String document = printQueue.dequeue();
            System.out.println("printing document" + document);
        }
        System.out.println("we printed all document");
    }

    public static void main(String[] args){
        PrintService printService = new PrintService();
        printService.summitPrintRequest("ducoment1");
        printService.summitPrintRequest("ducoment2");
        printService.summitPrintRequest("ducoment3");
        printService.summitPrintRequest("ducoment4");

        printService.processPrintRequest();
    }
    
}
