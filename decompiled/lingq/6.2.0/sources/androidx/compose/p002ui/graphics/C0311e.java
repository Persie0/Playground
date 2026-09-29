package androidx.compose.p002ui.graphics;

import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.node.InterfaceC0354d;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import kotlin.collections.AbstractC3194a;
import p000.ct5;
import p000.d16;
import p000.if1;
import p000.it5;
import p000.jt5;
import p000.k9a;
import p000.l87;
import p000.o39;
import p000.ov8;
import p000.pd0;
import p000.tv8;
import p000.up4;
import p000.ux5;
import p000.vi3;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0311e extends d16 implements InterfaceC0354d, ov8 {

    /* JADX INFO: renamed from: J */
    public float f3958J;

    /* JADX INFO: renamed from: K */
    public float f3959K;

    /* JADX INFO: renamed from: L */
    public float f3960L;

    /* JADX INFO: renamed from: M */
    public float f3961M;

    /* JADX INFO: renamed from: N */
    public float f3962N;

    /* JADX INFO: renamed from: O */
    public float f3963O;

    /* JADX INFO: renamed from: P */
    public long f3964P;

    /* JADX INFO: renamed from: Q */
    public o39 f3965Q;

    /* JADX INFO: renamed from: R */
    public boolean f3966R;

    /* JADX INFO: renamed from: S */
    public long f3967S;

    /* JADX INFO: renamed from: T */
    public long f3968T;

    /* JADX INFO: renamed from: U */
    public int f3969U;

    /* JADX INFO: renamed from: V */
    public int f3970V;

    /* JADX INFO: renamed from: W */
    public up4 f3971W;

    /* JADX INFO: renamed from: X */
    public vi3 f3972X;

    @Override // p000.ov8
    /* JADX INFO: renamed from: H0 */
    public final void mo787H0(tv8 tv8Var) {
        if (this.f3966R) {
            AbstractC0426f.m1865i(tv8Var, this.f3965Q);
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
        return jt5Var.mo9895M0(l87VarMo1514r.f49301a, l87VarMo1514r.f49302b, AbstractC3194a.m15360M(), new vi3() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                AbstractC0343j.m1525p((AbstractC0343j) obj, l87VarMo1514r, 0, 0, this.f3972X, 4);
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
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f3958J);
        sb.append(", scaleY=");
        sb.append(this.f3959K);
        sb.append(", alpha = ");
        sb.append(this.f3960L);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f3961M);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.f3962N);
        sb.append(", cameraDistance=");
        sb.append(this.f3963O);
        sb.append(", transformOrigin=");
        sb.append((Object) k9a.m15026b(this.f3964P));
        sb.append(", shape=");
        sb.append(this.f3965Q);
        sb.append(", clip=");
        sb.append(this.f3966R);
        sb.append(", renderEffect=null, ambientShadowColor=");
        ux5.m23002y(this.f3967S, ", spotShadowColor=", sb);
        ux5.m23002y(this.f3968T, ", compositingStrategy=", sb);
        sb.append((Object) if1.m13860a(this.f3969U));
        sb.append(", blendMode=");
        sb.append((Object) pd0.m19073a(this.f3970V));
        sb.append(", colorFilter=nulloutsets=");
        sb.append(this.f3971W);
        sb.append(')');
        return sb.toString();
    }
}
