package p193j7;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import p216k7.C6626a;
import p259m7.C7493a;

/* JADX INFO: renamed from: j7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6421a implements InterfaceC6422b {

    /* JADX INFO: renamed from: a */
    public URLConnection f36897a;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m13043b(C7493a c7493a) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(c7493a.f41389c).openConnection();
        this.f36897a = uRLConnectionOpenConnection;
        uRLConnectionOpenConnection.setReadTimeout(c7493a.f41396j);
        this.f36897a.setConnectTimeout(c7493a.f41397k);
        this.f36897a.addRequestProperty("Range", String.format(Locale.ENGLISH, "bytes=%d-", Long.valueOf(c7493a.f41394h)));
        URLConnection uRLConnection = this.f36897a;
        if (c7493a.f41398l == null) {
            C6626a c6626a = C6626a.f37566f;
            if (c6626a.f37569c == null) {
                synchronized (C6626a.class) {
                    if (c6626a.f37569c == null) {
                        c6626a.f37569c = "PRDownloader";
                    }
                }
            }
            c7493a.f41398l = c6626a.f37569c;
        }
        uRLConnection.addRequestProperty("User-Agent", c7493a.f41398l);
        this.f36897a.connect();
    }

    /* JADX INFO: renamed from: c */
    public final int m13044c() throws IOException {
        URLConnection uRLConnection = this.f36897a;
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getResponseCode();
        }
        return 0;
    }

    public final Object clone() throws CloneNotSupportedException {
        return new C6421a();
    }
}
