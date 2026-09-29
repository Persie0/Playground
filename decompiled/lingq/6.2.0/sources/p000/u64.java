package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class u64 implements t17 {

    /* JADX INFO: renamed from: a */
    public final e5b f63487a;

    /* JADX INFO: renamed from: b */
    public final fb2 f63488b;

    public u64(e5b e5bVar, fb2 fb2Var) {
        this.f63487a = e5bVar;
        this.f63488b = fb2Var;
    }

    @Override // p000.t17
    /* JADX INFO: renamed from: a */
    public final float mo14018a() {
        e5b e5bVar = this.f63487a;
        fb2 fb2Var = this.f63488b;
        return fb2Var.mo905T(e5bVar.mo4001c(fb2Var));
    }

    @Override // p000.t17
    /* JADX INFO: renamed from: b */
    public final float mo14019b(LayoutDirection layoutDirection) {
        e5b e5bVar = this.f63487a;
        fb2 fb2Var = this.f63488b;
        return fb2Var.mo905T(e5bVar.mo4000b(fb2Var, layoutDirection));
    }

    @Override // p000.t17
    /* JADX INFO: renamed from: c */
    public final float mo14020c(LayoutDirection layoutDirection) {
        e5b e5bVar = this.f63487a;
        fb2 fb2Var = this.f63488b;
        return fb2Var.mo905T(e5bVar.mo4002d(fb2Var, layoutDirection));
    }

    @Override // p000.t17
    /* JADX INFO: renamed from: d */
    public final float mo14021d() {
        e5b e5bVar = this.f63487a;
        fb2 fb2Var = this.f63488b;
        return fb2Var.mo905T(e5bVar.mo3999a(fb2Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u64)) {
            return false;
        }
        u64 u64Var = (u64) obj;
        return fa4.m11650l(this.f63487a, u64Var.f63487a) && fa4.m11650l(this.f63488b, u64Var.f63488b);
    }

    public final int hashCode() {
        return this.f63488b.hashCode() + (this.f63487a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f63487a + ", density=" + this.f63488b + ')';
    }
}
