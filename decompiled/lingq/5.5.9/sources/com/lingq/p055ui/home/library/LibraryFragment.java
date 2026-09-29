package com.lingq.p055ui.home.library;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.constraintlayout.widget.C0762b;
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
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2239y;
import com.google.android.material.appbar.AppBarLayout;
import com.lingq.p055ui.home.HomeViewModel;
import com.lingq.p055ui.home.library.LibraryFragment;
import com.lingq.p055ui.info.LessonInfoParent;
import com.lingq.p055ui.tooltips.TooltipStep;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.shared.uimodel.library.LibraryShelf;
import com.lingq.shared.uimodel.library.LibraryShelfType;
import com.lingq.shared.uimodel.library.Sort;
import com.lingq.shared.util.LessonPath;
import com.lingq.util.C4924a;
import com.lingq.util.ViewsUtilsKt;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kh.C6678e;
import kh.C6682i;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import ni.C7797e;
import no.C7828f;
import no.InterfaceC7882z;
import p003a2.C0009a;
import p067d8.ViewOnClickListenerC5062d0;
import p181ii.C6332a;
import p181ii.C6336e;
import p225kk.C6716m;
import p260m8.C7499b;
import p290o6.C7946b;
import p322pd.C8228i;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import p512yi.AbstractC10385m;
import p512yi.C10372b0;
import p512yi.C10389q;
import p512yi.InterfaceC10396x;
import p537zi.C10507q;
import ph.C8369v;
import sl.C9072e;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/library/LibraryFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LibraryFragment extends AbstractC10385m {

    /* JADX INFO: renamed from: G0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f24638G0 = {C0204c.m857q(LibraryFragment.class, "getBinding()Lcom/lingq/databinding/FragmentHomeLibraryBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f24639A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f24640B0;

    /* JADX INFO: renamed from: C0 */
    public final C1038i0 f24641C0;

    /* JADX INFO: renamed from: D0 */
    public LibraryAdapter f24642D0;

    /* JADX INFO: renamed from: E0 */
    public boolean f24643E0;

    /* JADX INFO: renamed from: F0 */
    public C7797e f24644F0;

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryFragment$a */
    public static final class C3759a extends RecyclerView.AbstractC1125r {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LinearLayoutManager f24645a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LibraryFragment f24646b;

        public C3759a(LinearLayoutManager linearLayoutManager, LibraryFragment libraryFragment) {
            this.f24645a = linearLayoutManager;
            this.f24646b = libraryFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1125r
        /* JADX INFO: renamed from: b */
        public final void mo4340b(RecyclerView recyclerView, int i10, int i11) {
            C5207g.m11111f(recyclerView, "recyclerView");
            int iM4122S0 = this.f24645a.m4122S0();
            InterfaceC6727j<Object>[] interfaceC6727jArr = LibraryFragment.f24638G0;
            LibraryViewModel libraryViewModelM9938s0 = this.f24646b.m9938s0();
            LibraryAdapter.AbstractC3755a abstractC3755a = (LibraryAdapter.AbstractC3755a) C6752c.m13426T(iM4122S0, (List) libraryViewModelM9938s0.f24755T.getValue());
            if (abstractC3755a == null || !(abstractC3755a instanceof LibraryAdapter.AbstractC3755a.e)) {
                return;
            }
            LinkedHashMap linkedHashMap = libraryViewModelM9938s0.f24752Q;
            LibraryShelf libraryShelf = ((LibraryAdapter.AbstractC3755a.e) abstractC3755a).f24613a;
            if (linkedHashMap.get(libraryShelf) == null || (linkedHashMap.get(libraryShelf) instanceof LibraryAdapter.AbstractC3755a.e)) {
                libraryViewModelM9938s0.m9944p2(libraryShelf);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.home.library.LibraryFragment$special$$inlined$viewModels$default$1] */
    public LibraryFragment() {
        super(R.layout.fragment_home_library);
        this.f24639A0 = C4924a.m10477o0(this, LibraryFragment$binding$2.f24647j);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.home.library.LibraryFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.library.LibraryFragment$special$$inlined$viewModels$default$2
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
        this.f24640B0 = C8573r0.m16711Z(this, C5209i.m11118a(LibraryViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.library.LibraryFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.library.LibraryFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.library.LibraryFragment$special$$inlined$viewModels$default$5
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
        this.f24641C0 = C8573r0.m16711Z(this, C5209i.m11118a(HomeViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.library.LibraryFragment$special$$inlined$activityViewModels$default$1
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
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.library.LibraryFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                return this.m3576Y().mo792j();
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.library.LibraryFragment$special$$inlined$activityViewModels$default$3
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
    }

    /* JADX INFO: renamed from: n0 */
    public static void m9933n0(LibraryFragment libraryFragment, C8369v c8369v) {
        C5207g.m11111f(libraryFragment, "this$0");
        C5207g.m11111f(c8369v, "$this_with");
        LibraryViewModel libraryViewModelM9938s0 = libraryFragment.m9938s0();
        C7828f.m15570d(C8573r0.m16767w0(libraryViewModelM9938s0), null, null, new LibraryViewModel$updateUserData$1(libraryViewModelM9938s0, null), 3);
        C7828f.m15570d(C8573r0.m16767w0(libraryViewModelM9938s0), null, null, new LibraryViewModel$updateUserData$2(libraryViewModelM9938s0, null), 3);
        libraryViewModelM9938s0.m9950v2();
        libraryFragment.m9938s0().m9946r2();
        C7828f.m15570d(C7499b.m14906H(libraryFragment), null, null, new LibraryFragment$onViewCreated$2$1$1(c8369v, null), 3);
    }

    /* JADX INFO: renamed from: o0 */
    public static final boolean m9934o0(LibraryFragment libraryFragment, C6332a c6332a, LibraryItemCounter libraryItemCounter) {
        libraryFragment.getClass();
        return (libraryItemCounter != null && !libraryItemCounter.f22009f) && c6332a.f36594U > 0;
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m9935p0(final LibraryFragment libraryFragment, TooltipStep tooltipStep, int i10) {
        int i11;
        LibraryAdapter.AbstractC3756b.d dVar;
        LibraryAdapter libraryAdapter = libraryFragment.f24642D0;
        Object obj = null;
        if (libraryAdapter == null) {
            C5207g.m11117l("contentAdapter");
            throw null;
        }
        List<T> list = libraryAdapter.f7471d.f7233f;
        C5207g.m11110e(list, "contentAdapter.currentList");
        Iterator it = list.iterator();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i11 = -1;
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (((LibraryAdapter.AbstractC3755a) it.next()) instanceof LibraryAdapter.AbstractC3755a.d) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 == -1 || i13 != i10 || (dVar = (LibraryAdapter.AbstractC3756b.d) libraryFragment.m9936q0().f45342g.m4175H(i13)) == null) {
            return;
        }
        CollectionsAdapter collectionsAdapter = dVar.f24628v;
        List<T> list2 = collectionsAdapter.f7471d.f7233f;
        C5207g.m11110e(list2, "view.adapter.currentList");
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (((CollectionsAdapter.AbstractC3739a) it2.next()) instanceof CollectionsAdapter.AbstractC3739a.j) {
                i11 = i12;
                break;
            }
            i12++;
        }
        Collection collection = collectionsAdapter.f7471d.f7233f;
        C5207g.m11110e(collection, "view.adapter.currentList");
        for (Object obj2 : collection) {
            if (((CollectionsAdapter.AbstractC3739a) obj2) instanceof CollectionsAdapter.AbstractC3739a.j) {
                obj = obj2;
                break;
            }
        }
        final CollectionsAdapter.AbstractC3739a.j jVar = (CollectionsAdapter.AbstractC3739a.j) obj;
        CollectionsAdapter.AbstractC3740b.l lVar = (CollectionsAdapter.AbstractC3740b.l) ((RecyclerView) dVar.f24627u.f45480b).m4175H(i11);
        if (lVar != null) {
            Rect rect = new Rect();
            lVar.f7054a.getGlobalVisibleRect(rect);
            int i14 = rect.top;
            List<Integer> list3 = C6716m.f37937a;
            rect.top = i14 - ((int) C6716m.m13316a(5));
            rect.bottom += (int) C6716m.m13316a(5);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            libraryFragment.m3576Y().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i15 = displayMetrics.heightPixels;
            Rect rect2 = new Rect();
            int i16 = rect.bottom;
            if (i16 > ((double) i15) / 1.5d) {
                rect2.bottom = rect.top - ((int) C6716m.m13316a(20));
            } else {
                rect2.top = i16 + ((int) C6716m.m13316a(5));
                int i17 = rect.left;
                rect2.left = (((rect.right - i17) / 2) + i17) - ((int) C6716m.m13316a(10));
            }
            libraryFragment.m9938s0().mo9734g2(tooltipStep, rect, (16 & 4) != 0 ? new Rect() : rect2, (16 & 8) != 0 ? false : true, (16 & 16) != 0 ? false : false, (16 & 32) != 0 ? false : true, (16 & 64) != 0 ? new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.tooltips.TooltipsController$show$1
                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final /* bridge */ /* synthetic */ C9072e mo807E() {
                    return C9072e.f47360a;
                }
            } : new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.home.library.LibraryFragment$showStartingTooltip$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C9072e mo807E() {
                    CollectionsAdapter.AbstractC3739a.j jVar2 = jVar;
                    if (jVar2 != null) {
                        InterfaceC6727j<Object>[] interfaceC6727jArr = LibraryFragment.f24638G0;
                        LibraryFragment libraryFragment2 = libraryFragment;
                        LibraryViewModel libraryViewModelM9938s0 = libraryFragment2.m9938s0();
                        LessonPath.Feed feed = new LessonPath.Feed(jVar2.f24501f);
                        C6332a c6332a = jVar2.f24496a;
                        LibraryItemCounter libraryItemCounter = jVar2.f24497b;
                        libraryViewModelM9938s0.m9945q2(new AbstractC3813g.c(c6332a, libraryItemCounter, feed, LibraryFragment.m9934o0(libraryFragment2, c6332a, libraryItemCounter)));
                    }
                    return C9072e.f47360a;
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: Q */
    public final void mo3568Q() {
        this.f6090a0 = true;
        if (this.f24643E0) {
            this.f24643E0 = false;
            LibraryViewModel libraryViewModelM9938s0 = m9938s0();
            C7828f.m15570d(C8573r0.m16767w0(libraryViewModelM9938s0), null, null, new LibraryViewModel$updateUser$1(libraryViewModelM9938s0, null), 3);
        }
        m3587g0(null);
        m3589h0(null);
        m9938s0().m9950v2();
        LibraryViewModel libraryViewModelM9938s1 = m9938s0();
        C7828f.m15570d(C8573r0.m16767w0(libraryViewModelM9938s1), libraryViewModelM9938s1.f24745J, null, new LibraryViewModel$updateNotifications$1(libraryViewModelM9938s1, null), 2);
        LibraryViewModel libraryViewModelM9938s2 = m9938s0();
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(libraryViewModelM9938s2);
        LibraryViewModel$getNotices$1 libraryViewModel$getNotices$1 = new LibraryViewModel$getNotices$1(libraryViewModelM9938s2, null);
        C7499b.m14933c0(interfaceC7882zM16767w0, libraryViewModelM9938s2.f24746K, libraryViewModelM9938s2.f24745J, "notices", libraryViewModel$getNotices$1);
        m9938s0().m9946r2();
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [com.lingq.ui.home.library.LibraryFragment$onViewCreated$1] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        LibraryAdapter libraryAdapter = new LibraryAdapter(new InterfaceC10396x() { // from class: com.lingq.ui.home.library.LibraryFragment$onViewCreated$1
            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: a */
            public final void mo9801a(String str) {
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: b */
            public final void mo9802b() {
                InterfaceC6727j<Object>[] interfaceC6727jArr = LibraryFragment.f24638G0;
                this.f24654a.m9937r0().f22743S.mo16479j(HomeViewModel.AbstractC3479a.a.f22770a);
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: c */
            public final void mo9803c(View view2, final C6332a c6332a, final LibraryItemCounter libraryItemCounter, final String str) {
                C5207g.m11111f(view2, "view");
                C5207g.m11111f(c6332a, "lesson");
                C5207g.m11111f(str, "shelf");
                boolean z10 = false;
                boolean z11 = c6332a.f36612r != null && C5207g.m11106a(c6332a.f36601g, "external");
                boolean z12 = libraryItemCounter != null ? libraryItemCounter.f22005b : false;
                if (libraryItemCounter != null) {
                    z10 = libraryItemCounter.f22009f;
                }
                final LibraryFragment libraryFragment = this.f24654a;
                new C10372b0(view2, z12, z11, false, z10, new InterfaceC2052l<LessonMenuItem, C9072e>() { // from class: com.lingq.ui.home.library.LibraryFragment$onViewCreated$1$onLessonLongClicked$1

                    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryFragment$onViewCreated$1$onLessonLongClicked$1$a */
                    public /* synthetic */ class C3764a {

                        /* JADX INFO: renamed from: a */
                        public static final /* synthetic */ int[] f24667a;

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
                            f24667a = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Code duplicated, block: B:26:0x0085  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(LessonMenuItem lessonMenuItem) {
                        LessonMenuItem lessonMenuItem2 = lessonMenuItem;
                        C5207g.m11111f(lessonMenuItem2, "item");
                        int i10 = C3764a.f24667a[lessonMenuItem2.ordinal()];
                        String str2 = str;
                        LibraryItemCounter libraryItemCounter2 = libraryItemCounter;
                        int i11 = 0;
                        final C6332a c6332a2 = c6332a;
                        final LibraryFragment libraryFragment2 = libraryFragment;
                        switch (i10) {
                            case 1:
                                InterfaceC6727j<Object>[] interfaceC6727jArr = LibraryFragment.f24638G0;
                                libraryFragment2.m9938s0().m9945q2(new AbstractC3813g.c(c6332a2, libraryItemCounter2, new LessonPath.Feed(str2), LibraryFragment.m9934o0(libraryFragment2, c6332a2, libraryItemCounter2)));
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
                                C4924a.m10447Z(C8573r0.m16725g0(libraryFragment2), new C6682i(i12, str4, str6, str8, str10, lessonInfoParent));
                                break;
                            case 3:
                                InterfaceC6727j<Object>[] interfaceC6727jArr2 = LibraryFragment.f24638G0;
                                libraryFragment2.m9939t0();
                                Integer num = c6332a2.f36607m;
                                C4924a.m10447Z(C8573r0.m16725g0(libraryFragment2), new C6678e(num != null ? num.intValue() : 0, new LessonPath.Feed(str2)));
                                break;
                            case 4:
                                if (!c6332a2.m12964a()) {
                                    InterfaceC6727j<Object>[] interfaceC6727jArr3 = LibraryFragment.f24638G0;
                                    LibraryViewModel libraryViewModelM9938s0 = libraryFragment2.m9938s0();
                                    C7499b.m14933c0(C8573r0.m16767w0(libraryViewModelM9938s0), libraryViewModelM9938s0.f24746K, libraryViewModelM9938s0.f24745J, "likeLesson", new LibraryViewModel$likeLesson$1(libraryViewModelM9938s0, c6332a2.f36595a, null));
                                } else if (!((libraryItemCounter2 == null || libraryItemCounter2.f22005b) ? false : true)) {
                                    InterfaceC6727j<Object>[] interfaceC6727jArr4 = LibraryFragment.f24638G0;
                                    LibraryViewModel libraryViewModelM9938s1 = libraryFragment2.m9938s0();
                                    C7499b.m14933c0(C8573r0.m16767w0(libraryViewModelM9938s1), libraryViewModelM9938s1.f24746K, libraryViewModelM9938s1.f24745J, "likeLesson", new LibraryViewModel$likeLesson$1(libraryViewModelM9938s1, c6332a2.f36595a, null));
                                } else {
                                    ViewsUtilsKt.m10421g(libraryFragment2, new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.home.library.LibraryFragment$onViewCreated$1$onLessonLongClicked$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // cm.InterfaceC2041a
                                        /* JADX INFO: renamed from: E */
                                        public final C9072e mo807E() {
                                            InterfaceC6727j<Object>[] interfaceC6727jArr5 = LibraryFragment.f24638G0;
                                            LibraryViewModel libraryViewModelM9938s2 = libraryFragment2.m9938s0();
                                            int i13 = c6332a2.f36595a;
                                            InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(libraryViewModelM9938s2);
                                            LibraryViewModel$likeLesson$1 libraryViewModel$likeLesson$1 = new LibraryViewModel$likeLesson$1(libraryViewModelM9938s2, i13, null);
                                            C7499b.m14933c0(interfaceC7882zM16767w0, libraryViewModelM9938s2.f24746K, libraryViewModelM9938s2.f24745J, "likeLesson", libraryViewModel$likeLesson$1);
                                            return C9072e.f47360a;
                                        }
                                    });
                                }
                                break;
                            case 5:
                                InterfaceC6727j<Object>[] interfaceC6727jArr5 = LibraryFragment.f24638G0;
                                libraryFragment2.m9938s0().m9945q2(new AbstractC3813g.a(c6332a2, LibraryFragment.m9934o0(libraryFragment2, c6332a2, libraryItemCounter2)));
                                break;
                            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                Context contextM3578a0 = libraryFragment2.m3578a0();
                                String str11 = c6332a2.f36599e;
                                new C10507q(contextM3578a0, str11 != null ? str11 : "", new InterfaceC2056p<String, String, C9072e>() { // from class: com.lingq.ui.home.library.LibraryFragment$onViewCreated$1$onLessonLongClicked$1$reportMenu$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // cm.InterfaceC2056p
                                    /* JADX INFO: renamed from: m0 */
                                    public final C9072e mo1337m0(String str12, String str13) {
                                        String str14 = str12;
                                        C5207g.m11111f(str14, "scope");
                                        InterfaceC6727j<Object>[] interfaceC6727jArr6 = LibraryFragment.f24638G0;
                                        LibraryFragment libraryFragment3 = libraryFragment2;
                                        libraryFragment3.m9938s0().mo9831a0(libraryFragment3.m9938s0().mo498E1(), c6332a2.f36595a, str14, str13);
                                        return C9072e.f47360a;
                                    }
                                }).m19482a();
                                break;
                            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                InterfaceC6727j<Object>[] interfaceC6727jArr6 = LibraryFragment.f24638G0;
                                LibraryViewModel libraryViewModelM9938s2 = libraryFragment2.m9938s0();
                                if (libraryItemCounter2 != null && libraryItemCounter2.f22009f) {
                                    i11 = 1;
                                }
                                libraryViewModelM9938s2.m9945q2(new AbstractC3813g.d(c6332a2, 1 ^ i11, LibraryFragment.m9934o0(libraryFragment2, c6332a2, libraryItemCounter2)));
                                break;
                        }
                        return C9072e.f47360a;
                    }
                }, 8);
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: d */
            public final void mo9804d(C6336e c6336e) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = LibraryFragment.f24638G0;
                LibraryViewModel libraryViewModelM9938s0 = this.f24654a.m9938s0();
                LinkedHashMap linkedHashMap = libraryViewModelM9938s0.f24753R;
                LibraryShelf libraryShelf = c6336e.f36629b;
                linkedHashMap.put(libraryShelf.f22050c, libraryShelf.f22049b.get(c6336e.f36633f));
                libraryViewModelM9938s0.m9949u2();
                libraryViewModelM9938s0.m9944p2(libraryShelf);
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: e */
            public final void mo9805e(C6332a c6332a) {
                C5207g.m11111f(c6332a, "course");
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: f */
            public final void mo9806f(Sort sort) {
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
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: i */
            public final void mo9809i(C6332a c6332a, String str) {
                C5207g.m11111f(c6332a, "course");
                C5207g.m11111f(str, "shelf");
                C4924a.m10447Z(C8573r0.m16725g0(this.f24654a), new C6678e(c6332a.f36595a, new LessonPath.Feed(str)));
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: j */
            public final void mo9810j(C6332a c6332a) {
                C5207g.m11111f(c6332a, "course");
            }

            /* JADX WARN: Code duplicated, block: B:13:0x0059  */
            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: k */
            public final void mo9811k(LibraryShelf libraryShelf) {
                int iIntValue;
                Integer num;
                C5207g.m11111f(libraryShelf, "shelf");
                InterfaceC6727j<Object>[] interfaceC6727jArr = LibraryFragment.f24638G0;
                LibraryViewModel libraryViewModelM9938s0 = this.f24654a.m9938s0();
                LibraryAdapter.AbstractC3755a abstractC3755a = (LibraryAdapter.AbstractC3755a) libraryViewModelM9938s0.f24752Q.get(libraryShelf);
                if (C5207g.m11106a(libraryShelf.f22050c, LibraryShelfType.MiniStories.getValue()) && abstractC3755a != null && (abstractC3755a instanceof LibraryAdapter.AbstractC3755a.d)) {
                    LibraryAdapter.AbstractC3757c.a aVar = ((LibraryAdapter.AbstractC3755a.d) abstractC3755a).f24612b;
                    if (!(!aVar.f24635a.isEmpty()) || (num = ((C6332a) C6752c.m13423Q(aVar.f24635a)).f36607m) == null) {
                        iIntValue = -1;
                    } else {
                        iIntValue = num.intValue();
                    }
                } else {
                    iIntValue = -1;
                }
                libraryViewModelM9938s0.m9945q2(new AbstractC3813g.b(libraryShelf, iIntValue));
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: l */
            public final void mo9812l(View view2, C6332a c6332a, LibraryItemCounter libraryItemCounter, String str) {
                C5207g.m11111f(view2, "view");
                C5207g.m11111f(c6332a, "course");
                C5207g.m11111f(str, "shelfId");
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: m */
            public final void mo9813m(C6332a c6332a, LibraryItemCounter libraryItemCounter, String str) {
                C5207g.m11111f(c6332a, "lesson");
                C5207g.m11111f(str, "shelf");
                InterfaceC6727j<Object>[] interfaceC6727jArr = LibraryFragment.f24638G0;
                LibraryFragment libraryFragment = this.f24654a;
                libraryFragment.m9938s0().m9945q2(new AbstractC3813g.c(c6332a, libraryItemCounter, new LessonPath.Feed(str), LibraryFragment.m9934o0(libraryFragment, c6332a, libraryItemCounter)));
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: n */
            public final void mo9814n(boolean z10) {
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: o */
            public final void mo9815o(C6332a c6332a, LibraryItemCounter libraryItemCounter) {
                C5207g.m11111f(c6332a, "lesson");
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: p */
            public final void mo9816p() {
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: q */
            public final void mo9817q(String str) {
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: r */
            public final void mo9818r(C6332a c6332a, LibraryItemCounter libraryItemCounter) {
                C5207g.m11111f(c6332a, "lesson");
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
                InterfaceC6727j<Object>[] interfaceC6727jArr = LibraryFragment.f24638G0;
                this.f24654a.m9938s0().m9945q2(AbstractC3813g.f.f25032c);
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: v */
            public final void mo9822v(boolean z10) {
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: w */
            public final void mo9823w(Sort sort) {
            }

            /* JADX WARN: Code duplicated, block: B:11:0x002a  */
            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: x */
            public final void mo9824x(View view2, final C6332a c6332a, LibraryItemCounter libraryItemCounter, final String str) {
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
                final LibraryFragment libraryFragment = this.f24654a;
                new C10389q(view2, new InterfaceC2052l<CourseMenuItem, C9072e>() { // from class: com.lingq.ui.home.library.LibraryFragment$onViewCreated$1$onCourseLongClicked$1

                    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryFragment$onViewCreated$1$onCourseLongClicked$1$a */
                    public /* synthetic */ class C3761a {

                        /* JADX INFO: renamed from: a */
                        public static final /* synthetic */ int[] f24658a;

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
                            f24658a = iArr;
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
                        int i10 = C3761a.f24658a[courseMenuItem2.ordinal()];
                        final C6332a c6332a2 = c6332a;
                        final LibraryFragment libraryFragment2 = libraryFragment;
                        if (i10 != 1) {
                            String str2 = "";
                            if (i10 == 2) {
                                int i11 = c6332a2.f36595a;
                                String str3 = c6332a2.f36597c;
                                if (str3 != null) {
                                    str2 = str3;
                                }
                                C4924a.m10447Z(C8573r0.m16725g0(libraryFragment2), C8573r0.m16663B(i11, str2, true, false, 8));
                            } else if (i10 == 3) {
                                InterfaceC6727j<Object>[] interfaceC6727jArr = LibraryFragment.f24638G0;
                                LibraryViewModel libraryViewModelM9938s0 = libraryFragment2.m9938s0();
                                int i12 = c6332a2.f36595a;
                                C7499b.m14933c0(C8573r0.m16767w0(libraryViewModelM9938s0), libraryViewModelM9938s0.f24746K, libraryViewModelM9938s0.f24745J, C0166e.m761g("updateCourseLike ", i12), new LibraryViewModel$updateCourseLike$1(libraryViewModelM9938s0, i12, null));
                            } else if (i10 == 4) {
                                Context contextM3578a0 = libraryFragment2.m3578a0();
                                String str4 = c6332a2.f36599e;
                                if (str4 != null) {
                                    str2 = str4;
                                }
                                new C10507q(contextM3578a0, str2, new InterfaceC2056p<String, String, C9072e>() { // from class: com.lingq.ui.home.library.LibraryFragment$onViewCreated$1$onCourseLongClicked$1$reportMenu$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // cm.InterfaceC2056p
                                    /* JADX INFO: renamed from: m0 */
                                    public final C9072e mo1337m0(String str5, String str6) {
                                        String str7 = str5;
                                        C5207g.m11111f(str7, "scope");
                                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = LibraryFragment.f24638G0;
                                        LibraryFragment libraryFragment3 = libraryFragment2;
                                        libraryFragment3.m9938s0().mo9834n(libraryFragment3.m9938s0().mo498E1(), c6332a2.f36595a, str7, str6);
                                        return C9072e.f47360a;
                                    }
                                }).m19482a();
                            }
                        } else {
                            InterfaceC6727j<Object>[] interfaceC6727jArr2 = LibraryFragment.f24638G0;
                            libraryFragment2.m9939t0();
                            C4924a.m10447Z(C8573r0.m16725g0(libraryFragment2), new C6678e(c6332a2.f36595a, new LessonPath.Feed(str)));
                        }
                        return C9072e.f47360a;
                    }
                }, z11, z12);
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: y */
            public final void mo9825y(View view2, C6332a c6332a, LibraryItemCounter libraryItemCounter, String str) {
                C5207g.m11111f(view2, "view");
                C5207g.m11111f(c6332a, "lesson");
                C5207g.m11111f(str, "shelf");
            }
        });
        this.f24642D0 = libraryAdapter;
        libraryAdapter.f7042c = RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY;
        libraryAdapter.f7040a.m4264g();
        C8369v c8369vM9936q0 = m9936q0();
        AppBarLayout appBarLayout = c8369vM9936q0.f45337b;
        C5207g.m11110e(appBarLayout, "appbar");
        C4924a.m10464i(appBarLayout);
        int[] iArr = {R.color.indigo_lightest, R.color.yellow_dark, R.color.green};
        SwipeRefreshLayout swipeRefreshLayout = c8369vM9936q0.f45343h;
        swipeRefreshLayout.setColorSchemeResources(iArr);
        swipeRefreshLayout.setOnRefreshListener(new C7946b(this, 14, c8369vM9936q0));
        ViewOnClickListenerC3807a viewOnClickListenerC3807a = new ViewOnClickListenerC3807a(2, this);
        FrameLayout frameLayout = c8369vM9936q0.f45346k;
        frameLayout.setOnClickListener(viewOnClickListenerC3807a);
        ViewOnClickListenerC2239y viewOnClickListenerC2239y = new ViewOnClickListenerC2239y(15, this);
        TextView textView = c8369vM9936q0.f45344i;
        textView.setOnClickListener(viewOnClickListenerC2239y);
        final int i10 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: yi.r

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LibraryFragment f52181b;

            {
                this.f52181b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                LibraryFragment libraryFragment = this.f52181b;
                switch (i11) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = LibraryFragment.f24638G0;
                        C5207g.m11111f(libraryFragment, "this$0");
                        libraryFragment.m9937r0().f22743S.mo16479j(HomeViewModel.AbstractC3479a.c.f22772a);
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = LibraryFragment.f24638G0;
                        C5207g.m11111f(libraryFragment, "this$0");
                        libraryFragment.m9939t0();
                        NavController navControllerM16725g0 = C8573r0.m16725g0(libraryFragment);
                        Bundle bundle2 = new Bundle();
                        NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                        if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToSettings) != null) {
                            navControllerM16725g0.m3992m(R.id.actionToSettings, bundle2, null);
                        }
                        break;
                }
            }
        };
        TextView textView2 = c8369vM9936q0.f45345j;
        textView2.setOnClickListener(onClickListener);
        C7797e c7797e = this.f24644F0;
        if (c7797e == null) {
            C5207g.m11117l("utils");
            throw null;
        }
        int i11 = 8;
        if (!c7797e.m15514g()) {
            C0762b c0762bM2809z = c8369vM9936q0.f45340e.m2809z(R.id.startTransition);
            c0762bM2809z.m2895i(R.id.tvChangeLanguage).f5385c.f5489d = 0.0f;
            c0762bM2809z.m2895i(R.id.tvChangeLanguage).f5385c.f5487b = 8;
            c0762bM2809z.m2894f(3, 3);
            c0762bM2809z.m2894f(4, 4);
            textView.setOnClickListener(new View.OnClickListener() { // from class: yi.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr = LibraryFragment.f24638G0;
                }
            });
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: yi.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr = LibraryFragment.f24638G0;
                }
            });
            textView2.setOnClickListener(new View.OnClickListener() { // from class: yi.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr = LibraryFragment.f24638G0;
                }
            });
        }
        final int i12 = 1;
        c8369vM9936q0.f45339d.setOnClickListener(new View.OnClickListener(this) { // from class: yi.r

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LibraryFragment f52181b;

            {
                this.f52181b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i13 = i12;
                LibraryFragment libraryFragment = this.f52181b;
                switch (i13) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = LibraryFragment.f24638G0;
                        C5207g.m11111f(libraryFragment, "this$0");
                        libraryFragment.m9937r0().f22743S.mo16479j(HomeViewModel.AbstractC3479a.c.f22772a);
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = LibraryFragment.f24638G0;
                        C5207g.m11111f(libraryFragment, "this$0");
                        libraryFragment.m9939t0();
                        NavController navControllerM16725g0 = C8573r0.m16725g0(libraryFragment);
                        Bundle bundle2 = new Bundle();
                        NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                        if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToSettings) != null) {
                            navControllerM16725g0.m3992m(R.id.actionToSettings, bundle2, null);
                        }
                        break;
                }
            }
        });
        c8369vM9936q0.f45338c.setOnClickListener(new ViewOnClickListenerC5062d0(i11, this));
        m9936q0().f45336a.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        RecyclerView recyclerView = c8369vM9936q0.f45342g;
        recyclerView.setLayoutManager(linearLayoutManager);
        LibraryAdapter libraryAdapter2 = this.f24642D0;
        if (libraryAdapter2 == null) {
            C5207g.m11117l("contentAdapter");
            throw null;
        }
        recyclerView.setAdapter(libraryAdapter2);
        recyclerView.m4203i(new C3759a(linearLayoutManager, this));
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C3760x7270a28e(this, Lifecycle.State.STARTED, null, this), 3);
        C7828f.m15570d(C7499b.m14906H(this), null, null, new LibraryFragment$onViewCreated$4(this, null), 3);
    }

    /* JADX INFO: renamed from: q0 */
    public final C8369v m9936q0() {
        return (C8369v) this.f24639A0.m10489a(this, f24638G0[0]);
    }

    /* JADX INFO: renamed from: r0 */
    public final HomeViewModel m9937r0() {
        return (HomeViewModel) this.f24641C0.getValue();
    }

    /* JADX INFO: renamed from: s0 */
    public final LibraryViewModel m9938s0() {
        return (LibraryViewModel) this.f24640B0.getValue();
    }

    /* JADX INFO: renamed from: t0 */
    public final void m9939t0() {
        C8228i c8228i = new C8228i(0, false);
        c8228i.f48293c = 400L;
        m3589h0(c8228i);
        C8228i c8228i2 = new C8228i(0, true);
        c8228i2.f48293c = 400L;
        m3587g0(c8228i2);
    }
}
