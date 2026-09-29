package p000;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class ugb implements Closeable {

    /* JADX INFO: renamed from: b */
    public static final C2932dl f63908b = new C2932dl(5);

    /* JADX INFO: renamed from: a */
    public int f63909a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f63909a;
        if (i <= 0) {
            throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.f63909a = i - 1;
    }
}
