package com.lingq.p055ui.home.vocabulary.filter;

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
import com.lingq.commons.p053ui.FilterType;
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
import kotlin.Pair;
import no.C7828f;
import p003a2.C0009a;
import p097ej.AbstractC5410a;
import p260m8.C7499b;
import p278nh.InterfaceC7788o;
import p322pd.C8228i;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import ph.C8306j2;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/vocabulary/filter/VocabularyFilterFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class VocabularyFilterFragment extends AbstractC5410a {

    /* JADX INFO: renamed from: E0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f26346E0 = {C0204c.m857q(VocabularyFilterFragment.class, "getBinding()Lcom/lingq/databinding/FragmentVocabularyFilterBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f26347A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f26348B0;

    /* JADX INFO: renamed from: C0 */
    public final C1038i0 f26349C0;

    /* JADX INFO: renamed from: D0 */
    public C4079a f26350D0;

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.VocabularyFilterFragment$a */
    public static final class C4034a implements InterfaceC7788o {
        public C4034a() {
        }

        @Override // p278nh.InterfaceC7788o
        /* JADX INFO: renamed from: a */
        public final void mo9847a(int i10, int i11) {
        }

        @Override // p278nh.InterfaceC7788o
        /* JADX INFO: renamed from: b */
        public final void mo9848b(int i10, Object obj) {
            if (i10 == ViewKeys.StatusRange.ordinal()) {
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                VocabularyFilterViewModel vocabularyFilterViewModel = (VocabularyFilterViewModel) VocabularyFilterFragment.this.f26348B0.getValue();
                C7828f.m15570d(C8573r0.m16767w0(vocabularyFilterViewModel), null, null, new VocabularyFilterViewModel$updateQueryWith$1(vocabularyFilterViewModel, (Pair) obj, null), 3);
            }
        }

        @Override // p278nh.InterfaceC7788o
        /* JADX INFO: renamed from: c */
        public final void mo9849c(String str, int i10) {
            C5207g.m11111f(str, "value");
            int iOrdinal = ViewKeys.SearchTerm.ordinal();
            VocabularyFilterFragment vocabularyFilterFragment = VocabularyFilterFragment.this;
            if (i10 == iOrdinal) {
                VocabularyFilterFragment.m10067n0(vocabularyFilterFragment).mo10050h1(FilterType.SearchTerm);
                return;
            }
            if (i10 == ViewKeys.SortBy.ordinal()) {
                VocabularyFilterFragment.m10067n0(vocabularyFilterFragment).mo10050h1(FilterType.SortBy);
                return;
            }
            if (i10 == ViewKeys.Course.ordinal()) {
                VocabularyFilterFragment.m10067n0(vocabularyFilterFragment).mo10050h1(FilterType.Course);
            } else if (i10 == ViewKeys.Lesson.ordinal()) {
                VocabularyFilterFragment.m10067n0(vocabularyFilterFragment).mo10050h1(FilterType.Lesson);
            } else {
                if (i10 == ViewKeys.Tags.ordinal()) {
                    VocabularyFilterFragment.m10067n0(vocabularyFilterFragment).mo10050h1(FilterType.Tags);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.home.vocabulary.filter.VocabularyFilterFragment$special$$inlined$viewModels$default$1] */
    public VocabularyFilterFragment() {
        super(R.layout.fragment_vocabulary_filter);
        this.f26347A0 = C4924a.m10477o0(this, VocabularyFilterFragment$binding$2.f26352j);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.home.vocabulary.filter.VocabularyFilterFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.vocabulary.filter.VocabularyFilterFragment$special$$inlined$viewModels$default$2
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
        this.f26348B0 = C8573r0.m16711Z(this, C5209i.m11118a(VocabularyFilterViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.vocabulary.filter.VocabularyFilterFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.vocabulary.filter.VocabularyFilterFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.vocabulary.filter.VocabularyFilterFragment$special$$inlined$viewModels$default$5
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
        final InterfaceC2041a<InterfaceC1048n0> interfaceC2041a = new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.vocabulary.filter.VocabularyFilterFragment$delegateViewModel$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return this.f26353b.m3579b0().m3579b0();
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b2 = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.vocabulary.filter.VocabularyFilterFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) interfaceC2041a.mo807E();
            }
        });
        this.f26349C0 = C8573r0.m16711Z(this, C5209i.m11118a(VocabularyParentFilterViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.vocabulary.filter.VocabularyFilterFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b2, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.vocabulary.filter.VocabularyFilterFragment$special$$inlined$viewModels$default$8
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
                if (abstractC9634aMo792j == null) {
                    abstractC9634aMo792j = AbstractC9634a.a.f49330b;
                }
                return abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.vocabulary.filter.VocabularyFilterFragment$special$$inlined$viewModels$default$9
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
    public static final VocabularyParentFilterViewModel m10067n0(VocabularyFilterFragment vocabularyFilterFragment) {
        return (VocabularyParentFilterViewModel) vocabularyFilterFragment.f26349C0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C8228i c8228iM29r = C0009a.m29r(view, "view", 0, true);
        c8228iM29r.f48293c = 180L;
        m3589h0(c8228iM29r);
        C8306j2 c8306j2 = (C8306j2) this.f26347A0.m10489a(this, f26346E0[0]);
        RecyclerView recyclerView = c8306j2.f44910a;
        m3578a0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        C4079a c4079a = new C4079a(m3578a0(), new C4034a());
        this.f26350D0 = c4079a;
        c8306j2.f44910a.setAdapter(c4079a);
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4035x8d1a8e51(this, Lifecycle.State.STARTED, null, this), 3);
    }
}
