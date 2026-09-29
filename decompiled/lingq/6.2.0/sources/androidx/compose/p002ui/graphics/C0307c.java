package androidx.compose.p002ui.graphics;

import p000.aa1;
import p000.d16;
import p000.d32;
import p000.fa4;
import p000.g9a;
import p000.i16;
import p000.if1;
import p000.k9a;
import p000.o39;
import p000.pd0;
import p000.q98;
import p000.up4;
import p000.ux5;
import p000.vi3;
import p000.wq1;
import p000.xfa;
import p000.y64;
import p000.z91;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.c */
/* JADX INFO: loaded from: classes.dex */
final class C0307c extends i16 {

    /* JADX INFO: renamed from: H */
    public final up4 f3926H;

    /* JADX INFO: renamed from: b */
    public final float f3927b;

    /* JADX INFO: renamed from: c */
    public final float f3928c;

    /* JADX INFO: renamed from: d */
    public final float f3929d;

    /* JADX INFO: renamed from: e */
    public final float f3930e;

    /* JADX INFO: renamed from: f */
    public final float f3931f;

    /* JADX INFO: renamed from: g */
    public final long f3932g;

    /* JADX INFO: renamed from: h */
    public final o39 f3933h;

    /* JADX INFO: renamed from: i */
    public final boolean f3934i;

    /* JADX INFO: renamed from: j */
    public final long f3935j;

    /* JADX INFO: renamed from: k */
    public final long f3936k;

    /* JADX INFO: renamed from: l */
    public final int f3937l;

    public C0307c(float f, float f2, float f3, float f4, float f5, long j, o39 o39Var, boolean z, long j2, long j3, int i, up4 up4Var) {
        this.f3927b = f;
        this.f3928c = f2;
        this.f3929d = f3;
        this.f3930e = f4;
        this.f3931f = f5;
        this.f3932g = j;
        this.f3933h = o39Var;
        this.f3934i = z;
        this.f3935j = j2;
        this.f3936k = j3;
        this.f3937l = i;
        this.f3926H = up4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0307c)) {
            return false;
        }
        C0307c c0307c = (C0307c) obj;
        return Float.compare(this.f3927b, c0307c.f3927b) == 0 && Float.compare(this.f3928c, c0307c.f3928c) == 0 && Float.compare(this.f3929d, c0307c.f3929d) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f3930e, c0307c.f3930e) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f3931f, c0307c.f3931f) == 0 && Float.compare(8.0f, 8.0f) == 0 && k9a.m15025a(this.f3932g, c0307c.f3932g) && fa4.m11650l(this.f3933h, c0307c.f3933h) && this.f3934i == c0307c.f3934i && aa1.m199c(this.f3935j, c0307c.f3935j) && aa1.m199c(this.f3936k, c0307c.f3936k) && this.f3937l == c0307c.f3937l && fa4.m11650l(this.f3926H, c0307c.f3926H);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        final C0311e c0311e = new C0311e();
        c0311e.f3958J = this.f3927b;
        c0311e.f3959K = this.f3928c;
        c0311e.f3960L = this.f3929d;
        c0311e.f3961M = this.f3930e;
        c0311e.f3962N = this.f3931f;
        c0311e.f3963O = 8.0f;
        c0311e.f3964P = this.f3932g;
        c0311e.f3965Q = this.f3933h;
        c0311e.f3966R = this.f3934i;
        c0311e.f3967S = this.f3935j;
        c0311e.f3968T = this.f3936k;
        c0311e.f3969U = this.f3937l;
        c0311e.f3970V = 3;
        c0311e.f3971W = this.f3926H;
        c0311e.f3972X = new vi3() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$layerBlock$1
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                q98 q98Var = (q98) obj;
                C0311e c0311e2 = c0311e;
                q98Var.m19823p(c0311e2.f3958J);
                q98Var.m19824q(c0311e2.f3959K);
                q98Var.m19813c(c0311e2.f3960L);
                q98Var.m19810A(0.0f);
                q98Var.m19811D(0.0f);
                q98Var.m19825r(c0311e2.f3961M);
                q98Var.m19820l(0.0f);
                q98Var.m19821m(0.0f);
                q98Var.m19822n(c0311e2.f3962N);
                q98Var.m19815e(c0311e2.f3963O);
                q98Var.m19828x(c0311e2.f3964P);
                q98Var.m19826s(c0311e2.f3965Q);
                q98Var.m19816f(c0311e2.f3966R);
                q98Var.m19819j(null);
                q98Var.m19814d(c0311e2.f3967S);
                q98Var.m19827t(c0311e2.f3968T);
                q98Var.m19818i(c0311e2.f3969U);
                int i = c0311e2.f3970V;
                if (q98Var.f57468S != i) {
                    q98Var.f57470a |= 524288;
                    q98Var.f57468S = i;
                }
                q98Var.m19817g(null);
                up4 up4Var = c0311e2.f3971W;
                if (!fa4.m11650l(q98Var.f57463N, up4Var)) {
                    q98Var.f57470a |= 1048576;
                    q98Var.f57463N = up4Var;
                }
                return xfa.f68157a;
            }
        };
        return c0311e;
    }

    public final int hashCode() {
        int iM24105a = wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(Float.hashCode(this.f3927b) * 31, this.f3928c, 31), this.f3929d, 31), 0.0f, 31), 0.0f, 31), this.f3930e, 31), 0.0f, 31), 0.0f, 31), this.f3931f, 31), 8.0f, 31);
        int i = k9a.f46916c;
        int iM12428e = g9a.m12428e((this.f3933h.hashCode() + ux5.m22981d(this.f3932g, iM24105a, 31)) * 31, 961, this.f3934i);
        int i2 = aa1.f413l;
        return this.f3926H.hashCode() + wq1.m24106b(3, wq1.m24106b(this.f3937l, ux5.m22981d(this.f3936k, ux5.m22981d(this.f3935j, iM12428e, 31), 31), 31), 961);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "graphicsLayer";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(Float.valueOf(this.f3927b), "scaleX");
        z91Var.m25511b(Float.valueOf(this.f3928c), "scaleY");
        z91Var.m25511b(Float.valueOf(this.f3929d), "alpha");
        Float fValueOf = Float.valueOf(0.0f);
        z91Var.m25511b(fValueOf, "translationX");
        z91Var.m25511b(fValueOf, "translationY");
        z91Var.m25511b(Float.valueOf(this.f3930e), "shadowElevation");
        z91Var.m25511b(fValueOf, "rotationX");
        z91Var.m25511b(fValueOf, "rotationY");
        z91Var.m25511b(Float.valueOf(this.f3931f), "rotationZ");
        z91Var.m25511b(Float.valueOf(8.0f), "cameraDistance");
        z91Var.m25511b(new k9a(this.f3932g), "transformOrigin");
        z91Var.m25511b(this.f3933h, "shape");
        z91Var.m25511b(Boolean.valueOf(this.f3934i), "clip");
        z91Var.m25511b(null, "renderEffect");
        z91Var.m25511b(new aa1(this.f3935j), "ambientShadowColor");
        z91Var.m25511b(new aa1(this.f3936k), "spotShadowColor");
        z91Var.m25511b(new if1(this.f3937l), "compositingStrategy");
        z91Var.m25511b(new pd0(), "blendMode");
        z91Var.m25511b(null, "colorFilter");
        z91Var.m25511b(this.f3926H, "outsets");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        C0311e c0311e = (C0311e) d16Var;
        c0311e.f3958J = this.f3927b;
        c0311e.f3959K = this.f3928c;
        c0311e.f3960L = this.f3929d;
        c0311e.f3961M = this.f3930e;
        c0311e.f3962N = this.f3931f;
        c0311e.f3963O = 8.0f;
        c0311e.f3964P = this.f3932g;
        c0311e.f3965Q = this.f3933h;
        c0311e.f3966R = this.f3934i;
        c0311e.f3967S = this.f3935j;
        c0311e.f3968T = this.f3936k;
        c0311e.f3969U = this.f3937l;
        c0311e.f3970V = 3;
        c0311e.f3971W = this.f3926H;
        d32.m10052m0(c0311e, c0311e.f3972X);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.f3927b);
        sb.append(", scaleY=");
        sb.append(this.f3928c);
        sb.append(", alpha=");
        sb.append(this.f3929d);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f3930e);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.f3931f);
        sb.append(", cameraDistance=8.0, transformOrigin=");
        sb.append((Object) k9a.m15026b(this.f3932g));
        sb.append(", shape=");
        sb.append(this.f3933h);
        sb.append(", clip=");
        sb.append(this.f3934i);
        sb.append(", renderEffect=null, ambientShadowColor=");
        ux5.m23002y(this.f3935j, ", spotShadowColor=", sb);
        ux5.m23002y(this.f3936k, ", compositingStrategy=", sb);
        sb.append((Object) if1.m13860a(this.f3937l));
        sb.append(", blendMode=");
        sb.append((Object) pd0.m19073a(3));
        sb.append(", colorFilter=null, outsets=");
        sb.append(this.f3926H);
        sb.append(')');
        return sb.toString();
    }
}
