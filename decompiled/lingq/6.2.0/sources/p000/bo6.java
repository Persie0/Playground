package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class bo6 extends do6 {

    /* JADX INFO: renamed from: a */
    public final om6 f8772a;

    public bo6(om6 om6Var) {
        om6Var.getClass();
        this.f8772a = om6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bo6) && fa4.m11650l(this.f8772a, ((bo6) obj).f8772a);
    }

    public final int hashCode() {
        return this.f8772a.hashCode();
    }

    public final String toString() {
        return "ToNotification(notification=" + this.f8772a + ")";
    }
}
