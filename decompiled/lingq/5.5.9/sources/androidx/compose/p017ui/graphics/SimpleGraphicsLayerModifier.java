package androidx.compose.p017ui.graphics;

import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.layout.InterfaceC0524e;
import androidx.compose.p017ui.node.InterfaceC0544c;
import cm.InterfaceC2052l;
import dm.C5207g;
import kotlin.collections.C6753d;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5653q;
import p387t0.C9162o0;
import p387t0.C9169u;
import p387t0.InterfaceC9154k0;
import p387t0.InterfaceC9172x;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class SimpleGraphicsLayerModifier extends InterfaceC0500b.c implements InterfaceC0544c {

    /* JADX INFO: renamed from: H */
    public float f3429H;

    /* JADX INFO: renamed from: I */
    public float f3430I;

    /* JADX INFO: renamed from: J */
    public float f3431J;

    /* JADX INFO: renamed from: K */
    public float f3432K;

    /* JADX INFO: renamed from: L */
    public float f3433L;

    /* JADX INFO: renamed from: M */
    public float f3434M;

    /* JADX INFO: renamed from: N */
    public float f3435N;

    /* JADX INFO: renamed from: O */
    public float f3436O;

    /* JADX INFO: renamed from: P */
    public long f3437P;

    /* JADX INFO: renamed from: Q */
    public InterfaceC9154k0 f3438Q;

    /* JADX INFO: renamed from: R */
    public boolean f3439R;

    /* JADX INFO: renamed from: S */
    public long f3440S;

    /* JADX INFO: renamed from: T */
    public long f3441T;

    /* JADX INFO: renamed from: U */
    public int f3442U;

    /* JADX INFO: renamed from: V */
    public final InterfaceC2052l<? super InterfaceC9172x, C9072e> f3443V = new InterfaceC2052l<InterfaceC9172x, C9072e>() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$layerBlock$1
        {
            super(1);
        }

        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C9072e mo528n(InterfaceC9172x interfaceC9172x) {
            InterfaceC9172x interfaceC9172x2 = interfaceC9172x;
            C5207g.m11111f(interfaceC9172x2, "$this$null");
            SimpleGraphicsLayerModifier simpleGraphicsLayerModifier = this.f3446b;
            interfaceC9172x2.mo17465x(simpleGraphicsLayerModifier.f3444k);
            interfaceC9172x2.mo17459p(simpleGraphicsLayerModifier.f3445l);
            interfaceC9172x2.mo17463v(simpleGraphicsLayerModifier.f3429H);
            interfaceC9172x2.mo17466z(simpleGraphicsLayerModifier.f3430I);
            interfaceC9172x2.mo17458m(simpleGraphicsLayerModifier.f3431J);
            interfaceC9172x2.mo17452G(simpleGraphicsLayerModifier.f3432K);
            interfaceC9172x2.mo17451D(simpleGraphicsLayerModifier.f3433L);
            interfaceC9172x2.mo17453i(simpleGraphicsLayerModifier.f3434M);
            interfaceC9172x2.mo17457l(simpleGraphicsLayerModifier.f3435N);
            interfaceC9172x2.mo17450B(simpleGraphicsLayerModifier.f3436O);
            interfaceC9172x2.mo17462u0(simpleGraphicsLayerModifier.f3437P);
            interfaceC9172x2.mo17454j0(simpleGraphicsLayerModifier.f3438Q);
            interfaceC9172x2.mo17460q0(simpleGraphicsLayerModifier.f3439R);
            interfaceC9172x2.mo17455k();
            interfaceC9172x2.mo17456k0(simpleGraphicsLayerModifier.f3440S);
            interfaceC9172x2.mo17464v0(simpleGraphicsLayerModifier.f3441T);
            interfaceC9172x2.mo17461r(simpleGraphicsLayerModifier.f3442U);
            return C9072e.f47360a;
        }
    };

    /* JADX INFO: renamed from: k */
    public float f3444k;

    /* JADX INFO: renamed from: l */
    public float f3445l;

    public SimpleGraphicsLayerModifier(float f3, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, long j10, InterfaceC9154k0 interfaceC9154k0, boolean z10, long j11, long j12, int i10) {
        this.f3444k = f3;
        this.f3445l = f10;
        this.f3429H = f11;
        this.f3430I = f12;
        this.f3431J = f13;
        this.f3432K = f14;
        this.f3433L = f15;
        this.f3434M = f16;
        this.f3435N = f17;
        this.f3436O = f18;
        this.f3437P = j10;
        this.f3438Q = interfaceC9154k0;
        this.f3439R = z10;
        this.f3440S = j11;
        this.f3441T = j12;
        this.f3442U = i10;
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0544c
    /* JADX INFO: renamed from: e */
    public final InterfaceC5653q mo1943e(InterfaceC0524e interfaceC0524e, InterfaceC5651o interfaceC5651o, long j10) {
        C5207g.m11111f(interfaceC0524e, "$this$measure");
        final AbstractC0526g abstractC0526gMo2048w = interfaceC5651o.mo2048w(j10);
        return interfaceC0524e.m2043P(abstractC0526gMo2048w.f3686a, abstractC0526gMo2048w.f3687b, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(AbstractC0526g.a aVar) {
                AbstractC0526g.a aVar2 = aVar;
                C5207g.m11111f(aVar2, "$this$layout");
                AbstractC0526g.a.m2061g(aVar2, abstractC0526gMo2048w, 0, 0, this.f3443V, 4);
                return C9072e.f47360a;
            }
        });
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb2.append(this.f3444k);
        sb2.append(", scaleY=");
        sb2.append(this.f3445l);
        sb2.append(", alpha = ");
        sb2.append(this.f3429H);
        sb2.append(", translationX=");
        sb2.append(this.f3430I);
        sb2.append(", translationY=");
        sb2.append(this.f3431J);
        sb2.append(", shadowElevation=");
        sb2.append(this.f3432K);
        sb2.append(", rotationX=");
        sb2.append(this.f3433L);
        sb2.append(", rotationY=");
        sb2.append(this.f3434M);
        sb2.append(", rotationZ=");
        sb2.append(this.f3435N);
        sb2.append(", cameraDistance=");
        sb2.append(this.f3436O);
        sb2.append(", transformOrigin=");
        sb2.append((Object) C9162o0.m17481b(this.f3437P));
        sb2.append(", shape=");
        sb2.append(this.f3438Q);
        sb2.append(", clip=");
        sb2.append(this.f3439R);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        sb2.append((Object) C9169u.m17503i(this.f3440S));
        sb2.append(", spotShadowColor=");
        sb2.append((Object) C9169u.m17503i(this.f3441T));
        sb2.append(", compositingStrategy=");
        sb2.append((Object) ("CompositingStrategy(value=" + this.f3442U + ')'));
        sb2.append(')');
        return sb2.toString();
    }
}
