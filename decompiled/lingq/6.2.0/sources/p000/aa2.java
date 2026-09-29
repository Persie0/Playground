package p000;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class aa2 implements jd9 {

    /* JADX INFO: renamed from: a */
    public final z92 f415a;

    /* JADX INFO: renamed from: b */
    public jd9 f416b;

    public aa2(z92 z92Var) {
        this.f415a = z92Var;
    }

    @Override // p000.jd9
    /* JADX INFO: renamed from: a */
    public final boolean mo206a(SSLSocket sSLSocket) {
        return this.f415a.mo10374a(sSLSocket);
    }

    @Override // p000.jd9
    /* JADX INFO: renamed from: b */
    public final boolean mo207b() {
        return true;
    }

    @Override // p000.jd9
    /* JADX INFO: renamed from: c */
    public final String mo208c(SSLSocket sSLSocket) {
        jd9 jd9VarM210e = m210e(sSLSocket);
        if (jd9VarM210e != null) {
            return jd9VarM210e.mo208c(sSLSocket);
        }
        return null;
    }

    @Override // p000.jd9
    /* JADX INFO: renamed from: d */
    public final void mo209d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        jd9 jd9VarM210e = m210e(sSLSocket);
        if (jd9VarM210e != null) {
            jd9VarM210e.mo209d(sSLSocket, str, list);
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized jd9 m210e(SSLSocket sSLSocket) {
        try {
            if (this.f416b == null && this.f415a.mo10374a(sSLSocket)) {
                this.f416b = this.f415a.mo10375i(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f416b;
    }
}
