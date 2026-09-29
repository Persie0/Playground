package com.lingq.p055ui.settings;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import ck.AbstractC2035d;
import ck.C2038g;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.ViewKeys;
import com.lingq.shared.storage.LessonFont;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import no.C7828f;
import p003a2.C0009a;
import p254m2.C7472a;
import p260m8.C7499b;
import p278nh.AbstractC7789p;
import p301oh.C8043b;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import ph.C8356s1;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/settings/SettingsSelectionFragment;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class SettingsSelectionFragment extends AbstractC2035d {

    /* JADX INFO: renamed from: S0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f31025S0 = {C0204c.m857q(SettingsSelectionFragment.class, "getBinding()Lcom/lingq/databinding/FragmentSettingsSelectionBinding;")};

    /* JADX INFO: renamed from: Q0 */
    public final FragmentViewBindingDelegate f31026Q0 = C4924a.m10477o0(this, SettingsSelectionFragment$binding$2.f31029j);

    /* JADX INFO: renamed from: R0 */
    public final C1038i0 f31027R0;

    /* JADX INFO: renamed from: com.lingq.ui.settings.SettingsSelectionFragment$a */
    public static final class C4773a implements C4782a.c {
        public C4773a() {
        }

        @Override // com.lingq.p055ui.settings.C4782a.c
        /* JADX INFO: renamed from: a */
        public final void mo10355a(AbstractC7789p abstractC7789p) {
            SettingsSelectionFragment settingsSelectionFragment = SettingsSelectionFragment.this;
            SettingsSelectionFragment.m10353u0(settingsSelectionFragment).m10358l2(settingsSelectionFragment.m3578a0(), abstractC7789p);
            if (abstractC7789p.f42796a != ViewKeys.UseWebVoices.ordinal()) {
                C8573r0.m16725g0(settingsSelectionFragment).m3995p();
            }
        }

        @Override // com.lingq.p055ui.settings.C4782a.c
        /* JADX INFO: renamed from: b */
        public final void mo10356b(AbstractC7789p.e eVar) {
            SettingsSelectionFragment settingsSelectionFragment = SettingsSelectionFragment.this;
            SettingsSelectionFragment.m10353u0(settingsSelectionFragment).m10358l2(settingsSelectionFragment.m3578a0(), eVar);
        }

        @Override // com.lingq.p055ui.settings.C4782a.c
        /* JADX INFO: renamed from: c */
        public final void mo10357c(AbstractC7789p.a aVar, boolean z10) {
            int iOrdinal = ViewKeys.LessonFont.ordinal();
            int i10 = aVar.f42796a;
            SettingsSelectionFragment settingsSelectionFragment = SettingsSelectionFragment.this;
            if (i10 != iOrdinal || z10) {
                SettingsSelectionFragment.m10353u0(settingsSelectionFragment).m10358l2(settingsSelectionFragment.m3578a0(), aVar);
                C8573r0.m16725g0(settingsSelectionFragment).m3995p();
                return;
            }
            SettingsSelectionViewModel settingsSelectionViewModelM10353u0 = SettingsSelectionFragment.m10353u0(settingsSelectionFragment);
            LessonFont.INSTANCE.getClass();
            LessonFont lessonFontM9552b = LessonFont.Companion.m9552b(aVar.f42798c);
            C7828f.m15570d(C8573r0.m16767w0(settingsSelectionViewModelM10353u0), settingsSelectionViewModelM10353u0.f31053H, null, new SettingsSelectionViewModel$downloadFont$1(settingsSelectionViewModelM10353u0, lessonFontM9552b, null), 2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.lingq.ui.settings.SettingsSelectionFragment$special$$inlined$viewModels$default$1] */
    public SettingsSelectionFragment() {
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.settings.SettingsSelectionFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.settings.SettingsSelectionFragment$special$$inlined$viewModels$default$2
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
        this.f31027R0 = C8573r0.m16711Z(this, C5209i.m11118a(SettingsSelectionViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.settings.SettingsSelectionFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.settings.SettingsSelectionFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.settings.SettingsSelectionFragment$special$$inlined$viewModels$default$5
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
        C5207g.m11111f(C5209i.m11118a(C2038g.class), "navArgsClass");
    }

    /* JADX INFO: renamed from: u0 */
    public static final SettingsSelectionViewModel m10353u0(SettingsSelectionFragment settingsSelectionFragment) {
        return (SettingsSelectionViewModel) settingsSelectionFragment.f31027R0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C5207g.m11111f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_settings_selection, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        if (C4924a.m10460g(m3578a0())) {
            m10354v0().f45248a.setBackgroundResource(R.drawable.dr_token_edit_bg);
        }
        m10354v0().f45249b.setItemAnimator(null);
        RecyclerView recyclerView = m10354v0().f45249b;
        m3578a0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        RecyclerView recyclerView2 = m10354v0().f45249b;
        Context contextM3578a0 = m3578a0();
        Object obj = C7472a.f41322a;
        recyclerView2.m4199g(new C8043b(C7472a.c.m14849b(contextM3578a0, R.drawable.dr_item_divider), 0));
        C4782a c4782a = new C4782a(new C4773a());
        m10354v0().f45249b.setAdapter(c4782a);
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4774x16f6f0fc(this, Lifecycle.State.STARTED, null, this, c4782a), 3);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: o0 */
    public final int mo3768o0() {
        return R.style.AppTheme_BottomSheetDialog;
    }

    /* JADX INFO: renamed from: v0 */
    public final C8356s1 m10354v0() {
        return (C8356s1) this.f31026Q0.m10489a(this, f31025S0[0]);
    }
}
