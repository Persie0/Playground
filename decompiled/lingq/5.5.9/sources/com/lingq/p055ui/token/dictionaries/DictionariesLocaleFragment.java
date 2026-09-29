package com.lingq.p055ui.token.dictionaries;

import android.app.Dialog;
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
import com.lingq.p055ui.home.language.C3700a;
import com.lingq.shared.uimodel.language.LanguageToLearn;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import hk.AbstractC6075f;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import no.C7828f;
import p003a2.C0009a;
import p260m8.C7499b;
import p278nh.InterfaceC7774a;
import p301oh.C8049h;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import ph.C8344q;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m13365d2 = {"Lcom/lingq/ui/token/dictionaries/DictionariesLocaleFragment;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "a", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class DictionariesLocaleFragment extends AbstractC6075f {

    /* JADX INFO: renamed from: Q0 */
    public final FragmentViewBindingDelegate f31728Q0 = C4924a.m10477o0(this, DictionariesLocaleFragment$binding$2.f31732j);

    /* JADX INFO: renamed from: R0 */
    public final C1038i0 f31729R0;

    /* JADX INFO: renamed from: S0 */
    public C3700a f31730S0;

    /* JADX INFO: renamed from: U0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f31727U0 = {C0204c.m857q(DictionariesLocaleFragment.class, "getBinding()Lcom/lingq/databinding/FragmentDictionariesLocaleBinding;")};

    /* JADX INFO: renamed from: T0 */
    public static final C4868a f31726T0 = new C4868a();

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionariesLocaleFragment$a */
    public static final class C4868a {
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionariesLocaleFragment$b */
    public static final class C4869b implements InterfaceC7774a<LanguageToLearn> {
        public C4869b() {
        }

        @Override // p278nh.InterfaceC7774a
        /* JADX INFO: renamed from: a */
        public final void mo9795a(LanguageToLearn languageToLearn) {
            LanguageToLearn languageToLearn2 = languageToLearn;
            C5207g.m11111f(languageToLearn2, "it");
            DictionariesLocaleFragment dictionariesLocaleFragment = DictionariesLocaleFragment.this;
            DictionariesLocaleViewModel dictionariesLocaleViewModel = (DictionariesLocaleViewModel) dictionariesLocaleFragment.f31729R0.getValue();
            String str = languageToLearn2.f21681a;
            C5207g.m11111f(str, "locale");
            C7828f.m15570d(C8573r0.m16767w0(dictionariesLocaleViewModel), dictionariesLocaleViewModel.f31751f, null, new DictionariesLocaleViewModel$updateHintLocale$1(dictionariesLocaleViewModel, str, null), 2);
            dictionariesLocaleFragment.mo3766m0();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.lingq.ui.token.dictionaries.DictionariesLocaleFragment$special$$inlined$viewModels$default$1] */
    public DictionariesLocaleFragment() {
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.token.dictionaries.DictionariesLocaleFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.token.dictionaries.DictionariesLocaleFragment$special$$inlined$viewModels$default$2
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
        this.f31729R0 = C8573r0.m16711Z(this, C5209i.m11118a(DictionariesLocaleViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.token.dictionaries.DictionariesLocaleFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.token.dictionaries.DictionariesLocaleFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                AbstractC9634a abstractC9634aMo792j = interfaceC1037i != null ? interfaceC1037i.mo792j() : null;
                return abstractC9634aMo792j == null ? AbstractC9634a.a.f49330b : abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.token.dictionaries.DictionariesLocaleFragment$special$$inlined$viewModels$default$5
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
        return layoutInflater.inflate(R.layout.fragment_dictionaries_locale, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        Dialog dialog = this.f6328G0;
        View viewFindViewById = dialog != null ? dialog.findViewById(R.id.design_bottom_sheet) : null;
        FragmentViewBindingDelegate fragmentViewBindingDelegate = this.f31728Q0;
        InterfaceC6727j<?>[] interfaceC6727jArr = f31727U0;
        if (viewFindViewById != null) {
            BottomSheetBehavior bottomSheetBehaviorM8602w = BottomSheetBehavior.m8602w(viewFindViewById);
            C5207g.m11110e(bottomSheetBehaviorM8602w, "from(it)");
            DisplayMetrics displayMetrics = m3599s().getDisplayMetrics();
            bottomSheetBehaviorM8602w.m8605C(displayMetrics.heightPixels - 160);
            LinearLayout linearLayout = ((C8344q) fragmentViewBindingDelegate.m10489a(this, interfaceC6727jArr[0])).f45160a;
            C5207g.m11110e(linearLayout, "binding.root");
            C4924a.m10444W(linearLayout, displayMetrics.heightPixels - 160);
        }
        C8344q c8344q = (C8344q) fragmentViewBindingDelegate.m10489a(this, interfaceC6727jArr[0]);
        m3578a0();
        c8344q.f45161b.setLayoutManager(new LinearLayoutManager(1));
        C8049h c8049h = new C8049h(10);
        RecyclerView recyclerView = c8344q.f45161b;
        recyclerView.m4199g(c8049h);
        C3700a c3700a = new C3700a(new C4869b());
        this.f31730S0 = c3700a;
        recyclerView.setAdapter(c3700a);
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4870x24dddd81(this, Lifecycle.State.STARTED, null, this), 3);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: o0 */
    public final int mo3768o0() {
        return R.style.AppTheme_BottomSheetDialog;
    }
}
