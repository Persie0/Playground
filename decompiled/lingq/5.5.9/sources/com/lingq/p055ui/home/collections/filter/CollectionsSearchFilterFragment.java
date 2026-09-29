package com.lingq.p055ui.home.collections.filter;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
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
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lingq.commons.p053ui.FilterType;
import com.lingq.commons.p053ui.ViewKeys;
import com.lingq.p055ui.home.vocabulary.filter.C4079a;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import no.C7828f;
import p003a2.C0009a;
import p040c4.C1681f;
import p260m8.C7499b;
import p278nh.C7777d;
import p278nh.InterfaceC7788o;
import p322pd.C8228i;
import p338qd.C8573r0;
import p417ui.AbstractC9538i;
import p417ui.C9532c;
import p427v3.AbstractC9634a;
import ph.C8303j;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/collections/filter/CollectionsSearchFilterFragment;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class CollectionsSearchFilterFragment extends AbstractC9538i {

    /* JADX INFO: renamed from: V0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f23450V0 = {C0204c.m857q(CollectionsSearchFilterFragment.class, "getBinding()Lcom/lingq/databinding/FragmentCollectionsSearchFilterBinding;")};

    /* JADX INFO: renamed from: Q0 */
    public final FragmentViewBindingDelegate f23451Q0 = C4924a.m10477o0(this, CollectionsSearchFilterFragment$binding$2.f23457j);

    /* JADX INFO: renamed from: R0 */
    public final C1038i0 f23452R0;

    /* JADX INFO: renamed from: S0 */
    public final C1681f f23453S0;

    /* JADX INFO: renamed from: T0 */
    public final C1038i0 f23454T0;

    /* JADX INFO: renamed from: U0 */
    public C4079a f23455U0;

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterFragment$a */
    public static final class C3572a implements InterfaceC7788o {
        public C3572a() {
        }

        @Override // p278nh.InterfaceC7788o
        /* JADX INFO: renamed from: a */
        public final void mo9847a(int i10, int i11) {
        }

        @Override // p278nh.InterfaceC7788o
        /* JADX INFO: renamed from: b */
        public final void mo9848b(int i10, Object obj) {
            int iOrdinal = ViewKeys.Levels.ordinal();
            CollectionsSearchFilterFragment collectionsSearchFilterFragment = CollectionsSearchFilterFragment.this;
            if (i10 == iOrdinal) {
                CollectionsSearchFilterViewModel collectionsSearchFilterViewModel = (CollectionsSearchFilterViewModel) collectionsSearchFilterFragment.f23452R0.getValue();
                C7828f.m15570d(C8573r0.m16767w0(collectionsSearchFilterViewModel), null, null, new CollectionsSearchFilterViewModel$storeLevelsSelected$1(collectionsSearchFilterViewModel, obj, null), 3);
            } else if (i10 == ViewKeys.ContentTypes.ordinal()) {
                CollectionsSearchFilterViewModel collectionsSearchFilterViewModel2 = (CollectionsSearchFilterViewModel) collectionsSearchFilterFragment.f23452R0.getValue();
                C7828f.m15570d(C8573r0.m16767w0(collectionsSearchFilterViewModel2), null, null, new CollectionsSearchFilterViewModel$storeContentType$1(collectionsSearchFilterViewModel2, obj instanceof Integer ? (Integer) obj : null, null), 3);
            }
        }

        @Override // p278nh.InterfaceC7788o
        /* JADX INFO: renamed from: c */
        public final void mo9849c(String str, int i10) {
            C5207g.m11111f(str, "value");
            int iOrdinal = ViewKeys.ProviderSharedBy.ordinal();
            CollectionsSearchFilterFragment collectionsSearchFilterFragment = CollectionsSearchFilterFragment.this;
            if (i10 == iOrdinal) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = CollectionsSearchFilterFragment.f23450V0;
                CollectionsSearchParentFilterViewModel collectionsSearchParentFilterViewModel = (CollectionsSearchParentFilterViewModel) collectionsSearchFilterFragment.f23454T0.getValue();
                collectionsSearchParentFilterViewModel.f23668d.mo9839r1(new Pair<>(FilterType.ProviderSharedBy, ((C9532c) collectionsSearchFilterFragment.f23453S0.getValue()).f49071a));
                return;
            }
            if (i10 == ViewKeys.LessonTags.ordinal()) {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = CollectionsSearchFilterFragment.f23450V0;
                CollectionsSearchParentFilterViewModel collectionsSearchParentFilterViewModel2 = (CollectionsSearchParentFilterViewModel) collectionsSearchFilterFragment.f23454T0.getValue();
                collectionsSearchParentFilterViewModel2.f23668d.mo9839r1(new Pair<>(FilterType.LessonTags, ((C9532c) collectionsSearchFilterFragment.f23453S0.getValue()).f49071a));
                return;
            }
            if (i10 == ViewKeys.Accent.ordinal()) {
                InterfaceC6727j<Object>[] interfaceC6727jArr3 = CollectionsSearchFilterFragment.f23450V0;
                CollectionsSearchParentFilterViewModel collectionsSearchParentFilterViewModel3 = (CollectionsSearchParentFilterViewModel) collectionsSearchFilterFragment.f23454T0.getValue();
                collectionsSearchParentFilterViewModel3.f23668d.mo9839r1(new Pair<>(FilterType.Accent, ((C9532c) collectionsSearchFilterFragment.f23453S0.getValue()).f49071a));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.lingq.ui.home.collections.filter.CollectionsSearchFilterFragment$special$$inlined$viewModels$default$1] */
    public CollectionsSearchFilterFragment() {
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.home.collections.filter.CollectionsSearchFilterFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.collections.filter.CollectionsSearchFilterFragment$special$$inlined$viewModels$default$2
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
        this.f23452R0 = C8573r0.m16711Z(this, C5209i.m11118a(CollectionsSearchFilterViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.collections.filter.CollectionsSearchFilterFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.collections.filter.CollectionsSearchFilterFragment$special$$inlined$viewModels$default$4
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
                return abstractC9634aMo792j == null ? AbstractC9634a.a.f49330b : abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.collections.filter.CollectionsSearchFilterFragment$special$$inlined$viewModels$default$5
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
        this.f23453S0 = new C1681f(C5209i.m11118a(C9532c.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.home.collections.filter.CollectionsSearchFilterFragment$special$$inlined$navArgs$1
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
        final InterfaceC2041a<InterfaceC1048n0> interfaceC2041a = new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.collections.filter.CollectionsSearchFilterFragment$collectionsViewModel$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                Fragment fragment = this.f23458b.m3579b0().m3594l().f6181x;
                C5207g.m11108c(fragment);
                return fragment;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b2 = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.collections.filter.CollectionsSearchFilterFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) interfaceC2041a.mo807E();
            }
        });
        this.f23454T0 = C8573r0.m16711Z(this, C5209i.m11118a(CollectionsSearchParentFilterViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.collections.filter.CollectionsSearchFilterFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b2, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.collections.filter.CollectionsSearchFilterFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b2);
                AbstractC9634a abstractC9634aMo792j = null;
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i != null) {
                    abstractC9634aMo792j = interfaceC1037i.mo792j();
                }
                return abstractC9634aMo792j == null ? AbstractC9634a.a.f49330b : abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.collections.filter.CollectionsSearchFilterFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1042k0.b mo807E() {
                C1042k0.b bVarMo470i;
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b2);
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
        return layoutInflater.inflate(R.layout.fragment_collections_search_filter, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        if (C7777d.m15481b(this)) {
            Dialog dialog = this.f6328G0;
            View viewFindViewById = dialog != null ? dialog.findViewById(R.id.design_bottom_sheet) : null;
            if (viewFindViewById != null) {
                BottomSheetBehavior bottomSheetBehaviorM8602w = BottomSheetBehavior.m8602w(viewFindViewById);
                C5207g.m11110e(bottomSheetBehaviorM8602w, "from(it)");
                bottomSheetBehaviorM8602w.m8606D(3);
            }
        }
        C8228i c8228i = new C8228i(0, true);
        c8228i.f48293c = 240L;
        m3587g0(c8228i);
        C8228i c8228i2 = new C8228i(0, false);
        c8228i2.f48293c = 480L;
        m3589h0(c8228i2);
        C8303j c8303j = (C8303j) this.f23451Q0.m10489a(this, f23450V0[0]);
        RecyclerView recyclerView = c8303j.f44907a;
        m3578a0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        C4079a c4079a = new C4079a(m3578a0(), new C3572a());
        this.f23455U0 = c4079a;
        c8303j.f44907a.setAdapter(c4079a);
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C3573xeb2cec8(this, Lifecycle.State.STARTED, null, this), 3);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: o0 */
    public final int mo3768o0() {
        return R.style.AppTheme_BottomSheetDialog;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C5207g.m11111f(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        ((CollectionsSearchParentFilterViewModel) this.f23454T0.getValue()).mo9828B1();
    }
}
