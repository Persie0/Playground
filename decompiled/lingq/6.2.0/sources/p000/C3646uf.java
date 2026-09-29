package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: renamed from: uf */
/* JADX INFO: loaded from: classes2.dex */
public final class C3646uf implements bx5 {

    /* JADX INFO: renamed from: a */
    public final ec0 f63820a;

    /* JADX INFO: renamed from: b */
    public final ec0 f63821b;

    /* JADX INFO: renamed from: c */
    public final int f63822c;

    public C3646uf(ec0 ec0Var, ec0 ec0Var2, int i) {
        this.f63820a = ec0Var;
        this.f63821b = ec0Var2;
        this.f63822c = i;
    }

    @Override // p000.bx5
    /* JADX INFO: renamed from: a */
    public final int mo4220a(j84 j84Var, long j, int i, LayoutDirection layoutDirection) {
        int iMo4499a = this.f63821b.mo4499a(0, j84Var.m14324d(), layoutDirection);
        int i2 = -this.f63820a.mo4499a(0, i, layoutDirection);
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        int i3 = this.f63822c;
        if (layoutDirection != layoutDirection2) {
            i3 = -i3;
        }
        return j84Var.f45185a + iMo4499a + i2 + i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3646uf)) {
            return false;
        }
        C3646uf c3646uf = (C3646uf) obj;
        return this.f63820a.equals(c3646uf.f63820a) && this.f63821b.equals(c3646uf.f63821b) && this.f63822c == c3646uf.f63822c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f63822c) + wq1.m24105a(Float.hashCode(this.f63820a.f36988a) * 31, this.f63821b.f36988a, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Horizontal(menuAlignment=");
        sb.append(this.f63820a);
        sb.append(", anchorAlignment=");
        sb.append(this.f63821b);
        sb.append(", offset=");
        return wq1.m24122r(sb, this.f63822c, ')');
    }
}
