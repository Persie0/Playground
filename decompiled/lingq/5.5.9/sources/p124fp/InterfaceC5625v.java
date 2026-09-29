package p124fp;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* JADX INFO: renamed from: fp.v */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5625v extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;

    /* JADX INFO: renamed from: g */
    C5628y mo11921g();

    /* JADX INFO: renamed from: k1 */
    void mo11922k1(C5608e c5608e, long j10) throws IOException;
}
