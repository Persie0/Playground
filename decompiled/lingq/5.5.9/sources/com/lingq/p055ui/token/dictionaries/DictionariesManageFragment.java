package com.lingq.p055ui.token.dictionaries;

import android.app.Dialog;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C1165p;
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
import com.lingq.shared.uimodel.language.UserDictionaryData;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import hk.AbstractC6076g;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.C7828f;
import no.InterfaceC7882z;
import p003a2.C0009a;
import p015ak.ViewOnClickListenerC0111h;
import p260m8.C7499b;
import p278nh.InterfaceC7781h;
import p301oh.C8044c;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import ph.C8365u0;
import sl.C9072e;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m13365d2 = {"Lcom/lingq/ui/token/dictionaries/DictionariesManageFragment;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "a", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class DictionariesManageFragment extends AbstractC6076g {

    /* JADX INFO: renamed from: Q0 */
    public DictionariesManageAdapter f31776Q0;

    /* JADX INFO: renamed from: R0 */
    public C1165p f31777R0;

    /* JADX INFO: renamed from: S0 */
    public final FragmentViewBindingDelegate f31778S0 = C4924a.m10477o0(this, DictionariesManageFragment$binding$2.f31781j);

    /* JADX INFO: renamed from: T0 */
    public final C1038i0 f31779T0;

    /* JADX INFO: renamed from: V0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f31775V0 = {C0204c.m857q(DictionariesManageFragment.class, "getBinding()Lcom/lingq/databinding/FragmentManageDictionariesBinding;")};

    /* JADX INFO: renamed from: U0 */
    public static final C4877a f31774U0 = new C4877a();

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionariesManageFragment$a */
    public static final class C4877a {
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionariesManageFragment$b */
    public static final class C4878b implements InterfaceC7781h {
        public C4878b() {
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p278nh.InterfaceC7781h
        /* JADX INFO: renamed from: a */
        public final void mo9874a(RecyclerView.AbstractC1109b0 abstractC1109b0) {
            DictionariesManageFragment dictionariesManageFragment = DictionariesManageFragment.this;
            C1165p c1165p = dictionariesManageFragment.f31777R0;
            if (c1165p == null) {
                C5207g.m11117l("itemTouchHelper");
                throw null;
            }
            c1165p.m4518t(abstractC1109b0);
            ((DictionariesManageViewModel) dictionariesManageFragment.f31779T0.getValue()).f31809i.setValue(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionariesManageFragment$c */
    public static final class C4879c implements DictionariesManageAdapter.InterfaceC4875c {
        public C4879c() {
        }

        @Override // com.lingq.p055ui.token.dictionaries.DictionariesManageAdapter.InterfaceC4875c
        /* JADX INFO: renamed from: a */
        public final void mo10389a(int i10, int i11) {
            DictionariesManageViewModel dictionariesManageViewModelM10393u0 = DictionariesManageFragment.m10393u0(DictionariesManageFragment.this);
            C7828f.m15570d(C8573r0.m16767w0(dictionariesManageViewModelM10393u0), dictionariesManageViewModelM10393u0.f31806f, null, new DictionariesManageViewModel$changePosition$1(dictionariesManageViewModelM10393u0, i10, i11, null), 2);
        }

        @Override // com.lingq.p055ui.token.dictionaries.DictionariesManageAdapter.InterfaceC4875c
        /* JADX INFO: renamed from: b */
        public final void mo10390b(String str) {
            C5207g.m11111f(str, "locale");
            DictionariesManageViewModel dictionariesManageViewModelM10393u0 = DictionariesManageFragment.m10393u0(DictionariesManageFragment.this);
            StateFlowImpl stateFlowImpl = dictionariesManageViewModelM10393u0.f31810j;
            if (C5207g.m11106a(str, stateFlowImpl.getValue())) {
                return;
            }
            stateFlowImpl.setValue(str);
            InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(dictionariesManageViewModelM10393u0);
            DictionariesManageViewModel$fetchAvailableDictionaries$1 dictionariesManageViewModel$fetchAvailableDictionaries$1 = new DictionariesManageViewModel$fetchAvailableDictionaries$1(dictionariesManageViewModelM10393u0, null);
            C7499b.m14933c0(interfaceC7882zM16767w0, dictionariesManageViewModelM10393u0.f31807g, dictionariesManageViewModelM10393u0.f31806f, "observableAvailableDictionaries", dictionariesManageViewModel$fetchAvailableDictionaries$1);
            C7828f.m15570d(C8573r0.m16767w0(dictionariesManageViewModelM10393u0), null, null, new DictionariesManageViewModel$updateActiveDictionaries$1(dictionariesManageViewModelM10393u0, null), 3);
        }

        @Override // com.lingq.p055ui.token.dictionaries.DictionariesManageAdapter.InterfaceC4875c
        /* JADX INFO: renamed from: c */
        public final void mo10391c(UserDictionaryData userDictionaryData) {
            C5207g.m11111f(userDictionaryData, "dictionary");
            DictionariesManageViewModel dictionariesManageViewModelM10393u0 = DictionariesManageFragment.m10393u0(DictionariesManageFragment.this);
            C7828f.m15570d(C8573r0.m16767w0(dictionariesManageViewModelM10393u0), dictionariesManageViewModelM10393u0.f31806f, null, new DictionariesManageViewModel$removeDictionaryFromActive$1(dictionariesManageViewModelM10393u0, userDictionaryData, null), 2);
        }

        @Override // com.lingq.p055ui.token.dictionaries.DictionariesManageAdapter.InterfaceC4875c
        /* JADX INFO: renamed from: d */
        public final void mo10392d(UserDictionaryData userDictionaryData) {
            C5207g.m11111f(userDictionaryData, "dictionary");
            DictionariesManageViewModel dictionariesManageViewModelM10393u0 = DictionariesManageFragment.m10393u0(DictionariesManageFragment.this);
            C7828f.m15570d(C8573r0.m16767w0(dictionariesManageViewModelM10393u0), dictionariesManageViewModelM10393u0.f31806f, null, new DictionariesManageViewModel$addDictionaryToActive$1(dictionariesManageViewModelM10393u0, userDictionaryData, null), 2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.lingq.ui.token.dictionaries.DictionariesManageFragment$special$$inlined$viewModels$default$1] */
    public DictionariesManageFragment() {
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.token.dictionaries.DictionariesManageFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.token.dictionaries.DictionariesManageFragment$special$$inlined$viewModels$default$2
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
        this.f31779T0 = C8573r0.m16711Z(this, C5209i.m11118a(DictionariesManageViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.token.dictionaries.DictionariesManageFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.token.dictionaries.DictionariesManageFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.token.dictionaries.DictionariesManageFragment$special$$inlined$viewModels$default$5
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

    /* JADX INFO: renamed from: u0 */
    public static final DictionariesManageViewModel m10393u0(DictionariesManageFragment dictionariesManageFragment) {
        return (DictionariesManageViewModel) dictionariesManageFragment.f31779T0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C5207g.m11111f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_manage_dictionaries, viewGroup, false);
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
            DisplayMetrics displayMetrics = m3599s().getDisplayMetrics();
            bottomSheetBehaviorM8602w.m8605C(displayMetrics.heightPixels);
            RelativeLayout relativeLayout = m10394v0().f45304a;
            C5207g.m11110e(relativeLayout, "binding.root");
            C4924a.m10444W(relativeLayout, displayMetrics.heightPixels);
        }
        C8365u0 c8365u0M10394v0 = m10394v0();
        c8365u0M10394v0.f45306c.setOnClickListener(new ViewOnClickListenerC0111h(3, this));
        this.f31776Q0 = new DictionariesManageAdapter(new C4878b(), new C4879c());
        m10394v0().f45304a.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        RecyclerView recyclerView = c8365u0M10394v0.f45305b;
        recyclerView.setLayoutManager(linearLayoutManager);
        DictionariesManageAdapter dictionariesManageAdapter = this.f31776Q0;
        if (dictionariesManageAdapter == null) {
            C5207g.m11117l("dictionariesManageAdapter");
            throw null;
        }
        C1165p c1165p = new C1165p(new C8044c(dictionariesManageAdapter, C7499b.m14921S(Integer.valueOf(DictionariesManageAdapter.DictionaryAdapterItemType.AvailableDictionary.ordinal()), Integer.valueOf(DictionariesManageAdapter.DictionaryAdapterItemType.Filter.ordinal())), new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.token.dictionaries.DictionariesManageFragment$onViewCreated$2$callback$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C9072e mo807E() {
                DictionariesManageFragment dictionariesManageFragment = this.f31789b;
                DictionariesManageFragment.m10393u0(dictionariesManageFragment).f31809i.setValue(Boolean.FALSE);
                DictionariesManageViewModel dictionariesManageViewModel = (DictionariesManageViewModel) dictionariesManageFragment.f31779T0.getValue();
                C7499b.m14933c0(C8573r0.m16767w0(dictionariesManageViewModel), dictionariesManageViewModel.f31807g, dictionariesManageViewModel.f31806f, "reorderActiveDictionaries", new DictionariesManageViewModel$reorderActiveDictionaries$1(dictionariesManageViewModel, null));
                return C9072e.f47360a;
            }
        }));
        this.f31777R0 = c1165p;
        c1165p.m4508i(m10394v0().f45305b);
        RecyclerView.AbstractC1117j itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f7080f = 0L;
        }
        DictionariesManageAdapter dictionariesManageAdapter2 = this.f31776Q0;
        if (dictionariesManageAdapter2 == null) {
            C5207g.m11117l("dictionariesManageAdapter");
            throw null;
        }
        recyclerView.setAdapter(dictionariesManageAdapter2);
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4880x672f82cc(this, Lifecycle.State.STARTED, null, this), 3);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: o0 */
    public final int mo3768o0() {
        return R.style.AppTheme_BottomSheetDialog;
    }

    /* JADX INFO: renamed from: v0 */
    public final C8365u0 m10394v0() {
        return (C8365u0) this.f31778S0.m10489a(this, f31775V0[0]);
    }
}
