package p208k;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.AbstractC0140a;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: k.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6561d extends AbstractC0140a {

    /* JADX INFO: renamed from: a */
    public final Object f37357a = new Object();

    /* JADX INFO: renamed from: b */
    public final ExecutorService f37358b = Executors.newFixedThreadPool(4, new a());

    /* JADX INFO: renamed from: c */
    public volatile Handler f37359c;

    /* JADX INFO: renamed from: k.d$a */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f37360a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f37360a.getAndIncrement());
            return thread;
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static Handler m13161k0(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
