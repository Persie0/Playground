package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class q72 {

    /* JADX INFO: renamed from: a */
    public final String f57336a;

    /* JADX INFO: renamed from: b */
    public int f57337b;

    /* JADX INFO: renamed from: c */
    public long f57338c;

    /* JADX INFO: renamed from: d */
    public final jv5 f57339d;

    /* JADX INFO: renamed from: e */
    public boolean f57340e;

    /* JADX INFO: renamed from: f */
    public boolean f57341f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ r72 f57342g;

    public q72(r72 r72Var, String str, int i, jv5 jv5Var) {
        this.f57342g = r72Var;
        this.f57336a = str;
        this.f57337b = i;
        this.f57338c = jv5Var == null ? -1L : jv5Var.f46229d;
        if (jv5Var == null || !jv5Var.m14690b()) {
            return;
        }
        this.f57339d = jv5Var;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m19698i(int i, jv5 jv5Var) {
        if (jv5Var != null) {
            long j = jv5Var.f46229d;
            if (j != -1) {
                jv5 jv5Var2 = this.f57339d;
                if (jv5Var2 == null) {
                    return !jv5Var.m14690b() && j == this.f57338c;
                }
                return j == jv5Var2.f46229d && jv5Var.f46227b == jv5Var2.f46227b && jv5Var.f46228c == jv5Var2.f46228c;
            }
        }
        return i == this.f57337b;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m19699j(C3496qf c3496qf) {
        jv5 jv5Var = c3496qf.f57669d;
        z0a z0aVar = c3496qf.f57667b;
        if (jv5Var == null) {
            return this.f57337b != c3496qf.f57668c;
        }
        long j = this.f57338c;
        if (j == -1) {
            return false;
        }
        if (jv5Var.f46229d > j) {
            return true;
        }
        jv5 jv5Var2 = this.f57339d;
        if (jv5Var2 == null) {
            return false;
        }
        int i = jv5Var2.f46227b;
        int iMo17285b = z0aVar.mo17285b(jv5Var.f46226a);
        int iMo17285b2 = z0aVar.mo17285b(jv5Var2.f46226a);
        if (jv5Var.f46229d < jv5Var2.f46229d || iMo17285b < iMo17285b2) {
            return false;
        }
        if (iMo17285b > iMo17285b2) {
            return true;
        }
        if (!jv5Var.m14690b()) {
            int i2 = jv5Var.f46230e;
            return i2 == -1 || i2 > i;
        }
        int i3 = jv5Var.f46227b;
        int i4 = jv5Var.f46228c;
        if (i3 <= i) {
            return i3 == i && i4 > jv5Var2.f46228c;
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final void m19700k(int i, jv5 jv5Var) {
        if (this.f57338c == -1 && i == this.f57337b && jv5Var != null) {
            long j = jv5Var.f46229d;
            if (j >= this.f57342g.m20425b()) {
                this.f57338c = j;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m19701l(z0a z0aVar, z0a z0aVar2) {
        jv5 jv5Var;
        int i = this.f57337b;
        if (i < z0aVar.mo17288o()) {
            r72 r72Var = this.f57342g;
            y0a y0aVar = r72Var.f58824a;
            z0aVar.m25397n(i, y0aVar);
            int i2 = y0aVar.f69075l;
            while (true) {
                if (i2 > y0aVar.f69076m) {
                    i = -1;
                    break;
                }
                int iMo17285b = z0aVar2.mo17285b(z0aVar.mo17287l(i2));
                if (iMo17285b != -1) {
                    i = z0aVar2.mo16393f(iMo17285b, r72Var.f58825b, false).f67601c;
                    break;
                }
                i2++;
            }
        } else if (i >= z0aVar2.mo17288o()) {
            i = -1;
            break;
        }
        this.f57337b = i;
        return i != -1 && ((jv5Var = this.f57339d) == null || z0aVar2.mo17285b(jv5Var.f46226a) != -1);
    }
}
