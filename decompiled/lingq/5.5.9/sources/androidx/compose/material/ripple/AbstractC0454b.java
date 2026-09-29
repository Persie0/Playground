package androidx.compose.material.ripple;

import androidx.activity.result.C0204c;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2057q;
import dm.C5207g;
import p021b0.AbstractC1283h;
import p021b0.InterfaceC1285j;
import p081e0.C5333r;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5301c1;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5336s0;
import p338qd.C8573r0;
import p386t.InterfaceC9126r;
import p386t.InterfaceC9127s;
import p387t0.C9169u;
import p423v.InterfaceC9611i;
import p470x1.C10017e;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.material.ripple.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0454b implements InterfaceC9126r {

    /* JADX INFO: renamed from: a */
    public final boolean f2639a;

    /* JADX INFO: renamed from: b */
    public final float f2640b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5301c1<C9169u> f2641c;

    public AbstractC0454b() {
        throw null;
    }

    public AbstractC0454b(boolean z10, float f3, InterfaceC5312g0 interfaceC5312g0) {
        this.f2639a = z10;
        this.f2640b = f3;
        this.f2641c = interfaceC5312g0;
    }

    @Override // p386t.InterfaceC9126r
    /* JADX INFO: renamed from: a */
    public final InterfaceC9127s mo1552a(InterfaceC9611i interfaceC9611i, InterfaceC0476a interfaceC0476a) {
        C5207g.m11111f(interfaceC9611i, "interactionSource");
        interfaceC0476a.mo1622c(988743187);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        InterfaceC1285j interfaceC1285j = (InterfaceC1285j) interfaceC0476a.mo1648p(RippleThemeKt.f2618a);
        interfaceC0476a.mo1622c(-1524341038);
        InterfaceC5301c1<C9169u> interfaceC5301c1 = this.f2641c;
        long jMo4780a = (interfaceC5301c1.getValue().f47705a > C9169u.f47703f ? 1 : (interfaceC5301c1.getValue().f47705a == C9169u.f47703f ? 0 : -1)) != 0 ? interfaceC5301c1.getValue().f47705a : interfaceC1285j.mo4780a(interfaceC0476a);
        interfaceC0476a.mo1661w();
        AbstractC1283h abstractC1283hMo1553b = mo1553b(interfaceC9611i, this.f2639a, this.f2640b, C8573r0.m16704V0(new C9169u(jMo4780a), interfaceC0476a), C8573r0.m16704V0(interfaceC1285j.mo4781b(interfaceC0476a), interfaceC0476a), interfaceC0476a);
        C5333r.m11461c(abstractC1283hMo1553b, interfaceC9611i, new Ripple$rememberUpdatedInstance$1(interfaceC9611i, abstractC1283hMo1553b, null), interfaceC0476a);
        interfaceC0476a.mo1661w();
        return abstractC1283hMo1553b;
    }

    /* JADX INFO: renamed from: b */
    public abstract AbstractC1283h mo1553b(InterfaceC9611i interfaceC9611i, boolean z10, float f3, InterfaceC5312g0 interfaceC5312g0, InterfaceC5312g0 interfaceC5312g1, InterfaceC0476a interfaceC0476a);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0454b)) {
            return false;
        }
        AbstractC0454b abstractC0454b = (AbstractC0454b) obj;
        return this.f2639a == abstractC0454b.f2639a && C10017e.m18618a(this.f2640b, abstractC0454b.f2640b) && C5207g.m11106a(this.f2641c, abstractC0454b.f2641c);
    }

    public final int hashCode() {
        return this.f2641c.hashCode() + C0204c.m846e(this.f2640b, Boolean.hashCode(this.f2639a) * 31, 31);
    }
}
