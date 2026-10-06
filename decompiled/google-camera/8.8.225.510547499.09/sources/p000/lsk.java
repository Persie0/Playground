package p000;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lsk implements Closeable {

    /* JADX INFO: renamed from: a */
    public final Closeable f39134a;

    public lsk(Closeable closeable) {
        this.f39134a = closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Closeable closeable = this.f39134a;
        if (closeable != null) {
            closeable.close();
        }
    }
}
