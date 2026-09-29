package com.lingq.p055ui.home.vocabulary.filter;

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
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2239y;
import com.lingq.commons.p053ui.FilterType;
import com.lingq.shared.uimodel.vocabulary.VocabularySearch;
import com.lingq.shared.uimodel.vocabulary.VocabularySearchQuery;
import com.lingq.shared.uimodel.vocabulary.VocabularySort;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.text.C7076b;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.C7828f;
import p003a2.C0009a;
import p097ej.AbstractC5411b;
import p254m2.C7472a;
import p260m8.C7499b;
import p264mi.C7564d;
import p264mi.C7565e;
import p274n8.ViewOnClickListenerC7718c;
import p301oh.C8043b;
import p322pd.C8228i;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import ph.C8312k2;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/vocabulary/filter/VocabularyFilterSelectionFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class VocabularyFilterSelectionFragment extends AbstractC5411b {

    /* JADX INFO: renamed from: D0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f26380D0 = {C0204c.m857q(VocabularyFilterSelectionFragment.class, "getBinding()Lcom/lingq/databinding/FragmentVocabularyFilterSelectionBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f26381A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f26382B0;

    /* JADX INFO: renamed from: C0 */
    public final C1038i0 f26383C0;

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionFragment$a */
    public static final class C4041a implements VocabularyFilterSelectionAdapter.InterfaceC4040d {
        public C4041a() {
        }

        @Override // com.lingq.p055ui.home.vocabulary.filter.VocabularyFilterSelectionAdapter.InterfaceC4040d
        /* JADX INFO: renamed from: a */
        public final void mo10068a(String str) {
            InterfaceC6727j<Object>[] interfaceC6727jArr = VocabularyFilterSelectionFragment.f26380D0;
            VocabularyFilterSelectionViewModel vocabularyFilterSelectionViewModelM10071o0 = VocabularyFilterSelectionFragment.this.m10071o0();
            String string = C7076b.m14277B3(str).toString();
            C5207g.m11111f(string, "query");
            vocabularyFilterSelectionViewModelM10071o0.f26444l.setValue(string);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
        @Override // com.lingq.p055ui.home.vocabulary.filter.VocabularyFilterSelectionAdapter.InterfaceC4040d
        /* JADX INFO: renamed from: b */
        public final void mo10069b(String str) {
            VocabularySort vocabularySort;
            VocabularySort vocabularySort2;
            VocabularySort[] enumConstants;
            Object obj;
            VocabularySearch vocabularySearch;
            VocabularySearch vocabularySearch2;
            VocabularySearch[] enumConstants2;
            Object next;
            Pair<String, Integer> pair;
            C7564d c7564d;
            Object next2;
            Pair<String, Integer> pair2;
            C7565e c7565e;
            C5207g.m11111f(str, "filter");
            InterfaceC6727j<Object>[] interfaceC6727jArr = VocabularyFilterSelectionFragment.f26380D0;
            VocabularyFilterSelectionViewModel vocabularyFilterSelectionViewModelM10071o0 = VocabularyFilterSelectionFragment.this.m10071o0();
            FilterType filterType = vocabularyFilterSelectionViewModelM10071o0.f26443k;
            int i10 = filterType == null ? -1 : VocabularyFilterSelectionViewModel.C4058a.f26456a[filterType.ordinal()];
            C7138s c7138s = vocabularyFilterSelectionViewModelM10071o0.f26433R;
            StateFlowImpl stateFlowImpl = vocabularyFilterSelectionViewModelM10071o0.f26435T;
            int i11 = 0;
            VocabularySort vocabularySort3 = null;
            if (i10 == 2) {
                VocabularySearchQuery vocabularySearchQuery = (VocabularySearchQuery) stateFlowImpl.getValue();
                if (vocabularySearchQuery != null) {
                    VocabularySort.Companion companion = VocabularySort.INSTANCE;
                    Class<VocabularySort> cls = VocabularySort.class;
                    if (!cls.isEnum()) {
                        cls = null;
                    }
                    if (cls != null && (enumConstants = cls.getEnumConstants()) != null) {
                        int length = enumConstants.length;
                        while (true) {
                            if (i11 >= length) {
                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                            }
                            vocabularySort3 = enumConstants[i11];
                            if (C5207g.m11106a(vocabularySort3.getRoomColumnName(), str)) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (vocabularySort3 == null) {
                        vocabularySort2 = VocabularySort.AtoZ;
                        if (vocabularySort2 == null) {
                            vocabularySort = vocabularySort2;
                            throw new NullPointerException("null cannot be cast to non-null type com.lingq.shared.uimodel.vocabulary.VocabularySort");
                        }
                    } else {
                        vocabularySort = vocabularySort3;
                    }
                    vocabularySort = vocabularySort2;
                    vocabularySearchQuery.f22131e = vocabularySort;
                    vocabularyFilterSelectionViewModelM10071o0.m10073m2(vocabularySearchQuery);
                }
                c7138s.mo14371k(Boolean.TRUE);
                return;
            }
            if (i10 == 3) {
                VocabularySearchQuery vocabularySearchQuery2 = (VocabularySearchQuery) stateFlowImpl.getValue();
                if (vocabularySearchQuery2 != null) {
                    VocabularySearch.Companion companion2 = VocabularySearch.INSTANCE;
                    Class cls2 = VocabularySearch.class.isEnum() ? VocabularySearch.class : null;
                    if (cls2 == null || (enumConstants2 = cls2.getEnumConstants()) == null) {
                        obj = vocabularySort3;
                    } else {
                        int length2 = enumConstants2.length;
                        while (true) {
                            if (i11 >= length2) {
                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                            }
                            VocabularySearch vocabularySearch3 = enumConstants2[i11];
                            if (C5207g.m11106a(vocabularySearch3.getColumnName(), str)) {
                                obj = vocabularySearch3;
                                break;
                            }
                            i11++;
                        }
                    }
                    if (obj == null) {
                        vocabularySearch2 = VocabularySearch.Contains;
                        if (vocabularySearch2 == null) {
                            vocabularySearch = vocabularySearch2;
                            throw new NullPointerException("null cannot be cast to non-null type com.lingq.shared.uimodel.vocabulary.VocabularySearch");
                        }
                    } else {
                        vocabularySearch = obj;
                    }
                    vocabularySearch = vocabularySearch2;
                    vocabularySearchQuery2.f22129c = vocabularySearch;
                    vocabularyFilterSelectionViewModelM10071o0.m10073m2(vocabularySearchQuery2);
                }
                c7138s.mo14371k(Boolean.TRUE);
                return;
            }
            if (i10 == 4) {
                VocabularySearchQuery vocabularySearchQuery3 = (VocabularySearchQuery) stateFlowImpl.getValue();
                if (vocabularySearchQuery3 != null) {
                    if (C5207g.m11106a(str, "key_all")) {
                        pair = new Pair<>(null, null);
                    } else {
                        Iterator it = ((Iterable) vocabularyFilterSelectionViewModelM10071o0.f26428M.getValue()).iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            } else {
                                next = it.next();
                                c7564d = (C7564d) next;
                            }
                        } while (!C5207g.m11106a(c7564d != null ? c7564d.f41688b : null, str));
                        C7564d c7564d2 = (C7564d) next;
                        pair = new Pair<>(str, c7564d2 != null ? Integer.valueOf(c7564d2.f41687a) : null);
                    }
                    vocabularySearchQuery3.f22135i = pair;
                    vocabularySearchQuery3.f22136j = new Pair<>(null, null);
                    vocabularyFilterSelectionViewModelM10071o0.m10073m2(vocabularySearchQuery3);
                }
                c7138s.mo14371k(Boolean.TRUE);
                return;
            }
            if (i10 != 5) {
                if (i10 != 6) {
                    return;
                }
                StateFlowImpl stateFlowImpl2 = vocabularyFilterSelectionViewModelM10071o0.f26431P;
                ArrayList arrayListM13454v0 = C6752c.m13454v0((Collection) stateFlowImpl2.getValue());
                if (C5207g.m11106a(str, "key_all")) {
                    arrayListM13454v0.clear();
                } else if (arrayListM13454v0.contains(str)) {
                    arrayListM13454v0.remove(str);
                } else {
                    arrayListM13454v0.add(str);
                }
                stateFlowImpl2.setValue(arrayListM13454v0);
                VocabularySearchQuery vocabularySearchQuery4 = (VocabularySearchQuery) stateFlowImpl.getValue();
                if (vocabularySearchQuery4 != null) {
                    vocabularySearchQuery4.f22133g = arrayListM13454v0;
                    vocabularyFilterSelectionViewModelM10071o0.m10073m2(vocabularySearchQuery4);
                    return;
                }
                return;
            }
            VocabularySearchQuery vocabularySearchQuery5 = (VocabularySearchQuery) stateFlowImpl.getValue();
            if (vocabularySearchQuery5 != null) {
                if (C5207g.m11106a(str, "key_all")) {
                    pair2 = new Pair<>(null, null);
                } else {
                    Iterator it2 = ((Iterable) vocabularyFilterSelectionViewModelM10071o0.f26429N.getValue()).iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        } else {
                            next2 = it2.next();
                            c7565e = (C7565e) next2;
                        }
                    } while (!C5207g.m11106a(c7565e != null ? c7565e.f41690b : null, str));
                    C7565e c7565e2 = (C7565e) next2;
                    Object objValueOf = vocabularySort3;
                    if (c7565e2 != null) {
                        objValueOf = Integer.valueOf(c7565e2.f41689a);
                    }
                    pair2 = new Pair<>(str, objValueOf);
                }
                vocabularySearchQuery5.f22136j = pair2;
                vocabularyFilterSelectionViewModelM10071o0.m10073m2(vocabularySearchQuery5);
            }
            c7138s.mo14371k(Boolean.TRUE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionFragment$special$$inlined$viewModels$default$1] */
    public VocabularyFilterSelectionFragment() {
        super(R.layout.fragment_vocabulary_filter_selection);
        this.f26381A0 = C4924a.m10477o0(this, VocabularyFilterSelectionFragment$binding$2.f26385j);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionFragment$special$$inlined$viewModels$default$2
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
        this.f26382B0 = C8573r0.m16711Z(this, C5209i.m11118a(VocabularyFilterSelectionViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionFragment$special$$inlined$viewModels$default$5
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
        final InterfaceC2041a<InterfaceC1048n0> interfaceC2041a = new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionFragment$delegateViewModel$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return this.f26386b.m3579b0().m3579b0();
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b2 = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) interfaceC2041a.mo807E();
            }
        });
        this.f26383C0 = C8573r0.m16711Z(this, C5209i.m11118a(VocabularyParentFilterViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b2, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionFragment$special$$inlined$viewModels$default$8
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionFragment$special$$inlined$viewModels$default$9
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
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C8228i c8228iM29r = C0009a.m29r(view, "view", 0, true);
        c8228iM29r.f48293c = 180L;
        m3585f0(c8228iM29r);
        m10070n0().f44960c.setOnClickListener(new ViewOnClickListenerC2239y(19, this));
        m10070n0().f44958a.setOnClickListener(new ViewOnClickListenerC7718c(22, this));
        RecyclerView recyclerView = m10070n0().f44959b;
        m3578a0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        RecyclerView recyclerView2 = m10070n0().f44959b;
        Context contextM3578a0 = m3578a0();
        Object obj = C7472a.f41322a;
        recyclerView2.m4199g(new C8043b(C7472a.c.m14849b(contextM3578a0, R.drawable.dr_item_divider), 0));
        VocabularyFilterSelectionAdapter vocabularyFilterSelectionAdapter = new VocabularyFilterSelectionAdapter(new C4041a());
        m10070n0().f44959b.setAdapter(vocabularyFilterSelectionAdapter);
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4042xb5dde541(this, Lifecycle.State.STARTED, null, this, vocabularyFilterSelectionAdapter), 3);
    }

    /* JADX INFO: renamed from: n0 */
    public final C8312k2 m10070n0() {
        return (C8312k2) this.f26381A0.m10489a(this, f26380D0[0]);
    }

    /* JADX INFO: renamed from: o0 */
    public final VocabularyFilterSelectionViewModel m10071o0() {
        return (VocabularyFilterSelectionViewModel) this.f26382B0.getValue();
    }
}
