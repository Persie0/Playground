package com.lingq.feature.vocabulary;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C0282a;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import p000.C3159jt;
import p000.bia;
import p000.c0b;
import p000.d32;
import p000.dl9;
import p000.eh0;
import p000.eta;
import p000.fy1;
import p000.ky1;
import p000.nk3;
import p000.og8;
import p000.thb;
import p000.vz1;
import p000.w41;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class VocabularyFragment extends AbstractComponentCallbacksC0635c implements nk3 {

    /* JADX INFO: renamed from: B0 */
    public og8 f33482B0;

    /* JADX INFO: renamed from: C0 */
    public w41 f33483C0;

    /* JADX INFO: renamed from: D0 */
    public bia f33484D0;

    /* JADX INFO: renamed from: w0 */
    public eta f33485w0;

    /* JADX INFO: renamed from: y0 */
    public volatile C3159jt f33487y0;

    /* JADX INFO: renamed from: x0 */
    public boolean f33486x0 = false;

    /* JADX INFO: renamed from: z0 */
    public final Object f33488z0 = new Object();

    /* JADX INFO: renamed from: A0 */
    public boolean f33481A0 = false;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return vz1.m23648r(this, new C0282a(1455421410, true, new dl9(this, 14)));
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
        vz1.m23636i0(this);
    }

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        if (this.f33487y0 == null) {
            synchronized (this.f33488z0) {
                try {
                    if (this.f33487y0 == null) {
                        this.f33487y0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f33487y0.mo6995b();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m9732c0() {
        if (this.f33485w0 == null) {
            this.f33485w0 = new eta(super.mo2107i(), this);
            this.f33486x0 = d32.m10022T(super.mo2107i());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c, p000.gr3
    /* JADX INFO: renamed from: d */
    public final zta mo2102d() {
        return eh0.m11143x(this, super.mo2102d());
    }

    /* JADX INFO: renamed from: d0 */
    public final void m9733d0() {
        if (this.f33481A0) {
            return;
        }
        this.f33481A0 = true;
        fy1 fy1Var = (fy1) ((c0b) mo6995b());
        ky1 ky1Var = fy1Var.f39919b;
        this.f33482B0 = (og8) ky1Var.f48671a2.get();
        this.f33483C0 = fy1Var.m12244a();
        this.f33484D0 = (bia) ky1Var.f48652U1.get();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: i */
    public final Context mo2107i() {
        if (super.mo2107i() == null && !this.f33486x0) {
            return null;
        }
        m9732c0();
        return this.f33485w0;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        boolean z = true;
        this.f5688b0 = true;
        eta etaVar = this.f33485w0;
        if (etaVar != null && C3159jt.m14640c(etaVar) != activity) {
            z = false;
        }
        thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m9732c0();
        m9733d0();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        super.mo2123y(context);
        m9732c0();
        m9733d0();
    }
}
