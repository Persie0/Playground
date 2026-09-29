package p000;

/* JADX INFO: loaded from: classes.dex */
public final class pu8 {

    /* JADX INFO: renamed from: a */
    public final ou8 f56817a;

    /* JADX INFO: renamed from: b */
    public final ou8 f56818b;

    /* JADX INFO: renamed from: c */
    public final boolean f56819c;

    public pu8(ou8 ou8Var, ou8 ou8Var2, boolean z) {
        this.f56817a = ou8Var;
        this.f56818b = ou8Var2;
        this.f56819c = z;
    }

    /* JADX INFO: renamed from: a */
    public static pu8 m19483a(pu8 pu8Var, ou8 ou8Var, ou8 ou8Var2, boolean z, int i) {
        if ((i & 1) != 0) {
            ou8Var = pu8Var.f56817a;
        }
        if ((i & 2) != 0) {
            ou8Var2 = pu8Var.f56818b;
        }
        pu8Var.getClass();
        return new pu8(ou8Var, ou8Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu8)) {
            return false;
        }
        pu8 pu8Var = (pu8) obj;
        return fa4.m11650l(this.f56817a, pu8Var.f56817a) && fa4.m11650l(this.f56818b, pu8Var.f56818b) && this.f56819c == pu8Var.f56819c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f56819c) + ((this.f56818b.hashCode() + (this.f56817a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.f56817a);
        sb.append(", end=");
        sb.append(this.f56818b);
        sb.append(", handlesCrossed=");
        return ux5.m22993p(sb, this.f56819c, ')');
    }
}
