package com.lingq.core.settings.notifications;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.R$id;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lingq.core.designsystem.R$style;
import p000.C3159jt;
import p000.d32;
import p000.eh0;
import p000.eta;
import p000.nk3;
import p000.sg0;
import p000.thb;
import p000.vz1;
import p000.xn6;
import p000.z1c;
import p000.zta;

/* JADX INFO: loaded from: classes2.dex */
public final class NotificationsDailyLingqsFragment extends sg0 implements nk3 {

    /* JADX INFO: renamed from: M0 */
    public eta f22984M0;

    /* JADX INFO: renamed from: O0 */
    public volatile C3159jt f22986O0;

    /* JADX INFO: renamed from: N0 */
    public boolean f22985N0 = false;

    /* JADX INFO: renamed from: P0 */
    public final Object f22987P0 = new Object();

    /* JADX INFO: renamed from: Q0 */
    public boolean f22988Q0 = false;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return vz1.m23648r(this, z1c.f70763a);
    }

    @Override // p000.be2, androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: E */
    public final LayoutInflater mo2078E(Bundle bundle) {
        LayoutInflater layoutInflaterMo2078E = super.mo2078E(bundle);
        return layoutInflaterMo2078E.cloneInContext(new eta(layoutInflaterMo2078E, this));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        if (vz1.m23653w(this)) {
            Dialog dialog = this.f8417H0;
            View viewFindViewById = dialog != null ? dialog.findViewById(R$id.design_bottom_sheet) : null;
            if (viewFindViewById != null) {
                BottomSheetBehavior.m6021C(viewFindViewById).m6032M(3);
            }
        }
    }

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        if (this.f22986O0 == null) {
            synchronized (this.f22987P0) {
                try {
                    if (this.f22986O0 == null) {
                        this.f22986O0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f22986O0.mo6995b();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c, p000.gr3
    /* JADX INFO: renamed from: d */
    public final zta mo2102d() {
        return eh0.m11143x(this, super.mo2102d());
    }

    @Override // p000.be2
    /* JADX INFO: renamed from: g0 */
    public final int mo3661g0() {
        return R$style.AppTheme_BottomSheetDialog;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: i */
    public final Context mo2107i() {
        if (super.mo2107i() == null && !this.f22985N0) {
            return null;
        }
        m8648l0();
        return this.f22984M0;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m8648l0() {
        if (this.f22984M0 == null) {
            this.f22984M0 = new eta(super.mo2107i(), this);
            this.f22985N0 = d32.m10022T(super.mo2107i());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        this.f5688b0 = true;
        eta etaVar = this.f22984M0;
        thb.m22048g(etaVar == null || C3159jt.m14640c(etaVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m8648l0();
        if (this.f22988Q0) {
            return;
        }
        this.f22988Q0 = true;
        ((xn6) mo6995b()).getClass();
    }

    @Override // p000.be2, androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        super.mo2123y(context);
        m8648l0();
        if (this.f22988Q0) {
            return;
        }
        this.f22988Q0 = true;
        ((xn6) mo6995b()).getClass();
    }
}
