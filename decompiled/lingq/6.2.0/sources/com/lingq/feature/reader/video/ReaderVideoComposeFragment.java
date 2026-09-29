package com.lingq.feature.reader.video;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C0282a;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.google.android.material.R$attr;
import com.lingq.core.p012ui.R$transition;
import p000.C3159jt;
import p000.d32;
import p000.daa;
import p000.eh0;
import p000.eta;
import p000.fy1;
import p000.haa;
import p000.ht6;
import p000.m08;
import p000.nk3;
import p000.qz2;
import p000.r46;
import p000.thb;
import p000.vz1;
import p000.w41;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class ReaderVideoComposeFragment extends AbstractComponentCallbacksC0635c implements nk3 {

    /* JADX INFO: renamed from: B0 */
    public w41 f31165B0;

    /* JADX INFO: renamed from: w0 */
    public eta f31166w0;

    /* JADX INFO: renamed from: y0 */
    public volatile C3159jt f31168y0;

    /* JADX INFO: renamed from: x0 */
    public boolean f31167x0 = false;

    /* JADX INFO: renamed from: z0 */
    public final Object f31169z0 = new Object();

    /* JADX INFO: renamed from: A0 */
    public boolean f31164A0 = false;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return vz1.m23648r(this, new C0282a(628935480, true, new ht6(this, 12)));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: E */
    public final LayoutInflater mo2078E(Bundle bundle) {
        LayoutInflater layoutInflaterMo2078E = super.mo2078E(bundle);
        return layoutInflaterMo2078E.cloneInContext(new eta(layoutInflaterMo2078E, this));
    }

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        if (this.f31168y0 == null) {
            synchronized (this.f31169z0) {
                try {
                    if (this.f31168y0 == null) {
                        this.f31168y0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f31168y0.mo6995b();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m9508c0() {
        if (this.f31166w0 == null) {
            this.f31166w0 = new eta(super.mo2107i(), this);
            this.f31167x0 = d32.m10022T(super.mo2107i());
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
        if (super.mo2107i() == null && !this.f31167x0) {
            return null;
        }
        m9508c0();
        return this.f31166w0;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        this.f5688b0 = true;
        eta etaVar = this.f31166w0;
        thb.m22048g(etaVar == null || C3159jt.m14640c(etaVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m9508c0();
        if (this.f31164A0) {
            return;
        }
        this.f31164A0 = true;
        this.f31165B0 = ((fy1) ((m08) mo6995b())).m12244a();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        super.mo2123y(context);
        m9508c0();
        if (this.f31164A0) {
            return;
        }
        this.f31164A0 = true;
        this.f31165B0 = ((fy1) ((m08) mo6995b())).m12244a();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: z */
    public final void mo2124z(Bundle bundle) {
        super.mo2124z(bundle);
        haa haaVar = new haa(m2090R());
        daa daaVarM13157c = haaVar.m13157c(R$transition.slide_up);
        daa daaVar = null;
        if (daaVarM13157c != null) {
            daaVarM13157c.mo10196Q(r46.m20365H(m2090R(), R$attr.motionEasingEmphasizedDecelerateInterpolator, new qz2(1)));
            daaVarM13157c.mo10194O(r46.m20364G(m2090R(), R$attr.motionDurationLong2, 300));
        } else {
            daaVarM13157c = null;
        }
        m2096X(daaVarM13157c);
        daa daaVarM13157c2 = haaVar.m13157c(R$transition.slide_up);
        if (daaVarM13157c2 != null) {
            daaVarM13157c2.mo10196Q(r46.m20365H(m2090R(), R$attr.motionEasingEmphasizedAccelerateInterpolator, new qz2(1)));
            daaVarM13157c2.mo10194O(r46.m20364G(m2090R(), R$attr.motionDurationMedium2, 250));
            daaVar = daaVarM13157c2;
        }
        m2098Z(daaVar);
    }
}
