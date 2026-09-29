package p000;

import java.util.HashMap;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class r72 {

    /* JADX INFO: renamed from: h */
    public static final p72 f58822h = new p72(0);

    /* JADX INFO: renamed from: i */
    public static final Random f58823i = new Random();

    /* JADX INFO: renamed from: d */
    public vu5 f58827d;

    /* JADX INFO: renamed from: f */
    public String f58829f;

    /* JADX INFO: renamed from: a */
    public final y0a f58824a = new y0a();

    /* JADX INFO: renamed from: b */
    public final x0a f58825b = new x0a();

    /* JADX INFO: renamed from: c */
    public final HashMap f58826c = new HashMap();

    /* JADX INFO: renamed from: e */
    public z0a f58828e = z0a.f70734a;

    /* JADX INFO: renamed from: g */
    public long f58830g = -1;

    /* JADX INFO: renamed from: a */
    public final void m20424a(q72 q72Var) {
        if (q72Var.f57338c != -1 && q72Var.f57340e) {
            this.f58830g = q72Var.f57338c;
        }
        this.f58829f = null;
    }

    /* JADX INFO: renamed from: b */
    public final long m20425b() {
        q72 q72Var = (q72) this.f58826c.get(this.f58829f);
        return (q72Var == null || q72Var.f57338c == -1) ? this.f58830g + 1 : q72Var.f57338c;
    }

    /* JADX INFO: renamed from: c */
    public final q72 m20426c(int i, jv5 jv5Var) {
        HashMap map = this.f58826c;
        q72 q72Var = null;
        long j = Long.MAX_VALUE;
        for (q72 q72Var2 : map.values()) {
            q72Var2.m19700k(i, jv5Var);
            if (q72Var2.m19698i(i, jv5Var)) {
                long j2 = q72Var2.f57338c;
                if (j2 == -1 || j2 < j) {
                    q72Var = q72Var2;
                    j = j2;
                } else if (j2 == j) {
                    String str = uma.f64080a;
                    if (q72Var.f57339d != null && q72Var2.f57339d != null) {
                        q72Var = q72Var2;
                    }
                }
            }
        }
        if (q72Var != null) {
            return q72Var;
        }
        String str2 = (String) f58822h.get();
        q72 q72Var3 = new q72(this, str2, i, jv5Var);
        map.put(str2, q72Var3);
        return q72Var3;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized String m20427d(z0a z0aVar, jv5 jv5Var) {
        return m20426c(z0aVar.mo23250g(jv5Var.f46226a, this.f58825b).f67601c, jv5Var).f57336a;
    }

    /* JADX INFO: renamed from: e */
    public final void m20428e(C3496qf c3496qf) {
        z0a z0aVar = c3496qf.f57667b;
        int i = c3496qf.f57668c;
        jv5 jv5Var = c3496qf.f57669d;
        boolean zM25398p = z0aVar.m25398p();
        String str = this.f58829f;
        HashMap map = this.f58826c;
        if (zM25398p) {
            if (str != null) {
                q72 q72Var = (q72) map.get(str);
                q72Var.getClass();
                m20424a(q72Var);
                return;
            }
            return;
        }
        q72 q72Var2 = (q72) map.get(str);
        this.f58829f = m20426c(i, jv5Var).f57336a;
        m20429f(c3496qf);
        if (jv5Var != null) {
            long j = jv5Var.f46229d;
            if (jv5Var.m14690b()) {
                if (q72Var2 != null && q72Var2.f57338c == j && q72Var2.f57339d != null && q72Var2.f57339d.f46227b == jv5Var.f46227b && q72Var2.f57339d.f46228c == jv5Var.f46228c) {
                    return;
                }
                m20426c(i, new jv5(jv5Var.f46226a, j));
                this.f58827d.getClass();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m20429f(C3496qf c3496qf) {
        this.f58827d.getClass();
        if (c3496qf.f57667b.m25398p()) {
            return;
        }
        jv5 jv5Var = c3496qf.f57669d;
        if (jv5Var != null) {
            long j = jv5Var.f46229d;
            if (j != -1 && j < m20425b()) {
                return;
            }
            q72 q72Var = (q72) this.f58826c.get(this.f58829f);
            if (q72Var != null && q72Var.f57338c == -1 && q72Var.f57337b != c3496qf.f57668c) {
                return;
            }
        }
        q72 q72VarM20426c = m20426c(c3496qf.f57668c, c3496qf.f57669d);
        if (this.f58829f == null) {
            this.f58829f = q72VarM20426c.f57336a;
        }
        jv5 jv5Var2 = c3496qf.f57669d;
        if (jv5Var2 != null && jv5Var2.m14690b()) {
            jv5 jv5Var3 = c3496qf.f57669d;
            q72 q72VarM20426c2 = m20426c(c3496qf.f57668c, new jv5(jv5Var3.f46226a, jv5Var3.f46229d, jv5Var3.f46227b));
            if (!q72VarM20426c2.f57340e) {
                q72VarM20426c2.f57340e = true;
                c3496qf.f57667b.mo23250g(c3496qf.f57669d.f46226a, this.f58825b);
                this.f58825b.m24226d(c3496qf.f57669d.f46227b);
                Math.max(0L, uma.m22805J(0L) + uma.m22805J(this.f58825b.f67603e));
                this.f58827d.getClass();
            }
        }
        if (!q72VarM20426c.f57340e) {
            q72VarM20426c.f57340e = true;
            this.f58827d.getClass();
        }
        if (q72VarM20426c.f57336a.equals(this.f58829f) && !q72VarM20426c.f57341f) {
            q72VarM20426c.f57341f = true;
            vu5 vu5Var = this.f58827d;
            String str = q72VarM20426c.f57336a;
            vu5Var.getClass();
            jv5 jv5Var4 = c3496qf.f57669d;
            if (jv5Var4 == null || !jv5Var4.m14690b()) {
                vu5Var.m23549P();
                vu5Var.f65926j = str;
                vu5Var.f65927k = uu5.m22920e().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.0");
                vu5Var.m23550Q(c3496qf.f57667b, c3496qf.f57669d);
            }
        }
    }
}
