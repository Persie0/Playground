package com.lingq.feature.vocabulary.filter;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import com.google.android.material.R$id;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lingq.core.designsystem.R$style;
import com.lingq.feature.vocabulary.R$layout;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.C3159jt;
import p000.br8;
import p000.cs4;
import p000.d32;
import p000.dua;
import p000.eh0;
import p000.eta;
import p000.gr3;
import p000.nk3;
import p000.or1;
import p000.s0b;
import p000.sg0;
import p000.t0b;
import p000.thb;
import p000.ui3;
import p000.vz1;
import p000.w41;
import p000.wfb;
import p000.x74;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class VocabularyParentFilterFragment extends sg0 implements nk3 {

    /* JADX INFO: renamed from: M0 */
    public eta f33652M0;

    /* JADX INFO: renamed from: O0 */
    public volatile C3159jt f33654O0;

    /* JADX INFO: renamed from: R0 */
    public final w41 f33657R0;

    /* JADX INFO: renamed from: N0 */
    public boolean f33653N0 = false;

    /* JADX INFO: renamed from: P0 */
    public final Object f33655P0 = new Object();

    /* JADX INFO: renamed from: Q0 */
    public boolean f33656Q0 = false;

    public VocabularyParentFilterFragment() {
        final br8 br8Var = new br8(this, 13);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.vocabulary.filter.VocabularyParentFilterFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) br8Var.mo0a();
            }
        });
        this.f33657R0 = new w41(y38.m24933a(t0b.class), new ui3() { // from class: com.lingq.feature.vocabulary.filter.VocabularyParentFilterFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.vocabulary.filter.VocabularyParentFilterFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                zta ztaVarMo2102d;
                dua duaVar = (dua) cs4VarM15357b.getValue();
                gr3 gr3Var = duaVar instanceof gr3 ? (gr3) duaVar : null;
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f33675b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.vocabulary.filter.VocabularyParentFilterFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                dua duaVar = (dua) cs4VarM15357b.getValue();
                gr3 gr3Var = duaVar instanceof gr3 ? (gr3) duaVar : null;
                return gr3Var != null ? gr3Var.mo2103e() : or1.f54780b;
            }
        });
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R$layout.fragment_vocabulary_parent_filter, viewGroup, false);
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
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C2842x27dd029b(this, Lifecycle$State.STARTED, null, this), 3);
    }

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        if (this.f33654O0 == null) {
            synchronized (this.f33655P0) {
                try {
                    if (this.f33654O0 == null) {
                        this.f33654O0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f33654O0.mo6995b();
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
        if (super.mo2107i() == null && !this.f33653N0) {
            return null;
        }
        m9754l0();
        return this.f33652M0;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m9754l0() {
        if (this.f33652M0 == null) {
            this.f33652M0 = new eta(super.mo2107i(), this);
            this.f33653N0 = d32.m10022T(super.mo2107i());
        }
    }

    @Override // p000.be2, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        x74.m24338E(this, "vocabularyFilterClosed", new Bundle());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        this.f5688b0 = true;
        eta etaVar = this.f33652M0;
        thb.m22048g(etaVar == null || C3159jt.m14640c(etaVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m9754l0();
        if (this.f33656Q0) {
            return;
        }
        this.f33656Q0 = true;
        ((s0b) mo6995b()).getClass();
    }

    @Override // p000.be2, androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        super.mo2123y(context);
        m9754l0();
        if (this.f33656Q0) {
            return;
        }
        this.f33656Q0 = true;
        ((s0b) mo6995b()).getClass();
    }
}
