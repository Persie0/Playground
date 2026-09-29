package p000;

import androidx.compose.material3.C0234h0;

/* JADX INFO: loaded from: classes2.dex */
public final class bq9 extends i16 {

    /* JADX INFO: renamed from: b */
    public final dh9 f8874b;

    /* JADX INFO: renamed from: c */
    public final int f8875c;

    /* JADX INFO: renamed from: d */
    public final boolean f8876d;

    /* JADX INFO: renamed from: e */
    public final l43 f8877e;

    public bq9(dh9 dh9Var, int i, boolean z, l43 l43Var) {
        this.f8874b = dh9Var;
        this.f8875c = i;
        this.f8876d = z;
        this.f8877e = l43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq9)) {
            return false;
        }
        bq9 bq9Var = (bq9) obj;
        return fa4.m11650l(this.f8874b, bq9Var.f8874b) && this.f8875c == bq9Var.f8875c && this.f8876d == bq9Var.f8876d && fa4.m11650l(this.f8877e, bq9Var.f8877e);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        C0234h0 c0234h0 = new C0234h0();
        c0234h0.f3432J = this.f8874b;
        c0234h0.f3433K = this.f8875c;
        c0234h0.f3434L = this.f8876d;
        c0234h0.f3435M = this.f8877e;
        return c0234h0;
    }

    public final int hashCode() {
        return this.f8877e.hashCode() + g9a.m12428e(wq1.m24106b(this.f8875c, this.f8874b.hashCode() * 31, 31), 31, this.f8876d);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        C0234h0 c0234h0 = (C0234h0) d16Var;
        c0234h0.f3432J = this.f8874b;
        c0234h0.f3433K = this.f8875c;
        c0234h0.f3434L = this.f8876d;
        c0234h0.f3435M = this.f8877e;
    }

    public final String toString() {
        return "TabIndicatorModifier(tabPositionsState=" + this.f8874b + ", selectedTabIndex=" + this.f8875c + ", followContentSize=" + this.f8876d + ", animationSpec=" + this.f8877e + ')';
    }
}
