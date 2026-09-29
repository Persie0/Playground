package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class y17 implements e5b {

    /* JADX INFO: renamed from: a */
    public final t17 f69094a;

    public y17(t17 t17Var) {
        this.f69094a = t17Var;
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: a */
    public final int mo3999a(fb2 fb2Var) {
        return fb2Var.mo916w0(this.f69094a.mo14021d());
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: b */
    public final int mo4000b(fb2 fb2Var, LayoutDirection layoutDirection) {
        return fb2Var.mo916w0(this.f69094a.mo14019b(layoutDirection));
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: c */
    public final int mo4001c(fb2 fb2Var) {
        return fb2Var.mo916w0(this.f69094a.mo14018a());
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: d */
    public final int mo4002d(fb2 fb2Var, LayoutDirection layoutDirection) {
        return fb2Var.mo916w0(this.f69094a.mo14020c(layoutDirection));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y17) {
            return fa4.m11650l(((y17) obj).f69094a, this.f69094a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f69094a.hashCode();
    }

    public final String toString() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        t17 t17Var = this.f69094a;
        return "PaddingValues(" + ((Object) xj2.m24561c(t17Var.mo14019b(layoutDirection))) + ", " + ((Object) xj2.m24561c(t17Var.mo14021d())) + ", " + ((Object) xj2.m24561c(t17Var.mo14020c(layoutDirection))) + ", " + ((Object) xj2.m24561c(t17Var.mo14018a())) + ')';
    }
}
