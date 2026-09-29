package p000;

import androidx.compose.material3.C0269z;
import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes2.dex */
public final class p59 implements e5b {

    /* JADX INFO: renamed from: a */
    public final C0269z f55620a;

    public p59(C0269z c0269z) {
        this.f55620a = c0269z;
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: a */
    public final int mo3999a(fb2 fb2Var) {
        int i;
        float fM19861h = this.f55620a.f3651e.f2241j.m19861h();
        if (!Float.isNaN(fM19861h) && (i = (int) fM19861h) >= 0) {
            return i;
        }
        return 0;
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: b */
    public final int mo4000b(fb2 fb2Var, LayoutDirection layoutDirection) {
        return 0;
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: c */
    public final int mo4001c(fb2 fb2Var) {
        return 0;
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: d */
    public final int mo4002d(fb2 fb2Var, LayoutDirection layoutDirection) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p59)) {
            return false;
        }
        return fa4.m11650l(this.f55620a, ((p59) obj).f55620a);
    }

    public final int hashCode() {
        return this.f55620a.hashCode();
    }
}
