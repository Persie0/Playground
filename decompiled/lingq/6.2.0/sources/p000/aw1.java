package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class aw1 {

    /* JADX INFO: renamed from: a */
    public final ew1 f7601a;

    public aw1(ew1 ew1Var) {
        ew1Var.getClass();
        this.f7601a = ew1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aw1) && fa4.m11650l(this.f7601a, ((aw1) obj).f7601a);
    }

    public final int hashCode() {
        return this.f7601a.hashCode();
    }

    public final String toString() {
        return "LiveJoined(summary=" + this.f7601a + ")";
    }
}
