package p152hb;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p276nb.ThreadFactoryC7737b;

/* JADX INFO: renamed from: hb.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5993n0 {

    /* JADX INFO: renamed from: a */
    public static final ExecutorService f35561a;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC7737b("GAC_Executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f35561a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
