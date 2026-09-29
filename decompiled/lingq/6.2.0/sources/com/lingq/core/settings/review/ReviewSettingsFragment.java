package com.lingq.core.settings.review;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C0282a;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.lingq.core.settings.R$layout;
import com.lingq.core.settings.ViewKeys;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.C3159jt;
import p000.cs4;
import p000.d32;
import p000.dua;
import p000.eh0;
import p000.eta;
import p000.gr3;
import p000.ht6;
import p000.mf8;
import p000.nk3;
import p000.or1;
import p000.pf8;
import p000.sq5;
import p000.thb;
import p000.ui3;
import p000.uq0;
import p000.vz1;
import p000.w41;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes2.dex */
public final class ReviewSettingsFragment extends AbstractComponentCallbacksC0635c implements nk3 {

    /* JADX INFO: renamed from: A0 */
    public boolean f23072A0;

    /* JADX INFO: renamed from: B0 */
    public final w41 f23073B0;

    /* JADX INFO: renamed from: C0 */
    public final sq5 f23074C0;

    /* JADX INFO: renamed from: w0 */
    public eta f23075w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f23076x0;

    /* JADX INFO: renamed from: y0 */
    public volatile C3159jt f23077y0;

    /* JADX INFO: renamed from: z0 */
    public final Object f23078z0;

    public ReviewSettingsFragment() {
        super(R$layout.fragment_review_settings);
        this.f23076x0 = false;
        this.f23078z0 = new Object();
        this.f23072A0 = false;
        final ReviewSettingsFragment$special$$inlined$viewModels$default$1 reviewSettingsFragment$special$$inlined$viewModels$default$1 = new ReviewSettingsFragment$special$$inlined$viewModels$default$1(this);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.core.settings.review.ReviewSettingsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) reviewSettingsFragment$special$$inlined$viewModels$default$1.mo0a();
            }
        });
        this.f23073B0 = new w41(y38.m24933a(C1880a.class), new ui3() { // from class: com.lingq.core.settings.review.ReviewSettingsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.core.settings.review.ReviewSettingsFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f23083b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.core.settings.review.ReviewSettingsFragment$special$$inlined$viewModels$default$4
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
        this.f23074C0 = new sq5(3, y38.m24933a(mf8.class), new uq0(this, 15));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return vz1.m23648r(this, new C0282a(-1794304724, true, new ht6(this, 15)));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: B */
    public final void mo2075B() {
        this.f5688b0 = true;
        if (((mf8) this.f23074C0.getValue()).f51256a == ViewKeys.ActivitiesSettings) {
            ((C1880a) this.f23073B0.getValue()).mo8660C0(false);
        }
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
        ((C1880a) this.f23073B0.getValue()).mo8660C0(true);
    }

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        if (this.f23077y0 == null) {
            synchronized (this.f23078z0) {
                try {
                    if (this.f23077y0 == null) {
                        this.f23077y0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f23077y0.mo6995b();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m8658c0() {
        if (this.f23075w0 == null) {
            this.f23075w0 = new eta(super.mo2107i(), this);
            this.f23076x0 = d32.m10022T(super.mo2107i());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c, p000.gr3
    /* JADX INFO: renamed from: d */
    public final zta mo2102d() {
        return eh0.m11143x(this, super.mo2102d());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: i */
    public final Context mo2107i() {
        if (super.mo2107i() == null && !this.f23076x0) {
            return null;
        }
        m8658c0();
        return this.f23075w0;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        this.f5688b0 = true;
        eta etaVar = this.f23075w0;
        thb.m22048g(etaVar == null || C3159jt.m14640c(etaVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m8658c0();
        if (this.f23072A0) {
            return;
        }
        this.f23072A0 = true;
        ((pf8) mo6995b()).getClass();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        super.mo2123y(context);
        m8658c0();
        if (this.f23072A0) {
            return;
        }
        this.f23072A0 = true;
        ((pf8) mo6995b()).getClass();
    }
}
