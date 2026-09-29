package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class ufa implements e5b {

    /* JADX INFO: renamed from: a */
    public final e5b f63854a;

    /* JADX INFO: renamed from: b */
    public final e5b f63855b;

    public ufa(e5b e5bVar, e5b e5bVar2) {
        this.f63854a = e5bVar;
        this.f63855b = e5bVar2;
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: a */
    public final int mo3999a(fb2 fb2Var) {
        return Math.max(this.f63854a.mo3999a(fb2Var), this.f63855b.mo3999a(fb2Var));
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: b */
    public final int mo4000b(fb2 fb2Var, LayoutDirection layoutDirection) {
        return Math.max(this.f63854a.mo4000b(fb2Var, layoutDirection), this.f63855b.mo4000b(fb2Var, layoutDirection));
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: c */
    public final int mo4001c(fb2 fb2Var) {
        return Math.max(this.f63854a.mo4001c(fb2Var), this.f63855b.mo4001c(fb2Var));
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: d */
    public final int mo4002d(fb2 fb2Var, LayoutDirection layoutDirection) {
        return Math.max(this.f63854a.mo4002d(fb2Var, layoutDirection), this.f63855b.mo4002d(fb2Var, layoutDirection));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufa)) {
            return false;
        }
        ufa ufaVar = (ufa) obj;
        return fa4.m11650l(ufaVar.f63854a, this.f63854a) && fa4.m11650l(ufaVar.f63855b, this.f63855b);
    }

    public final int hashCode() {
        return (this.f63855b.hashCode() * 31) + this.f63854a.hashCode();
    }

    public final String toString() {
        return "(" + this.f63854a + " ∪ " + this.f63855b + ')';
    }
}
