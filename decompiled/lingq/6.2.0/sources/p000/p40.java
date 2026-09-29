package p000;

/* JADX INFO: loaded from: classes.dex */
public final class p40 extends fy2 {

    /* JADX INFO: renamed from: a */
    public final ey2 f55540a;

    public p40(o40 o40Var) {
        this.f55540a = o40Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fy2)) {
            return false;
        }
        ey2 ey2Var = this.f55540a;
        p40 p40Var = (p40) ((fy2) obj);
        if (ey2Var == null) {
            return p40Var.f55540a == null;
        }
        return ey2Var.equals(p40Var.f55540a);
    }

    public final int hashCode() {
        ey2 ey2Var = this.f55540a;
        return (ey2Var == null ? 0 : ey2Var.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f55540a + "}";
    }
}
