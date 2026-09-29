package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q90 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f57432a = new ArrayList(1);

    /* JADX INFO: renamed from: b */
    public final HashSet f57433b = new HashSet(1);

    /* JADX INFO: renamed from: c */
    public final fm2 f57434c;

    /* JADX INFO: renamed from: d */
    public final fm2 f57435d;

    /* JADX INFO: renamed from: e */
    public Looper f57436e;

    /* JADX INFO: renamed from: f */
    public z0a f57437f;

    /* JADX INFO: renamed from: g */
    public xb7 f57438g;

    public q90() {
        int i = 0;
        jv5 jv5Var = null;
        this.f57434c = new fm2(new CopyOnWriteArrayList(), i, jv5Var);
        this.f57435d = new fm2(new CopyOnWriteArrayList(), i, jv5Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m19797a(Handler handler, gm2 gm2Var) {
        handler.getClass();
        fm2 fm2Var = this.f57435d;
        fm2Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = fm2Var.f39279c;
        em2 em2Var = new em2();
        em2Var.f37454a = gm2Var;
        copyOnWriteArrayList.add(em2Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m19798b(Handler handler, ov5 ov5Var) {
        handler.getClass();
        fm2 fm2Var = this.f57434c;
        fm2Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = fm2Var.f39279c;
        nv5 nv5Var = new nv5();
        nv5Var.f53288a = handler;
        nv5Var.f53289b = ov5Var;
        copyOnWriteArrayList.add(nv5Var);
    }

    /* JADX INFO: renamed from: c */
    public abstract xu5 mo16936c(jv5 jv5Var, gv5 gv5Var, long j);

    /* JADX INFO: renamed from: d */
    public final void m19799d(ef1 ef1Var) {
        HashSet hashSet = this.f57433b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(ef1Var);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        mo17291e();
    }

    /* JADX INFO: renamed from: e */
    public void mo17291e() {
    }

    /* JADX INFO: renamed from: f */
    public final void m19800f(ef1 ef1Var) {
        this.f57436e.getClass();
        HashSet hashSet = this.f57433b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(ef1Var);
        if (zIsEmpty) {
            mo17292g();
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo17292g() {
    }

    /* JADX INFO: renamed from: h */
    public z0a mo17293h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public abstract pu5 mo16937i();

    /* JADX INFO: renamed from: j */
    public boolean mo17294j() {
        return true;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo16938k();

    /* JADX INFO: renamed from: l */
    public final void m19801l(ef1 ef1Var, u52 u52Var, xb7 xb7Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f57436e;
        bna.m3969q(looper == null || looper == looperMyLooper);
        this.f57438g = xb7Var;
        z0a z0aVar = this.f57437f;
        this.f57432a.add(ef1Var);
        if (this.f57436e == null) {
            this.f57436e = looperMyLooper;
            this.f57433b.add(ef1Var);
            mo16939m(u52Var);
        } else if (z0aVar != null) {
            m19800f(ef1Var);
            ef1Var.m11087a(z0aVar);
        }
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo16939m(u52 u52Var);

    /* JADX INFO: renamed from: n */
    public final void m19802n(z0a z0aVar) {
        this.f57437f = z0aVar;
        Iterator it = this.f57432a.iterator();
        while (it.hasNext()) {
            ((ef1) it.next()).m11087a(z0aVar);
        }
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo16940o(xu5 xu5Var);

    /* JADX INFO: renamed from: p */
    public final void m19803p(ef1 ef1Var) {
        ArrayList arrayList = this.f57432a;
        arrayList.remove(ef1Var);
        if (!arrayList.isEmpty()) {
            m19799d(ef1Var);
            return;
        }
        this.f57436e = null;
        this.f57437f = null;
        this.f57438g = null;
        this.f57433b.clear();
        mo16941q();
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo16941q();

    /* JADX INFO: renamed from: r */
    public final void m19804r(gm2 gm2Var) {
        CopyOnWriteArrayList<em2> copyOnWriteArrayList = this.f57435d.f39279c;
        for (em2 em2Var : copyOnWriteArrayList) {
            if (em2Var.f37454a == gm2Var) {
                copyOnWriteArrayList.remove(em2Var);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m19805s(ov5 ov5Var) {
        CopyOnWriteArrayList<nv5> copyOnWriteArrayList = this.f57434c.f39279c;
        for (nv5 nv5Var : copyOnWriteArrayList) {
            if (nv5Var.f53289b == ov5Var) {
                copyOnWriteArrayList.remove(nv5Var);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public abstract void mo16942t(pu5 pu5Var);
}
