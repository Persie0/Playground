package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class r94 extends az3 {

    /* JADX INFO: renamed from: b */
    public final String f58941b;

    /* JADX INFO: renamed from: c */
    public final String f58942c;

    /* JADX INFO: renamed from: d */
    public final String f58943d;

    public r94(String str, String str2, String str3) {
        super("----");
        this.f58941b = str;
        this.f58942c = str2;
        this.f58943d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r94.class != obj.getClass()) {
            return false;
        }
        r94 r94Var = (r94) obj;
        return this.f58942c.equals(r94Var.f58942c) && this.f58941b.equals(r94Var.f58941b) && this.f58943d.equals(r94Var.f58943d);
    }

    public final int hashCode() {
        return this.f58943d.hashCode() + ux5.m22980c(ux5.m22980c(527, this.f58941b, 31), this.f58942c, 31);
    }

    @Override // p000.az3
    public final String toString() {
        return this.f7687a + ": domain=" + this.f58941b + ", description=" + this.f58942c;
    }
}
