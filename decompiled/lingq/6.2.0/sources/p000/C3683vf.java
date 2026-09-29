package p000;

/* JADX INFO: renamed from: vf */
/* JADX INFO: loaded from: classes2.dex */
public final class C3683vf implements cx5 {

    /* JADX INFO: renamed from: a */
    public final fc0 f65297a;

    /* JADX INFO: renamed from: b */
    public final fc0 f65298b;

    /* JADX INFO: renamed from: c */
    public final int f65299c;

    public C3683vf(fc0 fc0Var, fc0 fc0Var2, int i) {
        this.f65297a = fc0Var;
        this.f65298b = fc0Var2;
        this.f65299c = i;
    }

    @Override // p000.cx5
    /* JADX INFO: renamed from: a */
    public final int mo9918a(j84 j84Var, long j, int i) {
        int iM11762a = this.f65298b.m11762a(0, j84Var.m14322b());
        return j84Var.f45186b + iM11762a + (-this.f65297a.m11762a(0, i)) + this.f65299c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3683vf)) {
            return false;
        }
        C3683vf c3683vf = (C3683vf) obj;
        return this.f65297a.equals(c3683vf.f65297a) && this.f65298b.equals(c3683vf.f65298b) && this.f65299c == c3683vf.f65299c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f65299c) + wq1.m24105a(Float.hashCode(this.f65297a.f38829a) * 31, this.f65298b.f38829a, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(menuAlignment=");
        sb.append(this.f65297a);
        sb.append(", anchorAlignment=");
        sb.append(this.f65298b);
        sb.append(", offset=");
        return wq1.m24122r(sb, this.f65299c, ')');
    }
}
