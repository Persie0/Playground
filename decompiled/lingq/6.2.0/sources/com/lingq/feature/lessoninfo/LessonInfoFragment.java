package com.lingq.feature.lessoninfo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.designsystem.R$style;
import p000.C3159jt;
import p000.bia;
import p000.d32;
import p000.eh0;
import p000.eta;
import p000.fy1;
import p000.i35;
import p000.j35;
import p000.nk3;
import p000.sg0;
import p000.sq5;
import p000.thb;
import p000.uq0;
import p000.vz1;
import p000.w41;
import p000.wz2;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class LessonInfoFragment extends sg0 implements nk3 {

    /* JADX INFO: renamed from: M0 */
    public eta f26337M0;

    /* JADX INFO: renamed from: O0 */
    public volatile C3159jt f26339O0;

    /* JADX INFO: renamed from: S0 */
    public w41 f26343S0;

    /* JADX INFO: renamed from: T0 */
    public bia f26344T0;

    /* JADX INFO: renamed from: N0 */
    public boolean f26338N0 = false;

    /* JADX INFO: renamed from: P0 */
    public final Object f26340P0 = new Object();

    /* JADX INFO: renamed from: Q0 */
    public boolean f26341Q0 = false;

    /* JADX INFO: renamed from: R0 */
    public final sq5 f26342R0 = new sq5(3, y38.m24933a(i35.class), new uq0(this, 10));

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return vz1.m23648r(this, new C0282a(-335679774, true, new wz2(this, 15)));
    }

    @Override // p000.be2, androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: E */
    public final LayoutInflater mo2078E(Bundle bundle) {
        LayoutInflater layoutInflaterMo2078E = super.mo2078E(bundle);
        return layoutInflaterMo2078E.cloneInContext(new eta(layoutInflaterMo2078E, this));
    }

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        if (this.f26339O0 == null) {
            synchronized (this.f26340P0) {
                try {
                    if (this.f26339O0 == null) {
                        this.f26339O0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f26339O0.mo6995b();
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
        if (super.mo2107i() == null && !this.f26338N0) {
            return null;
        }
        m9040l0();
        return this.f26337M0;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m9040l0() {
        if (this.f26337M0 == null) {
            this.f26337M0 = new eta(super.mo2107i(), this);
            this.f26338N0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m9041m0() {
        if (this.f26341Q0) {
            return;
        }
        this.f26341Q0 = true;
        fy1 fy1Var = (fy1) ((j35) mo6995b());
        this.f26343S0 = fy1Var.m12244a();
        this.f26344T0 = (bia) fy1Var.f39919b.f48652U1.get();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        boolean z = true;
        this.f5688b0 = true;
        eta etaVar = this.f26337M0;
        if (etaVar != null && C3159jt.m14640c(etaVar) != activity) {
            z = false;
        }
        thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m9040l0();
        m9041m0();
    }

    @Override // p000.be2, androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        super.mo2123y(context);
        m9040l0();
        m9041m0();
    }
}
