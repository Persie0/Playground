package p000;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes.dex */
public interface t89 extends Closeable, Flushable {
    /* JADX INFO: renamed from: X */
    void mo471X(aj0 aj0Var, long j);

    void close();

    @Override // java.io.Flushable
    void flush();

    /* JADX INFO: renamed from: i */
    c1a mo484i();
}
