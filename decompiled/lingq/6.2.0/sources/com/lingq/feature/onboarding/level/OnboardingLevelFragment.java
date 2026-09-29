package com.lingq.feature.onboarding.level;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C0282a;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$LanguageLevels;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.C3159jt;
import p000.cs4;
import p000.cx6;
import p000.d32;
import p000.dua;
import p000.eh0;
import p000.eta;
import p000.fa4;
import p000.fy1;
import p000.gr3;
import p000.hm5;
import p000.ht6;
import p000.nk3;
import p000.or1;
import p000.thb;
import p000.ui3;
import p000.vz1;
import p000.w41;
import p000.y38;
import p000.yt6;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class OnboardingLevelFragment extends AbstractComponentCallbacksC0635c implements nk3 {

    /* JADX INFO: renamed from: B0 */
    public final w41 f27247B0;

    /* JADX INFO: renamed from: C0 */
    public hm5 f27248C0;

    /* JADX INFO: renamed from: w0 */
    public eta f27249w0;

    /* JADX INFO: renamed from: y0 */
    public volatile C3159jt f27251y0;

    /* JADX INFO: renamed from: x0 */
    public boolean f27250x0 = false;

    /* JADX INFO: renamed from: z0 */
    public final Object f27252z0 = new Object();

    /* JADX INFO: renamed from: A0 */
    public boolean f27246A0 = false;

    public OnboardingLevelFragment() {
        final OnboardingLevelFragment$special$$inlined$viewModels$default$1 onboardingLevelFragment$special$$inlined$viewModels$default$1 = new OnboardingLevelFragment$special$$inlined$viewModels$default$1(this);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.onboarding.level.OnboardingLevelFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) onboardingLevelFragment$special$$inlined$viewModels$default$1.mo0a();
            }
        });
        this.f27247B0 = new w41(y38.m24933a(C2210b.class), new ui3() { // from class: com.lingq.feature.onboarding.level.OnboardingLevelFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.onboarding.level.OnboardingLevelFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f27257b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.onboarding.level.OnboardingLevelFragment$special$$inlined$viewModels$default$4
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
        return vz1.m23648r(this, new C0282a(869310299, true, new ht6(this, 2)));
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
    }

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        if (this.f27251y0 == null) {
            synchronized (this.f27252z0) {
                try {
                    if (this.f27251y0 == null) {
                        this.f27251y0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f27251y0.mo6995b();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m9139c0() {
        if (this.f27249w0 == null) {
            this.f27249w0 = new eta(super.mo2107i(), this);
            this.f27250x0 = d32.m10022T(super.mo2107i());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c, p000.gr3
    /* JADX INFO: renamed from: d */
    public final zta mo2102d() {
        return eh0.m11143x(this, super.mo2102d());
    }

    /* JADX INFO: renamed from: d0 */
    public final void m9140d0() {
        if (this.f27246A0) {
            return;
        }
        this.f27246A0 = true;
        this.f27248C0 = (hm5) ((fy1) ((yt6) mo6995b())).f39919b.f48736r.get();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX INFO: renamed from: e0 */
    public final void m9141e0() {
        String value;
        String str = cx6.f34682a;
        String str2 = cx6.f34683b;
        hm5 hm5Var = this.f27248C0;
        if (hm5Var == null) {
            fa4.m11636J("analytics");
            throw null;
        }
        Bundle bundle = new Bundle();
        int iHashCode = str2.hashCode();
        if (iHashCode != 49) {
            if (iHashCode != 51) {
                if (iHashCode == 53 && str2.equals("5")) {
                    value = LqAnalyticsValues$LanguageLevels.Advanced1.getValue();
                } else {
                    value = LqAnalyticsValues$LanguageLevels.Beginner1.getValue();
                }
            } else if (str2.equals("3")) {
                value = LqAnalyticsValues$LanguageLevels.Intermediate1.getValue();
            } else {
                value = LqAnalyticsValues$LanguageLevels.Beginner1.getValue();
            }
        } else if (str2.equals("1")) {
            value = LqAnalyticsValues$LanguageLevels.Beginner1.getValue();
        } else {
            value = LqAnalyticsValues$LanguageLevels.Beginner1.getValue();
        }
        bundle.putString("Registration level", value);
        ((C1240a) hm5Var).m7025f("registration level selected", bundle);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: i */
    public final Context mo2107i() {
        if (super.mo2107i() == null && !this.f27250x0) {
            return null;
        }
        m9139c0();
        return this.f27249w0;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        boolean z = true;
        this.f5688b0 = true;
        eta etaVar = this.f27249w0;
        if (etaVar != null && C3159jt.m14640c(etaVar) != activity) {
            z = false;
        }
        thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m9139c0();
        m9140d0();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        super.mo2123y(context);
        m9139c0();
        m9140d0();
    }
}
