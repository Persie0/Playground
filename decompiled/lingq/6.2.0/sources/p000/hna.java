package p000;

import android.os.Looper;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hna {

    /* JADX INFO: renamed from: a */
    public static final ExecutorService f42670a;

    static {
        bv2 bv2Var = new bv2(new AtomicLong(1L), 0);
        ThreadPoolExecutor.DiscardPolicy discardPolicy = new ThreadPoolExecutor.DiscardPolicy();
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), bv2Var, discardPolicy));
        Runtime.getRuntime().addShutdownHook(new Thread(new av2(executorServiceUnconfigurableExecutorService, 1), "Crashlytics Shutdown Hook for awaitEvenIfOnMainThread task continuation executor"));
        f42670a = executorServiceUnconfigurableExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public static void m13378a(Task task) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.mo5964f(f42670a, new dw6(countDownLatch, 20));
        Looper mainLooper = Looper.getMainLooper();
        Looper looperMyLooper = Looper.myLooper();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (mainLooper == looperMyLooper) {
            countDownLatch.await(3000L, timeUnit);
        } else {
            countDownLatch.await(4000L, timeUnit);
        }
        if (task.mo5971m()) {
            task.mo5967i();
        } else {
            if (task.mo5969k()) {
                throw new CancellationException("Task is already canceled");
            }
            if (!task.mo5970l()) {
                throw new TimeoutException();
            }
            uk9.m22779n(task.mo5966h());
        }
    }
}
