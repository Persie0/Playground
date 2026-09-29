package androidx.compose.animation;

import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.collections.AbstractC3194a;
import p000.C3189km;
import p000.InterfaceC3571se;
import p000.ba4;
import p000.ct5;
import p000.dh9;
import p000.fa4;
import p000.it5;
import p000.jt5;
import p000.k99;
import p000.l43;
import p000.l87;
import p000.n84;
import p000.ss5;
import p000.t66;
import p000.u9a;
import p000.v9a;
import p000.vi3;
import p000.xfa;
import p000.z9a;

/* JADX INFO: renamed from: androidx.compose.animation.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0065d extends ba4 {

    /* JADX INFO: renamed from: K */
    public v9a f1558K;

    /* JADX INFO: renamed from: L */
    public t66 f1559L;

    /* JADX INFO: renamed from: M */
    public C3189km f1560M;

    /* JADX INFO: renamed from: N */
    public long f1561N;

    @Override // p000.d16
    /* JADX INFO: renamed from: T0 */
    public final void mo763T0() {
        this.f1561N = -9223372034707292160L;
    }

    @Override // p000.ba4, androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        final long j2;
        final l87 l87VarMo1514r = ct5Var.mo1514r(j);
        if (jt5Var.mo211f0()) {
            j2 = (((long) l87VarMo1514r.f49301a) << 32) | (((long) l87VarMo1514r.f49302b) & 4294967295L);
        } else {
            v9a v9aVar = this.f1558K;
            int i = l87VarMo1514r.f49301a;
            if (v9aVar == null) {
                j2 = (((long) i) << 32) | (((long) l87VarMo1514r.f49302b) & 4294967295L);
                this.f1561N = j2;
            } else {
                final long j3 = (((long) l87VarMo1514r.f49302b) & 4294967295L) | (((long) i) << 32);
                u9a u9aVarM23193a = v9aVar.m23193a(new vi3() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        long j4;
                        l43 l43Var;
                        z9a z9aVar = (z9a) obj;
                        Object objMo217a = z9aVar.mo217a();
                        C0065d c0065d = this.f1351b;
                        if (fa4.m11650l(objMo217a, c0065d.f1560M.mo217a())) {
                            j4 = n84.m17279a(c0065d.f1561N, -9223372034707292160L) ? j3 : c0065d.f1561N;
                        } else {
                            dh9 dh9Var = (dh9) c0065d.f1560M.f47507d.m17255g(z9aVar.mo217a());
                            j4 = dh9Var != null ? ((n84) dh9Var.getValue()).f52482a : 0L;
                        }
                        dh9 dh9Var2 = (dh9) c0065d.f1560M.f47507d.m17255g(z9aVar.mo218c());
                        long j5 = dh9Var2 != null ? ((n84) dh9Var2.getValue()).f52482a : 0L;
                        k99 k99Var = (k99) c0065d.f1559L.getValue();
                        return (k99Var == null || (l43Var = (l43) k99Var.f46914a.invoke(new n84(j4), new n84(j5))) == null) ? ss5.m21698Y(0.0f, 400.0f, null, 5) : l43Var;
                    }
                }, new vi3() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        long j4;
                        C0065d c0065d = this.f1353b;
                        if (fa4.m11650l(obj, c0065d.f1560M.mo217a())) {
                            j4 = n84.m17279a(c0065d.f1561N, -9223372034707292160L) ? j3 : c0065d.f1561N;
                        } else {
                            dh9 dh9Var = (dh9) c0065d.f1560M.f47507d.m17255g(obj);
                            j4 = dh9Var != null ? ((n84) dh9Var.getValue()).f52482a : 0L;
                        }
                        return new n84(j4);
                    }
                });
                this.f1560M.getClass();
                j2 = ((n84) u9aVarM23193a.getValue()).f52482a;
                this.f1561N = ((n84) u9aVarM23193a.getValue()).f52482a;
            }
        }
        return jt5Var.mo9895M0((int) (j2 >> 32), (int) (4294967295L & j2), AbstractC3194a.m15360M(), new vi3() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                InterfaceC3571se interfaceC3571se = this.f1348b.f1560M.f47505b;
                l87 l87Var = l87VarMo1514r;
                AbstractC0343j.m1520i((AbstractC0343j) obj, l87Var, interfaceC3571se.mo10276a((((long) l87Var.f49302b) & 4294967295L) | (((long) l87Var.f49301a) << 32), j2, LayoutDirection.Ltr));
                return xfa.f68157a;
            }
        });
    }
}
