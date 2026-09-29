package com.lingq.feature.collections;

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
import p000.b71;
import p000.bia;
import p000.c71;
import p000.d32;
import p000.eh0;
import p000.eta;
import p000.fy1;
import p000.nk3;
import p000.sq5;
import p000.thb;
import p000.uq0;
import p000.vz1;
import p000.w41;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes2.dex */
public final class CollectionFragment extends AbstractComponentCallbacksC0635c implements nk3 {

    /* JADX INFO: renamed from: C0 */
    public w41 f25329C0;

    /* JADX INFO: renamed from: D0 */
    public bia f25330D0;

    /* JADX INFO: renamed from: w0 */
    public eta f25331w0;

    /* JADX INFO: renamed from: y0 */
    public volatile C3159jt f25333y0;

    /* JADX INFO: renamed from: x0 */
    public boolean f25332x0 = false;

    /* JADX INFO: renamed from: z0 */
    public final Object f25334z0 = new Object();

    /* JADX INFO: renamed from: A0 */
    public boolean f25327A0 = false;

    /* JADX INFO: renamed from: B0 */
    public final sq5 f25328B0 = new sq5(3, y38.m24933a(b71.class), new uq0(this, 3));

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return vz1.m23648r(this, new C0282a(-544690191, true, new C3368nd(this, 9)));
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
        if (this.f25333y0 == null) {
            synchronized (this.f25334z0) {
                try {
                    if (this.f25333y0 == null) {
                        this.f25333y0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f25333y0.mo6995b();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m8932c0() {
        if (this.f25331w0 == null) {
            this.f25331w0 = new eta(super.mo2107i(), this);
            this.f25332x0 = d32.m10022T(super.mo2107i());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c, p000.gr3
    /* JADX INFO: renamed from: d */
    public final zta mo2102d() {
        return eh0.m11143x(this, super.mo2102d());
    }

    /* JADX INFO: renamed from: d0 */
    public final void m8933d0() {
        if (this.f25327A0) {
            return;
        }
        this.f25327A0 = true;
        fy1 fy1Var = (fy1) ((c71) mo6995b());
        this.f25329C0 = fy1Var.m12244a();
        this.f25330D0 = (bia) fy1Var.f39919b.f48652U1.get();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: i */
    public final Context mo2107i() {
        if (super.mo2107i() == null && !this.f25332x0) {
            return null;
        }
        m8932c0();
        return this.f25331w0;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        boolean z = true;
        this.f5688b0 = true;
        eta etaVar = this.f25331w0;
        if (etaVar != null && C3159jt.m14640c(etaVar) != activity) {
            z = false;
        }
        thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m8932c0();
        m8933d0();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        super.mo2123y(context);
        m8932c0();
        m8933d0();
    }
}
