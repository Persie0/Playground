package com.lingq.feature.challenges.cup;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C0282a;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import p000.C3159jt;
import p000.C3368nd;
import p000.d32;
import p000.eh0;
import p000.eta;
import p000.nk3;
import p000.ss1;
import p000.thb;
import p000.vz1;
import p000.zta;

/* JADX INFO: loaded from: classes2.dex */
public final class CupBadgesFragment extends AbstractComponentCallbacksC0635c implements nk3 {

    /* JADX INFO: renamed from: w0 */
    public eta f24558w0;

    /* JADX INFO: renamed from: y0 */
    public volatile C3159jt f24560y0;

    /* JADX INFO: renamed from: x0 */
    public boolean f24559x0 = false;

    /* JADX INFO: renamed from: z0 */
    public final Object f24561z0 = new Object();

    /* JADX INFO: renamed from: A0 */
    public boolean f24557A0 = false;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return vz1.m23648r(this, new C0282a(-1647984032, true, new C3368nd(this, 14)));
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
        if (this.f24560y0 == null) {
            synchronized (this.f24561z0) {
                try {
                    if (this.f24560y0 == null) {
                        this.f24560y0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f24560y0.mo6995b();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m8813c0() {
        if (this.f24558w0 == null) {
            this.f24558w0 = new eta(super.mo2107i(), this);
            this.f24559x0 = d32.m10022T(super.mo2107i());
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
        if (super.mo2107i() == null && !this.f24559x0) {
            return null;
        }
        m8813c0();
        return this.f24558w0;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        this.f5688b0 = true;
        eta etaVar = this.f24558w0;
        thb.m22048g(etaVar == null || C3159jt.m14640c(etaVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m8813c0();
        if (this.f24557A0) {
            return;
        }
        this.f24557A0 = true;
        ((ss1) mo6995b()).getClass();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        super.mo2123y(context);
        m8813c0();
        if (this.f24557A0) {
            return;
        }
        this.f24557A0 = true;
        ((ss1) mo6995b()).getClass();
    }
}
