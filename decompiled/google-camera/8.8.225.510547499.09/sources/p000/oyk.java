package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oyk extends orq implements Executor {

    /* JADX INFO: renamed from: c */
    public static final oyk f46840c = new oyk();

    /* JADX INFO: renamed from: d */
    private static final oqo f46841d;

    static {
        oyr oyrVar = oyr.f46855c;
        int iM15640ai = lku.m15640ai("kotlinx.coroutines.io.parallelism", ook.m18789c(64, oya.f46803a), 0, 0, 12);
        if (iM15640ai > 0) {
            f46841d = new oxk(oyrVar, iM15640ai);
            return;
        }
        throw new IllegalArgumentException("Expected positive parallelism level, but got " + iM15640ai);
    }

    private oyk() {
    }

    @Override // p000.orq
    /* JADX INFO: renamed from: c */
    public final Executor mo18970c() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // p000.oqo
    /* JADX INFO: renamed from: d */
    public final void mo18915d(oly olyVar, Runnable runnable) {
        olyVar.getClass();
        f46841d.mo18915d(olyVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        mo18915d(olz.f46282a, runnable);
    }

    @Override // p000.oqo
    public final String toString() {
        return "Dispatchers.IO";
    }
}
