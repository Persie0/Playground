package p000;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oek implements oeo {

    /* JADX INFO: renamed from: a */
    public final HttpURLConnection f45738a;

    /* JADX INFO: renamed from: b */
    public final oeh f45739b;

    /* JADX INFO: renamed from: c */
    public final byte[] f45740c;

    /* JADX INFO: renamed from: d */
    public long f45741d;

    /* JADX INFO: renamed from: e */
    public int f45742e = -1;

    /* JADX INFO: renamed from: f */
    public int f45743f = 0;

    /* JADX INFO: renamed from: g */
    public int f45744g;

    /* JADX INFO: renamed from: h */
    public lij f45745h;

    public oek(HttpURLConnection httpURLConnection, String str, oej oejVar, oeh oehVar) {
        this.f45738a = httpURLConnection;
        try {
            httpURLConnection.setRequestMethod(str);
            httpURLConnection.setReadTimeout(300000);
            httpURLConnection.setConnectTimeout(300000);
            httpURLConnection.setDoInput(true);
            this.f45739b = oehVar;
            httpURLConnection.setDoOutput(true);
            if (oehVar.mo18410d() >= 0) {
                long jMo18410d = oehVar.mo18410d() - oehVar.mo18409c();
                if (jMo18410d < 2147483647L) {
                    httpURLConnection.setFixedLengthStreamingMode((int) jMo18410d);
                } else {
                    httpURLConnection.setFixedLengthStreamingMode(jMo18410d);
                }
            } else {
                httpURLConnection.setChunkedStreamingMode(0);
            }
            for (String str2 : oejVar.m18417c()) {
                Iterator it = oejVar.m18416b(str2).iterator();
                while (it.hasNext()) {
                    httpURLConnection.addRequestProperty(str2, (String) it.next());
                }
            }
            this.f45744g = 1;
            this.f45740c = new byte[65536];
        } catch (ProtocolException e) {
            throw new IllegalArgumentException("Invalid http method.", e);
        }
    }

    @Override // p000.oeo
    /* JADX INFO: renamed from: a */
    public final long mo18421a() {
        throw null;
    }

    @Override // p000.oeo
    /* JADX INFO: renamed from: b */
    public final String mo18422b() {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m18423c() {
        int i;
        while (true) {
            i = this.f45744g;
            if (i != 2) {
                break;
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
        }
        if (i == 3) {
            throw new oeq(oep.f45765b, "");
        }
        lku.m15657k(i == 1);
    }

    @Override // p000.oeo
    /* JADX INFO: renamed from: d */
    public final synchronized void mo18424d() {
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m18425e() throws oeq {
        try {
            return this.f45739b.mo18413g();
        } catch (IOException e) {
            throw new oeq(oep.f45766c, e);
        }
    }

    /* JADX INFO: renamed from: f */
    public final lqq m18426f() throws oeq {
        InputStream errorStream;
        oej oejVar;
        m18423c();
        try {
            int responseCode = this.f45738a.getResponseCode();
            try {
                errorStream = this.f45738a.getInputStream();
            } catch (IOException e) {
                errorStream = this.f45738a.getErrorStream();
            }
            Map<String, List<String>> headerFields = this.f45738a.getHeaderFields();
            if (headerFields != null) {
                oejVar = new oej();
                for (String str : headerFields.keySet()) {
                    if (str != null) {
                        Iterator<String> it = headerFields.get(str).iterator();
                        while (it.hasNext()) {
                            oejVar.m18418d(str, it.next());
                        }
                    }
                }
            } else {
                oejVar = null;
            }
            return new lqq(responseCode, oejVar, errorStream);
        } catch (IOException e2) {
            throw new oeq(oep.CONNECTION_ERROR, "Error while reading response code.", e2);
        }
    }

    @Override // p000.oeo
    /* JADX INFO: renamed from: g */
    public final synchronized void mo18427g(lij lijVar, int i, int i2) {
        this.f45745h = lijVar;
        if (i > 0) {
            this.f45742e = i;
        }
        this.f45743f = i2;
    }
}
