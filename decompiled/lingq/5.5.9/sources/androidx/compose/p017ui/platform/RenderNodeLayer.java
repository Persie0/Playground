package androidx.compose.p017ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import androidx.compose.p017ui.unit.LayoutDirection;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5207g;
import p166i1.InterfaceC6140d0;
import p260m8.C7499b;
import p338qd.C8584v;
import p375s0.C8940b;
import p375s0.C8941c;
import p375s0.C8944f;
import p387t0.C9139d;
import p387t0.C9141e;
import p387t0.C9144f0;
import p387t0.C9147h;
import p387t0.C9149i;
import p387t0.C9162o0;
import p387t0.C9166r;
import p387t0.InterfaceC9138c0;
import p387t0.InterfaceC9154k0;
import p387t0.InterfaceC9165q;
import p470x1.C10020h;
import p470x1.C10022j;
import p470x1.InterfaceC10015c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class RenderNodeLayer implements InterfaceC6140d0 {

    /* JADX INFO: renamed from: H */
    public static final InterfaceC2056p<InterfaceC0637k0, Matrix, C9072e> f4187H = new InterfaceC2056p<InterfaceC0637k0, Matrix, C9072e>() { // from class: androidx.compose.ui.platform.RenderNodeLayer$Companion$getMatrix$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final C9072e mo1337m0(InterfaceC0637k0 interfaceC0637k0, Matrix matrix) {
            InterfaceC0637k0 interfaceC0637k1 = interfaceC0637k0;
            Matrix matrix2 = matrix;
            C5207g.m11111f(interfaceC0637k1, "rn");
            C5207g.m11111f(matrix2, "matrix");
            interfaceC0637k1.mo2387a0(matrix2);
            return C9072e.f47360a;
        }
    };

    /* JADX INFO: renamed from: a */
    public final AndroidComposeView f4188a;

    /* JADX INFO: renamed from: b */
    public InterfaceC2052l<? super InterfaceC9165q, C9072e> f4189b;

    /* JADX INFO: renamed from: c */
    public InterfaceC2041a<C9072e> f4190c;

    /* JADX INFO: renamed from: d */
    public boolean f4191d;

    /* JADX INFO: renamed from: e */
    public final C0673w0 f4192e;

    /* JADX INFO: renamed from: f */
    public boolean f4193f;

    /* JADX INFO: renamed from: g */
    public boolean f4194g;

    /* JADX INFO: renamed from: h */
    public C9147h f4195h;

    /* JADX INFO: renamed from: i */
    public final C0667u0<InterfaceC0637k0> f4196i;

    /* JADX INFO: renamed from: j */
    public final C9166r f4197j;

    /* JADX INFO: renamed from: k */
    public long f4198k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC0637k0 f4199l;

    public RenderNodeLayer(AndroidComposeView androidComposeView, InterfaceC2052l<? super InterfaceC9165q, C9072e> interfaceC2052l, InterfaceC2041a<C9072e> interfaceC2041a) {
        C5207g.m11111f(androidComposeView, "ownerView");
        C5207g.m11111f(interfaceC2052l, "drawBlock");
        C5207g.m11111f(interfaceC2041a, "invalidateParentLayer");
        this.f4188a = androidComposeView;
        this.f4189b = interfaceC2052l;
        this.f4190c = interfaceC2041a;
        this.f4192e = new C0673w0(androidComposeView.getDensity());
        this.f4196i = new C0667u0<>(f4187H);
        this.f4197j = new C9166r(0);
        this.f4198k = C9162o0.f47689b;
        InterfaceC0637k0 c0679y0 = Build.VERSION.SDK_INT >= 29 ? new C0679y0(androidComposeView) : new C0676x0(androidComposeView);
        c0679y0.mo2377R();
        this.f4199l = c0679y0;
    }

    @Override // p166i1.InterfaceC6140d0
    /* JADX INFO: renamed from: a */
    public final void mo2311a(InterfaceC2041a interfaceC2041a, InterfaceC2052l interfaceC2052l) {
        C5207g.m11111f(interfaceC2052l, "drawBlock");
        C5207g.m11111f(interfaceC2041a, "invalidateParentLayer");
        m2321k(false);
        this.f4193f = false;
        this.f4194g = false;
        this.f4198k = C9162o0.f47689b;
        this.f4189b = interfaceC2052l;
        this.f4190c = interfaceC2041a;
    }

    @Override // p166i1.InterfaceC6140d0
    /* JADX INFO: renamed from: b */
    public final void mo2312b(C8940b c8940b, boolean z10) {
        InterfaceC0637k0 interfaceC0637k0 = this.f4199l;
        C0667u0<InterfaceC0637k0> c0667u0 = this.f4196i;
        if (!z10) {
            C7499b.m14939f0(c0667u0.m2492b(interfaceC0637k0), c8940b);
            return;
        }
        float[] fArrM2491a = c0667u0.m2491a(interfaceC0637k0);
        if (fArrM2491a != null) {
            C7499b.m14939f0(fArrM2491a, c8940b);
            return;
        }
        c8940b.f46884a = 0.0f;
        c8940b.f46885b = 0.0f;
        c8940b.f46886c = 0.0f;
        c8940b.f46887d = 0.0f;
    }

    @Override // p166i1.InterfaceC6140d0
    /* JADX INFO: renamed from: c */
    public final void mo2313c() {
        InterfaceC0637k0 interfaceC0637k0 = this.f4199l;
        if (interfaceC0637k0.mo2375P()) {
            interfaceC0637k0.mo2371L();
        }
        this.f4189b = null;
        this.f4190c = null;
        this.f4193f = true;
        m2321k(false);
        AndroidComposeView androidComposeView = this.f4188a;
        androidComposeView.f3958P = true;
        androidComposeView.m2256E(this);
    }

    @Override // p166i1.InterfaceC6140d0
    /* JADX INFO: renamed from: d */
    public final void mo2314d(InterfaceC9165q interfaceC9165q) {
        C5207g.m11111f(interfaceC9165q, "canvas");
        Canvas canvas = C9141e.f47648a;
        Canvas canvas2 = ((C9139d) interfaceC9165q).f47644a;
        boolean zIsHardwareAccelerated = canvas2.isHardwareAccelerated();
        boolean z10 = false;
        InterfaceC0637k0 interfaceC0637k0 = this.f4199l;
        if (zIsHardwareAccelerated) {
            mo2319i();
            if (interfaceC0637k0.mo2389b0() > 0.0f) {
                z10 = true;
            }
            this.f4194g = z10;
            if (z10) {
                interfaceC9165q.mo17430q();
            }
            interfaceC0637k0.mo2366G(canvas2);
            if (this.f4194g) {
                interfaceC9165q.mo17421f();
                return;
            }
            return;
        }
        float fMo2367H = interfaceC0637k0.mo2367H();
        float fMo2379T = interfaceC0637k0.mo2379T();
        float fMo2382W = interfaceC0637k0.mo2382W();
        float fMo2365F = interfaceC0637k0.mo2365F();
        if (interfaceC0637k0.mo2361A() < 1.0f) {
            C9147h c9147hM17467a = this.f4195h;
            if (c9147hM17467a == null) {
                c9147hM17467a = C9149i.m17467a();
                this.f4195h = c9147hM17467a;
            }
            c9147hM17467a.m17442d(interfaceC0637k0.mo2361A());
            canvas2.saveLayer(fMo2367H, fMo2379T, fMo2382W, fMo2365F, c9147hM17467a.f47651a);
        } else {
            interfaceC9165q.mo17420d();
        }
        interfaceC9165q.mo17427n(fMo2367H, fMo2379T);
        interfaceC9165q.mo17423i(this.f4196i.m2492b(interfaceC0637k0));
        if (interfaceC0637k0.mo2383X() || interfaceC0637k0.mo2378S()) {
            this.f4192e.m2497a(interfaceC9165q);
        }
        InterfaceC2052l<? super InterfaceC9165q, C9072e> interfaceC2052l = this.f4189b;
        if (interfaceC2052l != null) {
            interfaceC2052l.mo528n(interfaceC9165q);
        }
        interfaceC9165q.mo17428o();
        m2321k(false);
    }

    @Override // p166i1.InterfaceC6140d0
    /* JADX INFO: renamed from: e */
    public final boolean mo2315e(long j10) {
        float fM17164c = C8941c.m17164c(j10);
        float fM17165d = C8941c.m17165d(j10);
        InterfaceC0637k0 interfaceC0637k0 = this.f4199l;
        if (interfaceC0637k0.mo2378S()) {
            return 0.0f <= fM17164c && fM17164c < ((float) interfaceC0637k0.mo2388b()) && 0.0f <= fM17165d && fM17165d < ((float) interfaceC0637k0.mo2386a());
        }
        if (interfaceC0637k0.mo2383X()) {
            return this.f4192e.m2499c(j10);
        }
        return true;
    }

    @Override // p166i1.InterfaceC6140d0
    /* JADX INFO: renamed from: f */
    public final void mo2316f(float f3, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, long j10, InterfaceC9154k0 interfaceC9154k0, boolean z10, long j11, long j12, int i10, LayoutDirection layoutDirection, InterfaceC10015c interfaceC10015c) {
        InterfaceC2041a<C9072e> interfaceC2041a;
        C5207g.m11111f(interfaceC9154k0, "shape");
        C5207g.m11111f(layoutDirection, "layoutDirection");
        C5207g.m11111f(interfaceC10015c, "density");
        this.f4198k = j10;
        InterfaceC0637k0 interfaceC0637k0 = this.f4199l;
        boolean zMo2383X = interfaceC0637k0.mo2383X();
        C0673w0 c0673w0 = this.f4192e;
        boolean z11 = false;
        boolean z12 = zMo2383X && !(c0673w0.f4369i ^ true);
        interfaceC0637k0.mo2397x(f3);
        interfaceC0637k0.mo2394p(f10);
        interfaceC0637k0.mo2396v(f11);
        interfaceC0637k0.mo2398z(f12);
        interfaceC0637k0.mo2393m(f13);
        interfaceC0637k0.mo2373N(f14);
        interfaceC0637k0.mo2381V(C8584v.m16780C(j11));
        interfaceC0637k0.mo2385Z(C8584v.m16780C(j12));
        interfaceC0637k0.mo2392l(f17);
        interfaceC0637k0.mo2363D(f15);
        interfaceC0637k0.mo2390i(f16);
        interfaceC0637k0.mo2362B(f18);
        int i11 = C9162o0.f47690c;
        interfaceC0637k0.mo2368I(Float.intBitsToFloat((int) (j10 >> 32)) * interfaceC0637k0.mo2388b());
        interfaceC0637k0.mo2372M(C9162o0.m17480a(j10) * interfaceC0637k0.mo2386a());
        C9144f0.a aVar = C9144f0.f47650a;
        interfaceC0637k0.mo2384Y(z10 && interfaceC9154k0 != aVar);
        interfaceC0637k0.mo2369J(z10 && interfaceC9154k0 == aVar);
        interfaceC0637k0.mo2391k();
        interfaceC0637k0.mo2395r(i10);
        boolean zM2500d = this.f4192e.m2500d(interfaceC9154k0, interfaceC0637k0.mo2361A(), interfaceC0637k0.mo2383X(), interfaceC0637k0.mo2389b0(), layoutDirection, interfaceC10015c);
        interfaceC0637k0.mo2376Q(c0673w0.m2498b());
        if (interfaceC0637k0.mo2383X() && !(!c0673w0.f4369i)) {
            z11 = true;
        }
        AndroidComposeView androidComposeView = this.f4188a;
        if (z12 == z11 && (!z11 || !zM2500d)) {
            C0609b2.f4286a.m2339a(androidComposeView);
        } else if (!this.f4191d && !this.f4193f) {
            androidComposeView.invalidate();
            m2321k(true);
        }
        if (!this.f4194g && interfaceC0637k0.mo2389b0() > 0.0f && (interfaceC2041a = this.f4190c) != null) {
            interfaceC2041a.mo807E();
        }
        this.f4196i.m2493c();
    }

    @Override // p166i1.InterfaceC6140d0
    /* JADX INFO: renamed from: g */
    public final void mo2317g(long j10) {
        int i10 = (int) (j10 >> 32);
        int iM18628b = C10022j.m18628b(j10);
        long j11 = this.f4198k;
        int i11 = C9162o0.f47690c;
        float f3 = i10;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) * f3;
        InterfaceC0637k0 interfaceC0637k0 = this.f4199l;
        interfaceC0637k0.mo2368I(fIntBitsToFloat);
        float f10 = iM18628b;
        interfaceC0637k0.mo2372M(C9162o0.m17480a(this.f4198k) * f10);
        if (interfaceC0637k0.mo2370K(interfaceC0637k0.mo2367H(), interfaceC0637k0.mo2379T(), interfaceC0637k0.mo2367H() + i10, interfaceC0637k0.mo2379T() + iM18628b)) {
            long jM16788m = C8584v.m16788m(f3, f10);
            C0673w0 c0673w0 = this.f4192e;
            if (!C8944f.m17174a(c0673w0.f4364d, jM16788m)) {
                c0673w0.f4364d = jM16788m;
                c0673w0.f4368h = true;
            }
            interfaceC0637k0.mo2376Q(c0673w0.m2498b());
            if (!this.f4191d && !this.f4193f) {
                this.f4188a.invalidate();
                m2321k(true);
            }
            this.f4196i.m2493c();
        }
    }

    @Override // p166i1.InterfaceC6140d0
    /* JADX INFO: renamed from: h */
    public final void mo2318h(long j10) {
        InterfaceC0637k0 interfaceC0637k0 = this.f4199l;
        int iMo2367H = interfaceC0637k0.mo2367H();
        int iMo2379T = interfaceC0637k0.mo2379T();
        int i10 = (int) (j10 >> 32);
        int iM18625a = C10020h.m18625a(j10);
        if (iMo2367H == i10 && iMo2379T == iM18625a) {
            return;
        }
        interfaceC0637k0.mo2364E(i10 - iMo2367H);
        interfaceC0637k0.mo2374O(iM18625a - iMo2379T);
        C0609b2.f4286a.m2339a(this.f4188a);
        this.f4196i.m2493c();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    @Override // p166i1.InterfaceC6140d0
    /* JADX INFO: renamed from: i */
    public final void mo2319i() {
        InterfaceC9138c0 interfaceC9138c0;
        boolean z10 = this.f4191d;
        InterfaceC0637k0 interfaceC0637k0 = this.f4199l;
        if (z10 || !interfaceC0637k0.mo2375P()) {
            m2321k(false);
            if (interfaceC0637k0.mo2383X()) {
                C0673w0 c0673w0 = this.f4192e;
                if (!c0673w0.f4369i) {
                    interfaceC9138c0 = null;
                } else {
                    c0673w0.m2501e();
                    interfaceC9138c0 = c0673w0.f4367g;
                }
            } else {
                interfaceC9138c0 = null;
            }
            InterfaceC2052l<? super InterfaceC9165q, C9072e> interfaceC2052l = this.f4189b;
            if (interfaceC2052l != null) {
                interfaceC0637k0.mo2380U(this.f4197j, interfaceC9138c0, interfaceC2052l);
            }
        }
    }

    @Override // p166i1.InterfaceC6140d0
    public final void invalidate() {
        if (!this.f4191d && !this.f4193f) {
            this.f4188a.invalidate();
            m2321k(true);
        }
    }

    @Override // p166i1.InterfaceC6140d0
    /* JADX INFO: renamed from: j */
    public final long mo2320j(boolean z10, long j10) {
        InterfaceC0637k0 interfaceC0637k0 = this.f4199l;
        C0667u0<InterfaceC0637k0> c0667u0 = this.f4196i;
        if (!z10) {
            return C7499b.m14937e0(j10, c0667u0.m2492b(interfaceC0637k0));
        }
        float[] fArrM2491a = c0667u0.m2491a(interfaceC0637k0);
        if (fArrM2491a != null) {
            return C7499b.m14937e0(j10, fArrM2491a);
        }
        int i10 = C8941c.f46891e;
        return C8941c.f46889c;
    }

    /* JADX INFO: renamed from: k */
    public final void m2321k(boolean z10) {
        if (z10 != this.f4191d) {
            this.f4191d = z10;
            this.f4188a.m2254C(this, z10);
        }
    }
}
