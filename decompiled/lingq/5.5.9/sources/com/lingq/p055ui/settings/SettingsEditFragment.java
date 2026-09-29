package com.lingq.p055ui.settings;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import ck.AbstractC2034c;
import ck.C2036e;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2238x;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lingq.commons.p053ui.ViewKeys;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import mo.C7661i;
import no.C7828f;
import p003a2.C0009a;
import p040c4.C1681f;
import p199jd.ViewOnClickListenerC6464i;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import ph.C8351r1;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/settings/SettingsEditFragment;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class SettingsEditFragment extends AbstractC2034c {

    /* JADX INFO: renamed from: T0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f31006T0 = {C0204c.m857q(SettingsEditFragment.class, "getBinding()Lcom/lingq/databinding/FragmentSettingsEditBinding;")};

    /* JADX INFO: renamed from: Q0 */
    public final FragmentViewBindingDelegate f31007Q0 = C4924a.m10477o0(this, SettingsEditFragment$binding$2.f31010j);

    /* JADX INFO: renamed from: R0 */
    public final C1038i0 f31008R0;

    /* JADX INFO: renamed from: S0 */
    public final C1681f f31009S0;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.lingq.ui.settings.SettingsEditFragment$special$$inlined$viewModels$default$1] */
    public SettingsEditFragment() {
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.settings.SettingsEditFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.settings.SettingsEditFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) r10.mo807E();
            }
        });
        this.f31008R0 = C8573r0.m16711Z(this, C5209i.m11118a(SettingsEditViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.settings.SettingsEditFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.settings.SettingsEditFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                AbstractC9634a abstractC9634aMo792j = interfaceC1037i != null ? interfaceC1037i.mo792j() : null;
                if (abstractC9634aMo792j == null) {
                    abstractC9634aMo792j = AbstractC9634a.a.f49330b;
                }
                return abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.settings.SettingsEditFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1042k0.b mo807E() {
                C1042k0.b bVarMo470i;
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i == null || (bVarMo470i = interfaceC1037i.mo470i()) == null) {
                    bVarMo470i = this.mo470i();
                }
                C5207g.m11110e(bVarMo470i, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return bVarMo470i;
            }
        });
        this.f31009S0 = new C1681f(C5209i.m11118a(C2036e.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.settings.SettingsEditFragment$special$$inlined$navArgs$1
            {
                super(0);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Bundle mo807E() {
                Fragment fragment = this;
                Bundle bundle = fragment.f6101g;
                if (bundle != null) {
                    return bundle;
                }
                throw new IllegalStateException(C0166e.m764j("Fragment ", fragment, " has null arguments"));
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public static void m10352u0(C8351r1 c8351r1, SettingsEditFragment settingsEditFragment) {
        C5207g.m11111f(c8351r1, "$this_with");
        C5207g.m11111f(settingsEditFragment, "this$0");
        String strValueOf = String.valueOf(c8351r1.f45190c.getText());
        if (!C7661i.m15250P2(strValueOf)) {
            SettingsEditViewModel settingsEditViewModel = (SettingsEditViewModel) settingsEditFragment.f31008R0.getValue();
            C7828f.m15570d(C8573r0.m16767w0(settingsEditViewModel), settingsEditViewModel.f31019e, null, new SettingsEditViewModel$updatePreference$1(settingsEditViewModel, strValueOf, null), 2);
        }
        C8573r0.m16725g0(settingsEditFragment).m3995p();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C5207g.m11111f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_settings_edit, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        Dialog dialog = this.f6328G0;
        View viewFindViewById = dialog != null ? dialog.findViewById(R.id.design_bottom_sheet) : null;
        if (viewFindViewById != null) {
            BottomSheetBehavior bottomSheetBehaviorM8602w = BottomSheetBehavior.m8602w(viewFindViewById);
            C5207g.m11110e(bottomSheetBehaviorM8602w, "from(it)");
            bottomSheetBehaviorM8602w.m8605C(m3599s().getDisplayMetrics().heightPixels - 200);
            bottomSheetBehaviorM8602w.m8603A(true);
        }
        C8351r1 c8351r1 = (C8351r1) this.f31007Q0.m10489a(this, f31006T0[0]);
        TextView textView = c8351r1.f45191d;
        C1681f c1681f = this.f31009S0;
        textView.setText(((C2036e) c1681f.getValue()).f10485a);
        c8351r1.f45188a.setOnClickListener(new ViewOnClickListenerC2238x(29, this));
        if (((C2036e) c1681f.getValue()).f10486b == ViewKeys.CardsPerSession.ordinal()) {
            c8351r1.f45190c.setInputType(2);
        }
        c8351r1.f45189b.setOnClickListener(new ViewOnClickListenerC6464i(c8351r1, 20, this));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: o0 */
    public final int mo3768o0() {
        return R.style.AppTheme_BottomSheetDialog;
    }
}
