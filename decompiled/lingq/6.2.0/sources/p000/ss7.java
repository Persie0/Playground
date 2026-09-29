package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ss7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final e28 f61368a;

    public ss7(e28 e28Var) {
        e28Var.getClass();
        this.f61368a = e28Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ss7) && fa4.m11650l(this.f61368a, ((ss7) obj).f61368a);
    }

    public final int hashCode() {
        return this.f61368a.hashCode();
    }

    public final String toString() {
        return "ReviewButtonPositioned(bounds=" + this.f61368a + ")";
    }
}
