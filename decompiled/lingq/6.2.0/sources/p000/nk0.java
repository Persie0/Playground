package p000;

import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;

/* JADX INFO: loaded from: classes2.dex */
public final class nk0 implements mk0 {

    /* JADX INFO: renamed from: a */
    public final C3211a f52872a;

    /* JADX INFO: renamed from: b */
    public final du0 f52873b;

    public nk0() {
        C3211a c3211aM10525a = do7.m10525a(-1, 6, null);
        this.f52872a = c3211aM10525a;
        this.f52873b = AbstractC3224d.m15519A(c3211aM10525a);
    }

    @Override // p000.mk0
    /* JADX INFO: renamed from: C2 */
    public final c83 mo9319C2() {
        return this.f52873b;
    }

    @Override // p000.mk0
    /* JADX INFO: renamed from: G1 */
    public final void mo9320G1(String str, int i, String str2, int i2, int i3) {
        str.getClass();
        str2.getClass();
        C3211a c3211a = this.f52872a;
        if (i2 < i) {
            c3211a.mo4677k(new ux4(i, ux5.m22991n("https://www.lingq.com/", str2, "/learn/", str, "/web/settings/points"), i2));
        } else {
            c3211a.mo4677k(new vx4(i, i2, i3));
        }
    }

    @Override // p000.mk0
    /* JADX INFO: renamed from: g2 */
    public final void mo9326g2(yx4 yx4Var) {
        this.f52872a.mo4677k(yx4Var);
    }
}
