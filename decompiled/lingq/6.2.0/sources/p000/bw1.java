package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class bw1 {

    /* JADX INFO: renamed from: a */
    public final ew1 f9083a;

    public bw1(ew1 ew1Var) {
        ew1Var.getClass();
        this.f9083a = ew1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bw1) && fa4.m11650l(this.f9083a, ((bw1) obj).f9083a);
    }

    public final int hashCode() {
        return this.f9083a.hashCode();
    }

    public final String toString() {
        return "LiveNotJoined(summary=" + this.f9083a + ")";
    }
}
