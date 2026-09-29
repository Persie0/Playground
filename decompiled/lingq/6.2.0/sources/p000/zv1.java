package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class zv1 {

    /* JADX INFO: renamed from: a */
    public final ew1 f72250a;

    public zv1(ew1 ew1Var) {
        ew1Var.getClass();
        this.f72250a = ew1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zv1) && fa4.m11650l(this.f72250a, ((zv1) obj).f72250a);
    }

    public final int hashCode() {
        return this.f72250a.hashCode();
    }

    public final String toString() {
        return "Finished(summary=" + this.f72250a + ")";
    }
}
