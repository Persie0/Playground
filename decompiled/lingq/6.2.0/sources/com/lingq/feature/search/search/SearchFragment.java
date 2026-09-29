package com.lingq.feature.search.search;

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
import p000.d32;
import p000.eh0;
import p000.eta;
import p000.fy1;
import p000.ht6;
import p000.nk3;
import p000.nq8;
import p000.oq8;
import p000.sq5;
import p000.thb;
import p000.uq0;
import p000.vz1;
import p000.w41;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchFragment extends AbstractComponentCallbacksC0635c implements nk3 {

    /* JADX INFO: renamed from: C0 */
    public w41 f32979C0;

    /* JADX INFO: renamed from: D0 */
    public bia f32980D0;

    /* JADX INFO: renamed from: w0 */
    public eta f32981w0;

    /* JADX INFO: renamed from: y0 */
    public volatile C3159jt f32983y0;

    /* JADX INFO: renamed from: x0 */
    public boolean f32982x0 = false;

    /* JADX INFO: renamed from: z0 */
    public final Object f32984z0 = new Object();

    /* JADX INFO: renamed from: A0 */
    public boolean f32977A0 = false;

    /* JADX INFO: renamed from: B0 */
    public final sq5 f32978B0 = new sq5(3, y38.m24933a(nq8.class), new uq0(this, 16));

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return vz1.m23648r(this, new C0282a(382174948, true, new ht6(this, 18)));
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
        if (this.f32983y0 == null) {
            synchronized (this.f32984z0) {
                try {
                    if (this.f32983y0 == null) {
                        this.f32983y0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f32983y0.mo6995b();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m9696c0() {
        if (this.f32981w0 == null) {
            this.f32981w0 = new eta(super.mo2107i(), this);
            this.f32982x0 = d32.m10022T(super.mo2107i());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c, p000.gr3
    /* JADX INFO: renamed from: d */
    public final zta mo2102d() {
        return eh0.m11143x(this, super.mo2102d());
    }

    /* JADX INFO: renamed from: d0 */
    public final void m9697d0() {
        if (this.f32977A0) {
            return;
        }
        this.f32977A0 = true;
        fy1 fy1Var = (fy1) ((oq8) mo6995b());
        this.f32979C0 = fy1Var.m12244a();
        this.f32980D0 = (bia) fy1Var.f39919b.f48652U1.get();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: i */
    public final Context mo2107i() {
        if (super.mo2107i() == null && !this.f32982x0) {
            return null;
        }
        m9696c0();
        return this.f32981w0;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        boolean z = true;
        this.f5688b0 = true;
        eta etaVar = this.f32981w0;
        if (etaVar != null && C3159jt.m14640c(etaVar) != activity) {
            z = false;
        }
        thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m9696c0();
        m9697d0();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        super.mo2123y(context);
        m9696c0();
        m9697d0();
    }
}
