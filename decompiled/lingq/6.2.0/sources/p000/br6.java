package p000;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class br6 implements ul0 {

    /* JADX INFO: renamed from: a */
    public final h78 f8889a;

    /* JADX INFO: renamed from: b */
    public final Object f8890b;

    /* JADX INFO: renamed from: c */
    public final Object[] f8891c;

    /* JADX INFO: renamed from: d */
    public final dr6 f8892d;

    /* JADX INFO: renamed from: e */
    public final fm1 f8893e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f8894f;

    /* JADX INFO: renamed from: g */
    public i18 f8895g;

    /* JADX INFO: renamed from: h */
    public Throwable f8896h;

    /* JADX INFO: renamed from: i */
    public boolean f8897i;

    public br6(h78 h78Var, Object obj, Object[] objArr, dr6 dr6Var, fm1 fm1Var) {
        this.f8889a = h78Var;
        this.f8890b = obj;
        this.f8891c = objArr;
        this.f8892d = dr6Var;
        this.f8893e = fm1Var;
    }

    @Override // p000.ul0
    /* JADX INFO: renamed from: J */
    public final boolean mo4146J() {
        boolean z = true;
        if (this.f8894f) {
            return true;
        }
        synchronized (this) {
            try {
                i18 i18Var = this.f8895g;
                if (i18Var == null || !i18Var.f43339K) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.ul0
    /* JADX INFO: renamed from: Z */
    public final synchronized co7 mo4147Z() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return ((i18) m4149b()).f43343b;
    }

    /* JADX INFO: renamed from: a */
    public final i18 m4148a() {
        dx3 dx3Var;
        ex3 ex3VarM10734a;
        h78 h78Var = this.f8889a;
        AbstractC3695vr[] abstractC3695vrArr = h78Var.f41896k;
        Object[] objArr = this.f8891c;
        int length = objArr.length;
        if (length != abstractC3695vrArr.length) {
            C3386nv.m17626m(wq1.m24123s(ux5.m22998u("Argument count (", length, ") doesn't match expected count ("), abstractC3695vrArr.length, ")"));
            return null;
        }
        b78 b78Var = new b78(h78Var.f41889d, h78Var.f41888c, h78Var.f41890e, h78Var.f41891f, h78Var.f41892g, h78Var.f41893h, h78Var.f41894i, h78Var.f41895j);
        if (h78Var.f41897l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            abstractC3695vrArr[i].mo16613f(b78Var, objArr[i]);
        }
        dx3 dx3Var2 = b78Var.f8053d;
        if (dx3Var2 != null) {
            ex3VarM10734a = dx3Var2.m10734a();
        } else {
            String str = b78Var.f8052c;
            ex3 ex3Var = b78Var.f8051b;
            ex3Var.getClass();
            str.getClass();
            try {
                dx3Var = new dx3();
                dx3Var.m10737d(ex3Var, str);
            } catch (IllegalArgumentException unused) {
                dx3Var = null;
            }
            ex3VarM10734a = dx3Var != null ? dx3Var.m10734a() : null;
            if (ex3VarM10734a == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(ex3Var);
                uk9.m22778m(sb, ", Relative: ", b78Var.f8052c);
                return null;
            }
        }
        z68 a78Var = b78Var.f8060k;
        if (a78Var == null) {
            bl2 bl2Var = b78Var.f8059j;
            if (bl2Var != null) {
                a78Var = new jc3((ArrayList) bl2Var.f8655a, (ArrayList) bl2Var.f8656b);
            } else {
                gv5 gv5Var = b78Var.f8058i;
                if (gv5Var != null) {
                    a78Var = gv5Var.m12914v();
                } else if (b78Var.f8057h) {
                    int i2 = z68.f70989a;
                    icb.m13765a(0L, 0L, 0L);
                    a78Var = new y68(null, 0, new byte[0]);
                }
            }
        }
        xv5 xv5Var = b78Var.f8056g;
        or3 or3Var = b78Var.f8055f;
        if (xv5Var != null) {
            if (a78Var != null) {
                a78Var = new a78(a78Var, xv5Var);
            } else {
                or3Var.m18305j("Content-Type", xv5Var.f68847a);
            }
        }
        w41 w41Var = b78Var.f8054e;
        w41Var.getClass();
        w41Var.f66365a = ex3VarM10734a;
        w41Var.f66367c = or3Var.m18309w().m20123g();
        w41Var.m23736y(b78Var.f8050a, a78Var);
        w41Var.f66369e = ((pk9) w41Var.f66369e).mo16144v(y38.m24933a(sa4.class), new sa4(h78Var.f41886a, this.f8890b, h78Var.f41887b, arrayList));
        co7 co7Var = new co7(w41Var);
        dr6 dr6Var = this.f8892d;
        dr6Var.getClass();
        return new i18(dr6Var, co7Var);
    }

    /* JADX INFO: renamed from: b */
    public final vl0 m4149b() throws IOException {
        i18 i18Var = this.f8895g;
        if (i18Var != null) {
            return i18Var;
        }
        Throwable th = this.f8896h;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            i18 i18VarM4148a = m4148a();
            this.f8895g = i18VarM4148a;
            return i18VarM4148a;
        } catch (IOException | Error | RuntimeException e) {
            ci8.m4709V(e);
            this.f8896h = e;
            throw e;
        }
    }

    /* JADX INFO: renamed from: c */
    public final i88 m4150c(j88 j88Var) throws IOException {
        m88 m88Var = j88Var.f45207g;
        h88 h88VarM14326b = j88Var.m14326b();
        h88VarM14326b.f41985g = new ar6(m88Var.mo3002c(), m88Var.mo3001b());
        j88 j88VarM13143a = h88VarM14326b.m13143a();
        int i = j88VarM13143a.f45204d;
        if (i < 200 || i >= 300) {
            try {
                aj0 aj0Var = new aj0();
                m88Var.mo3003e().mo458E(aj0Var);
                return i88.m13719b(new l88(m88Var.mo3002c(), m88Var.mo3001b(), aj0Var), j88VarM13143a);
            } finally {
                m88Var.close();
            }
        }
        if (i == 204 || i == 205) {
            m88Var.close();
            return i88.m13721d(null, j88VarM13143a);
        }
        zq6 zq6Var = new zq6(m88Var);
        try {
            return i88.m13721d(this.f8893e.convert(zq6Var), j88VarM13143a);
        } catch (RuntimeException e) {
            IOException iOException = zq6Var.f71975e;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    @Override // p000.ul0
    public final void cancel() {
        i18 i18Var;
        this.f8894f = true;
        synchronized (this) {
            i18Var = this.f8895g;
        }
        if (i18Var != null) {
            i18Var.cancel();
        }
    }

    @Override // p000.ul0
    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final ul0 mo25919clone() {
        return new br6(this.f8889a, this.f8890b, this.f8891c, this.f8892d, this.f8893e);
    }

    @Override // p000.ul0
    /* JADX INFO: renamed from: n */
    public final i88 mo4151n() {
        vl0 vl0VarM4149b;
        synchronized (this) {
            if (this.f8897i) {
                throw new IllegalStateException("Already executed.");
            }
            this.f8897i = true;
            vl0VarM4149b = m4149b();
        }
        if (this.f8894f) {
            ((i18) vl0VarM4149b).cancel();
        }
        return m4150c(FirebasePerfOkHttpClient.execute(vl0VarM4149b));
    }

    @Override // p000.ul0
    /* JADX INFO: renamed from: r */
    public final void mo4152r(am0 am0Var) {
        i18 i18Var;
        Throwable th;
        synchronized (this) {
            try {
                if (this.f8897i) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f8897i = true;
                i18Var = this.f8895g;
                th = this.f8896h;
                if (i18Var == null && th == null) {
                    try {
                        i18 i18VarM4148a = m4148a();
                        this.f8895g = i18VarM4148a;
                        i18Var = i18VarM4148a;
                    } catch (Throwable th2) {
                        th = th2;
                        ci8.m4709V(th);
                        this.f8896h = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            am0Var.mo554p(this, th);
            return;
        }
        if (this.f8894f) {
            i18Var.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(i18Var, new bl2(this, am0Var, false));
    }

    public final Object clone() {
        return new br6(this.f8889a, this.f8890b, this.f8891c, this.f8892d, this.f8893e);
    }
}
