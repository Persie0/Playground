package com.lingq.core.token;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C0282a;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.C3159jt;
import p000.cs4;
import p000.d32;
import p000.dl9;
import p000.dua;
import p000.eh0;
import p000.eta;
import p000.fy1;
import p000.gr3;
import p000.ky1;
import p000.nk3;
import p000.or1;
import p000.thb;
import p000.u4a;
import p000.ui3;
import p000.vz1;
import p000.w41;
import p000.wfb;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes2.dex */
public final class TokenPopupHostFragment extends AbstractComponentCallbacksC0635c implements nk3 {

    /* JADX INFO: renamed from: B0 */
    public final w41 f23458B0;

    /* JADX INFO: renamed from: w0 */
    public eta f23459w0;

    /* JADX INFO: renamed from: y0 */
    public volatile C3159jt f23461y0;

    /* JADX INFO: renamed from: x0 */
    public boolean f23460x0 = false;

    /* JADX INFO: renamed from: z0 */
    public final Object f23462z0 = new Object();

    /* JADX INFO: renamed from: A0 */
    public boolean f23457A0 = false;

    public TokenPopupHostFragment() {
        final TokenPopupHostFragment$special$$inlined$viewModels$default$1 tokenPopupHostFragment$special$$inlined$viewModels$default$1 = new TokenPopupHostFragment$special$$inlined$viewModels$default$1(this);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.core.token.TokenPopupHostFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) tokenPopupHostFragment$special$$inlined$viewModels$default$1.mo0a();
            }
        });
        this.f23458B0 = new w41(y38.m24933a(C1909e.class), new ui3() { // from class: com.lingq.core.token.TokenPopupHostFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.core.token.TokenPopupHostFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f23477b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.core.token.TokenPopupHostFragment$special$$inlined$viewModels$default$4
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
        return vz1.m23648r(this, new C0282a(1344978486, true, new dl9(this, 5)));
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
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C1891x6267648e(this, Lifecycle$State.STARTED, null, this), 3);
    }

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        if (this.f23461y0 == null) {
            synchronized (this.f23462z0) {
                try {
                    if (this.f23461y0 == null) {
                        this.f23461y0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f23461y0.mo6995b();
    }

    /* JADX INFO: renamed from: c0 */
    public final C1909e m8689c0() {
        return (C1909e) this.f23458B0.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c, p000.gr3
    /* JADX INFO: renamed from: d */
    public final zta mo2102d() {
        return eh0.m11143x(this, super.mo2102d());
    }

    /* JADX INFO: renamed from: d0 */
    public final void m8690d0() {
        if (this.f23459w0 == null) {
            this.f23459w0 = new eta(super.mo2107i(), this);
            this.f23460x0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m8691e0() {
        if (this.f23457A0) {
            return;
        }
        this.f23457A0 = true;
        fy1 fy1Var = (fy1) ((u4a) mo6995b());
        ky1 ky1Var = fy1Var.f39919b;
        fy1Var.m12244a();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: i */
    public final Context mo2107i() {
        if (super.mo2107i() == null && !this.f23460x0) {
            return null;
        }
        m8690d0();
        return this.f23459w0;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        boolean z = true;
        this.f5688b0 = true;
        eta etaVar = this.f23459w0;
        if (etaVar != null && C3159jt.m14640c(etaVar) != activity) {
            z = false;
        }
        thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m8690d0();
        m8691e0();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        super.mo2123y(context);
        m8690d0();
        m8691e0();
    }
}
