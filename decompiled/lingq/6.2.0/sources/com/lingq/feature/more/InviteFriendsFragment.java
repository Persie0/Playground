package com.lingq.feature.more;

import android.app.Activity;
import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C0282a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.designsystem.R$style;
import p000.C3159jt;
import p000.d32;
import p000.eh0;
import p000.eta;
import p000.fa4;
import p000.fy1;
import p000.hm5;
import p000.jfa;
import p000.nk3;
import p000.oa4;
import p000.sg0;
import p000.thb;
import p000.vz1;
import p000.wz2;
import p000.zta;

/* JADX INFO: loaded from: classes2.dex */
public final class InviteFriendsFragment extends sg0 implements nk3 {

    /* JADX INFO: renamed from: M0 */
    public eta f26790M0;

    /* JADX INFO: renamed from: O0 */
    public volatile C3159jt f26792O0;

    /* JADX INFO: renamed from: R0 */
    public ClipboardManager f26795R0;

    /* JADX INFO: renamed from: S0 */
    public hm5 f26796S0;

    /* JADX INFO: renamed from: N0 */
    public boolean f26791N0 = false;

    /* JADX INFO: renamed from: P0 */
    public final Object f26793P0 = new Object();

    /* JADX INFO: renamed from: Q0 */
    public boolean f26794Q0 = false;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return vz1.m23648r(this, new C0282a(407634681, true, new wz2(this, 4)));
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
        Dialog dialog = this.f8417H0;
        View viewFindViewById = dialog != null ? dialog.findViewById(com.google.android.material.R$id.design_bottom_sheet) : null;
        if (viewFindViewById != null) {
            BottomSheetBehavior bottomSheetBehaviorM6021C = BottomSheetBehavior.m6021C(viewFindViewById);
            DisplayMetrics displayMetrics = m2110l().getDisplayMetrics();
            bottomSheetBehaviorM6021C.m6031L(displayMetrics.heightPixels - 160);
            jfa.m14426i(view, displayMetrics.heightPixels - 160);
        }
        hm5 hm5Var = this.f26796S0;
        if (hm5Var == null) {
            fa4.m11636J("analytics");
            throw null;
        }
        ((C1240a) hm5Var).m7025f("Invite friends visited", null);
        Object systemService = m2089Q().getSystemService("clipboard");
        systemService.getClass();
        this.f26795R0 = (ClipboardManager) systemService;
    }

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        if (this.f26792O0 == null) {
            synchronized (this.f26793P0) {
                try {
                    if (this.f26792O0 == null) {
                        this.f26792O0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f26792O0.mo6995b();
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
        if (super.mo2107i() == null && !this.f26791N0) {
            return null;
        }
        m9091l0();
        return this.f26790M0;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m9091l0() {
        if (this.f26790M0 == null) {
            this.f26790M0 = new eta(super.mo2107i(), this);
            this.f26791N0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m9092m0() {
        if (this.f26794Q0) {
            return;
        }
        this.f26794Q0 = true;
        this.f26796S0 = (hm5) ((fy1) ((oa4) mo6995b())).f39919b.f48736r.get();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        boolean z = true;
        this.f5688b0 = true;
        eta etaVar = this.f26790M0;
        if (etaVar != null && C3159jt.m14640c(etaVar) != activity) {
            z = false;
        }
        thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m9091l0();
        m9092m0();
    }

    @Override // p000.be2, androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        super.mo2123y(context);
        m9091l0();
        m9092m0();
    }
}
