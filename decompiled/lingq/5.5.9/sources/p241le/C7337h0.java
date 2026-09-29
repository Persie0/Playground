package p241le;

import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p136gc.AbstractC5751g;
import p402u0.C9369l;

/* JADX INFO: renamed from: le.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7337h0 {

    /* JADX INFO: renamed from: a */
    public static final ExecutorService f41062a = C7329d0.m14743a("awaitEvenIfOnMainThread task continuation executor");

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: a */
    public static <T> T m14755a(AbstractC5751g<T> abstractC5751g) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        abstractC5751g.mo12104f(f41062a, new C9369l(16, countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        }
        if (abstractC5751g.mo12111m()) {
            return abstractC5751g.mo12107i();
        }
        if (abstractC5751g.mo12109k()) {
            throw new CancellationException("Task is already canceled");
        }
        if (abstractC5751g.mo12110l()) {
            throw new IllegalStateException(abstractC5751g.mo12106h());
        }
        throw new TimeoutException();
    }
}
