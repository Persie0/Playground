package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ut3 extends be2 implements nk3 {

    /* JADX INFO: renamed from: M0 */
    public eta f64322M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f64323N0;

    /* JADX INFO: renamed from: O0 */
    public volatile C3159jt f64324O0;

    /* JADX INFO: renamed from: P0 */
    public final Object f64325P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f64326Q0;

    public ut3(int i) {
        super(i);
        this.f8423x0 = new RunnableC3468pp(this, 4);
        this.f8424y0 = new xd2(this, 0);
        this.f8425z0 = new yd2(this);
        this.f8410A0 = 0;
        this.f8411B0 = 0;
        this.f8412C0 = true;
        this.f8413D0 = true;
        this.f8414E0 = -1;
        this.f8416G0 = new zd2(this);
        this.f8421L0 = false;
        this.f64323N0 = false;
        this.f64325P0 = new Object();
        this.f64326Q0 = false;
    }

    @Override // p000.be2, androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: E */
    public final LayoutInflater mo2078E(Bundle bundle) {
        LayoutInflater layoutInflaterMo2078E = super.mo2078E(bundle);
        return layoutInflaterMo2078E.cloneInContext(new eta(layoutInflaterMo2078E, this));
    }

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        if (this.f64324O0 == null) {
            synchronized (this.f64325P0) {
                try {
                    if (this.f64324O0 == null) {
                        this.f64324O0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f64324O0.mo6995b();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c, p000.gr3
    /* JADX INFO: renamed from: d */
    public final zta mo2102d() {
        return eh0.m11143x(this, super.mo2102d());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: i */
    public final Context mo2107i() {
        if (super.mo2107i() == null && !this.f64323N0) {
            return null;
        }
        m22908l0();
        return this.f64322M0;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m22908l0() {
        if (this.f64322M0 == null) {
            this.f64322M0 = new eta(super.mo2107i(), this);
            this.f64323N0 = d32.m10022T(super.mo2107i());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        this.f5688b0 = true;
        eta etaVar = this.f64322M0;
        thb.m22048g(etaVar == null || C3159jt.m14640c(etaVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m22908l0();
        if (this.f64326Q0) {
            return;
        }
        this.f64326Q0 = true;
        i68 i68Var = (i68) mo6995b();
        i68Var.getClass();
    }

    @Override // p000.be2, androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        super.mo2123y(context);
        m22908l0();
        if (this.f64326Q0) {
            return;
        }
        this.f64326Q0 = true;
        i68 i68Var = (i68) mo6995b();
        i68Var.getClass();
    }
}
