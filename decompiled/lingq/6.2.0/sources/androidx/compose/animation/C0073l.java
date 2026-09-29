package androidx.compose.animation;

import androidx.compose.animation.core.C0059a;
import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC0278f;
import kotlin.collections.AbstractC3194a;
import p000.InterfaceC0025an;
import p000.ba4;
import p000.ct5;
import p000.dk1;
import p000.it5;
import p000.jt5;
import p000.l87;
import p000.n84;
import p000.pk9;
import p000.t66;
import p000.vi3;
import p000.wfb;
import p000.xc9;
import p000.xfa;
import p000.z89;

/* JADX INFO: renamed from: androidx.compose.animation.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0073l extends ba4 {

    /* JADX INFO: renamed from: K */
    public InterfaceC0025an f1593K;

    /* JADX INFO: renamed from: L */
    public long f1594L;

    /* JADX INFO: renamed from: M */
    public long f1595M;

    /* JADX INFO: renamed from: N */
    public boolean f1596N;

    /* JADX INFO: renamed from: O */
    public final t66 f1597O;

    public C0073l(InterfaceC0025an interfaceC0025an) {
        super(1);
        this.f1593K = interfaceC0025an;
        this.f1594L = -9223372034707292160L;
        this.f1595M = dk1.m10424b(0, 0, 0, 0, 15);
        this.f1597O = AbstractC0278f.m1260j(null);
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: R0 */
    public final void mo36R0() {
        this.f1594L = -9223372034707292160L;
        this.f1596N = false;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: T0 */
    public final void mo763T0() {
        ((xc9) this.f1597O).setValue(null);
    }

    @Override // p000.ba4, androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(final jt5 jt5Var, ct5 ct5Var, long j) {
        l87 l87VarMo1514r;
        z89 z89Var;
        long jM10426d;
        z89 z89Var2;
        if (jt5Var.mo211f0()) {
            this.f1595M = j;
            this.f1596N = true;
            l87VarMo1514r = ct5Var.mo1514r(j);
        } else {
            l87VarMo1514r = ct5Var.mo1514r(this.f1596N ? this.f1595M : j);
        }
        final l87 l87Var = l87VarMo1514r;
        char c = ' ';
        long j2 = (((long) l87Var.f49302b) & 4294967295L) | (((long) l87Var.f49301a) << 32);
        if (jt5Var.mo211f0()) {
            this.f1594L = j2;
            c = ' ';
            jM10426d = j2;
            j2 = jM10426d;
        } else {
            long j3 = !n84.m17279a(this.f1594L, -9223372034707292160L) ? this.f1594L : j2;
            t66 t66Var = this.f1597O;
            z89 z89Var3 = (z89) ((xc9) t66Var).getValue();
            if (z89Var3 != null) {
                C0059a c0059a = z89Var3.f71094a;
                boolean z = (n84.m17279a(j3, ((n84) c0059a.m745d()).f52482a) || c0059a.m746e()) ? false : true;
                if (!n84.m17279a(j3, ((n84) ((xc9) c0059a.f1542e).getValue()).f52482a) || z) {
                    z89Var3.f71095b = ((n84) c0059a.m745d()).f52482a;
                    z89Var2 = z89Var3;
                    wfb.m23926u(m9971N0(), null, null, new SizeAnimationModifierNode$animateTo$data$1$1(z89Var2, j3, this, null), 3);
                } else {
                    z89Var2 = z89Var3;
                }
                z89Var = z89Var2;
            } else {
                long j4 = j3;
                z89Var = new z89(new C0059a(new n84(j4), pk9.f56370o, new n84(4294967297L), 8), j4);
            }
            ((xc9) t66Var).setValue(z89Var);
            jM10426d = dk1.m10426d(j, ((n84) z89Var.f71094a.m745d()).f52482a);
        }
        final int i = (int) (jM10426d >> c);
        final int i2 = (int) (jM10426d & 4294967295L);
        final long j5 = j2;
        return jt5Var.mo9895M0(i, i2, AbstractC3194a.m15360M(), new vi3(this) { // from class: androidx.compose.animation.SizeAnimationModifierNode$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                long j6 = (((long) i) << 32) | (((long) i2) & 4294967295L);
                LayoutDirection layoutDirection = jt5Var.getLayoutDirection();
                long j7 = j5;
                float f = (((int) (j6 >> 32)) - ((int) (j7 >> 32))) / 2.0f;
                float f2 = (((int) (j6 & 4294967295L)) - ((int) (j7 & 4294967295L))) / 2.0f;
                float f3 = layoutDirection == LayoutDirection.Ltr ? -1.0f : (-1.0f) * (-1.0f);
                float f4 = (1.0f - 1.0f) * f2;
                int iRound = Math.round((f3 + 1.0f) * f);
                AbstractC0343j.m1520i(abstractC0343j, l87Var, (((long) Math.round(f4)) & 4294967295L) | (((long) iRound) << 32));
                return xfa.f68157a;
            }
        });
    }
}
