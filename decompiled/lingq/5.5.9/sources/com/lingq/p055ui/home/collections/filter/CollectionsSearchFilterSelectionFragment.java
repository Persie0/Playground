package com.lingq.p055ui.home.collections.filter;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
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
import p067d8.ViewOnClickListenerC5062d0;
import p254m2.C7472a;
import p260m8.C7499b;
import p278nh.C7785l;
import p278nh.C7786m;
import p301oh.C8043b;
import p322pd.C8228i;
import p338qd.C8573r0;
import p417ui.AbstractC9539j;
import p427v3.AbstractC9634a;
import ph.C8297i;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/collections/filter/CollectionsSearchFilterSelectionFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class CollectionsSearchFilterSelectionFragment extends AbstractC9539j {

    /* JADX INFO: renamed from: D0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f23490D0 = {C0204c.m857q(CollectionsSearchFilterSelectionFragment.class, "getBinding()Lcom/lingq/databinding/FragmentCollectionsFilterSelectionBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f23491A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f23492B0;

    /* JADX INFO: renamed from: C0 */
    public final C1038i0 f23493C0;

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionFragment$a */
    public static final class C3588a implements CollectionsSearchFilterSelectionAdapter.InterfaceC3586c {
        public C3588a() {
        }

        @Override // com.lingq.p055ui.home.collections.filter.CollectionsSearchFilterSelectionAdapter.InterfaceC3586c
        /* JADX INFO: renamed from: a */
        public final void mo9850a(String str) {
            CollectionsSearchFilterSelectionFragment.m9853n0(CollectionsSearchFilterSelectionFragment.this).f23530I.setValue(str);
        }

        @Override // com.lingq.p055ui.home.collections.filter.CollectionsSearchFilterSelectionAdapter.InterfaceC3586c
        /* JADX INFO: renamed from: b */
        public final void mo9851b(C7785l c7785l) {
            C5207g.m11111f(c7785l, "selectionItem");
            CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModelM9853n0 = CollectionsSearchFilterSelectionFragment.m9853n0(CollectionsSearchFilterSelectionFragment.this);
            String str = c7785l.f42737d;
            C5207g.m11111f(str, "newValue");
            C7828f.m15570d(C8573r0.m16767w0(collectionsSearchFilterSelectionViewModelM9853n0), null, null, new CollectionsSearchFilterSelectionViewModel$updateFilter$1(collectionsSearchFilterSelectionViewModelM9853n0, str, null), 3);
        }

        @Override // com.lingq.p055ui.home.collections.filter.CollectionsSearchFilterSelectionAdapter.InterfaceC3586c
        /* JADX INFO: renamed from: c */
        public final void mo9852c(C7786m c7786m) {
            C5207g.m11111f(c7786m, "selectionUser");
            CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModelM9853n0 = CollectionsSearchFilterSelectionFragment.m9853n0(CollectionsSearchFilterSelectionFragment.this);
            String str = c7786m.f42741d;
            C5207g.m11111f(str, "newValue");
            C7828f.m15570d(C8573r0.m16767w0(collectionsSearchFilterSelectionViewModelM9853n0), null, null, new CollectionsSearchFilterSelectionViewModel$updateFilter$1(collectionsSearchFilterSelectionViewModelM9853n0, str, null), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionFragment$special$$inlined$viewModels$default$1] */
    public CollectionsSearchFilterSelectionFragment() {
        super(R.layout.fragment_collections_filter_selection);
        this.f23491A0 = C4924a.m10477o0(this, CollectionsSearchFilterSelectionFragment$binding$2.f23495j);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionFragment$special$$inlined$viewModels$default$2
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
        this.f23492B0 = C8573r0.m16711Z(this, C5209i.m11118a(CollectionsSearchFilterSelectionViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionFragment$special$$inlined$viewModels$default$5
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
        final InterfaceC2041a<InterfaceC1048n0> interfaceC2041a = new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionFragment$delegateViewModel$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return this.f23496b.m3579b0().m3579b0();
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b2 = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) interfaceC2041a.mo807E();
            }
        });
        this.f23493C0 = C8573r0.m16711Z(this, C5209i.m11118a(CollectionsSearchParentFilterViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b2, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b2);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                AbstractC9634a abstractC9634aMo792j = interfaceC1037i != null ? interfaceC1037i.mo792j() : null;
                return abstractC9634aMo792j == null ? AbstractC9634a.a.f49330b : abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionFragment$special$$inlined$viewModels$default$9
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

    /* JADX INFO: renamed from: n0 */
    public static final CollectionsSearchFilterSelectionViewModel m9853n0(CollectionsSearchFilterSelectionFragment collectionsSearchFilterSelectionFragment) {
        return (CollectionsSearchFilterSelectionViewModel) collectionsSearchFilterSelectionFragment.f23492B0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C8228i c8228iM29r = C0009a.m29r(view, "view", 0, true);
        c8228iM29r.f48293c = 180L;
        m3585f0(c8228iM29r);
        m9854o0().f44871b.setOnClickListener(new ViewOnClickListenerC5062d0(6, this));
        RecyclerView recyclerView = m9854o0().f44870a;
        m3578a0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        RecyclerView recyclerView2 = m9854o0().f44870a;
        Context contextM3578a0 = m3578a0();
        Object obj = C7472a.f41322a;
        recyclerView2.m4199g(new C8043b(C7472a.c.m14849b(contextM3578a0, R.drawable.dr_item_divider), 0));
        CollectionsSearchFilterSelectionAdapter collectionsSearchFilterSelectionAdapter = new CollectionsSearchFilterSelectionAdapter(new C3588a());
        m9854o0().f44870a.setAdapter(collectionsSearchFilterSelectionAdapter);
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C3589x69b13aaa(this, Lifecycle.State.STARTED, null, this, collectionsSearchFilterSelectionAdapter), 3);
    }

    /* JADX INFO: renamed from: o0 */
    public final C8297i m9854o0() {
        return (C8297i) this.f23491A0.m10489a(this, f23490D0[0]);
    }
}
