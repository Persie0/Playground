package p000;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class k18 implements Closeable {

    /* JADX INFO: renamed from: a */
    public final ch2 f46559a;

    public k18(ch2 ch2Var) {
        this.f46559a = ch2Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f46559a.close();
    }
}
