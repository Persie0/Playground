package p457wd;

import com.google.android.play.core.tasks.RuntimeExecutionException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: wd.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9903d {
    /* JADX WARN: Unreachable blocks removed: 7, instructions: 7 */
    /* JADX INFO: renamed from: a */
    public static <ResultT> ResultT m18405a(C9910k c9910k) throws ExecutionException, InterruptedException {
        boolean z10;
        Exception exc;
        ResultT resultt;
        Exception exc2;
        ResultT resultt2;
        if (c9910k == null) {
            throw new NullPointerException("Task must not be null");
        }
        synchronized (c9910k.f50543a) {
            try {
                z10 = c9910k.f50545c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            if (!c9910k.m18408a()) {
                synchronized (c9910k.f50543a) {
                    exc2 = c9910k.f50547e;
                }
                throw new ExecutionException(exc2);
            }
            synchronized (c9910k.f50543a) {
                if (!c9910k.f50545c) {
                    throw new IllegalStateException("Task is not yet complete");
                }
                Exception exc3 = c9910k.f50547e;
                if (exc3 != null) {
                    throw new RuntimeExecutionException(exc3);
                }
                resultt2 = (ResultT) c9910k.f50546d;
            }
            return resultt2;
        }
        C9911l c9911l = new C9911l();
        ExecutorC9908i executorC9908i = C9902c.f50533b;
        c9910k.f50544b.m12894b(new C9904e(executorC9908i, c9911l));
        c9910k.m18409b();
        c9910k.f50544b.m12894b(new C9905f(executorC9908i, c9911l));
        c9910k.m18409b();
        c9911l.f50548a.await();
        if (!c9910k.m18408a()) {
            synchronized (c9910k.f50543a) {
                exc = c9910k.f50547e;
            }
            throw new ExecutionException(exc);
        }
        synchronized (c9910k.f50543a) {
            if (!c9910k.f50545c) {
                throw new IllegalStateException("Task is not yet complete");
            }
            Exception exc4 = c9910k.f50547e;
            if (exc4 != null) {
                throw new RuntimeExecutionException(exc4);
            }
            resultt = (ResultT) c9910k.f50546d;
        }
        return resultt;
    }
}
