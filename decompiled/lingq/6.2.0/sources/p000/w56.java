package p000;

import android.os.Looper;
import androidx.lifecycle.Lifecycle$State;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class w56 {

    /* JADX INFO: renamed from: k */
    public static final Object f66416k = new Object();

    /* JADX INFO: renamed from: a */
    public final Object f66417a;

    /* JADX INFO: renamed from: b */
    public final pk8 f66418b;

    /* JADX INFO: renamed from: c */
    public int f66419c;

    /* JADX INFO: renamed from: d */
    public boolean f66420d;

    /* JADX INFO: renamed from: e */
    public volatile Object f66421e;

    /* JADX INFO: renamed from: f */
    public volatile Object f66422f;

    /* JADX INFO: renamed from: g */
    public int f66423g;

    /* JADX INFO: renamed from: h */
    public boolean f66424h;

    /* JADX INFO: renamed from: i */
    public boolean f66425i;

    /* JADX INFO: renamed from: j */
    public final RunnableC3795yg f66426j;

    public w56(int i) {
        az6 az6Var = web.f66741d;
        this.f66417a = new Object();
        this.f66418b = new pk8();
        this.f66419c = 0;
        this.f66422f = f66416k;
        this.f66426j = new RunnableC3795yg(this, 7);
        this.f66421e = az6Var;
        this.f66423g = 0;
    }

    /* JADX INFO: renamed from: a */
    public static void m23760a(String str) {
        C3051gu.m12863O().f41318s.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        C3386nv.m17633t(wq1.m24118n("Cannot invoke ", str, " on a background thread"));
    }

    /* JADX INFO: renamed from: b */
    public final void m23761b(bh5 bh5Var) {
        if (bh5Var.f8539b) {
            if (!bh5Var.mo402g()) {
                bh5Var.m3717a(false);
                return;
            }
            int i = bh5Var.f8540c;
            int i2 = this.f66423g;
            if (i >= i2) {
                return;
            }
            bh5Var.f8540c = i2;
            bh5Var.f8538a.mo14457a(this.f66421e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m23762c(bh5 bh5Var) {
        if (this.f66424h) {
            this.f66425i = true;
            return;
        }
        this.f66424h = true;
        do {
            this.f66425i = false;
            if (bh5Var != null) {
                m23761b(bh5Var);
                bh5Var = null;
            } else {
                pk8 pk8Var = this.f66418b;
                pk8Var.getClass();
                nk8 nk8Var = new nk8(pk8Var);
                pk8Var.f56354c.put(nk8Var, Boolean.FALSE);
                while (nk8Var.hasNext()) {
                    m23761b((bh5) ((Map.Entry) nk8Var.next()).getValue());
                    if (this.f66425i) {
                        break;
                    }
                }
            }
        } while (this.f66425i);
        this.f66424h = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m23763d(ub5 ub5Var, op6 op6Var) {
        Object obj;
        m23760a("observe");
        if (ub5Var.mo256K().mo21327q() == Lifecycle$State.DESTROYED) {
            return;
        }
        ah5 ah5Var = new ah5(this, ub5Var, op6Var);
        pk8 pk8Var = this.f66418b;
        mk8 mk8VarMo19364d = pk8Var.mo19364d(op6Var);
        if (mk8VarMo19364d != null) {
            obj = mk8VarMo19364d.f51442b;
        } else {
            mk8 mk8Var = new mk8(op6Var, ah5Var);
            pk8Var.f56355d++;
            mk8 mk8Var2 = pk8Var.f56353b;
            if (mk8Var2 == null) {
                pk8Var.f56352a = mk8Var;
                pk8Var.f56353b = mk8Var;
            } else {
                mk8Var2.f51443c = mk8Var;
                mk8Var.f51444d = mk8Var2;
                pk8Var.f56353b = mk8Var;
            }
            obj = null;
        }
        bh5 bh5Var = (bh5) obj;
        if (bh5Var != null && !bh5Var.mo401f(ub5Var)) {
            C3386nv.m17626m("Cannot add the same observer with different lifecycles");
        } else {
            if (bh5Var != null) {
                return;
            }
            ub5Var.mo256K().mo21323g(ah5Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo13908e() {
    }

    /* JADX INFO: renamed from: f */
    public void mo13909f() {
    }

    /* JADX INFO: renamed from: g */
    public final void m23764g(Object obj) {
        boolean z;
        synchronized (this.f66417a) {
            z = this.f66422f == f66416k;
            this.f66422f = obj;
        }
        if (z) {
            C3051gu c3051guM12863O = C3051gu.m12863O();
            RunnableC3795yg runnableC3795yg = this.f66426j;
            s82 s82Var = c3051guM12863O.f41318s;
            if (s82Var.f60506u == null) {
                synchronized (s82Var.f60504s) {
                    try {
                        if (s82Var.f60506u == null) {
                            s82Var.f60506u = vad.m23215b(Looper.getMainLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            s82Var.f60506u.post(runnableC3795yg);
        }
    }

    /* JADX INFO: renamed from: h */
    public void mo13910h(op6 op6Var) {
        m23760a("removeObserver");
        bh5 bh5Var = (bh5) this.f66418b.mo19365f(op6Var);
        if (bh5Var == null) {
            return;
        }
        bh5Var.mo400d();
        bh5Var.m3717a(false);
    }

    /* JADX INFO: renamed from: i */
    public void m23765i(Object obj) {
        m23760a("setValue");
        this.f66423g++;
        this.f66421e = obj;
        m23762c(null);
    }

    public w56() {
        this.f66417a = new Object();
        this.f66418b = new pk8();
        this.f66419c = 0;
        Object obj = f66416k;
        this.f66422f = obj;
        this.f66426j = new RunnableC3795yg(this, 7);
        this.f66421e = obj;
        this.f66423g = -1;
    }
}
