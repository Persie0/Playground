package com.lingq.feature.reader.stats.p019ui.words;

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
import p000.cz4;
import p000.d32;
import p000.eh0;
import p000.eta;
import p000.fy1;
import p000.nk3;
import p000.sq5;
import p000.thb;
import p000.uq0;
import p000.vz1;
import p000.wz2;
import p000.xy4;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class LessonCompleteDealBlueFragment extends AbstractComponentCallbacksC0635c implements nk3 {

    /* JADX INFO: renamed from: C0 */
    public bia f31078C0;

    /* JADX INFO: renamed from: w0 */
    public eta f31079w0;

    /* JADX INFO: renamed from: y0 */
    public volatile C3159jt f31081y0;

    /* JADX INFO: renamed from: x0 */
    public boolean f31080x0 = false;

    /* JADX INFO: renamed from: z0 */
    public final Object f31082z0 = new Object();

    /* JADX INFO: renamed from: A0 */
    public boolean f31076A0 = false;

    /* JADX INFO: renamed from: B0 */
    public final sq5 f31077B0 = new sq5(3, y38.m24933a(xy4.class), new uq0(this, 7));

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return vz1.m23648r(this, new C0282a(2063196107, true, new wz2(this, 11)));
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
        if (this.f31081y0 == null) {
            synchronized (this.f31082z0) {
                try {
                    if (this.f31081y0 == null) {
                        this.f31081y0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f31081y0.mo6995b();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m9482c0() {
        if (this.f31079w0 == null) {
            this.f31079w0 = new eta(super.mo2107i(), this);
            this.f31080x0 = d32.m10022T(super.mo2107i());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c, p000.gr3
    /* JADX INFO: renamed from: d */
    public final zta mo2102d() {
        return eh0.m11143x(this, super.mo2102d());
    }

    /* JADX INFO: renamed from: d0 */
    public final void m9483d0() {
        if (this.f31076A0) {
            return;
        }
        this.f31076A0 = true;
        this.f31078C0 = (bia) ((fy1) ((cz4) mo6995b())).f39919b.f48652U1.get();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: i */
    public final Context mo2107i() {
        if (super.mo2107i() == null && !this.f31080x0) {
            return null;
        }
        m9482c0();
        return this.f31079w0;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        boolean z = true;
        this.f5688b0 = true;
        eta etaVar = this.f31079w0;
        if (etaVar != null && C3159jt.m14640c(etaVar) != activity) {
            z = false;
        }
        thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m9482c0();
        m9483d0();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        super.mo2123y(context);
        m9482c0();
        m9483d0();
    }
}
