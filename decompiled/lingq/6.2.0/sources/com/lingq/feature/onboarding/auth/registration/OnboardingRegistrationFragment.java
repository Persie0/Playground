package com.lingq.feature.onboarding.auth.registration;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.internal.C0282a;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.facebook.login.C0938l;
import com.facebook.login.C0939m;
import com.google.android.gms.common.api.ApiException;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.C3028g7;
import p000.C3159jt;
import p000.InterfaceC2991f7;
import p000.ad3;
import p000.bw6;
import p000.cs4;
import p000.cw6;
import p000.d32;
import p000.dm0;
import p000.dua;
import p000.eeb;
import p000.eh0;
import p000.eta;
import p000.fy1;
import p000.gr3;
import p000.gw6;
import p000.hm5;
import p000.ht6;
import p000.ky1;
import p000.lda;
import p000.nk3;
import p000.ob1;
import p000.or1;
import p000.thb;
import p000.tx5;
import p000.ui3;
import p000.vz1;
import p000.w41;
import p000.wfb;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class OnboardingRegistrationFragment extends AbstractComponentCallbacksC0635c implements nk3 {

    /* JADX INFO: renamed from: B0 */
    public final w41 f27115B0;

    /* JADX INFO: renamed from: C0 */
    public final cs4 f27116C0;

    /* JADX INFO: renamed from: D0 */
    public final cs4 f27117D0;

    /* JADX INFO: renamed from: E0 */
    public hm5 f27118E0;

    /* JADX INFO: renamed from: F0 */
    public ob1 f27119F0;

    /* JADX INFO: renamed from: G0 */
    public final C2194c f27120G0;

    /* JADX INFO: renamed from: H0 */
    public final ad3 f27121H0;

    /* JADX INFO: renamed from: I0 */
    public final ad3 f27122I0;

    /* JADX INFO: renamed from: w0 */
    public eta f27123w0;

    /* JADX INFO: renamed from: y0 */
    public volatile C3159jt f27125y0;

    /* JADX INFO: renamed from: x0 */
    public boolean f27124x0 = false;

    /* JADX INFO: renamed from: z0 */
    public final Object f27126z0 = new Object();

    /* JADX INFO: renamed from: A0 */
    public boolean f27114A0 = false;

    public OnboardingRegistrationFragment() {
        final C2187x25857f8b c2187x25857f8b = new C2187x25857f8b(this);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.onboarding.auth.registration.OnboardingRegistrationFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) c2187x25857f8b.mo0a();
            }
        });
        this.f27115B0 = new w41(y38.m24933a(C2196e.class), new ui3() { // from class: com.lingq.feature.onboarding.auth.registration.OnboardingRegistrationFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.onboarding.auth.registration.OnboardingRegistrationFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                zta ztaVarMo2102d;
                dua duaVar = (dua) cs4VarM15357b.getValue();
                gr3 gr3Var = duaVar instanceof gr3 ? (gr3) duaVar : null;
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f27131b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.onboarding.auth.registration.OnboardingRegistrationFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                dua duaVar = (dua) cs4VarM15357b.getValue();
                gr3 gr3Var = duaVar instanceof gr3 ? (gr3) duaVar : null;
                return gr3Var != null ? gr3Var.mo2103e() : or1.f54780b;
            }
        });
        dm0 dm0Var = new dm0();
        this.f27116C0 = AbstractC3192a.m15356a(new tx5(7));
        this.f27117D0 = AbstractC3192a.m15356a(new cw6(this, 0));
        this.f27120G0 = new C2194c(this);
        this.f27121H0 = (ad3) m2088P(new bw6(this), new C0938l(C0939m.f11517f.m5254a(), dm0Var));
        this.f27122I0 = (ad3) m2088P(new InterfaceC2991f7() { // from class: com.lingq.feature.onboarding.auth.registration.a
            @Override // p000.InterfaceC2991f7
            /* JADX INFO: renamed from: c */
            public final void mo2125c(Object obj) {
                OnboardingRegistrationFragment onboardingRegistrationFragment = this.f27150a;
                ActivityResult activityResult = (ActivityResult) obj;
                activityResult.getClass();
                Intent intent = activityResult.f1008b;
                if (intent == null) {
                    return;
                }
                try {
                    String str = ((eeb) onboardingRegistrationFragment.f27117D0.getValue()).m11082e(intent).f11562a;
                    if (str != null && str.length() != 0) {
                        C2196e c2196e = (C2196e) onboardingRegistrationFragment.f27115B0.getValue();
                        c2196e.getClass();
                        wfb.m23926u(lda.m16103C(c2196e), null, null, new OnboardingRegistrationViewModel$registerGoogle$1(c2196e, str, null), 3);
                    }
                } catch (ApiException unused) {
                }
            }
        }, new C3028g7(2));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return vz1.m23648r(this, new C0282a(1475593564, true, new ht6(this, 4)));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: E */
    public final LayoutInflater mo2078E(Bundle bundle) {
        LayoutInflater layoutInflaterMo2078E = super.mo2078E(bundle);
        return layoutInflaterMo2078E.cloneInContext(new eta(layoutInflaterMo2078E, this));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        vz1.m23640l0(this);
        ((C0939m) this.f27116C0.getValue()).m5258b();
    }

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        if (this.f27125y0 == null) {
            synchronized (this.f27126z0) {
                try {
                    if (this.f27125y0 == null) {
                        this.f27125y0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f27125y0.mo6995b();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m9119c0() {
        if (this.f27123w0 == null) {
            this.f27123w0 = new eta(super.mo2107i(), this);
            this.f27124x0 = d32.m10022T(super.mo2107i());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c, p000.gr3
    /* JADX INFO: renamed from: d */
    public final zta mo2102d() {
        return eh0.m11143x(this, super.mo2102d());
    }

    /* JADX INFO: renamed from: d0 */
    public final void m9120d0() {
        if (this.f27114A0) {
            return;
        }
        this.f27114A0 = true;
        ky1 ky1Var = ((fy1) ((gw6) mo6995b())).f39919b;
        this.f27118E0 = (hm5) ky1Var.f48736r.get();
        this.f27119F0 = (ob1) ky1Var.f48696h.get();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: i */
    public final Context mo2107i() {
        if (super.mo2107i() == null && !this.f27124x0) {
            return null;
        }
        m9119c0();
        return this.f27123w0;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        boolean z = true;
        this.f5688b0 = true;
        eta etaVar = this.f27123w0;
        if (etaVar != null && C3159jt.m14640c(etaVar) != activity) {
            z = false;
        }
        thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m9119c0();
        m9120d0();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        super.mo2123y(context);
        m9119c0();
        m9120d0();
    }
}
