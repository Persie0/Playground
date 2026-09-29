package com.lingq.p055ui.home.course;

import ae.C0062b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.activity.result.C0204c;
import androidx.fragment.app.C0980t0;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.C1052r;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import bj.C1597t;
import bj.ViewOnClickListenerC1581d;
import bj.ViewOnClickListenerC1582e;
import bj.ViewOnClickListenerC1583f;
import bj.ViewOnClickListenerC1588k;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2239y;
import com.google.android.material.appbar.MaterialToolbar;
import com.lingq.p055ui.home.HomeViewModel;
import com.lingq.p055ui.home.playlist.PlaylistAdapter;
import com.lingq.p055ui.home.playlist.PlaylistPlayerView;
import com.lingq.p055ui.home.playlist.PlaylistPopupMenu$PlaylistMenuItem;
import com.lingq.p055ui.info.LessonInfoParent;
import com.lingq.player.AbstractC3298c;
import com.lingq.player.AbstractC3299d;
import com.lingq.player.C3297b;
import com.lingq.player.C3300e;
import com.lingq.player.PlayerContentController;
import com.lingq.player.PlayerController;
import com.lingq.player.PlayingFrom;
import com.lingq.shared.download.DownloadItem;
import com.lingq.shared.uimodel.CoursePlaylistSort;
import com.lingq.shared.util.LessonPath;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import dm.C5207g;
import dm.C5209i;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kh.C6682i;
import ki.C6697c;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.InterfaceC7133n;
import kotlinx.coroutines.flow.StateFlowImpl;
import mo.C7661i;
import ni.C7793a;
import no.C7828f;
import p003a2.C0009a;
import p040c4.C1681f;
import p225kk.C6716m;
import p254m2.C7472a;
import p260m8.C7499b;
import p278nh.InterfaceC7781h;
import p301oh.C8043b;
import p322pd.C8228i;
import p338qd.C8573r0;
import p382s7.C8969b;
import p402u0.C9371n;
import p427v3.AbstractC9634a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import ph.C8309k;
import sh.InterfaceC9008d;
import sl.C9072e;
import sl.InterfaceC9070c;
import vi.AbstractC9740o;
import vi.C9737l;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/course/CoursePlaylistFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class CoursePlaylistFragment extends AbstractC9740o {

    /* JADX INFO: renamed from: G0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f23761G0 = {C0204c.m857q(CoursePlaylistFragment.class, "getBinding()Lcom/lingq/databinding/FragmentCoursePlaylistBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f23762A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f23763B0;

    /* JADX INFO: renamed from: C0 */
    public final C1038i0 f23764C0;

    /* JADX INFO: renamed from: D0 */
    public final C1681f f23765D0;

    /* JADX INFO: renamed from: E0 */
    public PlaylistAdapter f23766E0;

    /* JADX INFO: renamed from: F0 */
    public PlayerController f23767F0;

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CoursePlaylistFragment$a */
    public static final class C3640a implements InterfaceC9008d {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C8309k f23769b;

        public C3640a(C8309k c8309k) {
            this.f23769b = c8309k;
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: a */
        public final void mo9863a(float f3) {
            C3297b value;
            InterfaceC6727j<Object>[] interfaceC6727jArr = CoursePlaylistFragment.f23761G0;
            InterfaceC7133n<C3297b> interfaceC7133nMo9423y = CoursePlaylistFragment.this.m9862q0().mo9423y();
            do {
                value = interfaceC7133nMo9423y.getValue();
            } while (!interfaceC7133nMo9423y.mo14366c(value, C3297b.m9431a(value, 0L, ((int) f3) * 1000, 11)));
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: b */
        public final void mo9864b() {
            CoursePlaylistFragment.this.m9861p0().m9410d0(5000);
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: c */
        public final void mo9865c(float f3) {
            C3297b value;
            InterfaceC6727j<Object>[] interfaceC6727jArr = CoursePlaylistFragment.f23761G0;
            InterfaceC7133n<C3297b> interfaceC7133nMo9423y = CoursePlaylistFragment.this.m9862q0().mo9423y();
            do {
                value = interfaceC7133nMo9423y.getValue();
            } while (!interfaceC7133nMo9423y.mo14366c(value, C3297b.m9431a(value, (long) (1000 * f3), 0, 13)));
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: d */
        public final void mo9866d() {
            CoursePlaylistFragment coursePlaylistFragment = CoursePlaylistFragment.this;
            PlayerContentController.PlayerContentItem playerContentItemM9400L = coursePlaylistFragment.m9861p0().m9400L();
            int i10 = playerContentItemM9400L != null ? playerContentItemM9400L.f17600a : 0;
            if (coursePlaylistFragment.m9862q0().m9887o2(i10)) {
                coursePlaylistFragment.m9862q0().m9889q2(i10);
            } else {
                coursePlaylistFragment.m9861p0().m9408a0();
            }
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: e */
        public final void mo9867e() {
            CoursePlaylistFragment.this.m9861p0().m9397G0(AbstractC3298c.a.f17752a);
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: f */
        public final void mo9868f() {
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: g */
        public final void mo9869g() {
            CoursePlaylistFragment.this.m9861p0().m9418u0();
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: h */
        public final void mo9870h() {
            CoursePlaylistFragment.this.m9861p0().m9410d0(-5000);
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: i */
        public final void mo9871i() {
            C3300e value;
            AbstractC3299d.c cVar;
            AbstractC3298c.b bVar;
            InterfaceC6727j<Object>[] interfaceC6727jArr = CoursePlaylistFragment.f23761G0;
            InterfaceC7133n<C3300e> interfaceC7133nMo9424y0 = CoursePlaylistFragment.this.m9862q0().mo9424y0();
            do {
                value = interfaceC7133nMo9424y0.getValue();
                cVar = AbstractC3299d.c.f17756a;
                bVar = AbstractC3298c.b.f17753a;
                value.getClass();
            } while (!interfaceC7133nMo9424y0.mo14366c(value, C3300e.m9432a(cVar, bVar)));
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: j */
        public final void mo9872j() {
            CoursePlaylistFragment.this.m9861p0().m9394D0();
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: k */
        public final void mo9873k() {
            CoursePlaylistFragment coursePlaylistFragment = CoursePlaylistFragment.this;
            PlayerContentController.PlayerContentItem playerContentItemM9400L = coursePlaylistFragment.m9861p0().m9400L();
            int i10 = 0;
            int i11 = playerContentItemM9400L != null ? playerContentItemM9400L.f17600a : 0;
            if (coursePlaylistFragment.m9862q0().m9887o2(i11)) {
                coursePlaylistFragment.m9862q0().m9889q2(i11);
                return;
            }
            this.f23769b.f44946g.binding.f44978j.m10491a(new C1597t());
            HomeViewModel homeViewModel = (HomeViewModel) coursePlaylistFragment.f23764C0.getValue();
            PlayerContentController.PlayerContentItem playerContentItemM9400L2 = coursePlaylistFragment.m9861p0().m9400L();
            if (playerContentItemM9400L2 != null) {
                i10 = playerContentItemM9400L2.f17600a;
            }
            homeViewModel.f22743S.mo16479j(new HomeViewModel.AbstractC3479a.g(i10, coursePlaylistFragment.m9862q0().mo9424y0().getValue().f17757a instanceof AbstractC3299d.c));
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CoursePlaylistFragment$b */
    public static final class C3641b implements InterfaceC7781h {
        @Override // p278nh.InterfaceC7781h
        /* JADX INFO: renamed from: a */
        public final void mo9874a(RecyclerView.AbstractC1109b0 abstractC1109b0) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.home.course.CoursePlaylistFragment$special$$inlined$viewModels$default$1] */
    public CoursePlaylistFragment() {
        super(R.layout.fragment_course_playlist);
        this.f23762A0 = C4924a.m10477o0(this, CoursePlaylistFragment$binding$2.f23770j);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.home.course.CoursePlaylistFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.course.CoursePlaylistFragment$special$$inlined$viewModels$default$2
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
        this.f23763B0 = C8573r0.m16711Z(this, C5209i.m11118a(CoursePlaylistViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.course.CoursePlaylistFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.course.CoursePlaylistFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.course.CoursePlaylistFragment$special$$inlined$viewModels$default$5
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
        this.f23764C0 = C8573r0.m16711Z(this, C5209i.m11118a(HomeViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.course.CoursePlaylistFragment$special$$inlined$activityViewModels$default$1
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
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.course.CoursePlaylistFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                return this.m3576Y().mo792j();
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.course.CoursePlaylistFragment$special$$inlined$activityViewModels$default$3
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
        this.f23765D0 = new C1681f(C5209i.m11118a(C9737l.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.home.course.CoursePlaylistFragment$special$$inlined$navArgs$1
            {
                super(0);
            }

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
    public static void m9859n0(CoursePlaylistFragment coursePlaylistFragment, C8309k c8309k) {
        C5207g.m11111f(coursePlaylistFragment, "this$0");
        C5207g.m11111f(c8309k, "$this_with");
        coursePlaylistFragment.m9862q0().m9885m2();
        C7828f.m15570d(C7499b.m14906H(coursePlaylistFragment), null, null, new CoursePlaylistFragment$onViewCreated$4$2$1(c8309k, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: Q */
    public final void mo3568Q() {
        this.f6090a0 = true;
        PlayingFrom value = m9862q0().mo9726R1().getValue();
        PlayingFrom playingFrom = PlayingFrom.CoursePlaylist;
        if (value != playingFrom) {
            CoursePlaylistViewModel coursePlaylistViewModelM9862q0 = m9862q0();
            C7135p c7135p = coursePlaylistViewModelM9862q0.f23831T;
            if (!((List) c7135p.getValue()).isEmpty()) {
                coursePlaylistViewModelM9862q0.mo9401L1(EmptyList.f38032a);
                coursePlaylistViewModelM9862q0.f23849k.m9415p0(true);
                coursePlaylistViewModelM9862q0.m9888p2((List) c7135p.getValue());
            }
        }
        m9862q0().mo9720E(playingFrom);
        m9862q0().m9886n2(m9862q0().mo498E1());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        C9371n c9371n = new C9371n(16, this);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.i.m18727u(view, c9371n);
        C8228i c8228i = new C8228i(0, true);
        c8228i.f48293c = 400L;
        m3585f0(c8228i);
        C8228i c8228i2 = new C8228i(0, false);
        c8228i2.f48293c = 400L;
        m3589h0(c8228i2);
        C8309k c8309kM9860o0 = m9860o0();
        c8309kM9860o0.f44944e.setTitle(((C9737l) this.f23765D0.getValue()).f49763b);
        Context contextM3578a0 = m3578a0();
        Object obj = C7472a.f41322a;
        Drawable drawableM14849b = C7472a.c.m14849b(contextM3578a0, R.drawable.ic_arrow_back);
        MaterialToolbar materialToolbar = c8309kM9860o0.f44944e;
        materialToolbar.setNavigationIcon(drawableM14849b);
        List<Integer> list = C6716m.f37937a;
        materialToolbar.setNavigationIconTint(C6716m.m13333r(R.attr.primaryTextColor, m3578a0()));
        materialToolbar.setNavigationOnClickListener(new ViewOnClickListenerC2239y(11, this));
        int[] iArr = {R.color.indigo_lightest, R.color.yellow_dark, R.color.green};
        SwipeRefreshLayout swipeRefreshLayout = c8309kM9860o0.f44943d;
        swipeRefreshLayout.setColorSchemeResources(iArr);
        swipeRefreshLayout.setOnRefreshListener(new C8969b(this, 13, c8309kM9860o0));
        PlaylistPlayerView playlistPlayerView = c8309kM9860o0.f44946g;
        playlistPlayerView.m9985a();
        C0980t0 c0980t0M3601v = m3601v();
        c0980t0M3601v.m3813c();
        C1052r c1052r = c0980t0M3601v.f6415d;
        YouTubePlayerView youTubePlayerView = playlistPlayerView.getBinding().f44978j;
        C5207g.m11110e(youTubePlayerView, "viewPlayer.binding.youtubePlayerView");
        c1052r.mo3883a(youTubePlayerView);
        playlistPlayerView.setPlayerControlsListener(new C3640a(c8309kM9860o0));
        this.f23766E0 = new PlaylistAdapter(new C3641b(), new PlaylistAdapter.InterfaceC3891d() { // from class: com.lingq.ui.home.course.CoursePlaylistFragment$onViewCreated$4$5
            @Override // com.lingq.p055ui.home.playlist.PlaylistAdapter.InterfaceC3891d
            /* JADX INFO: renamed from: a */
            public final void mo9875a(int i10, int i11) {
            }

            @Override // com.lingq.p055ui.home.playlist.PlaylistAdapter.InterfaceC3891d
            /* JADX INFO: renamed from: b */
            public final void mo9876b(CoursePlaylistSort coursePlaylistSort) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = CoursePlaylistFragment.f23761G0;
                CoursePlaylistViewModel coursePlaylistViewModelM9862q0 = this.f23779a.m9862q0();
                StateFlowImpl stateFlowImpl = coursePlaylistViewModelM9862q0.f23828Q;
                if (stateFlowImpl.getValue() != coursePlaylistSort) {
                    coursePlaylistViewModelM9862q0.f23849k.m9415p0(false);
                    stateFlowImpl.setValue(coursePlaylistSort);
                    coursePlaylistViewModelM9862q0.m9885m2();
                }
            }

            @Override // com.lingq.p055ui.home.playlist.PlaylistAdapter.InterfaceC3891d
            /* JADX INFO: renamed from: c */
            public final void mo9877c() {
            }

            @Override // com.lingq.p055ui.home.playlist.PlaylistAdapter.InterfaceC3891d
            /* JADX INFO: renamed from: d */
            public final void mo9878d(int i10) {
            }

            @Override // com.lingq.p055ui.home.playlist.PlaylistAdapter.InterfaceC3891d
            /* JADX INFO: renamed from: e */
            public final void mo9879e(View view2, int i10) {
                C5207g.m11111f(view2, "view");
            }

            @Override // com.lingq.p055ui.home.playlist.PlaylistAdapter.InterfaceC3891d
            /* JADX INFO: renamed from: f */
            public final void mo9880f() {
            }

            @Override // com.lingq.p055ui.home.playlist.PlaylistAdapter.InterfaceC3891d
            /* JADX INFO: renamed from: g */
            public final void mo9881g(C6697c c6697c, boolean z10) {
                C5207g.m11111f(c6697c, "playlistLesson");
                InterfaceC6727j<Object>[] interfaceC6727jArr = CoursePlaylistFragment.f23761G0;
                CoursePlaylistFragment coursePlaylistFragment = this.f23779a;
                CoursePlaylistViewModel coursePlaylistViewModelM9862q0 = coursePlaylistFragment.m9862q0();
                int i10 = c6697c.f37856a;
                if (coursePlaylistViewModelM9862q0.m9887o2(i10)) {
                    coursePlaylistFragment.m9862q0().m9889q2(i10);
                    return;
                }
                String str = c6697c.f37869n;
                if (!(str == null || C7661i.m15250P2(str)) || z10 || c6697c.f37870o != null) {
                    coursePlaylistFragment.m9861p0().m9411g0(i10);
                    return;
                }
                CoursePlaylistViewModel coursePlaylistViewModelM9862q1 = coursePlaylistFragment.m9862q0();
                if (C5207g.m11106a(coursePlaylistViewModelM9862q1.f23842d0.getValue(), Boolean.TRUE)) {
                    coursePlaylistViewModelM9862q1.f23837Z.mo14371k(Integer.valueOf(i10));
                }
            }

            @Override // com.lingq.p055ui.home.playlist.PlaylistAdapter.InterfaceC3891d
            /* JADX INFO: renamed from: h */
            public final void mo9882h() {
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // com.lingq.p055ui.home.playlist.PlaylistAdapter.InterfaceC3891d
            /* JADX INFO: renamed from: i */
            public final void mo9883i(View view2, final C6697c c6697c) {
                C5207g.m11111f(view2, "view");
                C5207g.m11111f(c6697c, "lesson");
                final CoursePlaylistFragment coursePlaylistFragment = this.f23779a;
                InterfaceC2052l<PlaylistPopupMenu$PlaylistMenuItem, C9072e> interfaceC2052l = new InterfaceC2052l<PlaylistPopupMenu$PlaylistMenuItem, C9072e>() { // from class: com.lingq.ui.home.course.CoursePlaylistFragment$onViewCreated$4$5$onMenuSelected$1

                    /* JADX INFO: renamed from: com.lingq.ui.home.course.CoursePlaylistFragment$onViewCreated$4$5$onMenuSelected$1$a */
                    public /* synthetic */ class C3643a {

                        /* JADX INFO: renamed from: a */
                        public static final /* synthetic */ int[] f23782a;

                        static {
                            int[] iArr = new int[PlaylistPopupMenu$PlaylistMenuItem.values().length];
                            try {
                                iArr[PlaylistPopupMenu$PlaylistMenuItem.RemovePlaylist.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[PlaylistPopupMenu$PlaylistMenuItem.OpenLesson.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[PlaylistPopupMenu$PlaylistMenuItem.LessonInfo.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[PlaylistPopupMenu$PlaylistMenuItem.Download.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            f23782a = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(PlaylistPopupMenu$PlaylistMenuItem playlistPopupMenu$PlaylistMenuItem) {
                        int i10;
                        Object next;
                        PlaylistPopupMenu$PlaylistMenuItem playlistPopupMenu$PlaylistMenuItem2 = playlistPopupMenu$PlaylistMenuItem;
                        C5207g.m11111f(playlistPopupMenu$PlaylistMenuItem2, "it");
                        int i11 = C3643a.f23782a[playlistPopupMenu$PlaylistMenuItem2.ordinal()];
                        C6697c c6697c2 = c6697c;
                        String str = "";
                        CoursePlaylistFragment coursePlaylistFragment2 = coursePlaylistFragment;
                        if (i11 != 2) {
                            if (i11 == 3) {
                                int i12 = c6697c2.f37856a;
                                String str2 = c6697c2.f37861f;
                                String str3 = str2 == null ? str : str2;
                                String str4 = c6697c2.f37860e;
                                String str5 = str4 == null ? str : str4;
                                String str6 = c6697c2.f37858c;
                                String str7 = str6 == null ? str : str6;
                                LessonInfoParent lessonInfoParent = LessonInfoParent.CoursePlaylist;
                                String str8 = c6697c2.f37863h;
                                C5207g.m11111f(str8, "title");
                                C5207g.m11111f(lessonInfoParent, "from");
                                C4924a.m10447Z(C8573r0.m16725g0(coursePlaylistFragment2), new C6682i(i12, str8, str3, str5, str7, lessonInfoParent));
                            } else if (i11 == 4) {
                                InterfaceC6727j<Object>[] interfaceC6727jArr = CoursePlaylistFragment.f23761G0;
                                CoursePlaylistViewModel coursePlaylistViewModelM9862q0 = coursePlaylistFragment2.m9862q0();
                                C5207g.m11111f(c6697c2, "lesson");
                                Iterator it = ((Iterable) coursePlaylistViewModelM9862q0.f23831T.getValue()).iterator();
                                do {
                                    boolean zHasNext = it.hasNext();
                                    i10 = c6697c2.f37856a;
                                    if (!zHasNext) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!(((PlayerContentController.PlayerContentItem) next).f17600a == i10));
                                PlayerContentController.PlayerContentItem playerContentItem = (PlayerContentController.PlayerContentItem) next;
                                if (playerContentItem != null) {
                                    String str9 = playerContentItem.f17601b;
                                    boolean zM15250P2 = C7661i.m15250P2(str9);
                                    boolean z10 = playerContentItem.f17606g;
                                    if (!zM15250P2 || z10) {
                                        coursePlaylistViewModelM9862q0.mo9391A0(i10);
                                        coursePlaylistViewModelM9862q0.f23822K.mo9406X0(new DownloadItem(playerContentItem.f17608i, playerContentItem.f17600a, str9, z10), false);
                                    } else if (c6697c2.f37870o == null && C5207g.m11106a(coursePlaylistViewModelM9862q0.f23842d0.getValue(), Boolean.TRUE)) {
                                        coursePlaylistViewModelM9862q0.f23837Z.mo14371k(Integer.valueOf(i10));
                                    }
                                }
                            }
                        } else if (C8573r0.m16725g0(coursePlaylistFragment2).m3988i().f6834h == R.id.nav_graph_home) {
                            HomeViewModel homeViewModel = (HomeViewModel) coursePlaylistFragment2.f23764C0.getValue();
                            int i13 = c6697c2.f37856a;
                            String str10 = c6697c2.f37864i;
                            if (str10 != null) {
                                str = str10;
                            }
                            homeViewModel.m9776l2(i13, c6697c2.f37865j, str, LessonPath.Playlist.f22162a);
                        } else {
                            int i14 = c6697c2.f37856a;
                            String str11 = c6697c2.f37864i;
                            if (str11 != null) {
                                str = str11;
                            }
                            C4924a.m10447Z(C8573r0.m16725g0(coursePlaylistFragment2), C0062b.m279J(i14, c6697c2.f37865j, str, LessonPath.Playlist.f22162a, 24));
                        }
                        return C9072e.f47360a;
                    }
                };
                Object systemService = view2.getContext().getSystemService("layout_inflater");
                C5207g.m11109d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.menu_playlist, (ViewGroup) null, false);
                int i10 = R.id.tvDownload;
                LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(viewInflate, R.id.tvDownload);
                if (linearLayout != null) {
                    i10 = R.id.tvLessonInfo;
                    LinearLayout linearLayout2 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.tvLessonInfo);
                    if (linearLayout2 != null) {
                        i10 = R.id.tvOpenLesson;
                        LinearLayout linearLayout3 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.tvOpenLesson);
                        if (linearLayout3 != null) {
                            i10 = R.id.tvRemovePlaylist;
                            LinearLayout linearLayout4 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.tvRemovePlaylist);
                            if (linearLayout4 != null) {
                                PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2, true);
                                C4924a.m10442U(linearLayout4);
                                linearLayout4.setOnClickListener(new ViewOnClickListenerC1582e(popupWindow, interfaceC2052l, 1));
                                linearLayout3.setOnClickListener(new ViewOnClickListenerC1583f(popupWindow, interfaceC2052l, 2));
                                linearLayout2.setOnClickListener(new ViewOnClickListenerC1588k(popupWindow, interfaceC2052l, 1));
                                linearLayout.setOnClickListener(new ViewOnClickListenerC1581d(popupWindow, interfaceC2052l, 1));
                                C7793a.m15503g(popupWindow);
                                popupWindow.showAsDropDown(view2);
                                return;
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
            }
        });
        m9860o0().f44940a.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        RecyclerView recyclerView = c8309kM9860o0.f44942c;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.m4199g(new C8043b(C7472a.c.m14849b(m3578a0(), R.drawable.dr_item_divider), 0));
        RecyclerView.AbstractC1117j itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f7080f = 0L;
        }
        PlaylistAdapter playlistAdapter = this.f23766E0;
        if (playlistAdapter == null) {
            C5207g.m11117l("playlistAdapter");
            throw null;
        }
        recyclerView.setAdapter(playlistAdapter);
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C3642x4e320ea0(this, Lifecycle.State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: o0 */
    public final C8309k m9860o0() {
        return (C8309k) this.f23762A0.m10489a(this, f23761G0[0]);
    }

    /* JADX INFO: renamed from: p0 */
    public final PlayerController m9861p0() {
        PlayerController playerController = this.f23767F0;
        if (playerController != null) {
            return playerController;
        }
        C5207g.m11117l("playerController");
        throw null;
    }

    /* JADX INFO: renamed from: q0 */
    public final CoursePlaylistViewModel m9862q0() {
        return (CoursePlaylistViewModel) this.f23763B0.getValue();
    }
}
