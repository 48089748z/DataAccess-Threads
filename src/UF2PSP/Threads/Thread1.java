package UF2PSP.Threads;

/**
 * Created by 48089748z on 07/10/15.
 */
public class Thread1 implements Runnable
{
    public void run()
    {
        for (int x=0; x<50; x++)
        {
            System.out.println("PRIMER THREAD: "+x);
        }
    }
}
