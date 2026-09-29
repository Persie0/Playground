package com.lingq.p055ui.home.search;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.view.View;
import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2238x;
import com.google.android.material.appbar.MaterialToolbar;
import com.lingq.p055ui.home.HomeViewModel;
import com.lingq.p055ui.home.library.LessonMenuItem;
import com.lingq.p055ui.info.LessonInfoParent;
import com.lingq.shared.uimodel.library.FastSearchData;
import com.lingq.shared.uimodel.library.FastSearchType;
import com.lingq.shared.uimodel.library.LessonMediaSource;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.shared.util.LessonPath;
import com.lingq.util.C4924a;
import com.lingq.util.ViewsUtilsKt;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.util.List;
import kh.C6678e;
import kh.C6682i;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.C7828f;
import p003a2.C0009a;
import p048cj.AbstractC2027a;
import p068d9.C5097k;
import p181ii.C6332a;
import p225kk.C6716m;
import p254m2.C7472a;
import p260m8.C7499b;
import p322pd.C8228i;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import p512yi.C10372b0;
import p537zi.C10507q;
import ph.C8346q1;
import sl.C9072e;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/search/SearchFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class SearchFragment extends AbstractC2027a {

    /* JADX INFO: renamed from: E0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f25954E0 = {C0204c.m857q(SearchFragment.class, "getBinding()Lcom/lingq/databinding/FragmentSearchBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final C1038i0 f25955A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f25956B0;

    /* JADX INFO: renamed from: C0 */
    public final FragmentViewBindingDelegate f25957C0;

    /* JADX INFO: renamed from: D0 */
    public SearchAdapter f25958D0;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.lingq.ui.home.search.SearchFragment$special$$inlined$viewModels$default$1] */
    public SearchFragment() {
        super(R.layout.fragment_search);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.home.search.SearchFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.search.SearchFragment$special$$inlined$viewModels$default$2
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
        this.f25955A0 = C8573r0.m16711Z(this, C5209i.m11118a(SearchViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.search.SearchFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.search.SearchFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.search.SearchFragment$special$$inlined$viewModels$default$5
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
        this.f25956B0 = C8573r0.m16711Z(this, C5209i.m11118a(HomeViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.search.SearchFragment$special$$inlined$activityViewModels$default$1
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
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.search.SearchFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                return this.m3576Y().mo792j();
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.search.SearchFragment$special$$inlined$activityViewModels$default$3
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
        this.f25957C0 = C4924a.m10477o0(this, SearchFragment$binding$2.f25959j);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m10010n0(SearchFragment searchFragment, C8346q1 c8346q1) {
        C5207g.m11111f(searchFragment, "this$0");
        C5207g.m11111f(c8346q1, "$this_with");
        searchFragment.m10012p0().m10014m2();
        C7828f.m15570d(C7499b.m14906H(searchFragment), null, null, new SearchFragment$onViewCreated$3$2$1(c8346q1, null), 3);
    }

    /* JADX INFO: renamed from: o0 */
    public static final void m10011o0(SearchFragment searchFragment, C6332a c6332a, boolean z10) {
        String str;
        String str2;
        searchFragment.getClass();
        LessonMediaSource lessonMediaSource = c6332a.f36612r;
        C1038i0 c1038i0 = searchFragment.f25956B0;
        String str3 = "";
        int i10 = c6332a.f36595a;
        if (lessonMediaSource != null && C5207g.m11106a(c6332a.f36601g, "external")) {
            HomeViewModel homeViewModel = (HomeViewModel) c1038i0.getValue();
            LessonMediaSource lessonMediaSource2 = c6332a.f36612r;
            if (lessonMediaSource2 == null || (str = lessonMediaSource2.f22000b) == null) {
                str = str3;
            }
            if (lessonMediaSource2 != null && (str2 = lessonMediaSource2.f22001c) != null) {
                str3 = str2;
            }
            homeViewModel.m9777m2(i10, LessonPath.Search.f22163a, str, str3);
            return;
        }
        if (!C5207g.m11106a(c6332a.f36589P, Boolean.TRUE) && !z10) {
            int i11 = c6332a.f36595a;
            String str4 = c6332a.f36599e;
            String str5 = str4 == null ? str3 : str4;
            String str6 = c6332a.f36602h;
            String str7 = str6 == null ? str3 : str6;
            String str8 = c6332a.f36581H;
            String str9 = str8 == null ? str3 : str8;
            String str10 = c6332a.f36600f;
            String str11 = str10 == null ? str3 : str10;
            LessonInfoParent lessonInfoParent = LessonInfoParent.Overview;
            C5207g.m11111f(lessonInfoParent, "from");
            C4924a.m10447Z(C8573r0.m16725g0(searchFragment), new C6682i(i11, str5, str7, str9, str11, lessonInfoParent));
            return;
        }
        HomeViewModel homeViewModel2 = (HomeViewModel) c1038i0.getValue();
        Integer num = c6332a.f36607m;
        int iIntValue = num != null ? num.intValue() : 0;
        String str12 = c6332a.f36608n;
        homeViewModel2.m9776l2(i10, iIntValue, str12 != null ? str12 : "", LessonPath.Search.f22163a);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: T */
    public final void mo3571T() {
        this.f6090a0 = true;
        SearchViewModel searchViewModelM10012p0 = m10012p0();
        searchViewModelM10012p0.f26009i.m3930c(searchViewModelM10012p0.f25995I.getValue(), "query");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.lingq.ui.home.search.SearchFragment$onViewCreated$3$3] */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C8228i c8228iM29r = C0009a.m29r(view, "view", 0, true);
        c8228iM29r.f48293c = 400L;
        m3585f0(c8228iM29r);
        C8228i c8228i = new C8228i(0, true);
        c8228i.f48293c = 400L;
        m3587g0(c8228i);
        C8346q1 c8346q1 = (C8346q1) this.f25957C0.m10489a(this, f25954E0[0]);
        c8346q1.f45168c.setTitle(m3600t(R.string.search_search));
        Context contextM3578a0 = m3578a0();
        Object obj = C7472a.f41322a;
        Drawable drawableM14849b = C7472a.c.m14849b(contextM3578a0, R.drawable.ic_arrow_back);
        MaterialToolbar materialToolbar = c8346q1.f45168c;
        materialToolbar.setNavigationIcon(drawableM14849b);
        List<Integer> list = C6716m.f37937a;
        materialToolbar.setNavigationIconTint(C6716m.m13333r(R.attr.primaryTextColor, m3578a0()));
        materialToolbar.setNavigationOnClickListener(new ViewOnClickListenerC2238x(11, this));
        int[] iArr = {R.color.indigo_lightest, R.color.yellow_dark, R.color.green};
        SwipeRefreshLayout swipeRefreshLayout = c8346q1.f45167b;
        swipeRefreshLayout.setColorSchemeResources(iArr);
        swipeRefreshLayout.setOnRefreshListener(new C5097k(this, 10, c8346q1));
        m3578a0();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        RecyclerView recyclerView = c8346q1.f45166a;
        recyclerView.setLayoutManager(linearLayoutManager);
        SearchAdapter searchAdapter = new SearchAdapter(new SearchAdapter.InterfaceC3965d() { // from class: com.lingq.ui.home.search.SearchFragment$onViewCreated$3$3
            @Override // com.lingq.p055ui.home.search.SearchAdapter.InterfaceC3965d
            /* JADX INFO: renamed from: a */
            public final void mo10005a(String str) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = SearchFragment.f25954E0;
                this.f25968a.m10012p0().f25995I.setValue(str);
            }

            @Override // com.lingq.p055ui.home.search.SearchAdapter.InterfaceC3965d
            /* JADX INFO: renamed from: b */
            public final void mo10006b(View view2, final C6332a c6332a, final LibraryItemCounter libraryItemCounter) {
                C5207g.m11111f(view2, "view");
                C5207g.m11111f(c6332a, "lesson");
                boolean z10 = false;
                boolean z11 = c6332a.f36612r != null && C5207g.m11106a(c6332a.f36601g, "external");
                boolean z12 = libraryItemCounter != null ? libraryItemCounter.f22005b : false;
                if (libraryItemCounter != null) {
                    z10 = libraryItemCounter.f22009f;
                }
                final SearchFragment searchFragment = this.f25968a;
                new C10372b0(view2, z12, z11, false, z10, new InterfaceC2052l<LessonMenuItem, C9072e>() { // from class: com.lingq.ui.home.search.SearchFragment$onViewCreated$3$3$onLessonMenuClicked$1

                    /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchFragment$onViewCreated$3$3$onLessonMenuClicked$1$a */
                    public /* synthetic */ class C3968a {

                        /* JADX INFO: renamed from: a */
                        public static final /* synthetic */ int[] f25974a;

                        static {
                            int[] iArr = new int[LessonMenuItem.values().length];
                            try {
                                iArr[LessonMenuItem.OpenLesson.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[LessonMenuItem.LessonInfo.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[LessonMenuItem.ViewCourse.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[LessonMenuItem.Like.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            try {
                                iArr[LessonMenuItem.AddToPlaylist.ordinal()] = 5;
                            } catch (NoSuchFieldError unused5) {
                            }
                            try {
                                iArr[LessonMenuItem.Report.ordinal()] = 6;
                            } catch (NoSuchFieldError unused6) {
                            }
                            try {
                                iArr[LessonMenuItem.UpdateIsTaken.ordinal()] = 7;
                            } catch (NoSuchFieldError unused7) {
                            }
                            f25974a = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Code duplicated, block: B:30:0x0095  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(LessonMenuItem lessonMenuItem) {
                        LessonMenuItem lessonMenuItem2 = lessonMenuItem;
                        C5207g.m11111f(lessonMenuItem2, "item");
                        int i10 = C3968a.f25974a[lessonMenuItem2.ordinal()];
                        LibraryItemCounter libraryItemCounter2 = libraryItemCounter;
                        int i11 = 0;
                        final C6332a c6332a2 = c6332a;
                        final SearchFragment searchFragment2 = searchFragment;
                        switch (i10) {
                            case 1:
                                SearchFragment.m10011o0(searchFragment2, c6332a2, true);
                                break;
                            case 2:
                                int i12 = c6332a2.f36595a;
                                String str = c6332a2.f36599e;
                                String str2 = str == null ? "" : str;
                                String str3 = c6332a2.f36602h;
                                String str4 = str3 == null ? "" : str3;
                                String str5 = c6332a2.f36581H;
                                String str6 = str5 == null ? "" : str5;
                                String str7 = c6332a2.f36600f;
                                String str8 = str7 == null ? "" : str7;
                                LessonInfoParent lessonInfoParent = LessonInfoParent.Overview;
                                C5207g.m11111f(lessonInfoParent, "from");
                                C4924a.m10447Z(C8573r0.m16725g0(searchFragment2), new C6682i(i12, str2, str4, str6, str8, lessonInfoParent));
                                break;
                            case 3:
                                Integer num = c6332a2.f36607m;
                                C4924a.m10447Z(C8573r0.m16725g0(searchFragment2), new C6678e(num != null ? num.intValue() : 0, LessonPath.Search.f22163a));
                                break;
                            case 4:
                                if (!c6332a2.m12964a()) {
                                    InterfaceC6727j<Object>[] interfaceC6727jArr = SearchFragment.f25954E0;
                                    SearchViewModel searchViewModelM10012p0 = searchFragment2.m10012p0();
                                    C7828f.m15570d(C8573r0.m16767w0(searchViewModelM10012p0), searchViewModelM10012p0.f26008h, null, new SearchViewModel$updateLike$1(searchViewModelM10012p0, c6332a2.f36595a, null), 2);
                                } else if (!((libraryItemCounter2 == null || libraryItemCounter2.f22005b) ? false : true)) {
                                    InterfaceC6727j<Object>[] interfaceC6727jArr2 = SearchFragment.f25954E0;
                                    SearchViewModel searchViewModelM10012p1 = searchFragment2.m10012p0();
                                    C7828f.m15570d(C8573r0.m16767w0(searchViewModelM10012p1), searchViewModelM10012p1.f26008h, null, new SearchViewModel$updateLike$1(searchViewModelM10012p1, c6332a2.f36595a, null), 2);
                                } else {
                                    ViewsUtilsKt.m10421g(searchFragment2, new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.home.search.SearchFragment$onViewCreated$3$3$onLessonMenuClicked$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // cm.InterfaceC2041a
                                        /* JADX INFO: renamed from: E */
                                        public final C9072e mo807E() {
                                            InterfaceC6727j<Object>[] interfaceC6727jArr3 = SearchFragment.f25954E0;
                                            SearchViewModel searchViewModelM10012p2 = searchFragment2.m10012p0();
                                            int i13 = c6332a2.f36595a;
                                            C7828f.m15570d(C8573r0.m16767w0(searchViewModelM10012p2), searchViewModelM10012p2.f26008h, null, new SearchViewModel$updateLike$1(searchViewModelM10012p2, i13, null), 2);
                                            return C9072e.f47360a;
                                        }
                                    });
                                }
                                break;
                            case 5:
                                int i13 = c6332a2.f36595a;
                                String str9 = c6332a2.f36597c;
                                C4924a.m10447Z(C8573r0.m16725g0(searchFragment2), C8573r0.m16663B(i13, str9 != null ? str9 : "", false, false, 12));
                                break;
                            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                Context contextM3578a1 = searchFragment2.m3578a0();
                                String str10 = c6332a2.f36599e;
                                new C10507q(contextM3578a1, str10 != null ? str10 : "", new InterfaceC2056p<String, String, C9072e>() { // from class: com.lingq.ui.home.search.SearchFragment$onViewCreated$3$3$onLessonMenuClicked$1$reportMenu$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // cm.InterfaceC2056p
                                    /* JADX INFO: renamed from: m0 */
                                    public final C9072e mo1337m0(String str11, String str12) {
                                        String str13 = str11;
                                        C5207g.m11111f(str13, "scope");
                                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = SearchFragment.f25954E0;
                                        SearchFragment searchFragment3 = searchFragment2;
                                        searchFragment3.m10012p0().mo9831a0(searchFragment3.m10012p0().mo498E1(), c6332a2.f36595a, str13, str12);
                                        return C9072e.f47360a;
                                    }
                                }).m19482a();
                                break;
                            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                InterfaceC6727j<Object>[] interfaceC6727jArr3 = SearchFragment.f25954E0;
                                SearchViewModel searchViewModelM10012p2 = searchFragment2.m10012p0();
                                int i14 = c6332a2.f36595a;
                                if (libraryItemCounter2 != null && libraryItemCounter2.f22009f) {
                                    i11 = 1;
                                }
                                C7499b.m14933c0(C8573r0.m16767w0(searchViewModelM10012p2), searchViewModelM10012p2.f26004d, searchViewModelM10012p2.f26008h, C0166e.m761g("updateSave ", i14), new SearchViewModel$updateSave$1(searchViewModelM10012p2, i14, 1 ^ i11, null));
                                break;
                        }
                        return C9072e.f47360a;
                    }
                }, 8);
            }

            @Override // com.lingq.p055ui.home.search.SearchAdapter.InterfaceC3965d
            /* JADX INFO: renamed from: c */
            public final void mo10007c(C6332a c6332a) {
                C5207g.m11111f(c6332a, "course");
                C4924a.m10447Z(C8573r0.m16725g0(this.f25968a), new C6678e(c6332a.f36595a, LessonPath.Search.f22163a));
            }

            @Override // com.lingq.p055ui.home.search.SearchAdapter.InterfaceC3965d
            /* JADX INFO: renamed from: d */
            public final void mo10008d(C6332a c6332a) {
                C5207g.m11111f(c6332a, "lesson");
                SearchFragment.m10011o0(this.f25968a, c6332a, false);
            }

            @Override // com.lingq.p055ui.home.search.SearchAdapter.InterfaceC3965d
            /* JADX INFO: renamed from: e */
            public final void mo10009e(FastSearchData fastSearchData) {
                C5207g.m11111f(fastSearchData, "searchData");
                InterfaceC6727j<Object>[] interfaceC6727jArr = SearchFragment.f25954E0;
                SearchViewModel searchViewModelM10012p0 = this.f25968a.m10012p0();
                String value = FastSearchType.MoreLessons.getValue();
                String str = fastSearchData.f21943c;
                boolean zM11106a = C5207g.m11106a(str, value);
                C7138s c7138s = searchViewModelM10012p0.f26002P;
                StateFlowImpl stateFlowImpl = searchViewModelM10012p0.f25995I;
                if (zM11106a) {
                    c7138s.mo14371k(new AbstractC3986b.c((String) stateFlowImpl.getValue()));
                    return;
                }
                if (C5207g.m11106a(str, FastSearchType.MoreCourses.getValue())) {
                    c7138s.mo14371k(new AbstractC3986b.b((String) stateFlowImpl.getValue()));
                    return;
                }
                if (C5207g.m11106a(str, FastSearchType.Accent.getValue())) {
                    c7138s.mo14371k(new AbstractC3986b.a((String) stateFlowImpl.getValue()));
                } else if (C5207g.m11106a(str, FastSearchType.Shelf.getValue())) {
                    C7828f.m15570d(C8573r0.m16767w0(searchViewModelM10012p0), searchViewModelM10012p0.f26008h, null, new SearchViewModel$navigate$1(searchViewModelM10012p0, fastSearchData, null), 2);
                }
            }
        });
        this.f25958D0 = searchAdapter;
        recyclerView.setAdapter(searchAdapter);
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C3966xe7ae7b7b(this, Lifecycle.State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: p0 */
    public final SearchViewModel m10012p0() {
        return (SearchViewModel) this.f25955A0.getValue();
    }
}
