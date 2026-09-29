package p000;

import androidx.compose.foundation.pager.AbstractC0150d;

/* JADX INFO: loaded from: classes.dex */
public final class f27 implements pt4 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0150d f38309a;

    /* JADX INFO: renamed from: b */
    public final int f38310b;

    public f27(AbstractC0150d abstractC0150d, int i) {
        this.f38309a = abstractC0150d;
        this.f38310b = i;
    }

    @Override // p000.pt4
    /* JADX INFO: renamed from: a */
    public final int mo11505a() {
        return this.f38309a.mo1039n();
    }

    @Override // p000.pt4
    /* JADX INFO: renamed from: b */
    public final int mo11506b() {
        AbstractC0150d abstractC0150d = this.f38309a;
        return Math.min(abstractC0150d.mo1039n() - 1, ((lt5) u91.m22597O0(abstractC0150d.m1038m().f52219a)).f50100a + this.f38310b);
    }

    @Override // p000.pt4
    /* JADX INFO: renamed from: c */
    public final int mo11507c() {
        int i;
        AbstractC0150d abstractC0150d = this.f38309a;
        if (abstractC0150d.m1038m().f52219a.size() == 0) {
            return 0;
        }
        int iM19522r = pvc.m19522r(abstractC0150d.m1038m());
        int i2 = abstractC0150d.m1038m().f52220b + abstractC0150d.m1038m().f52221c;
        if (i2 != 0 && (i = iM19522r / i2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // p000.pt4
    /* JADX INFO: renamed from: d */
    public final boolean mo11508d() {
        return !this.f38309a.m1038m().f52219a.isEmpty();
    }

    @Override // p000.pt4
    /* JADX INFO: renamed from: e */
    public final int mo11509e() {
        return Math.max(0, this.f38309a.f2675e - this.f38310b);
    }
}
