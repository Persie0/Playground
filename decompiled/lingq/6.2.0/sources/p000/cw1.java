package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class cw1 {

    /* JADX INFO: renamed from: a */
    public final ew1 f34623a;

    public cw1(ew1 ew1Var) {
        ew1Var.getClass();
        this.f34623a = ew1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cw1) && fa4.m11650l(this.f34623a, ((cw1) obj).f34623a);
    }

    public final int hashCode() {
        return this.f34623a.hashCode();
    }

    public final String toString() {
        return "LiveSpectator(summary=" + this.f34623a + ")";
    }
}
