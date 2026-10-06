package p000;

import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bvc implements bqn {

    /* JADX INFO: renamed from: b */
    public final bvd f4519b;

    /* JADX INFO: renamed from: c */
    public final URL f4520c;

    /* JADX INFO: renamed from: d */
    public final String f4521d;

    /* JADX INFO: renamed from: e */
    public String f4522e;

    /* JADX INFO: renamed from: f */
    public URL f4523f;

    /* JADX INFO: renamed from: g */
    private volatile byte[] f4524g;

    /* JADX INFO: renamed from: h */
    private int f4525h;

    public bvc(String str) {
        bvd bvdVar = bvd.f4526a;
        this.f4520c = null;
        bzq.m3275o(str);
        this.f4521d = str;
        bzq.m3278r(bvdVar);
        this.f4519b = bvdVar;
    }

    @Override // p000.bqn
    /* JADX INFO: renamed from: a */
    public final void mo2922a(MessageDigest messageDigest) {
        if (this.f4524g == null) {
            this.f4524g = m3094b().getBytes(f4192a);
        }
        messageDigest.update(this.f4524g);
    }

    /* JADX INFO: renamed from: b */
    public final String m3094b() {
        String str = this.f4521d;
        if (str != null) {
            return str;
        }
        URL url = this.f4520c;
        bzq.m3278r(url);
        return url.toString();
    }

    @Override // p000.bqn
    public final boolean equals(Object obj) {
        if (obj instanceof bvc) {
            bvc bvcVar = (bvc) obj;
            if (m3094b().equals(bvcVar.m3094b()) && this.f4519b.equals(bvcVar.f4519b)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.bqn
    public final int hashCode() {
        int i = this.f4525h;
        if (i != 0) {
            return i;
        }
        int iHashCode = m3094b().hashCode();
        this.f4525h = iHashCode;
        int iHashCode2 = (iHashCode * 31) + this.f4519b.hashCode();
        this.f4525h = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        return m3094b();
    }

    public bvc(URL url) {
        bvd bvdVar = bvd.f4526a;
        bzq.m3278r(url);
        this.f4520c = url;
        this.f4521d = null;
        bzq.m3278r(bvdVar);
        this.f4519b = bvdVar;
    }
}
