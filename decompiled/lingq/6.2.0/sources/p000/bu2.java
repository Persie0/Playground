package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class bu2 implements Runnable, Comparable, ci2 {
    private volatile Object _heap;

    /* JADX INFO: renamed from: a */
    public long f9020a;

    /* JADX INFO: renamed from: b */
    public int f9021b = -1;

    public bu2(long j) {
        this.f9020a = j;
    }

    @Override // p000.ci2
    /* JADX INFO: renamed from: a */
    public final void mo125a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C0842cc c0842cc = fa4.f38707b;
                if (obj == c0842cc) {
                    return;
                }
                cu2 cu2Var = obj instanceof cu2 ? (cu2) obj : null;
                if (cu2Var != null) {
                    synchronized (cu2Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof tz9 ? (tz9) obj2 : null) != null) {
                            cu2Var.m22358b(this.f9021b);
                        }
                    }
                }
                this._heap = c0842cc;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m4176b(long j, cu2 cu2Var, du2 du2Var) {
        synchronized (this) {
            if (this._heap == fa4.f38707b) {
                return 2;
            }
            synchronized (cu2Var) {
                try {
                    bu2[] bu2VarArr = cu2Var.f63151a;
                    bu2 bu2Var = bu2VarArr != null ? bu2VarArr[0] : null;
                    if (du2.f36238i.get(du2Var) == 1) {
                        return 1;
                    }
                    if (bu2Var == null) {
                        cu2Var.f34536c = j;
                    } else {
                        long j2 = bu2Var.f9020a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - cu2Var.f34536c > 0) {
                            cu2Var.f34536c = j;
                        }
                    }
                    long j3 = this.f9020a;
                    long j4 = cu2Var.f34536c;
                    if (j3 - j4 < 0) {
                        this.f9020a = j4;
                    }
                    cu2Var.m22357a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f9020a - ((bu2) obj).f9020a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m4177d(cu2 cu2Var) {
        if (this._heap != fa4.f38707b) {
            this._heap = cu2Var;
        } else {
            C3386nv.m17626m("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f9020a + ']';
    }
}
