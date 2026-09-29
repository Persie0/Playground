package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.lingq.core.settings.SettingsManageSubscriptionsFragment;
import com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qt3 extends sg0 implements nk3 {

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ int f58184M0;

    /* JADX INFO: renamed from: N0 */
    public eta f58185N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f58186O0;

    /* JADX INFO: renamed from: P0 */
    public volatile C3159jt f58187P0;

    /* JADX INFO: renamed from: Q0 */
    public final Object f58188Q0;

    /* JADX INFO: renamed from: R0 */
    public boolean f58189R0;

    public qt3(int i) {
        this.f58184M0 = i;
        switch (i) {
            case 1:
                this.f58186O0 = false;
                this.f58188Q0 = new Object();
                this.f58189R0 = false;
                break;
            case 2:
                this.f58186O0 = false;
                this.f58188Q0 = new Object();
                this.f58189R0 = false;
                break;
            case 3:
                this.f58186O0 = false;
                this.f58188Q0 = new Object();
                this.f58189R0 = false;
                break;
            case 4:
                this.f58186O0 = false;
                this.f58188Q0 = new Object();
                this.f58189R0 = false;
                break;
            case 5:
                this.f58186O0 = false;
                this.f58188Q0 = new Object();
                this.f58189R0 = false;
                break;
            case 6:
                this.f58186O0 = false;
                this.f58188Q0 = new Object();
                this.f58189R0 = false;
                break;
            case 7:
                this.f58186O0 = false;
                this.f58188Q0 = new Object();
                this.f58189R0 = false;
                break;
            case 8:
                this.f58186O0 = false;
                this.f58188Q0 = new Object();
                this.f58189R0 = false;
                break;
            default:
                this.f58186O0 = false;
                this.f58188Q0 = new Object();
                this.f58189R0 = false;
                break;
        }
    }

    /* JADX INFO: renamed from: l0 */
    private final Object m20145l0() {
        if (this.f58187P0 == null) {
            synchronized (this.f58188Q0) {
                try {
                    if (this.f58187P0 == null) {
                        this.f58187P0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f58187P0.mo6995b();
    }

    /* JADX INFO: renamed from: m0 */
    private final Object m20146m0() {
        if (this.f58187P0 == null) {
            synchronized (this.f58188Q0) {
                try {
                    if (this.f58187P0 == null) {
                        this.f58187P0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f58187P0.mo6995b();
    }

    /* JADX INFO: renamed from: n0 */
    private final Object m20147n0() {
        if (this.f58187P0 == null) {
            synchronized (this.f58188Q0) {
                try {
                    if (this.f58187P0 == null) {
                        this.f58187P0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f58187P0.mo6995b();
    }

    /* JADX INFO: renamed from: o0 */
    private final Object m20148o0() {
        if (this.f58187P0 == null) {
            synchronized (this.f58188Q0) {
                try {
                    if (this.f58187P0 == null) {
                        this.f58187P0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f58187P0.mo6995b();
    }

    /* JADX INFO: renamed from: p0 */
    private final Object m20149p0() {
        if (this.f58187P0 == null) {
            synchronized (this.f58188Q0) {
                try {
                    if (this.f58187P0 == null) {
                        this.f58187P0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f58187P0.mo6995b();
    }

    @Override // p000.be2, androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: E */
    public final LayoutInflater mo2078E(Bundle bundle) {
        switch (this.f58184M0) {
            case 0:
                LayoutInflater layoutInflaterMo2078E = super.mo2078E(bundle);
                return layoutInflaterMo2078E.cloneInContext(new eta(layoutInflaterMo2078E, this));
            case 1:
                LayoutInflater layoutInflaterMo2078E2 = super.mo2078E(bundle);
                return layoutInflaterMo2078E2.cloneInContext(new eta(layoutInflaterMo2078E2, this));
            case 2:
                LayoutInflater layoutInflaterMo2078E3 = super.mo2078E(bundle);
                return layoutInflaterMo2078E3.cloneInContext(new eta(layoutInflaterMo2078E3, this));
            case 3:
                LayoutInflater layoutInflaterMo2078E4 = super.mo2078E(bundle);
                return layoutInflaterMo2078E4.cloneInContext(new eta(layoutInflaterMo2078E4, this));
            case 4:
                LayoutInflater layoutInflaterMo2078E5 = super.mo2078E(bundle);
                return layoutInflaterMo2078E5.cloneInContext(new eta(layoutInflaterMo2078E5, this));
            case 5:
                LayoutInflater layoutInflaterMo2078E6 = super.mo2078E(bundle);
                return layoutInflaterMo2078E6.cloneInContext(new eta(layoutInflaterMo2078E6, this));
            case 6:
                LayoutInflater layoutInflaterMo2078E7 = super.mo2078E(bundle);
                return layoutInflaterMo2078E7.cloneInContext(new eta(layoutInflaterMo2078E7, this));
            case 7:
                LayoutInflater layoutInflaterMo2078E8 = super.mo2078E(bundle);
                return layoutInflaterMo2078E8.cloneInContext(new eta(layoutInflaterMo2078E8, this));
            default:
                LayoutInflater layoutInflaterMo2078E9 = super.mo2078E(bundle);
                return layoutInflaterMo2078E9.cloneInContext(new eta(layoutInflaterMo2078E9, this));
        }
    }

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        switch (this.f58184M0) {
            case 0:
                if (this.f58187P0 == null) {
                    synchronized (this.f58188Q0) {
                        try {
                            if (this.f58187P0 == null) {
                                this.f58187P0 = new C3159jt(this);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return this.f58187P0.mo6995b();
            case 1:
                if (this.f58187P0 == null) {
                    synchronized (this.f58188Q0) {
                        try {
                            if (this.f58187P0 == null) {
                                this.f58187P0 = new C3159jt(this);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return this.f58187P0.mo6995b();
            case 2:
                if (this.f58187P0 == null) {
                    synchronized (this.f58188Q0) {
                        try {
                            if (this.f58187P0 == null) {
                                this.f58187P0 = new C3159jt(this);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                        break;
                    }
                }
                return this.f58187P0.mo6995b();
            case 3:
                return m20145l0();
            case 4:
                return m20146m0();
            case 5:
                return m20147n0();
            case 6:
                return m20148o0();
            case 7:
                return m20149p0();
            default:
                if (this.f58187P0 == null) {
                    synchronized (this.f58188Q0) {
                        try {
                            if (this.f58187P0 == null) {
                                this.f58187P0 = new C3159jt(this);
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                        break;
                    }
                }
                return this.f58187P0.mo6995b();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c, p000.gr3
    /* JADX INFO: renamed from: d */
    public final zta mo2102d() {
        switch (this.f58184M0) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return eh0.m11143x(this, super.mo2102d());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: i */
    public final Context mo2107i() {
        switch (this.f58184M0) {
            case 0:
                if (super.mo2107i() == null && !this.f58186O0) {
                    return null;
                }
                m20152s0();
                return this.f58185N0;
            case 1:
                if (super.mo2107i() == null && !this.f58186O0) {
                    return null;
                }
                m20151r0();
                return this.f58185N0;
            case 2:
                if (super.mo2107i() == null && !this.f58186O0) {
                    return null;
                }
                m20153t0();
                return this.f58185N0;
            case 3:
                if (super.mo2107i() == null && !this.f58186O0) {
                    return null;
                }
                m20155v0();
                return this.f58185N0;
            case 4:
                if (super.mo2107i() == null && !this.f58186O0) {
                    return null;
                }
                m20156w0();
                return this.f58185N0;
            case 5:
                if (super.mo2107i() == null && !this.f58186O0) {
                    return null;
                }
                m20154u0();
                return this.f58185N0;
            case 6:
                if (super.mo2107i() == null && !this.f58186O0) {
                    return null;
                }
                m20157x0();
                return this.f58185N0;
            case 7:
                if (super.mo2107i() == null && !this.f58186O0) {
                    return null;
                }
                m20158y0();
                return this.f58185N0;
            default:
                if (super.mo2107i() == null && !this.f58186O0) {
                    return null;
                }
                m20150q0();
                return this.f58185N0;
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m20150q0() {
        if (this.f58185N0 == null) {
            this.f58185N0 = new eta(super.mo2107i(), this);
            this.f58186O0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m20151r0() {
        if (this.f58185N0 == null) {
            this.f58185N0 = new eta(super.mo2107i(), this);
            this.f58186O0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m20152s0() {
        if (this.f58185N0 == null) {
            this.f58185N0 = new eta(super.mo2107i(), this);
            this.f58186O0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m20153t0() {
        if (this.f58185N0 == null) {
            this.f58185N0 = new eta(super.mo2107i(), this);
            this.f58186O0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m20154u0() {
        if (this.f58185N0 == null) {
            this.f58185N0 = new eta(super.mo2107i(), this);
            this.f58186O0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m20155v0() {
        if (this.f58185N0 == null) {
            this.f58185N0 = new eta(super.mo2107i(), this);
            this.f58186O0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m20156w0() {
        if (this.f58185N0 == null) {
            this.f58185N0 = new eta(super.mo2107i(), this);
            this.f58186O0 = d32.m10022T(super.mo2107i());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        boolean z = true;
        switch (this.f58184M0) {
            case 0:
                this.f5688b0 = true;
                eta etaVar = this.f58185N0;
                thb.m22048g(etaVar == null || C3159jt.m14640c(etaVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20152s0();
                if (!this.f58189R0) {
                    this.f58189R0 = true;
                    bf0 bf0Var = (bf0) mo6995b();
                    bf0Var.getClass();
                }
                break;
            case 1:
                this.f5688b0 = true;
                eta etaVar2 = this.f58185N0;
                thb.m22048g(etaVar2 == null || C3159jt.m14640c(etaVar2) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20151r0();
                if (!this.f58189R0) {
                    this.f58189R0 = true;
                    wr0 wr0Var = (wr0) mo6995b();
                    wr0Var.getClass();
                }
                break;
            case 2:
                this.f5688b0 = true;
                eta etaVar3 = this.f58185N0;
                thb.m22048g(etaVar3 == null || C3159jt.m14640c(etaVar3) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20153t0();
                if (!this.f58189R0) {
                    this.f58189R0 = true;
                    we2 we2Var = (we2) mo6995b();
                    we2Var.getClass();
                }
                break;
            case 3:
                this.f5688b0 = true;
                eta etaVar4 = this.f58185N0;
                if (etaVar4 != null && C3159jt.m14640c(etaVar4) != activity) {
                    z = false;
                }
                thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20155v0();
                m20159z0();
                break;
            case 4:
                this.f5688b0 = true;
                eta etaVar5 = this.f58185N0;
                thb.m22048g(etaVar5 == null || C3159jt.m14640c(etaVar5) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20156w0();
                if (!this.f58189R0) {
                    this.f58189R0 = true;
                    n25 n25Var = (n25) mo6995b();
                    n25Var.getClass();
                }
                break;
            case 5:
                this.f5688b0 = true;
                eta etaVar6 = this.f58185N0;
                thb.m22048g(etaVar6 == null || C3159jt.m14640c(etaVar6) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20154u0();
                if (!this.f58189R0) {
                    this.f58189R0 = true;
                    ((SettingsManageSubscriptionsFragment) this).f22662T0 = ((fy1) ((l29) mo6995b())).m12244a();
                }
                break;
            case 6:
                this.f5688b0 = true;
                eta etaVar7 = this.f58185N0;
                thb.m22048g(etaVar7 == null || C3159jt.m14640c(etaVar7) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20157x0();
                if (!this.f58189R0) {
                    this.f58189R0 = true;
                    li9 li9Var = (li9) mo6995b();
                    li9Var.getClass();
                }
                break;
            case 7:
                this.f5688b0 = true;
                eta etaVar8 = this.f58185N0;
                thb.m22048g(etaVar8 == null || C3159jt.m14640c(etaVar8) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20158y0();
                if (!this.f58189R0) {
                    this.f58189R0 = true;
                    d4a d4aVar = (d4a) mo6995b();
                    d4aVar.getClass();
                }
                break;
            default:
                this.f5688b0 = true;
                eta etaVar9 = this.f58185N0;
                if (etaVar9 != null && C3159jt.m14640c(etaVar9) != activity) {
                    z = false;
                }
                thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20150q0();
                m20159z0();
                break;
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m20157x0() {
        if (this.f58185N0 == null) {
            this.f58185N0 = new eta(super.mo2107i(), this);
            this.f58186O0 = d32.m10022T(super.mo2107i());
        }
    }

    @Override // p000.be2, androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        switch (this.f58184M0) {
            case 0:
                super.mo2123y(context);
                m20152s0();
                if (!this.f58189R0) {
                    this.f58189R0 = true;
                    bf0 bf0Var = (bf0) mo6995b();
                    bf0Var.getClass();
                }
                break;
            case 1:
                super.mo2123y(context);
                m20151r0();
                if (!this.f58189R0) {
                    this.f58189R0 = true;
                    wr0 wr0Var = (wr0) mo6995b();
                    wr0Var.getClass();
                }
                break;
            case 2:
                super.mo2123y(context);
                m20153t0();
                if (!this.f58189R0) {
                    this.f58189R0 = true;
                    we2 we2Var = (we2) mo6995b();
                    we2Var.getClass();
                }
                break;
            case 3:
                super.mo2123y(context);
                m20155v0();
                m20159z0();
                break;
            case 4:
                super.mo2123y(context);
                m20156w0();
                if (!this.f58189R0) {
                    this.f58189R0 = true;
                    n25 n25Var = (n25) mo6995b();
                    n25Var.getClass();
                }
                break;
            case 5:
                super.mo2123y(context);
                m20154u0();
                if (!this.f58189R0) {
                    this.f58189R0 = true;
                    ((SettingsManageSubscriptionsFragment) this).f22662T0 = ((fy1) ((l29) mo6995b())).m12244a();
                }
                break;
            case 6:
                super.mo2123y(context);
                m20157x0();
                if (!this.f58189R0) {
                    this.f58189R0 = true;
                    li9 li9Var = (li9) mo6995b();
                    li9Var.getClass();
                }
                break;
            case 7:
                super.mo2123y(context);
                m20158y0();
                if (!this.f58189R0) {
                    this.f58189R0 = true;
                    d4a d4aVar = (d4a) mo6995b();
                    d4aVar.getClass();
                }
                break;
            default:
                super.mo2123y(context);
                m20150q0();
                m20159z0();
                break;
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m20158y0() {
        if (this.f58185N0 == null) {
            this.f58185N0 = new eta(super.mo2107i(), this);
            this.f58186O0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m20159z0() {
        switch (this.f58184M0) {
            case 3:
                if (!this.f58189R0) {
                    this.f58189R0 = true;
                    v05 v05Var = (v05) mo6995b();
                    LessonDealWithWordsFragment lessonDealWithWordsFragment = (LessonDealWithWordsFragment) this;
                    ky1 ky1Var = ((fy1) v05Var).f39919b;
                    lessonDealWithWordsFragment.f29491W0 = (C3509qs) ky1Var.f48768z.get();
                    lessonDealWithWordsFragment.f29492X0 = (hm5) ky1Var.f48736r.get();
                }
                break;
            default:
                if (!this.f58189R0) {
                    this.f58189R0 = true;
                    m3b m3bVar = (m3b) mo6995b();
                    ky1 ky1Var2 = ((fy1) m3bVar).f39919b;
                }
                break;
        }
    }
}
