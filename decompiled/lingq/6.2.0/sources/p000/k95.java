package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class k95 extends w95 {

    /* JADX INFO: renamed from: a */
    public final jo1 f46889a;

    public k95(jo1 jo1Var) {
        jo1Var.getClass();
        this.f46889a = jo1Var;
    }

    /* JADX INFO: renamed from: a */
    public final jo1 m15012a() {
        return this.f46889a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k95) && fa4.m11650l(this.f46889a, ((k95) obj).f46889a);
    }

    public final int hashCode() {
        return this.f46889a.hashCode();
    }

    public final String toString() {
        return "NavigateToCourse(item=" + this.f46889a + ")";
    }
}
