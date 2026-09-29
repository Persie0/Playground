package com.lingq.feature.onboarding.auth.login;

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
import com.lingq.feature.onboarding.auth.login.C2177b;
import com.lingq.feature.onboarding.auth.login.OnboardingLoginFragment;
import com.lingq.feature.onboarding.domain.LoginAuthType;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.C3028g7;
import p000.C3159jt;
import p000.C3186kj;
import p000.InterfaceC2991f7;
import p000.ad3;
import p000.cs4;
import p000.d32;
import p000.dm0;
import p000.dua;
import p000.eh0;
import p000.eta;
import p000.fu6;
import p000.fy1;
import p000.gr3;
import p000.nk3;
import p000.ob1;
import p000.or1;
import p000.or3;
import p000.ri5;
import p000.thb;
import p000.ui3;
import p000.vz1;
import p000.w41;
import p000.y38;
import p000.zt6;
import p000.zta;

/* JADX INFO: loaded from: classes.dex */
public final class OnboardingLoginFragment extends AbstractComponentCallbacksC0635c implements nk3 {

    /* JADX INFO: renamed from: B0 */
    public ob1 f27022B0;

    /* JADX INFO: renamed from: C0 */
    public final w41 f27023C0;

    /* JADX INFO: renamed from: D0 */
    public final cs4 f27024D0;

    /* JADX INFO: renamed from: E0 */
    public final cs4 f27025E0;

    /* JADX INFO: renamed from: F0 */
    public final or3 f27026F0;

    /* JADX INFO: renamed from: G0 */
    public final ad3 f27027G0;

    /* JADX INFO: renamed from: H0 */
    public final ad3 f27028H0;

    /* JADX INFO: renamed from: w0 */
    public eta f27029w0;

    /* JADX INFO: renamed from: y0 */
    public volatile C3159jt f27031y0;

    /* JADX INFO: renamed from: x0 */
    public boolean f27030x0 = false;

    /* JADX INFO: renamed from: z0 */
    public final Object f27032z0 = new Object();

    /* JADX INFO: renamed from: A0 */
    public boolean f27021A0 = false;

    public OnboardingLoginFragment() {
        final int i = 0;
        final OnboardingLoginFragment$special$$inlined$viewModels$default$1 onboardingLoginFragment$special$$inlined$viewModels$default$1 = new OnboardingLoginFragment$special$$inlined$viewModels$default$1(this);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.onboarding.auth.login.OnboardingLoginFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) onboardingLoginFragment$special$$inlined$viewModels$default$1.mo0a();
            }
        });
        this.f27023C0 = new w41(y38.m24933a(C2177b.class), new ui3() { // from class: com.lingq.feature.onboarding.auth.login.OnboardingLoginFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.onboarding.auth.login.OnboardingLoginFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f27037b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.onboarding.auth.login.OnboardingLoginFragment$special$$inlined$viewModels$default$4
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
        this.f27024D0 = AbstractC3192a.m15356a(new ri5(6));
        this.f27025E0 = AbstractC3192a.m15356a(new zt6(this, i));
        this.f27026F0 = new or3(this);
        this.f27027G0 = (ad3) m2088P(new InterfaceC2991f7(this) { // from class: au6

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ OnboardingLoginFragment f7519b;

            {
                this.f7519b = this;
            }

            @Override // p000.InterfaceC2991f7
            /* JADX INFO: renamed from: c */
            public final void mo2125c(Object obj) {
                int i2 = i;
                OnboardingLoginFragment onboardingLoginFragment = this.f7519b;
                switch (i2) {
                    case 0:
                        cm0 cm0Var = (cm0) obj;
                        cm0Var.getClass();
                        ((C0939m) onboardingLoginFragment.f27024D0.getValue()).m5259c(cm0Var.m4849b(), cm0Var.m4848a(), onboardingLoginFragment.f27026F0);
                        break;
                    default:
                        ActivityResult activityResult = (ActivityResult) obj;
                        activityResult.getClass();
                        Intent intent = activityResult.f1008b;
                        if (intent != null) {
                            try {
                                String strM5268r = ((eeb) onboardingLoginFragment.f27025E0.getValue()).m11082e(intent).m5268r();
                                if (strM5268r != null && strM5268r.length() != 0) {
                                    C2177b.m9112V2((C2177b) onboardingLoginFragment.f27023C0.getValue(), null, null, strM5268r, LoginAuthType.GOOGLE, 3);
                                }
                            } catch (ApiException unused) {
                                return;
                            }
                            break;
                        }
                        break;
                }
            }
        }, new C0938l(C0939m.f11517f.m5254a(), dm0Var));
        final int i2 = 1;
        this.f27028H0 = (ad3) m2088P(new InterfaceC2991f7(this) { // from class: au6

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ OnboardingLoginFragment f7519b;

            {
                this.f7519b = this;
            }

            @Override // p000.InterfaceC2991f7
            /* JADX INFO: renamed from: c */
            public final void mo2125c(Object obj) {
                int i3 = i2;
                OnboardingLoginFragment onboardingLoginFragment = this.f7519b;
                switch (i3) {
                    case 0:
                        cm0 cm0Var = (cm0) obj;
                        cm0Var.getClass();
                        ((C0939m) onboardingLoginFragment.f27024D0.getValue()).m5259c(cm0Var.m4849b(), cm0Var.m4848a(), onboardingLoginFragment.f27026F0);
                        break;
                    default:
                        ActivityResult activityResult = (ActivityResult) obj;
                        activityResult.getClass();
                        Intent intent = activityResult.f1008b;
                        if (intent != null) {
                            try {
                                String strM5268r = ((eeb) onboardingLoginFragment.f27025E0.getValue()).m11082e(intent).m5268r();
                                if (strM5268r != null && strM5268r.length() != 0) {
                                    C2177b.m9112V2((C2177b) onboardingLoginFragment.f27023C0.getValue(), null, null, strM5268r, LoginAuthType.GOOGLE, 3);
                                }
                            } catch (ApiException unused) {
                                return;
                            }
                            break;
                        }
                        break;
                }
            }
        }, new C3028g7(2));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return vz1.m23648r(this, new C0282a(-306027956, true, new C3186kj(this, 13)));
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
        ((C0939m) this.f27024D0.getValue()).m5258b();
    }

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        if (this.f27031y0 == null) {
            synchronized (this.f27032z0) {
                try {
                    if (this.f27031y0 == null) {
                        this.f27031y0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f27031y0.mo6995b();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m9110c0() {
        if (this.f27029w0 == null) {
            this.f27029w0 = new eta(super.mo2107i(), this);
            this.f27030x0 = d32.m10022T(super.mo2107i());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c, p000.gr3
    /* JADX INFO: renamed from: d */
    public final zta mo2102d() {
        return eh0.m11143x(this, super.mo2102d());
    }

    /* JADX INFO: renamed from: d0 */
    public final void m9111d0() {
        if (this.f27021A0) {
            return;
        }
        this.f27021A0 = true;
        this.f27022B0 = (ob1) ((fy1) ((fu6) mo6995b())).f39919b.f48696h.get();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: i */
    public final Context mo2107i() {
        if (super.mo2107i() == null && !this.f27030x0) {
            return null;
        }
        m9110c0();
        return this.f27029w0;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        boolean z = true;
        this.f5688b0 = true;
        eta etaVar = this.f27029w0;
        if (etaVar != null && C3159jt.m14640c(etaVar) != activity) {
            z = false;
        }
        thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m9110c0();
        m9111d0();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        super.mo2123y(context);
        m9110c0();
        m9111d0();
    }
}
