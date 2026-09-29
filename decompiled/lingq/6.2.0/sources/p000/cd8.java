package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class cd8 {

    /* JADX INFO: renamed from: a */
    public final bd8 f9936a;

    /* JADX INFO: renamed from: b */
    public final bd8 f9937b;

    /* JADX INFO: renamed from: c */
    public final bd8 f9938c;

    /* JADX INFO: renamed from: d */
    public final ie8 f9939d;

    public /* synthetic */ cd8(bd8 bd8Var, bd8 bd8Var2, ie8 ie8Var, int i) {
        this((i & 1) != 0 ? null : bd8Var, (bd8) null, (i & 4) != 0 ? null : bd8Var2, (i & 8) != 0 ? null : ie8Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd8)) {
            return false;
        }
        cd8 cd8Var = (cd8) obj;
        return fa4.m11650l(this.f9936a, cd8Var.f9936a) && fa4.m11650l(this.f9937b, cd8Var.f9937b) && fa4.m11650l(this.f9938c, cd8Var.f9938c) && fa4.m11650l(this.f9939d, cd8Var.f9939d);
    }

    public final int hashCode() {
        bd8 bd8Var = this.f9936a;
        int iHashCode = (bd8Var == null ? 0 : bd8Var.hashCode()) * 31;
        bd8 bd8Var2 = this.f9937b;
        int iHashCode2 = (iHashCode + (bd8Var2 == null ? 0 : bd8Var2.hashCode())) * 31;
        bd8 bd8Var3 = this.f9938c;
        int iHashCode3 = (iHashCode2 + (bd8Var3 == null ? 0 : bd8Var3.hashCode())) * 31;
        ie8 ie8Var = this.f9939d;
        return iHashCode3 + (ie8Var != null ? ie8Var.hashCode() : 0);
    }

    public final String toString() {
        return "ReviewControlsState(leading=" + this.f9936a + ", middle=" + this.f9937b + ", trailing=" + this.f9938c + ", sessionActions=" + this.f9939d + ")";
    }

    public cd8(bd8 bd8Var, bd8 bd8Var2, bd8 bd8Var3, ie8 ie8Var) {
        this.f9936a = bd8Var;
        this.f9937b = bd8Var2;
        this.f9938c = bd8Var3;
        this.f9939d = ie8Var;
    }
}
