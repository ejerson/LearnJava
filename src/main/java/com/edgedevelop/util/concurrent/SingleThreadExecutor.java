package com.edgedevelop.util.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();

            System.out.println("begin");
            service.execute(() -> System.out.println("Printing zoo inventory"));
            service.execute(() -> {for(int i=0; i<3; i++)
                System.out.println("Printing record: "+i);}
         );


            service.execute(() -> System.out.println("Printing zoo inventory"));
            System.out.println("end");
        } finally {
            // when all execute methods are done, the service is shutdown
            if(service != null) service.shutdown();
        }
    }
}


