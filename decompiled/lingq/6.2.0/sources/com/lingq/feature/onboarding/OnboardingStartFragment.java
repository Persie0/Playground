package com.lingq.feature.onboarding;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C0282a;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.lifecycle.AbstractC0708b;
import com.lingq.feature.onboarding.p014v2.C2216d;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.C3159jt;
import p000.C3186kj;
import p000.C3794yf;
import p000.cs4;
import p000.d32;
import p000.dua;
import p000.eh0;
import p000.eta;
import p000.fy1;
import p000.gr3;
import p000.hm5;
import p000.ky1;
import p000.nk3;
import p000.ob1;
import p000.or1;
import p000.thb;
import p000.ui3;
import p000.uw6;
import p000.vz1;
import p000.w41;
import p000.wfb;
import p000.x74;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes.dex */
public final class OnboardingStartFragment extends AbstractComponentCallbacksC0635c implements nk3 {

    /* JADX INFO: renamed from: B0 */
    public hm5 f26981B0;

    /* JADX INFO: renamed from: C0 */
    public w41 f26982C0;

    /* JADX INFO: renamed from: D0 */
    public ob1 f26983D0;

    /* JADX INFO: renamed from: E0 */
    public final w41 f26984E0;

    /* JADX INFO: renamed from: w0 */
    public eta f26985w0;

    /* JADX INFO: renamed from: y0 */
    public volatile C3159jt f26987y0;

    /* JADX INFO: renamed from: x0 */
    public boolean f26986x0 = false;

    /* JADX INFO: renamed from: z0 */
    public final Object f26988z0 = new Object();

    /* JADX INFO: renamed from: A0 */
    public boolean f26980A0 = false;

    public OnboardingStartFragment() {
        final OnboardingStartFragment$special$$inlined$viewModels$default$1 onboardingStartFragment$special$$inlined$viewModels$default$1 = new OnboardingStartFragment$special$$inlined$viewModels$default$1(this);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.onboarding.OnboardingStartFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) onboardingStartFragment$special$$inlined$viewModels$default$1.mo0a();
            }
        });
        this.f26984E0 = new w41(y38.m24933a(C2216d.class), new ui3() { // from class: com.lingq.feature.onboarding.OnboardingStartFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.onboarding.OnboardingStartFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f26997b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.onboarding.OnboardingStartFragment$special$$inlined$viewModels$default$4
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
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return vz1.m23648r(this, new C0282a(1720254537, true, new C3186kj(this, 16)));
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
        vz1.m23598B(this);
        x74.m24339F(this, "upgradeClosed", new C3794yf(16, view, this));
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new OnboardingStartFragment$observeNavigation$1(this, null), 3);
    }

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        if (this.f26987y0 == null) {
            synchronized (this.f26988z0) {
                try {
                    if (this.f26987y0 == null) {
                        this.f26987y0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f26987y0.mo6995b();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m9102c0() {
        if (this.f26985w0 == null) {
            this.f26985w0 = new eta(super.mo2107i(), this);
            this.f26986x0 = d32.m10022T(super.mo2107i());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c, p000.gr3
    /* JADX INFO: renamed from: d */
    public final zta mo2102d() {
        return eh0.m11143x(this, super.mo2102d());
    }

    /* JADX INFO: renamed from: d0 */
    public final void m9103d0() {
        if (this.f26980A0) {
            return;
        }
        this.f26980A0 = true;
        fy1 fy1Var = (fy1) ((uw6) mo6995b());
        ky1 ky1Var = fy1Var.f39919b;
        this.f26981B0 = (hm5) ky1Var.f48736r.get();
        this.f26982C0 = fy1Var.m12244a();
        this.f26983D0 = (ob1) ky1Var.f48696h.get();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: i */
    public final Context mo2107i() {
        if (super.mo2107i() == null && !this.f26986x0) {
            return null;
        }
        m9102c0();
        return this.f26985w0;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        boolean z = true;
        this.f5688b0 = true;
        eta etaVar = this.f26985w0;
        if (etaVar != null && C3159jt.m14640c(etaVar) != activity) {
            z = false;
        }
        thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m9102c0();
        m9103d0();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        super.mo2123y(context);
        m9102c0();
        m9103d0();
    }
}
