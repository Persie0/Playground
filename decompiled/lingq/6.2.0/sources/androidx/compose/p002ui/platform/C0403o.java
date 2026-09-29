package androidx.compose.p002ui.platform;

import android.view.ViewParent;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.graphics.layer.C0312a;
import androidx.compose.p002ui.unit.LayoutDirection;
import p000.AbstractC3695vr;
import p000.an0;
import p000.b17;
import p000.do7;
import p000.f84;
import p000.fb2;
import p000.h66;
import p000.k9a;
import p000.n84;
import p000.omd;
import p000.pk9;
import p000.qp3;
import p000.sp3;
import p000.ts5;
import p000.ui3;
import p000.vi3;
import p000.vz1;
import p000.xfa;
import p000.ym0;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.platform.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0403o implements b17 {

    /* JADX INFO: renamed from: I */
    public int f4835I;

    /* JADX INFO: renamed from: K */
    public pk9 f4837K;

    /* JADX INFO: renamed from: L */
    public boolean f4838L;

    /* JADX INFO: renamed from: M */
    public boolean f4839M;

    /* JADX INFO: renamed from: O */
    public boolean f4841O;

    /* JADX INFO: renamed from: a */
    public C0312a f4843a;

    /* JADX INFO: renamed from: b */
    public final qp3 f4844b;

    /* JADX INFO: renamed from: c */
    public final ViewTreeObserverOnGlobalLayoutListenerC0391c f4845c;

    /* JADX INFO: renamed from: d */
    public zi3 f4846d;

    /* JADX INFO: renamed from: e */
    public ui3 f4847e;

    /* JADX INFO: renamed from: g */
    public boolean f4849g;

    /* JADX INFO: renamed from: i */
    public float[] f4851i;

    /* JADX INFO: renamed from: j */
    public boolean f4852j;

    /* JADX INFO: renamed from: f */
    public long f4848f = 9223372034707292159L;

    /* JADX INFO: renamed from: h */
    public final float[] f4850h = ts5.m22286a();

    /* JADX INFO: renamed from: k */
    public fb2 f4853k = vz1.m23621b();

    /* JADX INFO: renamed from: l */
    public LayoutDirection f4854l = LayoutDirection.Ltr;

    /* JADX INFO: renamed from: H */
    public final an0 f4834H = new an0();

    /* JADX INFO: renamed from: J */
    public long f4836J = k9a.f46915b;

    /* JADX INFO: renamed from: N */
    public boolean f4840N = true;

    /* JADX INFO: renamed from: P */
    public final vi3 f4842P = new vi3() { // from class: androidx.compose.ui.platform.GraphicsLayerOwnerLayer$recordLambda$1
        {
            super(1);
        }

        @Override // p000.vi3
        public final Object invoke(Object obj) {
            InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
            ym0 ym0VarM16515r = interfaceC0310a.mo603o0().m16515r();
            zi3 zi3Var = this.f4578b.f4846d;
            if (zi3Var != null) {
                zi3Var.invoke(ym0VarM16515r, (C0312a) interfaceC0310a.mo603o0().f50065c);
            }
            return xfa.f68157a;
        }
    };

    public C0403o(C0312a c0312a, qp3 qp3Var, ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c, zi3 zi3Var, ui3 ui3Var) {
        this.f4843a = c0312a;
        this.f4844b = qp3Var;
        this.f4845c = viewTreeObserverOnGlobalLayoutListenerC0391c;
        this.f4846d = zi3Var;
        this.f4847e = ui3Var;
    }

    /* JADX INFO: renamed from: a */
    public final float[] m1806a() {
        float[] fArrM22286a = this.f4851i;
        if (fArrM22286a == null) {
            fArrM22286a = ts5.m22286a();
            this.f4851i = fArrM22286a;
        }
        if (this.f4839M) {
            this.f4839M = false;
            float[] fArrM1807b = m1807b();
            if (this.f4840N) {
                return fArrM1807b;
            }
            if (!AbstractC3695vr.m23510u(fArrM1807b, fArrM22286a)) {
                fArrM22286a[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrM22286a[0])) {
            return null;
        }
        return fArrM22286a;
    }

    /* JADX INFO: renamed from: b */
    public final float[] m1807b() {
        boolean z = this.f4838L;
        float[] fArr = this.f4850h;
        if (z) {
            C0312a c0312a = this.f4843a;
            long jM10538n = c0312a.f4002z;
            if ((9223372034707292159L & jM10538n) == 9205357640488583168L) {
                jM10538n = do7.m10538n(omd.m18152h0(this.f4848f));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jM10538n >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM10538n & 4294967295L));
            sp3 sp3Var = c0312a.f3977a;
            float f = sp3Var.f61168n;
            float f2 = sp3Var.f61169o;
            float f3 = sp3Var.f61173s;
            float f4 = sp3Var.f61174t;
            float f5 = sp3Var.f61175u;
            float f6 = sp3Var.f61166l;
            float f7 = sp3Var.f61167m;
            double d = ((double) f3) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f8 = -fSin;
            float f9 = (f2 * fCos) - (0.0f * fSin);
            float f10 = (0.0f * fCos) + (f2 * fSin);
            double d2 = ((double) f4) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f11 = -fSin2;
            float f12 = fSin * fSin2;
            float f13 = fSin * fCos2;
            float f14 = fCos * fSin2;
            float f15 = fCos * fCos2;
            float f16 = (f10 * fSin2) + (f * fCos2);
            float f17 = (f10 * fCos2) + ((-f) * fSin2);
            double d3 = ((double) f5) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f18 = -fSin3;
            float f19 = (fCos3 * f12) + (f18 * fCos2);
            float f20 = (f12 * fSin3) + (fCos2 * fCos3);
            float f21 = fSin3 * fCos;
            float f22 = f20 * f6;
            float f23 = f21 * f6;
            float f24 = ((fSin3 * f13) + (fCos3 * f11)) * f6;
            float f25 = f19 * f7;
            float f26 = fCos * fCos3 * f7;
            float f27 = ((fCos3 * f13) + (f18 * f11)) * f7;
            float f28 = f14 * 1.0f;
            float f29 = f8 * 1.0f;
            float f30 = f15 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f22;
                fArr[1] = f23;
                fArr[2] = f24;
                fArr[3] = 0.0f;
                fArr[4] = f25;
                fArr[5] = f26;
                fArr[6] = f27;
                fArr[7] = 0.0f;
                fArr[8] = f28;
                fArr[9] = f29;
                fArr[10] = f30;
                fArr[11] = 0.0f;
                float f31 = -fIntBitsToFloat;
                fArr[12] = ((f22 * f31) - (fIntBitsToFloat2 * f25)) + f16 + fIntBitsToFloat;
                fArr[13] = ((f23 * f31) - (fIntBitsToFloat2 * f26)) + f9 + fIntBitsToFloat2;
                fArr[14] = ((f31 * f24) - (fIntBitsToFloat2 * f27)) + f17;
                fArr[15] = 1.0f;
            }
            this.f4838L = false;
            this.f4840N = AbstractC3695vr.m23514y(fArr);
        }
        return fArr;
    }

    /* JADX INFO: renamed from: c */
    public final void m1808c() {
        if (this.f4852j || this.f4849g) {
            return;
        }
        this.f4845c.invalidate();
        m1811f(true);
    }

    /* JADX INFO: renamed from: d */
    public final void m1809d(long j) {
        boolean zM1724p = ViewTreeObserverOnGlobalLayoutListenerC0391c.m1724p();
        ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = this.f4845c;
        if (zM1724p) {
            viewTreeObserverOnGlobalLayoutListenerC0391c.m1744T(-4.0f);
        }
        C0312a c0312a = this.f4843a;
        if (!f84.m11593b(c0312a.f3996t, j)) {
            c0312a.f3996t = j;
            c0312a.m1433j(j, c0312a.f3997u);
        }
        ViewParent parent = viewTreeObserverOnGlobalLayoutListenerC0391c.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(viewTreeObserverOnGlobalLayoutListenerC0391c, viewTreeObserverOnGlobalLayoutListenerC0391c);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1810e(long j) {
        if (n84.m17279a(j, this.f4848f)) {
            return;
        }
        if (ViewTreeObserverOnGlobalLayoutListenerC0391c.m1724p()) {
            this.f4845c.m1744T(-4.0f);
        }
        this.f4848f = j;
        m1808c();
    }

    /* JADX INFO: renamed from: f */
    public final void m1811f(boolean z) {
        if (z != this.f4852j) {
            this.f4852j = z;
            ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = this.f4845c;
            h66 h66Var = viewTreeObserverOnGlobalLayoutListenerC0391c.f4674U;
            boolean z2 = viewTreeObserverOnGlobalLayoutListenerC0391c.f4678W;
            if (!z) {
                if (z2) {
                    return;
                }
                h66Var.m13094k(this);
                h66 h66Var2 = viewTreeObserverOnGlobalLayoutListenerC0391c.f4676V;
                if (h66Var2 != null) {
                    h66Var2.m13094k(this);
                    return;
                }
                return;
            }
            if (!z2) {
                h66Var.m13090g(this);
                return;
            }
            h66 h66Var3 = viewTreeObserverOnGlobalLayoutListenerC0391c.f4676V;
            if (h66Var3 == null) {
                h66Var3 = new h66();
                viewTreeObserverOnGlobalLayoutListenerC0391c.f4676V = h66Var3;
            }
            h66Var3.m13090g(this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1812g() {
        ViewTreeObserverOnGlobalLayoutListenerC0391c.m1724p();
        if (this.f4852j) {
            if (!k9a.m15025a(this.f4836J, k9a.f46915b) && !n84.m17279a(this.f4843a.f3997u, this.f4848f)) {
                C0312a c0312a = this.f4843a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f4836J >> 32)) * ((int) (this.f4848f >> 32));
                c0312a.m1432i((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f4836J & 4294967295L)) * ((int) (this.f4848f & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
            }
            this.f4843a.m1428e(this.f4853k, this.f4854l, this.f4848f, this.f4842P);
            m1811f(false);
        }
    }
}
