package p000;

/* JADX INFO: loaded from: classes.dex */
public final class x76 {

    /* JADX INFO: renamed from: a */
    public final de6 f67888a;

    /* JADX INFO: renamed from: b */
    public final boolean f67889b;

    /* JADX INFO: renamed from: c */
    public final boolean f67890c;

    /* JADX INFO: renamed from: d */
    public final Object f67891d;

    public x76(de6 de6Var, boolean z, Object obj, boolean z2) {
        if (!de6Var.f35517a && z) {
            C3386nv.m17624j(de6Var.mo302b().concat(" does not allow nullable values"));
            throw null;
        }
        if (!z && z2 && obj == null) {
            v63.m23135m("Argument with type ", de6Var.mo302b(), " has null value but is not nullable.");
            throw null;
        }
        this.f67888a = de6Var;
        this.f67889b = z;
        this.f67891d = obj;
        this.f67890c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x76.class != obj.getClass()) {
            return false;
        }
        x76 x76Var = (x76) obj;
        if (this.f67889b != x76Var.f67889b || this.f67890c != x76Var.f67890c || !this.f67888a.equals(x76Var.f67888a)) {
            return false;
        }
        Object obj2 = x76Var.f67891d;
        Object obj3 = this.f67891d;
        if (obj3 != null) {
            return obj3.equals(obj2);
        }
        return obj2 == null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f67888a.hashCode() * 31) + (this.f67889b ? 1 : 0)) * 31) + (this.f67890c ? 1 : 0)) * 31;
        Object obj = this.f67891d;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(y38.m24933a(x76.class).m25414c());
        sb.append(" Type: " + this.f67888a);
        sb.append(" Nullable: " + this.f67889b);
        if (this.f67890c) {
            sb.append(" DefaultValue: " + this.f67891d);
        }
        return sb.toString();
    }
}
