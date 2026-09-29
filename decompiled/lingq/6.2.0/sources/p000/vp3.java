package p000;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import androidx.work.WorkInfo$State;
import androidx.work.impl.constraints.AbstractC0776b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vp3 implements sm8, vr6, vu2 {

    /* JADX INFO: renamed from: J */
    public static final String f65744J = oj5.m18041h("GreedyScheduler");

    /* JADX INFO: renamed from: H */
    public final e8b f65745H;

    /* JADX INFO: renamed from: I */
    public final ny8 f65746I;

    /* JADX INFO: renamed from: a */
    public final Context f65747a;

    /* JADX INFO: renamed from: c */
    public final da2 f65749c;

    /* JADX INFO: renamed from: d */
    public boolean f65750d;

    /* JADX INFO: renamed from: g */
    public final il7 f65753g;

    /* JADX INFO: renamed from: h */
    public final qfa f65754h;

    /* JADX INFO: renamed from: i */
    public final hh1 f65755i;

    /* JADX INFO: renamed from: k */
    public Boolean f65757k;

    /* JADX INFO: renamed from: l */
    public final f57 f65758l;

    /* JADX INFO: renamed from: b */
    public final HashMap f65748b = new HashMap();

    /* JADX INFO: renamed from: e */
    public final Object f65751e = new Object();

    /* JADX INFO: renamed from: f */
    public final fs6 f65752f = new fs6(new d54(2));

    /* JADX INFO: renamed from: j */
    public final HashMap f65756j = new HashMap();

    public vp3(Context context, hh1 hh1Var, w8a w8aVar, il7 il7Var, qfa qfaVar, e8b e8bVar) {
        this.f65747a = context;
        qn3 qn3Var = hh1Var.f42353g;
        this.f65749c = new da2(this, qn3Var, hh1Var.f42350d);
        this.f65746I = new ny8(qn3Var, qfaVar);
        this.f65745H = e8bVar;
        this.f65758l = new f57(w8aVar);
        this.f65755i = hh1Var;
        this.f65753g = il7Var;
        this.f65754h = qfaVar;
    }

    @Override // p000.vr6
    /* JADX INFO: renamed from: a */
    public final void mo18198a(p8b p8bVar, hk1 hk1Var) {
        a8b a8bVarM270b = acd.m270b(p8bVar);
        boolean z = hk1Var instanceof fk1;
        qfa qfaVar = this.f65754h;
        ny8 ny8Var = this.f65746I;
        String str = f65744J;
        fs6 fs6Var = this.f65752f;
        if (z) {
            if (fs6Var.m12110o(a8bVarM270b)) {
                return;
            }
            oj5.m18040f().m18042a(str, "Constraints met: Scheduling work ID " + a8bVarM270b);
            zg9 zg9VarM12098M = fs6Var.m12098M(a8bVarM270b);
            ny8Var.m17687O(zg9VarM12098M);
            qfaVar.getClass();
            qfaVar.m19912l(zg9VarM12098M, null);
            return;
        }
        oj5.m18040f().m18042a(str, "Constraints not met: Cancelling work ID " + a8bVarM270b);
        zg9 zg9VarM12095J = fs6Var.m12095J(a8bVarM270b);
        if (zg9VarM12095J != null) {
            ny8Var.m17698m(zg9VarM12095J);
            int iM12718a = ((gk1) hk1Var).m12718a();
            qfaVar.getClass();
            qfaVar.m19913m(zg9VarM12095J, iM12718a);
        }
    }

    @Override // p000.vu2
    /* JADX INFO: renamed from: b */
    public final void mo2918b(a8b a8bVar, boolean z) {
        cd4 cd4Var;
        zg9 zg9VarM12095J = this.f65752f.m12095J(a8bVar);
        if (zg9VarM12095J != null) {
            this.f65746I.m17698m(zg9VarM12095J);
        }
        synchronized (this.f65751e) {
            cd4Var = (cd4) this.f65748b.remove(a8bVar);
        }
        if (cd4Var != null) {
            oj5.m18040f().m18042a(f65744J, "Stopping tracking for " + a8bVar);
            cd4Var.mo4537a(null);
        }
        if (z) {
            return;
        }
        synchronized (this.f65751e) {
            this.f65756j.remove(a8bVar);
        }
    }

    @Override // p000.sm8
    /* JADX INFO: renamed from: c */
    public final boolean mo21480c() {
        return false;
    }

    @Override // p000.sm8
    /* JADX INFO: renamed from: d */
    public final void mo21481d(String str) {
        List<zg9> listM10101d;
        Runnable runnable;
        String str2 = f65744J;
        if (this.f65757k == null) {
            this.f65757k = Boolean.valueOf(gl7.m12735a(this.f65747a, this.f65755i));
        }
        if (!this.f65757k.booleanValue()) {
            oj5.m18040f().m18045g(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f65750d) {
            this.f65753g.m14012a(this);
            this.f65750d = true;
        }
        oj5.m18040f().m18042a(str2, "Cancelling work ID " + str);
        da2 da2Var = this.f65749c;
        if (da2Var != null && (runnable = (Runnable) da2Var.f35288d.remove(str)) != null) {
            ((Handler) da2Var.f35286b.f57974a).removeCallbacks(runnable);
        }
        fs6 fs6Var = this.f65752f;
        fs6Var.getClass();
        str.getClass();
        synchronized (fs6Var.f39591c) {
            listM10101d = ((d54) fs6Var.f39590b).m10101d(str);
        }
        for (zg9 zg9Var : listM10101d) {
            this.f65746I.m17698m(zg9Var);
            qfa qfaVar = this.f65754h;
            qfaVar.getClass();
            qfaVar.m19913m(zg9Var, -512);
        }
    }

    @Override // p000.sm8
    /* JADX INFO: renamed from: e */
    public final void mo21482e(p8b... p8bVarArr) {
        long jMax;
        if (this.f65757k == null) {
            this.f65757k = Boolean.valueOf(gl7.m12735a(this.f65747a, this.f65755i));
        }
        if (!this.f65757k.booleanValue()) {
            oj5.m18040f().m18045g(f65744J, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f65750d) {
            this.f65753g.m14012a(this);
            this.f65750d = true;
        }
        HashSet<p8b> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p8b p8bVar : p8bVarArr) {
            if (!this.f65752f.m12110o(acd.m270b(p8bVar))) {
                synchronized (this.f65751e) {
                    try {
                        a8b a8bVarM270b = acd.m270b(p8bVar);
                        up3 up3Var = (up3) this.f65756j.get(a8bVarM270b);
                        if (up3Var == null) {
                            int i = p8bVar.f55782k;
                            this.f65755i.f42350d.getClass();
                            up3Var = new up3(i, System.currentTimeMillis());
                            this.f65756j.put(a8bVarM270b, up3Var);
                        }
                        jMax = (((long) Math.max((p8bVar.f55782k - up3Var.f64168a) - 5, 0)) * 30000) + up3Var.f64169b;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                long jMax2 = Math.max(p8bVar.m18979a(), jMax);
                this.f65755i.f42350d.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (p8bVar.f55773b == WorkInfo$State.ENQUEUED) {
                    if (jCurrentTimeMillis < jMax2) {
                        da2 da2Var = this.f65749c;
                        if (da2Var != null) {
                            qn3 qn3Var = da2Var.f35286b;
                            HashMap map = da2Var.f35288d;
                            Runnable runnable = (Runnable) map.remove(p8bVar.f55772a);
                            if (runnable != null) {
                                ((Handler) qn3Var.f57974a).removeCallbacks(runnable);
                            }
                            gvb gvbVar = new gvb(da2Var, p8bVar, false, 3);
                            map.put(p8bVar.f55772a, gvbVar);
                            da2Var.f35287c.getClass();
                            ((Handler) qn3Var.f57974a).postDelayed(gvbVar, jMax2 - System.currentTimeMillis());
                        }
                    } else if (p8bVar.m18987j()) {
                        ak1 ak1Var = p8bVar.f55781j;
                        if (ak1Var.m522j()) {
                            oj5.m18040f().m18042a(f65744J, "Ignoring " + p8bVar + ". Requires device idle.");
                        } else if (ak1Var.m519g()) {
                            oj5.m18040f().m18042a(f65744J, "Ignoring " + p8bVar + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(p8bVar);
                            hashSet2.add(p8bVar.f55772a);
                        }
                    } else if (!this.f65752f.m12110o(acd.m270b(p8bVar))) {
                        oj5.m18040f().m18042a(f65744J, "Starting work for " + p8bVar.f55772a);
                        fs6 fs6Var = this.f65752f;
                        fs6Var.getClass();
                        zg9 zg9VarM12098M = fs6Var.m12098M(acd.m270b(p8bVar));
                        this.f65746I.m17687O(zg9VarM12098M);
                        qfa qfaVar = this.f65754h;
                        qfaVar.getClass();
                        qfaVar.m19912l(zg9VarM12098M, null);
                    }
                }
            }
        }
        synchronized (this.f65751e) {
            try {
                if (!hashSet.isEmpty()) {
                    oj5.m18040f().m18042a(f65744J, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (p8b p8bVar2 : hashSet) {
                        a8b a8bVarM270b2 = acd.m270b(p8bVar2);
                        if (!this.f65748b.containsKey(a8bVarM270b2)) {
                            this.f65748b.put(a8bVarM270b2, AbstractC0776b.m2922a(this.f65758l, p8bVar2, this.f65745H.f36848b, this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
