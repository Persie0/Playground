package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class kr8 extends hs8 {

    /* JADX INFO: renamed from: a */
    public final ct8 f48368a;

    public kr8(ct8 ct8Var) {
        ct8Var.getClass();
        this.f48368a = ct8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kr8) && fa4.m11650l(this.f48368a, ((kr8) obj).f48368a);
    }

    public final int hashCode() {
        return this.f48368a.hashCode();
    }

    public final String toString() {
        return "OnFilterAction(action=" + this.f48368a + ")";
    }
}
