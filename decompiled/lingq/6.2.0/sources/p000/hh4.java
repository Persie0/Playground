package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class hh4 {

    /* JADX INFO: renamed from: a */
    public final u45 f42362a;

    /* JADX INFO: renamed from: b */
    public final int f42363b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3055gy f42364c;

    public hh4(u45 u45Var, int i, InterfaceC3055gy interfaceC3055gy) {
        u45Var.getClass();
        this.f42362a = u45Var;
        this.f42363b = i;
        this.f42364c = interfaceC3055gy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh4)) {
            return false;
        }
        hh4 hh4Var = (hh4) obj;
        return fa4.m11650l(this.f42362a, hh4Var.f42362a) && this.f42363b == hh4Var.f42363b && fa4.m11650l(this.f42364c, hh4Var.f42364c);
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f42363b, this.f42362a.hashCode() * 31, 31);
        InterfaceC3055gy interfaceC3055gy = this.f42364c;
        return iM24106b + (interfaceC3055gy == null ? 0 : interfaceC3055gy.hashCode());
    }

    public final String toString() {
        return "KaraokeLessonInputs(lesson=" + this.f42362a + ", fontSize=" + this.f42363b + ", downloadState=" + this.f42364c + ")";
    }
}
