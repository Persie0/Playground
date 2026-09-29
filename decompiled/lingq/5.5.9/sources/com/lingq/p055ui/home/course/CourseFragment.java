package com.lingq.p055ui.home.course;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.activity.result.C0204c;
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
import com.google.android.material.appbar.MaterialToolbar;
import com.lingq.p055ui.home.HomeViewModel;
import com.lingq.p055ui.home.course.CourseFragment;
import com.lingq.p055ui.home.library.CollectionsAdapter;
import com.lingq.p055ui.home.library.LessonMenuItem;
import com.lingq.p055ui.info.LessonInfoParent;
import com.lingq.player.PlayerController;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.shared.uimodel.library.LibraryShelf;
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
import java.util.List;
import java.util.WeakHashMap;
import kh.C6682i;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.C7828f;
import p003a2.C0009a;
import p040c4.C1681f;
import p068d9.C5097k;
import p181ii.C6332a;
import p181ii.C6336e;
import p225kk.C6716m;
import p254m2.C7472a;
import p260m8.C7499b;
import p301oh.C8049h;
import p312p2.C8170b;
import p322pd.C8228i;
import p338qd.C8573r0;
import p402u0.C9371n;
import p427v3.AbstractC9634a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p471x2.C10063s0;
import p471x2.InterfaceC10060r;
import p512yi.C10372b0;
import p512yi.InterfaceC10396x;
import p537zi.C10507q;
import ph.C8364u;
import sl.C9072e;
import sl.InterfaceC9070c;
import tc.C9249b;
import vi.AbstractC9739n;
import vi.C9730e;
import vi.DialogInterfaceOnClickListenerC9729d;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/course/CourseFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class CourseFragment extends AbstractC9739n {

    /* JADX INFO: renamed from: H0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f23670H0 = {C0204c.m857q(CourseFragment.class, "getBinding()Lcom/lingq/databinding/FragmentHomeCollectionsBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f23671A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f23672B0;

    /* JADX INFO: renamed from: C0 */
    public final C1038i0 f23673C0;

    /* JADX INFO: renamed from: D0 */
    public CollectionsAdapter f23674D0;

    /* JADX INFO: renamed from: E0 */
    public final C1681f f23675E0;

    /* JADX INFO: renamed from: F0 */
    public boolean f23676F0;

    /* JADX INFO: renamed from: G0 */
    public PlayerController f23677G0;

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseFragment$a */
    public static final class C3627a extends RecyclerView.AbstractC1125r {
        public C3627a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1125r
        /* JADX INFO: renamed from: a */
        public final void mo4339a(int i10, RecyclerView recyclerView) {
            C5207g.m11111f(recyclerView, "recyclerView");
            if (!recyclerView.canScrollVertically(1)) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = CourseFragment.f23670H0;
                CourseViewModel courseViewModelM9858q0 = CourseFragment.this.m9858q0();
                if (courseViewModelM9858q0.f23946c0.getValue() != Resource.Status.LOADING) {
                    courseViewModelM9858q0.f23933P.mo14371k(C9072e.f47360a);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.home.course.CourseFragment$special$$inlined$viewModels$default$1] */
    public CourseFragment() {
        super(R.layout.fragment_home_collections);
        this.f23671A0 = C4924a.m10477o0(this, CourseFragment$binding$2.f23679j);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.home.course.CourseFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.course.CourseFragment$special$$inlined$viewModels$default$2
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
        this.f23672B0 = C8573r0.m16711Z(this, C5209i.m11118a(CourseViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.course.CourseFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.course.CourseFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.course.CourseFragment$special$$inlined$viewModels$default$5
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
        this.f23673C0 = C8573r0.m16711Z(this, C5209i.m11118a(HomeViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.course.CourseFragment$special$$inlined$activityViewModels$default$1
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
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.course.CourseFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                return this.m3576Y().mo792j();
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.course.CourseFragment$special$$inlined$activityViewModels$default$3
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
        this.f23675E0 = new C1681f(C5209i.m11118a(C9730e.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.home.course.CourseFragment$special$$inlined$navArgs$1
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
    public static void m9855n0(CourseFragment courseFragment, C8364u c8364u) {
        C5207g.m11111f(courseFragment, "this$0");
        C5207g.m11111f(c8364u, "$this_with");
        CourseViewModel courseViewModelM9858q0 = courseFragment.m9858q0();
        courseViewModelM9858q0.m9891m2();
        courseViewModelM9858q0.m9892n2();
        C7828f.m15570d(C7499b.m14906H(courseFragment), null, null, new CourseFragment$onViewCreated$4$3$1(c8364u, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: Q */
    public final void mo3568Q() {
        this.f6090a0 = true;
        if (this.f23676F0) {
            this.f23676F0 = false;
            CourseViewModel courseViewModelM9858q0 = m9858q0();
            C7828f.m15570d(C8573r0.m16767w0(courseViewModelM9858q0), null, null, new CourseViewModel$updateUser$1(courseViewModelM9858q0, null), 3);
        }
        m9858q0().m9893o2();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        InterfaceC10060r interfaceC10060r = new InterfaceC10060r() { // from class: vi.a
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // p471x2.InterfaceC10060r
            /* JADX INFO: renamed from: c */
            public final C10063s0 mo2934c(View view2, C10063s0 c10063s0) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = CourseFragment.f23670H0;
                CourseFragment courseFragment = this.f49745a;
                C5207g.m11111f(courseFragment, "this$0");
                C5207g.m11111f(view2, "view");
                C8170b c8170bM18864a = c10063s0.m18864a(7);
                C5207g.m11110e(c8170bM18864a, "windowInsets.getInsets(W…Compat.Type.systemBars())");
                MaterialToolbar materialToolbar = courseFragment.m9857p0().f45303d;
                C5207g.m11110e(materialToolbar, "binding.toolbar");
                materialToolbar.setPadding(materialToolbar.getPaddingLeft(), c8170bM18864a.f44303b, materialToolbar.getPaddingRight(), materialToolbar.getPaddingBottom());
                SwipeRefreshLayout swipeRefreshLayout = courseFragment.m9857p0().f45302c;
                C5207g.m11110e(swipeRefreshLayout, "binding.swipeContainer");
                ViewGroup.LayoutParams layoutParams = swipeRefreshLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = c8170bM18864a.f44305d;
                swipeRefreshLayout.setLayoutParams(marginLayoutParams);
                return C10063s0.f51076b;
            }
        };
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.i.m18727u(view, interfaceC10060r);
        C8228i c8228i = new C8228i(0, true);
        c8228i.f48293c = 400L;
        m3585f0(c8228i);
        C8228i c8228i2 = new C8228i(0, false);
        c8228i2.f48293c = 400L;
        m3589h0(c8228i2);
        C8364u c8364uM9857p0 = m9857p0();
        c8364uM9857p0.f45303d.setTitle(m3600t(R.string.course_overview));
        Context contextM3578a0 = m3578a0();
        Object obj = C7472a.f41322a;
        Drawable drawableM14849b = C7472a.c.m14849b(contextM3578a0, R.drawable.ic_arrow_back);
        MaterialToolbar materialToolbar = c8364uM9857p0.f45303d;
        materialToolbar.setNavigationIcon(drawableM14849b);
        List<Integer> list = C6716m.f37937a;
        materialToolbar.setNavigationIconTint(C6716m.m13333r(R.attr.primaryTextColor, m3578a0()));
        materialToolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: vi.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = CourseFragment.f23670H0;
                CourseFragment courseFragment = this.f49746a;
                C5207g.m11111f(courseFragment, "this$0");
                C8573r0.m16725g0(courseFragment).m3995p();
            }
        });
        materialToolbar.mo1059k(R.menu.menu_course_overview);
        materialToolbar.setOnMenuItemClickListener(new C9371n(15, this));
        int[] iArr = {R.color.indigo_lightest, R.color.yellow_dark, R.color.green};
        SwipeRefreshLayout swipeRefreshLayout = c8364uM9857p0.f45302c;
        swipeRefreshLayout.setColorSchemeResources(iArr);
        swipeRefreshLayout.setOnRefreshListener(new C5097k(this, 9, c8364uM9857p0));
        this.f23674D0 = new CollectionsAdapter(CollectionsAdapter.InnerListLayout.VerticalFullWidth, new InterfaceC10396x() { // from class: com.lingq.ui.home.course.CourseFragment$onViewCreated$4$4
            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: a */
            public final void mo9801a(String str) {
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
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: e */
            public final void mo9805e(C6332a c6332a) {
                C5207g.m11111f(c6332a, "course");
                InterfaceC6727j<Object>[] interfaceC6727jArr = CourseFragment.f23670H0;
                final CourseFragment courseFragment = this.f23690a;
                if (courseFragment.m9858q0().m9894p2()) {
                    courseFragment.m9858q0().m9898t2();
                    return;
                }
                C9249b c9249b = new C9249b(courseFragment.m3578a0());
                c9249b.m17614g(courseFragment.m3600t(R.string.course_download_course));
                c9249b.f599a.f579f = courseFragment.m3600t(R.string.course_download_course_desc);
                c9249b.m17612e(courseFragment.m3600t(R.string.ui_yes), new DialogInterface.OnClickListener() { // from class: com.lingq.ui.home.course.a
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        CourseFragment courseFragment2 = courseFragment;
                        C5207g.m11111f(courseFragment2, "this$0");
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = CourseFragment.f23670H0;
                        CourseViewModel courseViewModelM9858q0 = courseFragment2.m9858q0();
                        C7828f.m15570d(C8573r0.m16767w0(courseViewModelM9858q0), courseViewModelM9858q0.f23955h, null, new CourseViewModel$downloadCourse$1(courseViewModelM9858q0, null), 2);
                    }
                });
                c9249b.m17610c(courseFragment.m3600t(R.string.ui_no), new DialogInterfaceOnClickListenerC9729d(0));
                c9249b.m876a();
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: f */
            public final void mo9806f(Sort sort) {
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: g */
            public final void mo9807g(C6332a c6332a) {
                C5207g.m11111f(c6332a, "course");
                InterfaceC6727j<Object>[] interfaceC6727jArr = CourseFragment.f23670H0;
                CourseFragment courseFragment = this.f23690a;
                courseFragment.m9858q0().m9896r2(new AbstractC3689c.c(courseFragment.m9858q0().m9894p2()));
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: h */
            public final void mo9808h(C6332a c6332a, LibraryItemCounter libraryItemCounter) {
                C5207g.m11111f(c6332a, "lesson");
                InterfaceC6727j<Object>[] interfaceC6727jArr = CourseFragment.f23670H0;
                CourseFragment courseFragment = this.f23690a;
                courseFragment.m9858q0().m9897s2(new AbstractC3688b.d(c6332a, true, courseFragment.m9858q0().m9895q2(c6332a, libraryItemCounter)));
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: i */
            public final void mo9809i(C6332a c6332a, String str) {
                C5207g.m11111f(c6332a, "course");
                C5207g.m11111f(str, "shelf");
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: j */
            public final void mo9810j(C6332a c6332a) {
                C5207g.m11111f(c6332a, "course");
                InterfaceC6727j<Object>[] interfaceC6727jArr = CourseFragment.f23670H0;
                this.f23690a.m9858q0().m9899u2();
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: k */
            public final void mo9811k(LibraryShelf libraryShelf) {
                C5207g.m11111f(libraryShelf, "shelf");
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
                InterfaceC6727j<Object>[] interfaceC6727jArr = CourseFragment.f23670H0;
                CourseFragment courseFragment = this.f23690a;
                CourseViewModel courseViewModelM9858q0 = courseFragment.m9858q0();
                LessonPath lessonPath = courseFragment.m9856o0().f49750b;
                if (lessonPath == null) {
                    lessonPath = LessonPath.Unknown.f22167a;
                }
                courseViewModelM9858q0.m9897s2(new AbstractC3688b.c(c6332a, lessonPath, courseFragment.m9858q0().m9895q2(c6332a, libraryItemCounter)));
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: n */
            public final void mo9814n(boolean z10) {
                Object next;
                C6332a c6332a;
                Float f3;
                InterfaceC6727j<Object>[] interfaceC6727jArr = CourseFragment.f23670H0;
                CourseViewModel courseViewModelM9858q0 = this.f23690a.m9858q0();
                StateFlowImpl stateFlowImpl = courseViewModelM9858q0.f23945b0;
                if (!((Collection) stateFlowImpl.getValue()).isEmpty()) {
                    StateFlowImpl stateFlowImpl2 = courseViewModelM9858q0.f23940W;
                    C9730e c9730e = courseViewModelM9858q0.f23927J;
                    Object obj2 = null;
                    if (!z10) {
                        C6332a c6332a2 = (C6332a) C6752c.m13425S((List) stateFlowImpl.getValue());
                        if (c6332a2 != null) {
                            LessonPath lessonPath = c9730e.f49750b;
                            if (lessonPath == null) {
                                lessonPath = LessonPath.Unknown.f22167a;
                            }
                            for (Object obj3 : (Iterable) stateFlowImpl2.getValue()) {
                                if (((LibraryItemCounter) obj3).f22004a == c6332a2.f36595a) {
                                    obj2 = obj3;
                                    break;
                                }
                            }
                            courseViewModelM9858q0.m9897s2(new AbstractC3688b.c(c6332a2, lessonPath, courseViewModelM9858q0.m9895q2(c6332a2, (LibraryItemCounter) obj2)));
                            return;
                        }
                        return;
                    }
                    Iterator it = ((Iterable) stateFlowImpl2.getValue()).iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            f3 = ((LibraryItemCounter) next).f22006c;
                        }
                    } while (!(f3 == null || ((double) f3.floatValue()) < 100.0d));
                    LibraryItemCounter libraryItemCounter = (LibraryItemCounter) next;
                    if (libraryItemCounter == null) {
                        c6332a = (C6332a) C6752c.m13433a0((List) stateFlowImpl.getValue());
                    } else {
                        for (Object obj4 : (Iterable) stateFlowImpl.getValue()) {
                            if (((C6332a) obj4).f36595a == libraryItemCounter.f22004a) {
                                obj2 = obj4;
                                break;
                            }
                        }
                        c6332a = (C6332a) obj2;
                    }
                    if (c6332a != null) {
                        LessonPath lessonPath2 = c9730e.f49750b;
                        if (lessonPath2 == null) {
                            lessonPath2 = LessonPath.Unknown.f22167a;
                        }
                        courseViewModelM9858q0.m9897s2(new AbstractC3688b.c(c6332a, lessonPath2, courseViewModelM9858q0.m9895q2(c6332a, libraryItemCounter)));
                    }
                }
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: o */
            public final void mo9815o(C6332a c6332a, LibraryItemCounter libraryItemCounter) {
                C5207g.m11111f(c6332a, "lesson");
                InterfaceC6727j<Object>[] interfaceC6727jArr = CourseFragment.f23670H0;
                CourseFragment courseFragment = this.f23690a;
                courseFragment.m9858q0().m9897s2(new AbstractC3688b.b(c6332a, courseFragment.m9858q0().m9895q2(c6332a, libraryItemCounter)));
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: p */
            public final void mo9816p() {
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: q */
            public final void mo9817q(String str) {
                CourseFragment courseFragment = this.f23690a;
                Object systemService = courseFragment.m3576Y().getSystemService("clipboard");
                C5207g.m11109d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Course Link", str));
                Toast.makeText(courseFragment.m3578a0(), courseFragment.m3600t(R.string.share_copied_clipboard), 0).show();
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: r */
            public final void mo9818r(final C6332a c6332a, LibraryItemCounter libraryItemCounter) {
                C5207g.m11111f(c6332a, "lesson");
                boolean zM12964a = c6332a.m12964a();
                final CourseFragment courseFragment = this.f23690a;
                if (zM12964a) {
                    if ((libraryItemCounter == null || libraryItemCounter.f22005b) ? false : true) {
                        ViewsUtilsKt.m10421g(courseFragment, new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.home.course.CourseFragment$onViewCreated$4$4$onLikeLessonClicked$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final C9072e mo807E() {
                                InterfaceC6727j<Object>[] interfaceC6727jArr = CourseFragment.f23670H0;
                                courseFragment.m9858q0().m9900v2(c6332a.f36595a);
                                return C9072e.f47360a;
                            }
                        });
                        return;
                    }
                }
                InterfaceC6727j<Object>[] interfaceC6727jArr = CourseFragment.f23670H0;
                courseFragment.m9858q0().m9900v2(c6332a.f36595a);
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: s */
            public final void mo9819s(String str) {
                List<Integer> list2 = C6716m.f37937a;
                CourseFragment courseFragment = this.f23690a;
                C6716m.m13330o(courseFragment.m3578a0(), str, C8573r0.m16725g0(courseFragment), 4);
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: t */
            public final void mo9820t(C6332a c6332a) {
                C5207g.m11111f(c6332a, "course");
                InterfaceC6727j<Object>[] interfaceC6727jArr = CourseFragment.f23670H0;
                this.f23690a.m9858q0().m9898t2();
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: u */
            public final void mo9821u() {
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: v */
            public final void mo9822v(boolean z10) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = CourseFragment.f23670H0;
                this.f23690a.m9858q0().f23935R.setValue(Boolean.valueOf(z10));
            }

            @Override // p512yi.InterfaceC10396x
            /* JADX INFO: renamed from: w */
            public final void mo9823w(Sort sort) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = CourseFragment.f23670H0;
                CourseViewModel courseViewModelM9858q0 = this.f23690a.m9858q0();
                courseViewModelM9858q0.f23939V.setValue(sort);
                courseViewModelM9858q0.f23932O.setValue(1);
                courseViewModelM9858q0.m9892n2();
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
            public final void mo9825y(View view2, final C6332a c6332a, final LibraryItemCounter libraryItemCounter, String str) {
                C5207g.m11111f(view2, "view");
                C5207g.m11111f(c6332a, "lesson");
                C5207g.m11111f(str, "shelf");
                boolean z10 = libraryItemCounter != null ? libraryItemCounter.f22005b : false;
                boolean z11 = libraryItemCounter != null ? libraryItemCounter.f22009f : false;
                final CourseFragment courseFragment = this.f23690a;
                new C10372b0(view2, z10, false, true, z11, new InterfaceC2052l<LessonMenuItem, C9072e>() { // from class: com.lingq.ui.home.course.CourseFragment$onViewCreated$4$4$onLessonMenuClicked$1

                    /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseFragment$onViewCreated$4$4$onLessonMenuClicked$1$a */
                    public /* synthetic */ class C3630a {

                        /* JADX INFO: renamed from: a */
                        public static final /* synthetic */ int[] f23696a;

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
                            f23696a = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Code duplicated, block: B:37:0x00ba  */
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(LessonMenuItem lessonMenuItem) {
                        LessonMenuItem lessonMenuItem2 = lessonMenuItem;
                        C5207g.m11111f(lessonMenuItem2, "item");
                        int i10 = C3630a.f23696a[lessonMenuItem2.ordinal()];
                        LibraryItemCounter libraryItemCounter2 = libraryItemCounter;
                        final C6332a c6332a2 = c6332a;
                        final CourseFragment courseFragment2 = courseFragment;
                        if (i10 != 1) {
                            String str2 = "";
                            if (i10 != 2) {
                                boolean z12 = false;
                                if (i10 != 4) {
                                    if (i10 == 5) {
                                        InterfaceC6727j<Object>[] interfaceC6727jArr = CourseFragment.f23670H0;
                                        courseFragment2.m9858q0().m9897s2(new AbstractC3688b.a(c6332a2, courseFragment2.m9858q0().m9895q2(c6332a2, libraryItemCounter2)));
                                    } else if (i10 == 6) {
                                        Context contextM3578a1 = courseFragment2.m3578a0();
                                        String str3 = c6332a2.f36599e;
                                        if (str3 != null) {
                                            str2 = str3;
                                        }
                                        new C10507q(contextM3578a1, str2, new InterfaceC2056p<String, String, C9072e>() { // from class: com.lingq.ui.home.course.CourseFragment$onViewCreated$4$4$onLessonMenuClicked$1$reportMenu$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // cm.InterfaceC2056p
                                            /* JADX INFO: renamed from: m0 */
                                            public final C9072e mo1337m0(String str4, String str5) {
                                                String str6 = str4;
                                                C5207g.m11111f(str6, "scope");
                                                InterfaceC6727j<Object>[] interfaceC6727jArr2 = CourseFragment.f23670H0;
                                                CourseFragment courseFragment3 = courseFragment2;
                                                courseFragment3.m9858q0().mo9831a0(courseFragment3.m9858q0().mo498E1(), c6332a2.f36595a, str6, str5);
                                                return C9072e.f47360a;
                                            }
                                        }).m19482a();
                                    } else if (i10 == 7) {
                                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = CourseFragment.f23670H0;
                                        CourseViewModel courseViewModelM9858q0 = courseFragment2.m9858q0();
                                        if (libraryItemCounter2 != null && libraryItemCounter2.f22009f) {
                                            z12 = true;
                                        }
                                        courseViewModelM9858q0.m9897s2(new AbstractC3688b.d(c6332a2, true ^ z12, courseFragment2.m9858q0().m9895q2(c6332a2, libraryItemCounter2)));
                                    }
                                } else if (c6332a2.m12964a()) {
                                    if ((libraryItemCounter2 == null || libraryItemCounter2.f22005b) ? false : true) {
                                        ViewsUtilsKt.m10421g(courseFragment2, new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.home.course.CourseFragment$onViewCreated$4$4$onLessonMenuClicked$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // cm.InterfaceC2041a
                                            /* JADX INFO: renamed from: E */
                                            public final C9072e mo807E() {
                                                InterfaceC6727j<Object>[] interfaceC6727jArr3 = CourseFragment.f23670H0;
                                                courseFragment2.m9858q0().m9900v2(c6332a2.f36595a);
                                                return C9072e.f47360a;
                                            }
                                        });
                                    } else {
                                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = CourseFragment.f23670H0;
                                        courseFragment2.m9858q0().m9900v2(c6332a2.f36595a);
                                    }
                                } else {
                                    InterfaceC6727j<Object>[] interfaceC6727jArr4 = CourseFragment.f23670H0;
                                    courseFragment2.m9858q0().m9900v2(c6332a2.f36595a);
                                }
                            } else {
                                int i11 = c6332a2.f36595a;
                                String str4 = c6332a2.f36599e;
                                String str5 = str4 == null ? str2 : str4;
                                String str6 = c6332a2.f36602h;
                                String str7 = str6 == null ? str2 : str6;
                                String str8 = c6332a2.f36581H;
                                String str9 = str8 == null ? str2 : str8;
                                String str10 = c6332a2.f36600f;
                                String str11 = str10 == null ? str2 : str10;
                                LessonInfoParent lessonInfoParent = LessonInfoParent.Course;
                                C5207g.m11111f(lessonInfoParent, "from");
                                C4924a.m10447Z(C8573r0.m16725g0(courseFragment2), new C6682i(i11, str5, str7, str9, str11, lessonInfoParent));
                            }
                        } else {
                            InterfaceC6727j<Object>[] interfaceC6727jArr5 = CourseFragment.f23670H0;
                            CourseViewModel courseViewModelM9858q1 = courseFragment2.m9858q0();
                            LessonPath lessonPath = courseFragment2.m9856o0().f49750b;
                            if (lessonPath == null) {
                                lessonPath = LessonPath.Unknown.f22167a;
                            }
                            courseViewModelM9858q1.m9897s2(new AbstractC3688b.c(c6332a2, lessonPath, courseFragment2.m9858q0().m9895q2(c6332a2, libraryItemCounter2)));
                        }
                        return C9072e.f47360a;
                    }
                }, 4);
            }
        });
        m9857p0().f45300a.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        RecyclerView recyclerView = c8364uM9857p0.f45301b;
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView.AbstractC1117j itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f7080f = 0L;
        }
        recyclerView.m4199g(new C8049h((int) C6716m.m13316a(16)));
        CollectionsAdapter collectionsAdapter = this.f23674D0;
        if (collectionsAdapter == null) {
            C5207g.m11117l("contentAdapter");
            throw null;
        }
        collectionsAdapter.f7042c = RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY;
        collectionsAdapter.f7040a.m4264g();
        CollectionsAdapter collectionsAdapter2 = this.f23674D0;
        if (collectionsAdapter2 == null) {
            C5207g.m11117l("contentAdapter");
            throw null;
        }
        recyclerView.setAdapter(collectionsAdapter2);
        recyclerView.m4203i(new C3627a());
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C3628xca93aa2e(this, Lifecycle.State.STARTED, null, this, view), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    public final C9730e m9856o0() {
        return (C9730e) this.f23675E0.getValue();
    }

    /* JADX INFO: renamed from: p0 */
    public final C8364u m9857p0() {
        return (C8364u) this.f23671A0.m10489a(this, f23670H0[0]);
    }

    /* JADX INFO: renamed from: q0 */
    public final CourseViewModel m9858q0() {
        return (CourseViewModel) this.f23672B0.getValue();
    }
}
