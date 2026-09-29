package com.lingq.core.settings;

import android.app.Dialog;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p002ui.platform.C0411w;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.compose.runtime.internal.C0282a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lingq.core.designsystem.R$style;
import kotlin.jvm.internal.PropertyReference1Impl;
import p000.C3309ls;
import p000.bh4;
import p000.j29;
import p000.jf3;
import p000.jfa;
import p000.qt3;
import p000.w41;

/* JADX INFO: loaded from: classes2.dex */
public final class SettingsManageSubscriptionsFragment extends qt3 {

    /* JADX INFO: renamed from: U0 */
    public static final /* synthetic */ bh4[] f22660U0 = {new PropertyReference1Impl(SettingsManageSubscriptionsFragment.class, "binding", "getBinding()Lcom/lingq/core/settings/databinding/FragmentSettingsManageSubscriptionsBinding;")};

    /* JADX INFO: renamed from: S0 */
    public final C3309ls f22661S0;

    /* JADX INFO: renamed from: T0 */
    public w41 f22662T0;

    public SettingsManageSubscriptionsFragment() {
        super(5);
        this.f22661S0 = jfa.m14432o(this, SettingsManageSubscriptionsFragment$binding$2.f22663i);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R$layout.fragment_settings_manage_subscriptions, viewGroup, false);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        Dialog dialog = this.f8417H0;
        View viewFindViewById = dialog != null ? dialog.findViewById(com.google.android.material.R$id.design_bottom_sheet) : null;
        bh4[] bh4VarArr = f22660U0;
        C3309ls c3309ls = this.f22661S0;
        if (viewFindViewById != null) {
            BottomSheetBehavior bottomSheetBehaviorM6021C = BottomSheetBehavior.m6021C(viewFindViewById);
            DisplayMetrics displayMetrics = m2110l().getDisplayMetrics();
            bottomSheetBehaviorM6021C.m6031L(displayMetrics.heightPixels);
            ComposeView composeView = ((jf3) c3309ls.getValue(this, bh4VarArr[0])).f45499a;
            composeView.getClass();
            jfa.m14426i(composeView, displayMetrics.heightPixels);
            bottomSheetBehaviorM6021C.f12695L = false;
        }
        ComposeView composeView2 = ((jf3) c3309ls.getValue(this, bh4VarArr[0])).f45500b;
        composeView2.setViewCompositionStrategy(C0411w.f4868a);
        composeView2.setContent(new C0282a(1332163489, true, new j29(this, 0)));
    }

    @Override // p000.be2
    /* JADX INFO: renamed from: g0 */
    public final int mo3661g0() {
        return R$style.AppTheme;
    }
}
