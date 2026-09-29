package p000;

import com.kochava.core.task.internal.TaskQueue;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class mb2 implements vd4 {

    /* JADX INFO: renamed from: h */
    public static final Object f50870h = new Object();

    /* JADX INFO: renamed from: a */
    public final String f50871a;

    /* JADX INFO: renamed from: c */
    public final sq5 f50873c;

    /* JADX INFO: renamed from: e */
    public C3309ls f50875e;

    /* JADX INFO: renamed from: d */
    public final long f50874d = System.currentTimeMillis();

    /* JADX INFO: renamed from: f */
    public boolean f50876f = false;

    /* JADX INFO: renamed from: g */
    public tr9 f50877g = null;

    /* JADX INFO: renamed from: b */
    public final List f50872b = Collections.EMPTY_LIST;

    public mb2(sq5 sq5Var, String str) {
        this.f50871a = str;
        this.f50873c = sq5Var;
    }

    @Override // p000.vd4
    /* JADX INFO: renamed from: b */
    public final void mo3636b(boolean z) {
        boolean z2;
        C3309ls c3309ls = this.f50875e;
        if (c3309ls == null) {
            ho2.m13385e("Dependency was not initialized");
            return;
        }
        C0022ak c0022akMo16748i = mo16748i((ce4) c3309ls.f50065c);
        synchronized (f50870h) {
            try {
                if (this.f50876f != c0022akMo16748i.f748a) {
                    sq5 sq5Var = this.f50873c;
                    StringBuilder sb = new StringBuilder("Updated to ");
                    sb.append(c0022akMo16748i.f748a ? "complete" : "pending");
                    sb.append(" at ");
                    C3309ls c3309ls2 = this.f50875e;
                    if (c3309ls2 == null) {
                        throw new RuntimeException("Dependency was not initialized");
                    }
                    sb.append(ci8.m4710W(((ce4) c3309ls2.f50065c).f9966a));
                    sb.append(" seconds since SDK start and ");
                    sb.append(ci8.m4710W(this.f50874d));
                    sb.append(" seconds since created");
                    sq5Var.m21555D(sb.toString());
                    this.f50876f = c0022akMo16748i.f748a;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c0022akMo16748i.f749b >= 0) {
                    this.f50873c.m21555D("Requested an update in " + (c0022akMo16748i.f749b / 1000.0d) + " seconds");
                    tr9 tr9Var = this.f50877g;
                    if (tr9Var != null) {
                        tr9Var.m22276a();
                    }
                    this.f50877g = null;
                    long j = c0022akMo16748i.f749b;
                    tr9 tr9VarM17697l = ((ny8) c3309ls.f50064b).m17697l(TaskQueue.Primary, new sq5(new C3487q7((yd4) c3309ls.f50066d, 10)));
                    tr9VarM17697l.m22280e(j);
                    this.f50877g = tr9VarM17697l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            mo16747h((ce4) c3309ls.f50065c, c0022akMo16748i.f748a);
        }
    }

    @Override // p000.vd4
    /* JADX INFO: renamed from: c */
    public final List mo3637c() {
        return this.f50872b;
    }

    @Override // p000.vd4
    /* JADX INFO: renamed from: e */
    public final boolean mo3639e() {
        boolean z;
        synchronized (f50870h) {
            z = this.f50876f;
        }
        return z;
    }

    /* JADX INFO: renamed from: f */
    public abstract qb2 mo16745f(ce4 ce4Var);

    /* JADX INFO: renamed from: g */
    public final void m16746g(C3309ls c3309ls) {
        synchronized (f50870h) {
            try {
                if (this.f50875e != null) {
                    return;
                }
                this.f50875e = c3309ls;
                qb2 qb2VarMo16745f = mo16745f((ce4) c3309ls.f50065c);
                this.f50876f = qb2VarMo16745f.f57531a;
                sq5 sq5Var = this.f50873c;
                StringBuilder sb = new StringBuilder("Initialized to a default of ");
                sb.append(qb2VarMo16745f.f57531a ? "complete" : "pending");
                sb.append(" at ");
                C3309ls c3309ls2 = this.f50875e;
                if (c3309ls2 == null) {
                    ho2.m13385e("Dependency was not initialized");
                    return;
                }
                sb.append(ci8.m4710W(((ce4) c3309ls2.f50065c).f9966a));
                sb.append(" seconds since SDK start and ");
                sb.append(ci8.m4710W(this.f50874d));
                sb.append(" seconds since created");
                sq5Var.m21555D(sb.toString());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.vd4
    public final String getId() {
        return this.f50871a;
    }

    /* JADX INFO: renamed from: h */
    public void mo16747h(ce4 ce4Var, boolean z) {
    }

    /* JADX INFO: renamed from: i */
    public abstract C0022ak mo16748i(ce4 ce4Var);
}
