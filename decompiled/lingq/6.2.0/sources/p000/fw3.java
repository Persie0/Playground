package p000;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes.dex */
public final class fw3 implements ru2 {

    /* JADX INFO: renamed from: f */
    public static final qr3 f39779f;

    /* JADX INFO: renamed from: a */
    public final dr6 f39780a;

    /* JADX INFO: renamed from: b */
    public final qu2 f39781b;

    /* JADX INFO: renamed from: c */
    public final C3309ls f39782c;

    /* JADX INFO: renamed from: d */
    public int f39783d;

    /* JADX INFO: renamed from: e */
    public final rr3 f39784e;

    static {
        qr3 qr3Var = qr3.f58109b;
        f39779f = pb1.m19024L("OkHttp-Response-Body", "Truncated");
    }

    public fw3(dr6 dr6Var, qu2 qu2Var, C3309ls c3309ls) {
        c3309ls.getClass();
        this.f39780a = dr6Var;
        this.f39781b = qu2Var;
        this.f39782c = c3309ls;
        this.f39784e = new rr3((e18) c3309ls.f50065c);
    }

    /* JADX INFO: renamed from: k */
    public static final void m12220k(fw3 fw3Var, yc3 yc3Var) {
        c1a c1aVarM25067h = yc3Var.m25067h();
        yc3Var.m25068i();
        c1aVarM25067h.mo4281a();
        c1aVarM25067h.mo4282b();
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: a */
    public final yd9 mo12221a(j88 j88Var) {
        co7 co7Var = j88Var.f45201a;
        if (!xw3.m24724a(j88Var)) {
            return m12231l((ex3) co7Var.f10360c, 0L);
        }
        String strM20121d = j88Var.f45206f.m20121d("Transfer-Encoding");
        if (strM20121d == null) {
            strM20121d = null;
        }
        if ("chunked".equalsIgnoreCase(strM20121d)) {
            ex3 ex3Var = (ex3) co7Var.f10360c;
            if (this.f39783d == 4) {
                this.f39783d = 5;
                return new bw3(this, ex3Var);
            }
            ij6.m13960r(this.f39783d, "state: ");
            return null;
        }
        long jM15114e = kcb.m15114e(j88Var);
        if (jM15114e != -1) {
            return m12231l((ex3) co7Var.f10360c, jM15114e);
        }
        ex3 ex3Var2 = (ex3) co7Var.f10360c;
        if (this.f39783d != 4) {
            ij6.m13960r(this.f39783d, "state: ");
            return null;
        }
        this.f39783d = 5;
        this.f39781b.mo11847e();
        return new ew3(this, ex3Var2);
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: b */
    public final void mo12222b() {
        ((d18) this.f39782c.f50066d).flush();
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: c */
    public final boolean mo12223c() {
        return this.f39783d == 6;
    }

    @Override // p000.ru2
    public final void cancel() {
        this.f39781b.cancel();
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: d */
    public final long mo12224d(j88 j88Var) {
        if (!xw3.m24724a(j88Var)) {
            return 0L;
        }
        String strM20121d = j88Var.f45206f.m20121d("Transfer-Encoding");
        if (strM20121d == null) {
            strM20121d = null;
        }
        if ("chunked".equalsIgnoreCase(strM20121d)) {
            return -1L;
        }
        return kcb.m15114e(j88Var);
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: e */
    public final h88 mo12225e(boolean z) {
        rr3 rr3Var = this.f39784e;
        int i = this.f39783d;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            ij6.m13960r(this.f39783d, "state: ");
            return null;
        }
        try {
            C3047gq c3047gqM19796z = AbstractC3489q9.m19796z(rr3Var.m20759s());
            int i2 = c3047gqM19796z.f41171b;
            h88 h88Var = new h88();
            Protocol protocol = (Protocol) c3047gqM19796z.f41172c;
            protocol.getClass();
            h88Var.f41980b = protocol;
            h88Var.f41981c = i2;
            h88Var.f41982d = (String) c3047gqM19796z.f41173d;
            h88Var.f41984f = rr3Var.m20758r().m20123g();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f39783d = 3;
                return h88Var;
            }
            if (102 > i2 || i2 >= 200) {
                this.f39783d = 4;
                return h88Var;
            }
            this.f39783d = 3;
            return h88Var;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.f39781b.mo11850h().f44192a.f43720h.m11382h()), e);
        }
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: f */
    public final void mo12226f() {
        ((d18) this.f39782c.f50066d).flush();
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: g */
    public final id9 mo12227g() {
        return this.f39782c;
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: h */
    public final qu2 mo12228h() {
        return this.f39781b;
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: i */
    public final t89 mo12229i(co7 co7Var, long j) {
        co7Var.getClass();
        if ("chunked".equalsIgnoreCase(((qr3) co7Var.f10361d).m20121d("Transfer-Encoding"))) {
            if (this.f39783d == 1) {
                this.f39783d = 2;
                return new aw3(this);
            }
            ij6.m13960r(this.f39783d, "state: ");
            return null;
        }
        if (j == -1) {
            C3386nv.m17633t("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.f39783d == 1) {
            this.f39783d = 2;
            return new dw3(this);
        }
        ij6.m13960r(this.f39783d, "state: ");
        return null;
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: j */
    public final void mo12230j(co7 co7Var) {
        co7Var.getClass();
        Proxy.Type type = this.f39781b.mo11850h().f44193b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((String) co7Var.f10359b);
        sb.append(' ');
        ex3 ex3Var = (ex3) co7Var.f10360c;
        if (ex3Var.m11380f() || type != Proxy.Type.HTTP) {
            String strM11376b = ex3Var.m11376b();
            String strM11378d = ex3Var.m11378d();
            if (strM11378d != null) {
                strM11376b = strM11376b + '?' + strM11378d;
            }
            sb.append(strM11376b);
        } else {
            sb.append(ex3Var);
        }
        sb.append(" HTTP/1.1");
        m12232m((qr3) co7Var.f10361d, sb.toString());
    }

    /* JADX INFO: renamed from: l */
    public final cw3 m12231l(ex3 ex3Var, long j) {
        if (this.f39783d == 4) {
            this.f39783d = 5;
            return new cw3(this, ex3Var, j);
        }
        ij6.m13960r(this.f39783d, "state: ");
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final void m12232m(qr3 qr3Var, String str) {
        qr3Var.getClass();
        if (this.f39783d != 0) {
            ij6.m13960r(this.f39783d, "state: ");
            return;
        }
        C3309ls c3309ls = this.f39782c;
        d18 d18Var = (d18) c3309ls.f50066d;
        d18Var.mo461H(str);
        d18Var.mo461H("\r\n");
        int size = qr3Var.size();
        int i = 0;
        while (true) {
            d18 d18Var2 = (d18) c3309ls.f50066d;
            if (i >= size) {
                d18Var2.mo461H("\r\n");
                this.f39783d = 1;
                return;
            } else {
                d18Var2.mo461H(qr3Var.m20122f(i));
                d18Var2.mo461H(": ");
                d18Var2.mo461H(qr3Var.m20124h(i));
                d18Var2.mo461H("\r\n");
                i++;
            }
        }
    }
}
