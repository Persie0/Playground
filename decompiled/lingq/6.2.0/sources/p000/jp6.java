package p000;

/* JADX INFO: loaded from: classes.dex */
public final class jp6 {

    /* JADX INFO: renamed from: a */
    public final int f45962a;

    /* JADX INFO: renamed from: b */
    public final Integer f45963b;

    public jp6(int i, Integer num) {
        this.f45962a = i;
        this.f45963b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp6)) {
            return false;
        }
        jp6 jp6Var = (jp6) obj;
        return this.f45962a == jp6Var.f45962a && fa4.m11650l(this.f45963b, jp6Var.f45963b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f45962a) * 31;
        Integer num = this.f45963b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f45962a + ", dataOffset=" + this.f45963b + ')';
    }
}
