package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ag1 implements aoa {

    /* JADX INFO: renamed from: a */
    public final vi3 f596a;

    public ag1(vi3 vi3Var) {
        this.f596a = vi3Var;
    }

    @Override // p000.aoa
    /* JADX INFO: renamed from: a */
    public final Object mo367a(l77 l77Var) {
        return this.f596a.invoke(l77Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ag1) && this.f596a.equals(((ag1) obj).f596a);
    }

    public final int hashCode() {
        return this.f596a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f596a + ')';
    }
}
