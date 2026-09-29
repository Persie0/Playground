package com.lingq.feature.imports;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C0282a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lingq.core.designsystem.R$style;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.C3159jt;
import p000.d32;
import p000.dl9;
import p000.dua;
import p000.eh0;
import p000.eta;
import p000.fka;
import p000.nk3;
import p000.sg0;
import p000.thb;
import p000.ui3;
import p000.vz1;
import p000.y38;
import p000.zja;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class UserImportAddCourseFragment extends sg0 implements nk3 {

    /* JADX INFO: renamed from: M0 */
    public eta f25992M0;

    /* JADX INFO: renamed from: O0 */
    public volatile C3159jt f25994O0;

    /* JADX INFO: renamed from: N0 */
    public boolean f25993N0 = false;

    /* JADX INFO: renamed from: P0 */
    public final Object f25995P0 = new Object();

    /* JADX INFO: renamed from: Q0 */
    public boolean f25996Q0 = false;

    public UserImportAddCourseFragment() {
        final C2082xe1502183 c2082xe1502183 = new C2082xe1502183(this);
        AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.imports.UserImportAddCourseFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) c2082xe1502183.mo0a();
            }
        });
        y38.m24933a(fka.class);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return vz1.m23648r(this, new C0282a(1732703588, true, new dl9(this, 7)));
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
            bottomSheetBehaviorM6021C.m6031L(m2110l().getDisplayMetrics().heightPixels - 200);
            bottomSheetBehaviorM6021C.m6029J(true);
        }
    }

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        if (this.f25994O0 == null) {
            synchronized (this.f25995P0) {
                try {
                    if (this.f25994O0 == null) {
                        this.f25994O0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f25994O0.mo6995b();
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
        if (super.mo2107i() == null && !this.f25993N0) {
            return null;
        }
        m8996l0();
        return this.f25992M0;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m8996l0() {
        if (this.f25992M0 == null) {
            this.f25992M0 = new eta(super.mo2107i(), this);
            this.f25993N0 = d32.m10022T(super.mo2107i());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        this.f5688b0 = true;
        eta etaVar = this.f25992M0;
        thb.m22048g(etaVar == null || C3159jt.m14640c(etaVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m8996l0();
        if (this.f25996Q0) {
            return;
        }
        this.f25996Q0 = true;
        ((zja) mo6995b()).getClass();
    }

    @Override // p000.be2, androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        super.mo2123y(context);
        m8996l0();
        if (this.f25996Q0) {
            return;
        }
        this.f25996Q0 = true;
        ((zja) mo6995b()).getClass();
    }
}
