package androidx.compose.material3.internal.ripple;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.animation.core.C0059a;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.node.C0358h;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p000.AbstractC3393o1;
import p000.AbstractC3489q9;
import p000.AbstractC3497qg;
import p000.C2931dk;
import p000.C3309ls;
import p000.C3757xf;
import p000.aa1;
import p000.an0;
import p000.d16;
import p000.dh8;
import p000.eh8;
import p000.fb2;
import p000.fs6;
import p000.gq6;
import p000.h66;
import p000.kj7;
import p000.lj7;
import p000.ll2;
import p000.mj7;
import p000.nj7;
import p000.omd;
import p000.ph8;
import p000.q84;
import p000.qh8;
import p000.qn3;
import p000.ra2;
import p000.sa2;
import p000.ss5;
import p000.t66;
import p000.te1;
import p000.tf1;
import p000.thb;
import p000.v56;
import p000.v63;
import p000.vz1;
import p000.wfb;
import p000.x24;
import p000.ym0;
import p000.yp4;

/* JADX INFO: renamed from: androidx.compose.material3.internal.ripple.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0248b extends d16 implements tf1, ll2, yp4 {

    /* JADX INFO: renamed from: J */
    public final v56 f3523J;

    /* JADX INFO: renamed from: K */
    public final boolean f3524K;

    /* JADX INFO: renamed from: L */
    public final float f3525L;

    /* JADX INFO: renamed from: M */
    public final sa2 f3526M;

    /* JADX INFO: renamed from: N */
    public final ra2 f3527N;

    /* JADX INFO: renamed from: O */
    public float f3528O;

    /* JADX INFO: renamed from: Q */
    public boolean f3530Q;

    /* JADX INFO: renamed from: U */
    public q84 f3534U;

    /* JADX INFO: renamed from: X */
    public x24 f3537X;

    /* JADX INFO: renamed from: P */
    public long f3529P = 0;

    /* JADX INFO: renamed from: R */
    public final h66 f3531R = new h66();

    /* JADX INFO: renamed from: S */
    public final C0059a f3532S = AbstractC3489q9.m19771a(0.0f);

    /* JADX INFO: renamed from: T */
    public final ArrayList f3533T = new ArrayList();

    /* JADX INFO: renamed from: V */
    public final C0059a f3535V = AbstractC3489q9.m19771a(0.0f);

    /* JADX INFO: renamed from: W */
    public final t66 f3536W = AbstractC0278f.m1260j(Boolean.FALSE);

    public AbstractC0248b(v56 v56Var, boolean z, float f, sa2 sa2Var, ra2 ra2Var) {
        this.f3523J = v56Var;
        this.f3524K = z;
        this.f3525L = f;
        this.f3526M = sa2Var;
        this.f3527N = ra2Var;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: O0 */
    public final boolean mo574O0() {
        return false;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: R0 */
    public final void mo36R0() {
        wfb.m23926u(m9971N0(), null, null, new RippleNode$onAttach$1(this, null), 3);
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m1174Z0(nj7 nj7Var) throws IllegalAccessException {
        eh8 eh8Var;
        if (!(nj7Var instanceof lj7)) {
            if (nj7Var instanceof mj7) {
                eh8 eh8Var2 = ((C2931dk) this).f35739Z;
                if (eh8Var2 != null) {
                    eh8Var2.m11154d();
                    return;
                }
                return;
            }
            if (!(nj7Var instanceof kj7) || (eh8Var = ((C2931dk) this).f35739Z) == null) {
                return;
            }
            eh8Var.m11154d();
            return;
        }
        lj7 lj7Var = (lj7) nj7Var;
        long j = this.f3529P;
        float f = this.f3528O;
        C2931dk c2931dk = (C2931dk) this;
        dh8 dh8Var = c2931dk.f35738Y;
        if (dh8Var == null) {
            Object obj = (View) thb.m22050i(c2931dk, AbstractC0394f.f4765f);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    v63.m23135m("Couldn't find a valid parent for ", obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    dh8 dh8Var2 = new dh8(viewGroup.getContext());
                    viewGroup.addView(dh8Var2);
                    dh8Var = dh8Var2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof dh8) {
                        dh8Var = (dh8) childAt;
                        break;
                    }
                    i++;
                }
            }
            c2931dk.f35738Y = dh8Var;
        }
        ArrayList arrayList = dh8Var.f35660b;
        fs6 fs6Var = dh8Var.f35662d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) fs6Var.f39590b;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) fs6Var.f39590b;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) fs6Var.f39591c;
        eh8 eh8Var3 = (eh8) linkedHashMap.get(c2931dk);
        int i2 = 1;
        if (eh8Var3 == null) {
            ArrayList arrayList2 = dh8Var.f35661c;
            arrayList2.getClass();
            eh8Var3 = (eh8) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (eh8Var3 == null) {
                if (dh8Var.f35663e > vz1.m23602H(arrayList)) {
                    eh8Var3 = new eh8(dh8Var.getContext());
                    dh8Var.addView(eh8Var3);
                    arrayList.add(eh8Var3);
                } else {
                    eh8Var3 = (eh8) arrayList.get(dh8Var.f35663e);
                    C2931dk c2931dk2 = (C2931dk) linkedHashMap3.get(eh8Var3);
                    if (c2931dk2 != null) {
                        c2931dk2.f35739Z = null;
                        AbstractC3489q9.m19789s(c2931dk2);
                        eh8 eh8Var4 = (eh8) linkedHashMap2.get(c2931dk2);
                        if (eh8Var4 != null) {
                        }
                        linkedHashMap2.remove(c2931dk2);
                        eh8Var3.m11153c();
                    }
                }
                int i3 = dh8Var.f35663e;
                if (i3 < dh8Var.f35659a - 1) {
                    dh8Var.f35663e = i3 + 1;
                } else {
                    dh8Var.f35663e = 0;
                }
            }
            linkedHashMap2.put(c2931dk, eh8Var3);
            linkedHashMap3.put(eh8Var3, c2931dk);
        }
        eh8 eh8Var5 = eh8Var3;
        eh8Var5.m11152b(lj7Var, c2931dk.f3524K, j, ss5.m21693T(f), c2931dk.f3526M.mo16640c(), ((qh8) c2931dk.f3527N.mo0a()).f57791a instanceof ph8 ? 0.1f : 0.0f, new C3757xf(c2931dk, i2));
        c2931dk.f35739Z = eh8Var5;
        AbstractC3489q9.m19789s(c2931dk);
    }

    @Override // p000.yp4, p000.mt5
    /* JADX INFO: renamed from: c */
    public final void mo858c(long j) throws IllegalAccessException {
        float fMo912g0;
        this.f3530Q = true;
        fb2 fb2Var = te1.m21979L(this).f4327T;
        this.f3529P = omd.m18152h0(j);
        float f = this.f3525L;
        if (Float.isNaN(f)) {
            long j2 = this.f3529P;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            fMo912g0 = gq6.m12822c((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)) / 2.0f;
            if (this.f3524K) {
                fMo912g0 += fb2Var.mo912g0(10.0f);
            }
        } else {
            fMo912g0 = fb2Var.mo912g0(f);
        }
        this.f3528O = fMo912g0;
        h66 h66Var = this.f3531R;
        Object[] objArr = h66Var.f1293a;
        int i = h66Var.f1294b;
        for (int i2 = 0; i2 < i; i2++) {
            m1174Z0((nj7) objArr[i2]);
        }
        h66Var.m13093j();
    }

    @Override // p000.ll2
    /* JADX INFO: renamed from: i0 */
    public final void mo952i0(C0358h c0358h) throws IllegalAccessException {
        c0358h.m1614b();
        C2931dk c2931dk = (C2931dk) this;
        an0 an0Var = c0358h.f4358a;
        ym0 ym0VarM16515r = an0Var.f853b.m16515r();
        eh8 eh8Var = c2931dk.f35739Z;
        if (eh8Var != null) {
            eh8Var.m11155e(c2931dk.f3529P, ss5.m21693T(c2931dk.f3528O), c2931dk.f3526M.mo16640c(), ((qh8) c2931dk.f3527N.mo0a()).f57791a instanceof ph8 ? 0.1f : 0.0f);
            eh8Var.draw(AbstractC3497qg.m19936a(ym0VarM16515r));
        }
        float fFloatValue = ((Number) this.f3532S.m745d()).floatValue();
        if (fFloatValue > 0.0f) {
            long jM198b = aa1.m198b(fFloatValue, this.f3526M.mo16640c());
            if (this.f3524K) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (an0Var.mo1422h() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (an0Var.mo1422h() & 4294967295L));
                C3309ls c3309ls = an0Var.f853b;
                long jM16483A = c3309ls.m16483A();
                c3309ls.m16515r().mo17016h();
                try {
                    ((qn3) c3309ls.f50064b).m20070k(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                    InterfaceC0310a.m1417c0(c0358h, jM198b, this.f3528O, 0L, 0.0f, null, 124);
                    AbstractC3393o1.m17751z(c3309ls, jM16483A);
                } catch (Throwable th) {
                    AbstractC3393o1.m17751z(c3309ls, jM16483A);
                    throw th;
                }
            } else {
                InterfaceC0310a.m1417c0(c0358h, jM198b, this.f3528O, 0L, 0.0f, null, 124);
            }
        }
        if (((Number) this.f3535V.m745d()).floatValue() > 0.0f) {
            x24 x24Var = this.f3537X;
            if (x24Var == null) {
                x24Var = new x24(this);
            }
            this.f3537X = x24Var;
            this.f3527N.mo0a();
        }
    }
}
