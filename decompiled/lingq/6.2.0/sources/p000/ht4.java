package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ht4 extends i16 {

    /* JADX INFO: renamed from: b */
    public final bg9 f42926b;

    /* JADX INFO: renamed from: c */
    public final bg9 f42927c;

    /* JADX INFO: renamed from: d */
    public final bg9 f42928d;

    public ht4(bg9 bg9Var, bg9 bg9Var2, bg9 bg9Var3) {
        this.f42926b = bg9Var;
        this.f42927c = bg9Var2;
        this.f42928d = bg9Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht4)) {
            return false;
        }
        ht4 ht4Var = (ht4) obj;
        return this.f42926b.equals(ht4Var.f42926b) && this.f42927c.equals(ht4Var.f42927c) && this.f42928d.equals(ht4Var.f42928d);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        it4 it4Var = new it4();
        it4Var.f44530J = this.f42926b;
        it4Var.f44531K = this.f42927c;
        it4Var.f44532L = this.f42928d;
        return it4Var;
    }

    public final int hashCode() {
        return this.f42928d.hashCode() + ((this.f42927c.hashCode() + (this.f42926b.hashCode() * 31)) * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "animateItem";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(this.f42926b, "fadeInSpec");
        z91Var.m25511b(this.f42927c, "placementSpec");
        z91Var.m25511b(this.f42928d, "fadeOutSpec");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        it4 it4Var = (it4) d16Var;
        it4Var.f44530J = this.f42926b;
        it4Var.f44531K = this.f42927c;
        it4Var.f44532L = this.f42928d;
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.f42926b + ", placementSpec=" + this.f42927c + ", fadeOutSpec=" + this.f42928d + ')';
    }
}
