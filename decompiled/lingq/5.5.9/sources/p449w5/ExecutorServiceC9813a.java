package p449w5;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: w5.a */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorServiceC9813a implements ExecutorService {

    /* JADX INFO: renamed from: b */
    public static final long f49948b = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: c */
    public static volatile int f49949c;

    /* JADX INFO: renamed from: a */
    public final ExecutorService f49950a;

    /* JADX INFO: renamed from: w5.a$a */
    public static final class a implements ThreadFactory {

        /* JADX INFO: renamed from: w5.a$a$a, reason: collision with other inner class name */
        public class C10674a extends Thread {
            public C10674a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new C10674a(runnable);
        }
    }

    /* JADX INFO: renamed from: w5.a$b */
    public static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final ThreadFactory f49951a;

        /* JADX INFO: renamed from: b */
        public final String f49952b;

        /* JADX INFO: renamed from: c */
        public final c f49953c;

        /* JADX INFO: renamed from: d */
        public final boolean f49954d;

        /* JADX INFO: renamed from: e */
        public final AtomicInteger f49955e;

        /* JADX INFO: renamed from: w5.a$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Runnable f49956a;

            public a(Runnable runnable) {
                this.f49956a = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                if (bVar.f49954d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f49956a.run();
                } catch (Throwable th2) {
                    bVar.f49953c.mo18292a(th2);
                }
            }
        }

        public b(a aVar, String str, boolean z10) {
            c.a aVar2 = c.f49958a;
            this.f49955e = new AtomicInteger();
            this.f49951a = aVar;
            this.f49952b = str;
            this.f49953c = aVar2;
            this.f49954d = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f49951a.newThread(new a(runnable));
            threadNewThread.setName("glide-" + this.f49952b + "-thread-" + this.f49955e.getAndIncrement());
            return threadNewThread;
        }
    }

    /* JADX INFO: renamed from: w5.a$c */
    public interface c {

        /* JADX INFO: renamed from: a */
        public static final a f49958a = new a();

        /* JADX INFO: renamed from: w5.a$c$a */
        public class a implements c {
            @Override // p449w5.ExecutorServiceC9813a.c
            /* JADX INFO: renamed from: a */
            public final void mo18292a(Throwable th2) {
                if (Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        void mo18292a(Throwable th2);
    }

    public ExecutorServiceC9813a(ThreadPoolExecutor threadPoolExecutor) {
        this.f49950a = threadPoolExecutor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f49950a.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f49950a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f49950a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f49950a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f49950a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f49950a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f49950a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f49950a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f49950a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.f49950a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.f49950a.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f49950a.submit(runnable, t10);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f49950a.submit(callable);
    }

    public final String toString() {
        return this.f49950a.toString();
    }
}
