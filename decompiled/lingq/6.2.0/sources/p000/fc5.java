package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class fc5 implements e5b {

    /* JADX INFO: renamed from: a */
    public final e5b f38847a;

    /* JADX INFO: renamed from: b */
    public final int f38848b;

    public fc5(e5b e5bVar, int i) {
        this.f38847a = e5bVar;
        this.f38848b = i;
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: a */
    public final int mo3999a(fb2 fb2Var) {
        if ((this.f38848b & 16) != 0) {
            return this.f38847a.mo3999a(fb2Var);
        }
        return 0;
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: b */
    public final int mo4000b(fb2 fb2Var, LayoutDirection layoutDirection) {
        if (((layoutDirection == LayoutDirection.Ltr ? 8 : 2) & this.f38848b) != 0) {
            return this.f38847a.mo4000b(fb2Var, layoutDirection);
        }
        return 0;
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: c */
    public final int mo4001c(fb2 fb2Var) {
        if ((this.f38848b & 32) != 0) {
            return this.f38847a.mo4001c(fb2Var);
        }
        return 0;
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: d */
    public final int mo4002d(fb2 fb2Var, LayoutDirection layoutDirection) {
        if (((layoutDirection == LayoutDirection.Ltr ? 4 : 1) & this.f38848b) != 0) {
            return this.f38847a.mo4002d(fb2Var, layoutDirection);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc5)) {
            return false;
        }
        fc5 fc5Var = (fc5) obj;
        return fa4.m11650l(this.f38847a, fc5Var.f38847a) && this.f38848b == fc5Var.f38848b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38848b) + (this.f38847a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f38847a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = this.f38848b;
        int i2 = eda.f37081b;
        if ((i & i2) == i2) {
            eda.m11076i("Start", sb3);
        }
        int i3 = eda.f37083d;
        if ((i & i3) == i3) {
            eda.m11076i("Left", sb3);
        }
        if ((i & 16) == 16) {
            eda.m11076i("Top", sb3);
        }
        int i4 = eda.f37082c;
        if ((i & i4) == i4) {
            eda.m11076i("End", sb3);
        }
        int i5 = eda.f37084e;
        if ((i & i5) == i5) {
            eda.m11076i("Right", sb3);
        }
        if ((i & 32) == 32) {
            eda.m11076i("Bottom", sb3);
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
