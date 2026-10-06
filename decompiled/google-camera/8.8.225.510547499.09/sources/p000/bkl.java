package p000;

import java.io.Closeable;
import java.io.IOException;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bkl implements Closeable {

    /* JADX INFO: renamed from: a */
    public final HttpURLConnection f3646a;

    public bkl(HttpURLConnection httpURLConnection) {
        this.f3646a = httpURLConnection;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2548a() {
        try {
            return this.f3646a.getResponseCode() / 100 == 2;
        } catch (IOException e) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3646a.disconnect();
    }
}
