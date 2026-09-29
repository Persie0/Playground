package com.lingq.p055ui.home.collections;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.view.View;
import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
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
import com.google.android.material.appbar.MaterialToolbar;
import com.lingq.p055ui.home.HomeViewModel;
import com.lingq.p055ui.home.library.CollectionsAdapter;
import com.lingq.p055ui.home.library.CourseMenuItem;
import com.lingq.p055ui.home.library.LessonMenuItem;
import com.lingq.p055ui.info.LessonInfoParent;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.shared.uimodel.library.LibraryShelf;
import com.lingq.shared.uimodel.library.LibraryTab;
import com.lingq.shared.uimodel.library.Sort;
import com.lingq.shared.util.LessonPath;
import com.lingq.util.C4924a;
import com.lingq.util.ViewsUtilsKt;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.util.List;
import java.util.WeakHashMap;
import kh.C6678e;
import kh.C6682i;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlowImpl;
import ni.C7793a;
import no.C7828f;
import p003a2.C0009a;
import p040c4.C1681f;
import p181ii.C6332a;
import p181ii.C6336e;
import p225kk.C6716m;
import p254m2.C7472a;
import p260m8.C7499b;
import p274n8.ViewOnClickListenerC7718c;
import p290o6.C7946b;
import p301oh.C8049h;
import p322pd.C8228i;
import p338qd.C8573r0;
import p349qo.C8656b;
import p400ti.AbstractC9290e;
import p400ti.C9288c;
import p402u0.C9369l;
import p427v3.AbstractC9634a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p512yi.C10372b0;
import p512yi.C10389q;
import p512yi.InterfaceC10396x;
import p537zi.C10507q;
import ph.C8364u;
import sl.C9072e;
import sl.InterfaceC9070c;
import tc.C9249b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/collections/CollectionsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class CollectionsFragment extends AbstractC9290e {

    /* JADX INFO: renamed from: F0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f23142F0 = {C0204c.m857q(CollectionsFragment.class, "getBinding()Lcom/lingq/databinding/FragmentHomeCollectionsBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f23143A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f23144B0;

    /* JADX INFO: renamed from: C0 */
    public final C1038i0 f23145C0;

    /* JADX INFO: renamed from: D0 */
    public final C1681f f23146D0;

    /* JADX INFO: renamed from: E0 */
    public boolean f23147E0;

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsFragment$a */
    public static final class C3536a extends RecyclerView.AbstractC1125r {
        public C3536a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1125r
        /* JADX INFO: renamed from: a */
        public final void mo4339a(int i10, RecyclerView recyclerView) {
            C5207g.m11111f(recyclerView, "recyclerView");
            if (!recyclerView.canScrollVertically(1)) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = CollectionsFragment.f23142F0;
                CollectionsViewModel collectionsViewModelM9800p0 = CollectionsFragment.this.m9800p0();
                StateFlowImpl stateFlowImpl = collectionsViewModelM9800p0.f23246c0;
                Object value = stateFlowImpl.getValue();
                Resource.Status status = Resource.Status.LOADING;
                if (value != status && stateFlowImpl.getValue() != status) {
                    collectionsViewModelM9800p0.f23240W.mo14371k(C9072e.f47360a);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.home.collections.CollectionsFragment$special$$inlined$viewModels$default$1] */
    public CollectionsFragment() {
        super(R.layout.fragment_home_collections);
        this.f23143A0 = C4924a.m10477o0(this, CollectionsFragment$binding$2.f23149j);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.home.collections.CollectionsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.collections.CollectionsFragment$special$$inlined$viewModels$default$2
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
        this.f23144B0 = C8573r0.m16711Z(this, C5209i.m11118a(CollectionsViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.collections.CollectionsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.collections.CollectionsFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.collections.CollectionsFragment$special$$inlined$viewModels$default$5
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
        this.f23145C0 = C8573r0.m16711Z(this, C5209i.m11118a(HomeViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.collections.CollectionsFragment$special$$inlined$activityViewModels$default$1
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
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.collections.CollectionsFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                return this.m3576Y().mo792j();
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.collections.CollectionsFragment$special$$inlined$activityViewModels$default$3
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
        this.f23146D0 = new C1681f(C5209i.m11118a(C9288c.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.home.collections.CollectionsFragment$special$$inlined$navArgs$1
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

    /* JADX INFO: renamed from: n0 */
    public static void m9798n0(CollectionsFragment collectionsFragment, C8364u c8364u) {
        C5207g.m11111f(collectionsFragment, "this$0");
        C5207g.m11111f(c8364u, "$this_with");
        collectionsFragment.m9800p0().m9836o2(false);
        C7828f.m15570d(C7499b.m14906H(collectionsFragment), null, null, new CollectionsFragment$onViewCreated$4$2$1(c8364u, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: Q */
    public final void mo3568Q() {
        this.f6090a0 = true;
        if (this.f23147E0) {
            this.f23147E0 = false;
            CollectionsViewModel collectionsViewModelM9800p0 = m9800p0();
            C7828f.m15570d(C8573r0.m16767w0(collectionsViewModelM9800p0), null, null, new CollectionsViewModel$updateUser$1(collectionsViewModelM9800p0, null), 3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: T */
    public final void mo3571T() {
        this.f6090a0 = true;
        CollectionsViewModel collectionsViewModelM9800p0 = m9800p0();
        C7828f.m15570d(C8573r0.m16767w0(collectionsViewModelM9800p0), collectionsViewModelM9800p0.f23253g, null, new CollectionsViewModel$setLanguageFilters$1(collectionsViewModelM9800p0, false, null), 2);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        C9369l c9369l = new C9369l(20, this);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.i.m18727u(view, c9369l);
        C8228i c8228i = new C8228i(0, true);
        c8228i.f48293c = 400L;
        m3585f0(c8228i);
        C8228i c8228i2 = new C8228i(0, false);
        c8228i2.f48293c = 400L;
        m3591j0(c8228i2);
        CollectionsAdapter collectionsAdapter = new CollectionsAdapter(CollectionsAdapter.InnerListLayout.VerticalFullWidth, new InterfaceC10396x() { // from class: com.lingq.ui.home.collections.CollectionsFragment$onViewCreated$contentAdapter$1
            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: a */
            public final void mo9801a(String str) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = CollectionsFragment.f23142F0;
                this.f23197a.m9800p0().f23232O.setValue(str);
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: b */
            public final void mo9802b() {
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: c */
            public final void mo9803c(View view2, C6332a c6332a, LibraryItemCounter libraryItemCounter, String str) {
                C5207g.m11111f(view2, "view");
                C5207g.m11111f(c6332a, "lesson");
                C5207g.m11111f(str, "shelf");
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: d */
            public final void mo9804d(C6336e c6336e) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = CollectionsFragment.f23142F0;
                CollectionsViewModel collectionsViewModelM9800p0 = this.f23197a.m9800p0();
                for (Object obj : collectionsViewModelM9800p0.f23230M.f47985a.f22049b) {
                    if (C5207g.m11106a(((LibraryTab) obj).f22065f, c6336e.f36634g)) {
                        collectionsViewModelM9800p0.f23231N.setValue(obj);
                    }
                }
                obj = null;
                collectionsViewModelM9800p0.f23231N.setValue(obj);
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: e */
            public final void mo9805e(C6332a c6332a) {
                C5207g.m11111f(c6332a, "course");
                CollectionsFragment collectionsFragment = this.f23197a;
                C9249b c9249b = new C9249b(collectionsFragment.m3578a0());
                c9249b.setTitle(collectionsFragment.m3600t(R.string.course_download_course));
                c9249b.f599a.f579f = collectionsFragment.m3600t(R.string.course_download_course_desc);
                c9249b.m17612e(collectionsFragment.m3600t(R.string.ui_yes), new DialogInterfaceOnClickListenerC3570b(collectionsFragment, 0, c6332a));
                c9249b.m17610c(collectionsFragment.m3600t(R.string.ui_no), new DialogInterface.OnClickListener() { // from class: ti.b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                    }
                });
                c9249b.m876a();
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: f */
            public final void mo9806f(Sort sort) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = CollectionsFragment.f23142F0;
                CollectionsViewModel collectionsViewModelM9800p0 = this.f23197a.m9800p0();
                C7828f.m15570d(C8573r0.m16767w0(collectionsViewModelM9800p0), null, null, new CollectionsViewModel$updateSearchSettings$1(collectionsViewModelM9800p0, sort, null), 3);
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: g */
            public final void mo9807g(C6332a c6332a) {
                C5207g.m11111f(c6332a, "course");
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: h */
            public final void mo9808h(C6332a c6332a, LibraryItemCounter libraryItemCounter) {
                C5207g.m11111f(c6332a, "lesson");
                InterfaceC6727j<Object>[] interfaceC6727jArr = CollectionsFragment.f23142F0;
                CollectionsFragment collectionsFragment = this.f23197a;
                CollectionsViewModel collectionsViewModelM9800p0 = collectionsFragment.m9800p0();
                boolean z10 = false;
                if (libraryItemCounter != null && libraryItemCounter.f22009f) {
                    z10 = true;
                }
                collectionsViewModelM9800p0.m9838q2(new AbstractC3569a.b(c6332a, !z10, collectionsFragment.m9800p0().m9835n2(c6332a, libraryItemCounter)));
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: i */
            public final void mo9809i(C6332a c6332a, String str) {
                C5207g.m11111f(c6332a, "course");
                C5207g.m11111f(str, "shelf");
                C4924a.m10447Z(C8573r0.m16725g0(this.f23197a), new C6678e(c6332a.f36595a, new LessonPath.SearchShelf(str)));
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: j */
            public final void mo9810j(C6332a c6332a) {
                C5207g.m11111f(c6332a, "course");
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: k */
            public final void mo9811k(LibraryShelf libraryShelf) {
                C5207g.m11111f(libraryShelf, "shelf");
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0028  */
            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: l */
            public final void mo9812l(View view2, final C6332a c6332a, LibraryItemCounter libraryItemCounter, final String str) {
                boolean z10;
                C5207g.m11111f(view2, "view");
                C5207g.m11111f(c6332a, "course");
                C5207g.m11111f(str, "shelfId");
                if (c6332a.f36594U <= 0) {
                    z10 = false;
                } else {
                    if ((libraryItemCounter == null || libraryItemCounter.f22016m) ? false : true) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                boolean z11 = libraryItemCounter != null ? libraryItemCounter.f22005b : false;
                boolean z12 = !z10;
                final CollectionsFragment collectionsFragment = this.f23197a;
                new C10389q(view2, new InterfaceC2052l<CourseMenuItem, C9072e>() { // from class: com.lingq.ui.home.collections.CollectionsFragment$onViewCreated$contentAdapter$1$onCourseMenuClicked$1

                    /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsFragment$onViewCreated$contentAdapter$1$onCourseMenuClicked$1$a */
                    public /* synthetic */ class a {

                        /* JADX INFO: renamed from: a */
                        public static final /* synthetic */ int[] f23201a;

                        static {
                            int[] iArr = new int[CourseMenuItem.values().length];
                            try {
                                iArr[CourseMenuItem.ViewCourse.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[CourseMenuItem.AddToPlaylist.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[CourseMenuItem.Like.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[CourseMenuItem.Report.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            f23201a = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(CourseMenuItem courseMenuItem) {
                        CourseMenuItem courseMenuItem2 = courseMenuItem;
                        C5207g.m11111f(courseMenuItem2, "item");
                        int i10 = a.f23201a[courseMenuItem2.ordinal()];
                        final C6332a c6332a2 = c6332a;
                        final CollectionsFragment collectionsFragment2 = collectionsFragment;
                        if (i10 != 1) {
                            if (i10 == 2) {
                                int i11 = c6332a2.f36595a;
                                String str2 = c6332a2.f36597c;
                                C4924a.m10447Z(C8573r0.m16725g0(collectionsFragment2), C8573r0.m16663B(i11, str2 != null ? str2 : "", true, false, 8));
                            } else if (i10 == 3) {
                                InterfaceC6727j<Object>[] interfaceC6727jArr = CollectionsFragment.f23142F0;
                                CollectionsViewModel collectionsViewModelM9800p0 = collectionsFragment2.m9800p0();
                                int i12 = c6332a2.f36595a;
                                C7499b.m14933c0(C8573r0.m16767w0(collectionsViewModelM9800p0), collectionsViewModelM9800p0.f23255h, collectionsViewModelM9800p0.f23253g, C0166e.m761g("updateCourseLike ", i12), new CollectionsViewModel$updateCourseLike$1(collectionsViewModelM9800p0, i12, null));
                            } else if (i10 == 4) {
                                Context contextM3578a0 = collectionsFragment2.m3578a0();
                                String str3 = c6332a2.f36599e;
                                new C10507q(contextM3578a0, str3 != null ? str3 : "", new InterfaceC2056p<String, String, C9072e>() { // from class: com.lingq.ui.home.collections.CollectionsFragment$onViewCreated$contentAdapter$1$onCourseMenuClicked$1$reportMenu$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // cm.InterfaceC2056p
                                    /* JADX INFO: renamed from: m0 */
                                    public final C9072e mo1337m0(String str4, String str5) {
                                        String str6 = str4;
                                        C5207g.m11111f(str6, "scope");
                                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = CollectionsFragment.f23142F0;
                                        CollectionsFragment collectionsFragment3 = collectionsFragment2;
                                        collectionsFragment3.m9800p0().mo9834n(collectionsFragment3.m9800p0().mo498E1(), c6332a2.f36595a, str6, str5);
                                        return C9072e.f47360a;
                                    }
                                }).m19482a();
                            }
                        } else {
                            C4924a.m10447Z(C8573r0.m16725g0(collectionsFragment2), new C6678e(c6332a2.f36595a, new LessonPath.SearchShelf(str)));
                        }
                        return C9072e.f47360a;
                    }
                }, z11, z12);
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: m */
            public final void mo9813m(C6332a c6332a, LibraryItemCounter libraryItemCounter, String str) {
                C5207g.m11111f(c6332a, "lesson");
                C5207g.m11111f(str, "shelf");
                InterfaceC6727j<Object>[] interfaceC6727jArr = CollectionsFragment.f23142F0;
                CollectionsFragment collectionsFragment = this.f23197a;
                collectionsFragment.m9800p0().m9837p2(new AbstractC3571c.b(c6332a, libraryItemCounter, new LessonPath.SearchShelf(str), collectionsFragment.m9800p0().m9835n2(c6332a, libraryItemCounter)));
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: n */
            public final void mo9814n(boolean z10) {
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: o */
            public final void mo9815o(C6332a c6332a, LibraryItemCounter libraryItemCounter) {
                C5207g.m11111f(c6332a, "lesson");
                InterfaceC6727j<Object>[] interfaceC6727jArr = CollectionsFragment.f23142F0;
                CollectionsFragment collectionsFragment = this.f23197a;
                collectionsFragment.m9800p0().m9838q2(new AbstractC3569a.a(c6332a, libraryItemCounter, collectionsFragment.m9800p0().m9835n2(c6332a, libraryItemCounter)));
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: p */
            public final void mo9816p() {
                InterfaceC6727j<Object>[] interfaceC6727jArr = CollectionsFragment.f23142F0;
                CollectionsFragment collectionsFragment = this.f23197a;
                String strM16893T = C8656b.m16893T(((C9288c) collectionsFragment.f23146D0.getValue()).f47985a, collectionsFragment.m9800p0().mo498E1(), (LibraryTab) collectionsFragment.m9800p0().f23231N.getValue());
                C1681f c1681f = collectionsFragment.f23146D0;
                boolean z10 = C7793a.m15497a(C8656b.m16880G(((C9288c) c1681f.getValue()).f47985a, ((C9288c) c1681f.getValue()).f47987c)) == null;
                C5207g.m11111f(strM16893T, "collectionType");
                NavController navControllerM16725g0 = C8573r0.m16725g0(collectionsFragment);
                NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                if (navDestinationM3986g == null || navDestinationM3986g.m4016i(R.id.actionToCollectionsLevel) == null) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("collectionType", strM16893T);
                bundle2.putBoolean("canShowAccent", z10);
                navControllerM16725g0.m3992m(R.id.actionToCollectionsLevel, bundle2, null);
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: q */
            public final void mo9817q(String str) {
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: r */
            public final void mo9818r(C6332a c6332a, LibraryItemCounter libraryItemCounter) {
                C5207g.m11111f(c6332a, "lesson");
                boolean zM12964a = c6332a.m12964a();
                final int i10 = c6332a.f36595a;
                final CollectionsFragment collectionsFragment = this.f23197a;
                if (zM12964a) {
                    if ((libraryItemCounter == null || libraryItemCounter.f22005b) ? false : true) {
                        ViewsUtilsKt.m10421g(collectionsFragment, new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.home.collections.CollectionsFragment$onViewCreated$contentAdapter$1$onLikeLessonClicked$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final C9072e mo807E() {
                                InterfaceC6727j<Object>[] interfaceC6727jArr = CollectionsFragment.f23142F0;
                                collectionsFragment.m9800p0().m9840r2(i10);
                                return C9072e.f47360a;
                            }
                        });
                        return;
                    }
                }
                InterfaceC6727j<Object>[] interfaceC6727jArr = CollectionsFragment.f23142F0;
                collectionsFragment.m9800p0().m9840r2(i10);
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: s */
            public final void mo9819s(String str) {
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: t */
            public final void mo9820t(C6332a c6332a) {
                C5207g.m11111f(c6332a, "course");
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: u */
            public final void mo9821u() {
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: v */
            public final void mo9822v(boolean z10) {
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: w */
            public final void mo9823w(Sort sort) {
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: x */
            public final void mo9824x(View view2, C6332a c6332a, LibraryItemCounter libraryItemCounter, String str) {
                C5207g.m11111f(view2, "view");
                C5207g.m11111f(c6332a, "course");
                C5207g.m11111f(str, "shelfId");
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: y */
            public final void mo9825y(View view2, final C6332a c6332a, final LibraryItemCounter libraryItemCounter, final String str) {
                C5207g.m11111f(view2, "view");
                C5207g.m11111f(c6332a, "lesson");
                C5207g.m11111f(str, "shelf");
                boolean z10 = false;
                boolean z11 = c6332a.f36612r != null && C5207g.m11106a(c6332a.f36601g, "external");
                boolean z12 = libraryItemCounter != null ? libraryItemCounter.f22005b : false;
                if (libraryItemCounter != null) {
                    z10 = libraryItemCounter.f22009f;
                }
                final CollectionsFragment collectionsFragment = this.f23197a;
                new C10372b0(view2, z12, z11, false, z10, new InterfaceC2052l<LessonMenuItem, C9072e>() { // from class: com.lingq.ui.home.collections.CollectionsFragment$onViewCreated$contentAdapter$1$onLessonMenuClicked$1

                    /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsFragment$onViewCreated$contentAdapter$1$onLessonMenuClicked$1$a */
                    public /* synthetic */ class a {

                        /* JADX INFO: renamed from: a */
                        public static final /* synthetic */ int[] f23210a;

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
                            f23210a = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Code duplicated, block: B:26:0x008d  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(LessonMenuItem lessonMenuItem) {
                        LessonMenuItem lessonMenuItem2 = lessonMenuItem;
                        C5207g.m11111f(lessonMenuItem2, "item");
                        int i10 = a.f23210a[lessonMenuItem2.ordinal()];
                        String str2 = str;
                        int i11 = 0;
                        LibraryItemCounter libraryItemCounter2 = libraryItemCounter;
                        final C6332a c6332a2 = c6332a;
                        final CollectionsFragment collectionsFragment2 = collectionsFragment;
                        switch (i10) {
                            case 1:
                                InterfaceC6727j<Object>[] interfaceC6727jArr = CollectionsFragment.f23142F0;
                                collectionsFragment2.m9800p0().m9837p2(new AbstractC3571c.b(c6332a2, libraryItemCounter2, new LessonPath.SearchShelf(str2), collectionsFragment2.m9800p0().m9835n2(c6332a2, libraryItemCounter2)));
                                break;
                            case 2:
                                int i12 = c6332a2.f36595a;
                                String str3 = c6332a2.f36599e;
                                String str4 = str3 == null ? "" : str3;
                                String str5 = c6332a2.f36602h;
                                String str6 = str5 == null ? "" : str5;
                                String str7 = c6332a2.f36581H;
                                String str8 = str7 == null ? "" : str7;
                                String str9 = c6332a2.f36600f;
                                String str10 = str9 == null ? "" : str9;
                                LessonInfoParent lessonInfoParent = LessonInfoParent.Overview;
                                C5207g.m11111f(lessonInfoParent, "from");
                                C4924a.m10447Z(C8573r0.m16725g0(collectionsFragment2), new C6682i(i12, str4, str6, str8, str10, lessonInfoParent));
                                break;
                            case 3:
                                Integer num = c6332a2.f36607m;
                                C4924a.m10447Z(C8573r0.m16725g0(collectionsFragment2), new C6678e(num != null ? num.intValue() : 0, new LessonPath.SearchShelf(str2)));
                                break;
                            case 4:
                                if (!c6332a2.m12964a()) {
                                    InterfaceC6727j<Object>[] interfaceC6727jArr2 = CollectionsFragment.f23142F0;
                                    collectionsFragment2.m9800p0().m9840r2(c6332a2.f36595a);
                                } else if (!((libraryItemCounter2 == null || libraryItemCounter2.f22005b) ? false : true)) {
                                    InterfaceC6727j<Object>[] interfaceC6727jArr3 = CollectionsFragment.f23142F0;
                                    collectionsFragment2.m9800p0().m9840r2(c6332a2.f36595a);
                                } else {
                                    ViewsUtilsKt.m10421g(collectionsFragment2, new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.home.collections.CollectionsFragment$onViewCreated$contentAdapter$1$onLessonMenuClicked$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // cm.InterfaceC2041a
                                        /* JADX INFO: renamed from: E */
                                        public final C9072e mo807E() {
                                            InterfaceC6727j<Object>[] interfaceC6727jArr4 = CollectionsFragment.f23142F0;
                                            collectionsFragment2.m9800p0().m9840r2(c6332a2.f36595a);
                                            return C9072e.f47360a;
                                        }
                                    });
                                }
                                break;
                            case 5:
                                InterfaceC6727j<Object>[] interfaceC6727jArr4 = CollectionsFragment.f23142F0;
                                collectionsFragment2.m9800p0().m9837p2(new AbstractC3571c.a(c6332a2, collectionsFragment2.m9800p0().m9835n2(c6332a2, libraryItemCounter2)));
                                break;
                            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                Context contextM3578a0 = collectionsFragment2.m3578a0();
                                String str11 = c6332a2.f36599e;
                                new C10507q(contextM3578a0, str11 != null ? str11 : "", new InterfaceC2056p<String, String, C9072e>() { // from class: com.lingq.ui.home.collections.CollectionsFragment$onViewCreated$contentAdapter$1$onLessonMenuClicked$1$reportMenu$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // cm.InterfaceC2056p
                                    /* JADX INFO: renamed from: m0 */
                                    public final C9072e mo1337m0(String str12, String str13) {
                                        String str14 = str12;
                                        C5207g.m11111f(str14, "scope");
                                        InterfaceC6727j<Object>[] interfaceC6727jArr5 = CollectionsFragment.f23142F0;
                                        CollectionsFragment collectionsFragment3 = collectionsFragment2;
                                        collectionsFragment3.m9800p0().mo9831a0(collectionsFragment3.m9800p0().mo498E1(), c6332a2.f36595a, str14, str13);
                                        return C9072e.f47360a;
                                    }
                                }).m19482a();
                                break;
                            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                InterfaceC6727j<Object>[] interfaceC6727jArr5 = CollectionsFragment.f23142F0;
                                CollectionsViewModel collectionsViewModelM9800p0 = collectionsFragment2.m9800p0();
                                if (libraryItemCounter2 != null && libraryItemCounter2.f22009f) {
                                    i11 = 1;
                                }
                                collectionsViewModelM9800p0.m9838q2(new AbstractC3569a.b(c6332a2, 1 ^ i11, collectionsFragment2.m9800p0().m9835n2(c6332a2, libraryItemCounter2)));
                                break;
                        }
                        return C9072e.f47360a;
                    }
                }, 8);
            }
        });
        C8364u c8364uM9799o0 = m9799o0();
        c8364uM9799o0.f45303d.setTitle(((C9288c) this.f23146D0.getValue()).f47986b);
        Context contextM3578a0 = m3578a0();
        Object obj = C7472a.f41322a;
        Drawable drawableM14849b = C7472a.c.m14849b(contextM3578a0, R.drawable.ic_arrow_back);
        MaterialToolbar materialToolbar = c8364uM9799o0.f45303d;
        materialToolbar.setNavigationIcon(drawableM14849b);
        List<Integer> list = C6716m.f37937a;
        materialToolbar.setNavigationIconTint(C6716m.m13333r(R.attr.primaryTextColor, m3578a0()));
        materialToolbar.setNavigationOnClickListener(new ViewOnClickListenerC7718c(10, this));
        int[] iArr = {R.color.indigo_lightest, R.color.yellow_dark, R.color.green};
        SwipeRefreshLayout swipeRefreshLayout = c8364uM9799o0.f45302c;
        swipeRefreshLayout.setColorSchemeResources(iArr);
        swipeRefreshLayout.setOnRefreshListener(new C7946b(this, 11, c8364uM9799o0));
        m9799o0().f45300a.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        RecyclerView recyclerView = c8364uM9799o0.f45301b;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.m4199g(new C8049h((int) C6716m.m13316a(16)));
        recyclerView.setAdapter(collectionsAdapter);
        recyclerView.m4203i(new C3536a());
        Lifecycle.State state = Lifecycle.State.STARTED;
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C3537x4cf61ae8(this, state, null, this), 3);
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C3538x4cf61ae9(this, state, null, this, collectionsAdapter), 3);
    }

    /* JADX INFO: renamed from: o0 */
    public final C8364u m9799o0() {
        return (C8364u) this.f23143A0.m10489a(this, f23142F0[0]);
    }

    /* JADX INFO: renamed from: p0 */
    public final CollectionsViewModel m9800p0() {
        return (CollectionsViewModel) this.f23144B0.getValue();
    }
}
