package com.lingq.p055ui.home.language;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lingq.p055ui.home.HomeViewModel;
import com.lingq.shared.uimodel.language.LanguageToLearn;
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
import p274n8.ViewOnClickListenerC7718c;
import p278nh.InterfaceC7774a;
import p301oh.C8043b;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import p461wi.AbstractC9951a;
import ph.C8262c0;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/language/LanguageSelectorFragment;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LanguageSelectorFragment extends AbstractC9951a {

    /* JADX INFO: renamed from: U0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f24170U0 = {C0204c.m857q(LanguageSelectorFragment.class, "getBinding()Lcom/lingq/databinding/FragmentLanguageSelectorBinding;")};

    /* JADX INFO: renamed from: Q0 */
    public final FragmentViewBindingDelegate f24171Q0 = C4924a.m10477o0(this, LanguageSelectorFragment$binding$2.f24176j);

    /* JADX INFO: renamed from: R0 */
    public final C1038i0 f24172R0 = C8573r0.m16711Z(this, C5209i.m11118a(HomeViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.language.LanguageSelectorFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final C1046m0 mo807E() {
            C1046m0 c1046m0Mo796n = this.m3576Y().mo796n();
            C5207g.m11110e(c1046m0Mo796n, "requireActivity().viewModelStore");
            return c1046m0Mo796n;
        }
    }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.language.LanguageSelectorFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final AbstractC9634a mo807E() {
            return this.m3576Y().mo792j();
        }
    }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.language.LanguageSelectorFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final C1042k0.b mo807E() {
            C1042k0.b bVarMo470i = this.m3576Y().mo470i();
            C5207g.m11110e(bVarMo470i, "requireActivity().defaultViewModelProviderFactory");
            return bVarMo470i;
        }
    });

    /* JADX INFO: renamed from: S0 */
    public final C1038i0 f24173S0;

    /* JADX INFO: renamed from: T0 */
    public C3700a f24174T0;

    /* JADX INFO: renamed from: com.lingq.ui.home.language.LanguageSelectorFragment$a */
    public static final class C3690a implements InterfaceC7774a<LanguageToLearn> {
        public C3690a() {
        }

        @Override // p278nh.InterfaceC7774a
        /* JADX INFO: renamed from: a */
        public final void mo9795a(LanguageToLearn languageToLearn) {
            LanguageToLearn languageToLearn2 = languageToLearn;
            C5207g.m11111f(languageToLearn2, "it");
            LanguageSelectorFragment languageSelectorFragment = LanguageSelectorFragment.this;
            ((HomeViewModel) languageSelectorFragment.f24172R0.getValue()).m9780p2(languageToLearn2.f21681a, languageToLearn2);
            ((HomeViewModel) languageSelectorFragment.f24172R0.getValue()).f22743S.mo16479j(HomeViewModel.AbstractC3479a.b.f22771a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.lingq.ui.home.language.LanguageSelectorFragment$special$$inlined$viewModels$default$1] */
    public LanguageSelectorFragment() {
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.home.language.LanguageSelectorFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.language.LanguageSelectorFragment$special$$inlined$viewModels$default$2
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
        this.f24173S0 = C8573r0.m16711Z(this, C5209i.m11118a(LanguageSelectorViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.language.LanguageSelectorFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.language.LanguageSelectorFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                AbstractC9634a abstractC9634aMo792j = null;
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i != null) {
                    abstractC9634aMo792j = interfaceC1037i.mo792j();
                }
                if (abstractC9634aMo792j == null) {
                    abstractC9634aMo792j = AbstractC9634a.a.f49330b;
                }
                return abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.language.LanguageSelectorFragment$special$$inlined$viewModels$default$5
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
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C5207g.m11111f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_language_selector, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        Dialog dialog = this.f6328G0;
        View viewFindViewById = dialog != null ? dialog.findViewById(R.id.design_bottom_sheet) : null;
        FragmentViewBindingDelegate fragmentViewBindingDelegate = this.f24171Q0;
        InterfaceC6727j<?>[] interfaceC6727jArr = f24170U0;
        if (viewFindViewById != null) {
            BottomSheetBehavior bottomSheetBehaviorM8602w = BottomSheetBehavior.m8602w(viewFindViewById);
            C5207g.m11110e(bottomSheetBehaviorM8602w, "from(it)");
            DisplayMetrics displayMetrics = m3599s().getDisplayMetrics();
            bottomSheetBehaviorM8602w.m8605C(displayMetrics.heightPixels - 160);
            LinearLayout linearLayout = ((C8262c0) fragmentViewBindingDelegate.m10489a(this, interfaceC6727jArr[0])).f44634a;
            C5207g.m11110e(linearLayout, "binding.root");
            C4924a.m10444W(linearLayout, displayMetrics.heightPixels - 160);
        }
        C8262c0 c8262c0 = (C8262c0) fragmentViewBindingDelegate.m10489a(this, interfaceC6727jArr[0]);
        m3578a0();
        c8262c0.f44636c.setLayoutManager(new LinearLayoutManager(1));
        Context contextM3578a0 = m3578a0();
        Object obj = C7472a.f41322a;
        C8043b c8043b = new C8043b(C7472a.c.m14849b(contextM3578a0, R.drawable.dr_item_divider), 0);
        RecyclerView recyclerView = c8262c0.f44636c;
        recyclerView.m4199g(c8043b);
        c8262c0.f44635b.setOnClickListener(new ViewOnClickListenerC7718c(11, this));
        C3700a c3700a = new C3700a(new C3690a());
        this.f24174T0 = c3700a;
        recyclerView.setAdapter(c3700a);
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C3691xcb2e7a6a(this, Lifecycle.State.STARTED, null, this), 3);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: o0 */
    public final int mo3768o0() {
        return R.style.AppTheme_BottomSheetDialog;
    }
}
