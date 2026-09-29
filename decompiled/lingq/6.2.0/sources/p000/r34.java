package p000;

/* JADX INFO: loaded from: classes.dex */
public final class r34 {

    /* JADX INFO: renamed from: a */
    public final int f58552a;

    /* JADX INFO: renamed from: b */
    public final Object f58553b;

    public r34(int i, Object obj) {
        this.f58552a = i;
        this.f58553b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r34)) {
            return false;
        }
        r34 r34Var = (r34) obj;
        return this.f58552a == r34Var.f58552a && fa4.m11650l(this.f58553b, r34Var.f58553b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f58552a) * 31;
        Object obj = this.f58553b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f58552a + ", value=" + this.f58553b + ')';
    }
}
