package androidx.compose.p002ui.graphics;

import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.node.InterfaceC0354d;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import kotlin.collections.AbstractC3194a;
import p000.ct5;
import p000.d16;
import p000.it5;
import p000.jc9;
import p000.jt5;
import p000.l87;
import p000.lda;
import p000.o39;
import p000.omd;
import p000.ov8;
import p000.q98;
import p000.te1;
import p000.tv8;
import p000.vi3;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0306b extends d16 implements InterfaceC0354d, ov8 {

    /* JADX INFO: renamed from: J */
    public vi3 f3925J;

    public C0306b(vi3 vi3Var) {
        this.f3925J = vi3Var;
    }

    @Override // p000.ov8
    /* JADX INFO: renamed from: H0 */
    public final void mo787H0(tv8 tv8Var) {
        o39 o39Var;
        boolean z;
        AbstractC0362l abstractC0362lM21976I = te1.m21976I(this, 2);
        if (abstractC0362lM21976I.f4449a0) {
            o39Var = abstractC0362lM21976I.f4447Y;
            z = abstractC0362lM21976I.f4448Z;
        } else {
            q98 q98Var = AbstractC0309d.f3955a;
            if (q98Var == null) {
                AbstractC0309d.f3955a = new q98();
            } else {
                q98Var.m19812b();
            }
            q98 q98Var2 = AbstractC0309d.f3955a;
            q98Var2.getClass();
            q98Var2.f57464O = abstractC0362lM21976I.f4432J.f4327T;
            q98Var2.f57462M = omd.m18152h0(abstractC0362lM21976I.f49303c);
            jc9 jc9VarM16139y = lda.m16139y();
            vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
            jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
            try {
                this.f3925J.invoke(q98Var2);
                lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                o39Var = q98Var2.f57459J;
                z = q98Var2.f57460K;
            } catch (Throwable th) {
                lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                throw th;
            }
        }
        if (z) {
            AbstractC0426f.m1865i(tv8Var, o39Var);
        }
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: O0 */
    public final boolean mo574O0() {
        return false;
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        final l87 l87VarMo1514r = ct5Var.mo1514r(j);
        return jt5Var.mo9895M0(l87VarMo1514r.f49301a, l87VarMo1514r.f49302b, AbstractC3194a.m15360M(), new vi3() { // from class: androidx.compose.ui.graphics.BlockGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                AbstractC0343j.m1525p((AbstractC0343j) obj, l87VarMo1514r, 0, 0, this.f3925J, 4);
                return xfa.f68157a;
            }
        });
    }

    @Override // p000.ov8
    /* JADX INFO: renamed from: m */
    public final boolean mo1399m() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f3925J + ')';
    }
}
