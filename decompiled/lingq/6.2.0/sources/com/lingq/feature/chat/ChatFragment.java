package com.lingq.feature.chat;

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
import p000.fy1;
import p000.nk3;
import p000.r32;
import p000.thb;
import p000.vz1;
import p000.w41;
import p000.zta;
import p000.zv0;

/* JADX INFO: loaded from: classes2.dex */
public final class ChatFragment extends AbstractComponentCallbacksC0635c implements nk3 {

    /* JADX INFO: renamed from: B0 */
    public w41 f24774B0;

    /* JADX INFO: renamed from: C0 */
    public r32 f24775C0;

    /* JADX INFO: renamed from: w0 */
    public eta f24776w0;

    /* JADX INFO: renamed from: y0 */
    public volatile C3159jt f24778y0;

    /* JADX INFO: renamed from: x0 */
    public boolean f24777x0 = false;

    /* JADX INFO: renamed from: z0 */
    public final Object f24779z0 = new Object();

    /* JADX INFO: renamed from: A0 */
    public boolean f24773A0 = false;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return vz1.m23648r(this, new C0282a(1856098096, true, new C3368nd(this, 4)));
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
        if (this.f24778y0 == null) {
            synchronized (this.f24779z0) {
                try {
                    if (this.f24778y0 == null) {
                        this.f24778y0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f24778y0.mo6995b();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m8854c0() {
        if (this.f24776w0 == null) {
            this.f24776w0 = new eta(super.mo2107i(), this);
            this.f24777x0 = d32.m10022T(super.mo2107i());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c, p000.gr3
    /* JADX INFO: renamed from: d */
    public final zta mo2102d() {
        return eh0.m11143x(this, super.mo2102d());
    }

    /* JADX INFO: renamed from: d0 */
    public final void m8855d0() {
        if (this.f24773A0) {
            return;
        }
        this.f24773A0 = true;
        fy1 fy1Var = (fy1) ((zv0) mo6995b());
        this.f24774B0 = fy1Var.m12244a();
        this.f24775C0 = (r32) fy1Var.f39919b.f48649T1.get();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: i */
    public final Context mo2107i() {
        if (super.mo2107i() == null && !this.f24777x0) {
            return null;
        }
        m8854c0();
        return this.f24776w0;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        boolean z = true;
        this.f5688b0 = true;
        eta etaVar = this.f24776w0;
        if (etaVar != null && C3159jt.m14640c(etaVar) != activity) {
            z = false;
        }
        thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m8854c0();
        m8855d0();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        super.mo2123y(context);
        m8854c0();
        m8855d0();
    }
}
