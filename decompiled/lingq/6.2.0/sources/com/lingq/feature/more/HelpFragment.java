package com.lingq.feature.more;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C0282a;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import p000.C3159jt;
import p000.d32;
import p000.eh0;
import p000.eta;
import p000.fy1;
import p000.hm5;
import p000.is3;
import p000.ky1;
import p000.nk3;
import p000.ob1;
import p000.thb;
import p000.vz1;
import p000.wz2;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class HelpFragment extends AbstractComponentCallbacksC0635c implements nk3 {

    /* JADX INFO: renamed from: A0 */
    public boolean f26783A0;

    /* JADX INFO: renamed from: B0 */
    public hm5 f26784B0;

    /* JADX INFO: renamed from: C0 */
    public ob1 f26785C0;

    /* JADX INFO: renamed from: w0 */
    public eta f26786w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f26787x0;

    /* JADX INFO: renamed from: y0 */
    public volatile C3159jt f26788y0;

    /* JADX INFO: renamed from: z0 */
    public final Object f26789z0;

    public HelpFragment() {
        super(R$layout.fragment_help);
        this.f26787x0 = false;
        this.f26789z0 = new Object();
        this.f26783A0 = false;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return vz1.m23648r(this, new C0282a(677432499, true, new wz2(this, 3)));
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
        if (this.f26788y0 == null) {
            synchronized (this.f26789z0) {
                try {
                    if (this.f26788y0 == null) {
                        this.f26788y0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f26788y0.mo6995b();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m9089c0() {
        if (this.f26786w0 == null) {
            this.f26786w0 = new eta(super.mo2107i(), this);
            this.f26787x0 = d32.m10022T(super.mo2107i());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c, p000.gr3
    /* JADX INFO: renamed from: d */
    public final zta mo2102d() {
        return eh0.m11143x(this, super.mo2102d());
    }

    /* JADX INFO: renamed from: d0 */
    public final void m9090d0() {
        if (this.f26783A0) {
            return;
        }
        this.f26783A0 = true;
        ky1 ky1Var = ((fy1) ((is3) mo6995b())).f39919b;
        this.f26784B0 = (hm5) ky1Var.f48736r.get();
        this.f26785C0 = (ob1) ky1Var.f48696h.get();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: i */
    public final Context mo2107i() {
        if (super.mo2107i() == null && !this.f26787x0) {
            return null;
        }
        m9089c0();
        return this.f26786w0;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        boolean z = true;
        this.f5688b0 = true;
        eta etaVar = this.f26786w0;
        if (etaVar != null && C3159jt.m14640c(etaVar) != activity) {
            z = false;
        }
        thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m9089c0();
        m9090d0();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        super.mo2123y(context);
        m9089c0();
        m9090d0();
    }
}
