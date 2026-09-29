package p000;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes.dex */
public final class t62 extends xu2 implements Executor {

    /* JADX INFO: renamed from: c */
    public static final t62 f61909c = new t62();

    /* JADX INFO: renamed from: d */
    public static final nn1 f61910d;

    static {
        aga agaVar = aga.f611c;
        int i = zp9.f71940a;
        if (64 >= i) {
            i = 64;
        }
        f61910d = agaVar.mo387Z(ci8.m4708U(i, "kotlinx.coroutines.io.parallelism", 12));
    }

    @Override // p000.nn1
    /* JADX INFO: renamed from: T */
    public final void mo385T(kn1 kn1Var, Runnable runnable) {
        f61910d.mo385T(kn1Var, runnable);
    }

    @Override // p000.nn1
    /* JADX INFO: renamed from: W */
    public final void mo386W(kn1 kn1Var, Runnable runnable) throws DispatchException {
        f61910d.mo386W(kn1Var, runnable);
    }

    @Override // p000.nn1
    /* JADX INFO: renamed from: Z */
    public final nn1 mo387Z(int i) {
        return aga.f611c.mo387Z(1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo385T(EmptyCoroutineContext.f47685a, runnable);
    }

    @Override // p000.nn1
    public final String toString() {
        return "Dispatchers.IO";
    }
}
