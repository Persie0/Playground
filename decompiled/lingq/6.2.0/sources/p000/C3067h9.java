package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: renamed from: h9 */
/* JADX INFO: loaded from: classes.dex */
public final class C3067h9 implements e5b {

    /* JADX INFO: renamed from: a */
    public final e5b f42003a;

    /* JADX INFO: renamed from: b */
    public final y17 f42004b;

    public C3067h9(e5b e5bVar, y17 y17Var) {
        this.f42003a = e5bVar;
        this.f42004b = y17Var;
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: a */
    public final int mo3999a(fb2 fb2Var) {
        return this.f42004b.mo3999a(fb2Var) + this.f42003a.mo3999a(fb2Var);
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: b */
    public final int mo4000b(fb2 fb2Var, LayoutDirection layoutDirection) {
        return this.f42004b.mo4000b(fb2Var, layoutDirection) + this.f42003a.mo4000b(fb2Var, layoutDirection);
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: c */
    public final int mo4001c(fb2 fb2Var) {
        return this.f42004b.mo4001c(fb2Var) + this.f42003a.mo4001c(fb2Var);
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: d */
    public final int mo4002d(fb2 fb2Var, LayoutDirection layoutDirection) {
        return this.f42004b.mo4002d(fb2Var, layoutDirection) + this.f42003a.mo4002d(fb2Var, layoutDirection);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3067h9)) {
            return false;
        }
        C3067h9 c3067h9 = (C3067h9) obj;
        return fa4.m11650l(c3067h9.f42003a, this.f42003a) && c3067h9.f42004b.equals(this.f42004b);
    }

    public final int hashCode() {
        return (this.f42004b.f69094a.hashCode() * 31) + this.f42003a.hashCode();
    }

    public final String toString() {
        return "(" + this.f42003a + " + " + this.f42004b + ')';
    }
}
