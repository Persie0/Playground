package kotlinx.coroutines.scheduling;

import ae.C0062b;
import android.support.v4.media.session.C0166e;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.AbstractC7092d;
import kotlinx.coroutines.internal.C7169s;
import kotlinx.coroutines.internal.RunnableC7157g;

/* JADX INFO: renamed from: kotlinx.coroutines.scheduling.a */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC7177a extends AbstractC7092d implements Executor {

    /* JADX INFO: renamed from: c */
    public static final ExecutorC7177a f40473c = new ExecutorC7177a();

    /* JADX INFO: renamed from: d */
    public static final RunnableC7157g f40474d;

    static {
        C7187k c7187k = C7187k.f40489c;
        int i10 = C7169s.f40443a;
        if (64 >= i10) {
            i10 = 64;
        }
        boolean z10 = false;
        int iM371m2 = C0062b.m371m2("kotlinx.coroutines.io.parallelism", i10, 0, 0, 12);
        c7187k.getClass();
        if (iM371m2 >= 1) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException(C0166e.m761g("Expected positive parallelism level, but got ", iM371m2).toString());
        }
        f40474d = new RunnableC7157g(c7187k, iM371m2);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: A1 */
    public final void mo14310A1(CoroutineContext coroutineContext, Runnable runnable) {
        f40474d.mo14310A1(coroutineContext, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo2307z1(EmptyCoroutineContext.f38093a, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: z1 */
    public final void mo2307z1(CoroutineContext coroutineContext, Runnable runnable) {
        f40474d.mo2307z1(coroutineContext, runnable);
    }
}
