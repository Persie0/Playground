package p000;

import java.io.Closeable;

/* JADX INFO: renamed from: new, reason: invalid class name */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class Cnew implements Closeable {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f42158a = new nev();

    /* JADX INFO: renamed from: b */
    public int f42159b = 0;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f42159b;
        if (i <= 0) {
            throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.f42159b = i - 1;
    }
}
