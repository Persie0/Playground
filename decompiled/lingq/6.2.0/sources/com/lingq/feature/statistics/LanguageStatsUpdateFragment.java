package com.lingq.feature.statistics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C0282a;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.C3159jt;
import p000.cs4;
import p000.d32;
import p000.dua;
import p000.eh0;
import p000.eta;
import p000.fa4;
import p000.fy1;
import p000.gr3;
import p000.hm5;
import p000.nk3;
import p000.or1;
import p000.po4;
import p000.thb;
import p000.ui3;
import p000.vz1;
import p000.w41;
import p000.wo4;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class LanguageStatsUpdateFragment extends AbstractComponentCallbacksC0635c implements nk3 {

    /* JADX INFO: renamed from: B0 */
    public final w41 f33223B0;

    /* JADX INFO: renamed from: C0 */
    public w41 f33224C0;

    /* JADX INFO: renamed from: D0 */
    public hm5 f33225D0;

    /* JADX INFO: renamed from: w0 */
    public eta f33226w0;

    /* JADX INFO: renamed from: y0 */
    public volatile C3159jt f33228y0;

    /* JADX INFO: renamed from: x0 */
    public boolean f33227x0 = false;

    /* JADX INFO: renamed from: z0 */
    public final Object f33229z0 = new Object();

    /* JADX INFO: renamed from: A0 */
    public boolean f33222A0 = false;

    public LanguageStatsUpdateFragment() {
        final C2797x5871aba7 c2797x5871aba7 = new C2797x5871aba7(this);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.statistics.LanguageStatsUpdateFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) c2797x5871aba7.mo0a();
            }
        });
        this.f33223B0 = new w41(y38.m24933a(C2817e.class), new ui3() { // from class: com.lingq.feature.statistics.LanguageStatsUpdateFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.statistics.LanguageStatsUpdateFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f33234b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.statistics.LanguageStatsUpdateFragment$special$$inlined$viewModels$default$4
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
        return vz1.m23648r(this, new C0282a(722156223, true, new po4(this, 0)));
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
        if (this.f33228y0 == null) {
            synchronized (this.f33229z0) {
                try {
                    if (this.f33228y0 == null) {
                        this.f33228y0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f33228y0.mo6995b();
    }

    /* JADX INFO: renamed from: c0 */
    public final w41 m9716c0() {
        w41 w41Var = this.f33224C0;
        if (w41Var != null) {
            return w41Var;
        }
        fa4.m11636J("navGraphController");
        throw null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c, p000.gr3
    /* JADX INFO: renamed from: d */
    public final zta mo2102d() {
        return eh0.m11143x(this, super.mo2102d());
    }

    /* JADX INFO: renamed from: d0 */
    public final C2817e m9717d0() {
        return (C2817e) this.f33223B0.getValue();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m9718e0() {
        if (this.f33226w0 == null) {
            this.f33226w0 = new eta(super.mo2107i(), this);
            this.f33227x0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m9719f0() {
        if (this.f33222A0) {
            return;
        }
        this.f33222A0 = true;
        fy1 fy1Var = (fy1) ((wo4) mo6995b());
        this.f33224C0 = fy1Var.m12244a();
        this.f33225D0 = (hm5) fy1Var.f39919b.f48736r.get();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: i */
    public final Context mo2107i() {
        if (super.mo2107i() == null && !this.f33227x0) {
            return null;
        }
        m9718e0();
        return this.f33226w0;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        boolean z = true;
        this.f5688b0 = true;
        eta etaVar = this.f33226w0;
        if (etaVar != null && C3159jt.m14640c(etaVar) != activity) {
            z = false;
        }
        thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m9718e0();
        m9719f0();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        super.mo2123y(context);
        m9718e0();
        m9719f0();
    }
}
