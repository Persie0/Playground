package p000;

/* JADX INFO: loaded from: classes.dex */
public final class lr6 extends omd {

    /* JADX INFO: renamed from: h */
    public final kr6 f50043h;

    /* JADX INFO: renamed from: i */
    public final ub5 f50044i;

    public lr6(ub5 ub5Var, kr6 kr6Var) {
        kr6Var.getClass();
        this.f50043h = kr6Var;
        this.f50044i = ub5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr6)) {
            return false;
        }
        lr6 lr6Var = (lr6) obj;
        return fa4.m11650l(this.f50043h, lr6Var.f50043h) && fa4.m11650l(this.f50044i, lr6Var.f50044i);
    }

    public final int hashCode() {
        int iHashCode = this.f50043h.hashCode() * 31;
        ub5 ub5Var = this.f50044i;
        return iHashCode + (ub5Var == null ? 0 : ub5Var.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f50043h + ", owner=" + this.f50044i + ')';
    }
}
