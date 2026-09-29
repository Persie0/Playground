package com.lingq.p055ui.home.playlist;

import ae.C0062b;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.fragment.app.C0940a;
import androidx.fragment.app.C0980t0;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.C1165p;
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
import bj.AbstractC1579b;
import bj.C1597t;
import bj.ViewOnClickListenerC1581d;
import bj.ViewOnClickListenerC1582e;
import bj.ViewOnClickListenerC1583f;
import bj.ViewOnClickListenerC1588k;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2238x;
import com.google.android.material.appbar.AppBarLayout;
import com.lingq.p055ui.home.HomeViewModel;
import com.lingq.p055ui.home.playlist.PlaylistFragment;
import com.lingq.p055ui.home.playlist.PlaylistViewModel;
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
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kh.C6678e;
import kh.C6682i;
import ki.C6697c;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7133n;
import kotlinx.coroutines.flow.StateFlowImpl;
import mo.C7661i;
import ni.C7793a;
import no.C7828f;
import no.InterfaceC7882z;
import p003a2.C0009a;
import p225kk.C6714k;
import p254m2.C7472a;
import p260m8.C7499b;
import p278nh.InterfaceC7781h;
import p290o6.C7946b;
import p301oh.C8043b;
import p301oh.C8044c;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import ph.C8379x;
import sh.InterfaceC9008d;
import sl.C9072e;
import sl.InterfaceC9070c;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/playlist/PlaylistFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class PlaylistFragment extends AbstractC1579b {

    /* JADX INFO: renamed from: H0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f25457H0 = {C0204c.m857q(PlaylistFragment.class, "getBinding()Lcom/lingq/databinding/FragmentHomePlaylistBinding;")};

    /* JADX INFO: renamed from: A0 */
    public C1165p f25458A0;

    /* JADX INFO: renamed from: B0 */
    public final FragmentViewBindingDelegate f25459B0;

    /* JADX INFO: renamed from: C0 */
    public final C1038i0 f25460C0;

    /* JADX INFO: renamed from: D0 */
    public final C1038i0 f25461D0;

    /* JADX INFO: renamed from: E0 */
    public PlaylistAdapter f25462E0;

    /* JADX INFO: renamed from: F0 */
    public boolean f25463F0;

    /* JADX INFO: renamed from: G0 */
    public PlayerController f25464G0;

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistFragment$a */
    public static final class C3895a implements InterfaceC9008d {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C8379x f25466b;

        public C3895a(C8379x c8379x) {
            this.f25466b = c8379x;
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: a */
        public final void mo9863a(float f3) {
            C3297b value;
            InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistFragment.f25457H0;
            InterfaceC7133n<C3297b> interfaceC7133nMo9423y = PlaylistFragment.this.m9984r0().mo9423y();
            do {
                value = interfaceC7133nMo9423y.getValue();
            } while (!interfaceC7133nMo9423y.mo14366c(value, C3297b.m9431a(value, 0L, ((int) f3) * 1000, 11)));
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: b */
        public final void mo9864b() {
            PlaylistFragment.this.m9983q0().m9410d0(5000);
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: c */
        public final void mo9865c(float f3) {
            C3297b value;
            InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistFragment.f25457H0;
            InterfaceC7133n<C3297b> interfaceC7133nMo9423y = PlaylistFragment.this.m9984r0().mo9423y();
            do {
                value = interfaceC7133nMo9423y.getValue();
            } while (!interfaceC7133nMo9423y.mo14366c(value, C3297b.m9431a(value, (long) (1000 * f3), 0, 13)));
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: d */
        public final void mo9866d() {
            PlaylistFragment playlistFragment = PlaylistFragment.this;
            PlayerContentController.PlayerContentItem playerContentItemM9400L = playlistFragment.m9983q0().m9400L();
            int i10 = playerContentItemM9400L != null ? playerContentItemM9400L.f17600a : 0;
            if (playlistFragment.m9984r0().m9995p2(i10)) {
                playlistFragment.m9984r0().m9998s2(i10);
            } else {
                playlistFragment.m9983q0().m9408a0();
            }
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: e */
        public final void mo9867e() {
            PlaylistFragment.this.m9983q0().m9397G0(AbstractC3298c.a.f17752a);
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: f */
        public final void mo9868f() {
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: g */
        public final void mo9869g() {
            PlaylistFragment.this.m9983q0().m9418u0();
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: h */
        public final void mo9870h() {
            PlaylistFragment.this.m9983q0().m9410d0(-5000);
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: i */
        public final void mo9871i() {
            C3300e value;
            AbstractC3299d.c cVar;
            AbstractC3298c.b bVar;
            InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistFragment.f25457H0;
            InterfaceC7133n<C3300e> interfaceC7133nMo9424y0 = PlaylistFragment.this.m9984r0().mo9424y0();
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
            PlaylistFragment.this.m9983q0().m9394D0();
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: k */
        public final void mo9873k() {
            PlaylistFragment playlistFragment = PlaylistFragment.this;
            PlayerContentController.PlayerContentItem playerContentItemM9400L = playlistFragment.m9983q0().m9400L();
            int i10 = 0;
            int i11 = playerContentItemM9400L != null ? playerContentItemM9400L.f17600a : 0;
            if (playlistFragment.m9984r0().m9995p2(i11)) {
                playlistFragment.m9984r0().m9998s2(i11);
                return;
            }
            this.f25466b.f45459l.binding.f44978j.m10491a(new C1597t());
            HomeViewModel homeViewModelM9982p0 = playlistFragment.m9982p0();
            PlayerContentController.PlayerContentItem playerContentItemM9400L2 = playlistFragment.m9983q0().m9400L();
            if (playerContentItemM9400L2 != null) {
                i10 = playerContentItemM9400L2.f17600a;
            }
            homeViewModelM9982p0.f22743S.mo16479j(new HomeViewModel.AbstractC3479a.g(i10, playlistFragment.m9984r0().mo9424y0().getValue().f17757a instanceof AbstractC3299d.c));
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistFragment$b */
    public static final class C3896b implements InterfaceC7781h {
        public C3896b() {
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p278nh.InterfaceC7781h
        /* JADX INFO: renamed from: a */
        public final void mo9874a(RecyclerView.AbstractC1109b0 abstractC1109b0) {
            PlaylistFragment playlistFragment = PlaylistFragment.this;
            C1165p c1165p = playlistFragment.f25458A0;
            if (c1165p == null) {
                C5207g.m11117l("itemTouchHelper");
                throw null;
            }
            c1165p.m4518t(abstractC1109b0);
            playlistFragment.m9984r0().f25625q0.setValue(Boolean.TRUE);
        }
    }

    public PlaylistFragment() {
        super(R.layout.fragment_home_playlist);
        this.f25459B0 = C4924a.m10477o0(this, PlaylistFragment$binding$2.f25468j);
        final InterfaceC2041a<InterfaceC1048n0> interfaceC2041a = new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.playlist.PlaylistFragment$viewModel$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return this.f25565b;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.playlist.PlaylistFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) interfaceC2041a.mo807E();
            }
        });
        this.f25460C0 = C8573r0.m16711Z(this, C5209i.m11118a(PlaylistViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.playlist.PlaylistFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.playlist.PlaylistFragment$special$$inlined$viewModels$default$3
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.playlist.PlaylistFragment$special$$inlined$viewModels$default$4
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
        this.f25461D0 = C8573r0.m16711Z(this, C5209i.m11118a(HomeViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.playlist.PlaylistFragment$special$$inlined$activityViewModels$default$1
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
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.playlist.PlaylistFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                return this.m3576Y().mo792j();
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.playlist.PlaylistFragment$special$$inlined$activityViewModels$default$3
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
    public static void m9980n0(PlaylistFragment playlistFragment, C8379x c8379x) {
        C5207g.m11111f(playlistFragment, "this$0");
        C5207g.m11111f(c8379x, "$this_with");
        C7828f.m15570d(C7499b.m14906H(playlistFragment), null, null, new PlaylistFragment$onViewCreated$1$3$1(playlistFragment, c8379x, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: Q */
    public final void mo3568Q() {
        this.f6090a0 = true;
        if (this.f25463F0) {
            this.f25463F0 = false;
            PlaylistViewModel playlistViewModelM9984r0 = m9984r0();
            C7828f.m15570d(C8573r0.m16767w0(playlistViewModelM9984r0), null, null, new PlaylistViewModel$updateUser$1(playlistViewModelM9984r0, null), 3);
        }
        PlayingFrom value = m9984r0().mo9726R1().getValue();
        PlayingFrom playingFrom = PlayingFrom.Playlist;
        if (value != playingFrom) {
            PlaylistViewModel playlistViewModelM9984r1 = m9984r0();
            playlistViewModelM9984r1.mo9720E(playingFrom);
            PlayerController playerController = playlistViewModelM9984r1.f25583J;
            playerController.m9415p0(true);
            playerController.pause();
            playlistViewModelM9984r1.m9997r2((List) playlistViewModelM9984r1.f25618k0.getValue());
        }
        m9982p0().mo9724L();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        C8379x c8379xM9981o0 = m9981o0();
        final int i10 = 0;
        if (m9981o0().f45452e != null) {
            PlaylistsFragment playlistsFragment = new PlaylistsFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("itemId", -1);
            bundle2.putString("itemURL", "");
            bundle2.putBoolean("isCourse", false);
            bundle2.putBoolean("isRemovePlaylist", false);
            playlistsFragment.m3583e0(bundle2);
            FragmentManager fragmentManagerM3594l = m3594l();
            fragmentManagerM3594l.getClass();
            C0940a c0940a = new C0940a(fragmentManagerM3594l);
            c0940a.m3777g(R.id.fragment_playlists, playlistsFragment, null);
            c0940a.m3697i();
        }
        AppBarLayout appBarLayout = c8379xM9981o0.f45449b;
        C5207g.m11110e(appBarLayout, "appbar");
        C4924a.m10464i(appBarLayout);
        c8379xM9981o0.f45458k.setOnClickListener(new View.OnClickListener(this) { // from class: bj.l

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ PlaylistFragment f9074b;

            {
                this.f9074b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                PlaylistFragment playlistFragment = this.f9074b;
                switch (i11) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistFragment.f25457H0;
                        C5207g.m11111f(playlistFragment, "this$0");
                        C4924a.m10447Z(C8573r0.m16725g0(playlistFragment), C8573r0.m16663B(0, null, false, false, 15));
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = PlaylistFragment.f25457H0;
                        C5207g.m11111f(playlistFragment, "this$0");
                        StateFlowImpl stateFlowImpl = playlistFragment.m9984r0().f25626r0;
                        stateFlowImpl.setValue(Boolean.valueOf(!((Boolean) stateFlowImpl.getValue()).booleanValue()));
                        break;
                }
            }
        });
        TextView textView = c8379xM9981o0.f45456i;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: bj.m

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PlaylistFragment f9076b;

                {
                    this.f9076b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i11 = i10;
                    PlaylistFragment playlistFragment = this.f9076b;
                    switch (i11) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistFragment.f25457H0;
                            C5207g.m11111f(playlistFragment, "this$0");
                            C4924a.m10447Z(C8573r0.m16725g0(playlistFragment), C8573r0.m16663B(0, null, false, false, 15));
                            break;
                        default:
                            InterfaceC6727j<Object>[] interfaceC6727jArr2 = PlaylistFragment.f25457H0;
                            C5207g.m11111f(playlistFragment, "this$0");
                            PlaylistViewModel playlistViewModelM9984r0 = playlistFragment.m9984r0();
                            ArrayList<File> arrayListM13315a = C6714k.m13315a(new File(C0166e.m765k(playlistFragment.m3578a0().getFilesDir().toString(), "/tracks/")));
                            C7138s c7138s = playlistViewModelM9984r0.f25594U;
                            if (arrayListM13315a != null) {
                                List list = (List) playlistViewModelM9984r0.f25618k0.getValue();
                                ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((PlayerContentController.PlayerContentItem) it.next()).f17600a + ".mp3");
                                }
                                HashSet hashSetM13451s0 = C6752c.m13451s0(arrayList);
                                long length = 0;
                                for (File file : arrayListM13315a) {
                                    if (hashSetM13451s0.contains(file.getName())) {
                                        length += file.length();
                                    }
                                }
                                long j10 = 1024;
                                c7138s.mo14371k(Integer.valueOf((int) ((length / j10) / j10)));
                            } else {
                                c7138s.mo14371k(0);
                            }
                            break;
                    }
                }
            });
        }
        int[] iArr = {R.color.indigo_lightest, R.color.yellow_dark, R.color.green};
        SwipeRefreshLayout swipeRefreshLayout = c8379xM9981o0.f45455h;
        swipeRefreshLayout.setColorSchemeResources(iArr);
        swipeRefreshLayout.setOnRefreshListener(new C7946b(this, 16, c8379xM9981o0));
        c8379xM9981o0.f45450c.setOnClickListener(new ViewOnClickListenerC2238x(9, this));
        final int i11 = 1;
        c8379xM9981o0.f45457j.setOnClickListener(new View.OnClickListener(this) { // from class: bj.l

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ PlaylistFragment f9074b;

            {
                this.f9074b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i11;
                PlaylistFragment playlistFragment = this.f9074b;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistFragment.f25457H0;
                        C5207g.m11111f(playlistFragment, "this$0");
                        C4924a.m10447Z(C8573r0.m16725g0(playlistFragment), C8573r0.m16663B(0, null, false, false, 15));
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = PlaylistFragment.f25457H0;
                        C5207g.m11111f(playlistFragment, "this$0");
                        StateFlowImpl stateFlowImpl = playlistFragment.m9984r0().f25626r0;
                        stateFlowImpl.setValue(Boolean.valueOf(!((Boolean) stateFlowImpl.getValue()).booleanValue()));
                        break;
                }
            }
        });
        c8379xM9981o0.f45451d.setOnClickListener(new View.OnClickListener(this) { // from class: bj.m

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ PlaylistFragment f9076b;

            {
                this.f9076b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i11;
                PlaylistFragment playlistFragment = this.f9076b;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistFragment.f25457H0;
                        C5207g.m11111f(playlistFragment, "this$0");
                        C4924a.m10447Z(C8573r0.m16725g0(playlistFragment), C8573r0.m16663B(0, null, false, false, 15));
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = PlaylistFragment.f25457H0;
                        C5207g.m11111f(playlistFragment, "this$0");
                        PlaylistViewModel playlistViewModelM9984r0 = playlistFragment.m9984r0();
                        ArrayList<File> arrayListM13315a = C6714k.m13315a(new File(C0166e.m765k(playlistFragment.m3578a0().getFilesDir().toString(), "/tracks/")));
                        C7138s c7138s = playlistViewModelM9984r0.f25594U;
                        if (arrayListM13315a != null) {
                            List list = (List) playlistViewModelM9984r0.f25618k0.getValue();
                            ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((PlayerContentController.PlayerContentItem) it.next()).f17600a + ".mp3");
                            }
                            HashSet hashSetM13451s0 = C6752c.m13451s0(arrayList);
                            long length = 0;
                            for (File file : arrayListM13315a) {
                                if (hashSetM13451s0.contains(file.getName())) {
                                    length += file.length();
                                }
                            }
                            long j10 = 1024;
                            c7138s.mo14371k(Integer.valueOf((int) ((length / j10) / j10)));
                        } else {
                            c7138s.mo14371k(0);
                        }
                        break;
                }
            }
        });
        PlaylistPlayerView playlistPlayerView = c8379xM9981o0.f45459l;
        playlistPlayerView.m9985a();
        C0980t0 c0980t0M3601v = m3601v();
        c0980t0M3601v.m3813c();
        C1052r c1052r = c0980t0M3601v.f6415d;
        YouTubePlayerView youTubePlayerView = playlistPlayerView.getBinding().f44978j;
        C5207g.m11110e(youTubePlayerView, "viewPlayer.binding.youtubePlayerView");
        c1052r.mo3883a(youTubePlayerView);
        playlistPlayerView.setPlayerControlsListener(new C3895a(c8379xM9981o0));
        this.f25462E0 = new PlaylistAdapter(new C3896b(), new PlaylistAdapter.InterfaceC3891d() { // from class: com.lingq.ui.home.playlist.PlaylistFragment$onViewCreated$1$9
            @Override // com.lingq.p055ui.home.playlist.PlaylistAdapter.InterfaceC3891d
            /* JADX INFO: renamed from: a */
            public final void mo9875a(int i12, int i13) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistFragment.f25457H0;
                PlaylistViewModel playlistViewModelM9984r0 = this.f25478a.m9984r0();
                C7828f.m15570d(C8573r0.m16767w0(playlistViewModelM9984r0), playlistViewModelM9984r0.f25613i, null, new PlaylistViewModel$changePosition$1(playlistViewModelM9984r0, i12, i13, null), 2);
            }

            @Override // com.lingq.p055ui.home.playlist.PlaylistAdapter.InterfaceC3891d
            /* JADX INFO: renamed from: b */
            public final void mo9876b(CoursePlaylistSort coursePlaylistSort) {
            }

            @Override // com.lingq.p055ui.home.playlist.PlaylistAdapter.InterfaceC3891d
            /* JADX INFO: renamed from: c */
            public final void mo9877c() {
                PlaylistFragment playlistFragment = this.f25478a;
                PlayerContentController.PlayerContentItem playerContentItemM9400L = playlistFragment.m9983q0().m9400L();
                int i12 = playerContentItemM9400L != null ? playerContentItemM9400L.f17600a : 0;
                if (playlistFragment.m9984r0().m9995p2(i12)) {
                    playlistFragment.m9984r0().m9998s2(i12);
                } else {
                    playlistFragment.m9983q0().m9408a0();
                }
            }

            @Override // com.lingq.p055ui.home.playlist.PlaylistAdapter.InterfaceC3891d
            /* JADX INFO: renamed from: d */
            public final void mo9878d(int i12) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistFragment.f25457H0;
                this.f25478a.m9984r0().m9996q2(i12, true);
            }

            @Override // com.lingq.p055ui.home.playlist.PlaylistAdapter.InterfaceC3891d
            /* JADX INFO: renamed from: e */
            public final void mo9879e(View view2, final int i12) {
                C5207g.m11111f(view2, "view");
                final PlaylistFragment playlistFragment = this.f25478a;
                new PlaylistCoursePopupMenu(view2, new InterfaceC2052l<PlaylistCoursePopupMenu.PlaylistCourseMenuItem, C9072e>() { // from class: com.lingq.ui.home.playlist.PlaylistFragment$onViewCreated$1$9$onCourseMenuSelected$1

                    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistFragment$onViewCreated$1$9$onCourseMenuSelected$1$a */
                    public /* synthetic */ class C3898a {

                        /* JADX INFO: renamed from: a */
                        public static final /* synthetic */ int[] f25481a;

                        static {
                            int[] iArr = new int[PlaylistCoursePopupMenu.PlaylistCourseMenuItem.values().length];
                            try {
                                iArr[PlaylistCoursePopupMenu.PlaylistCourseMenuItem.RemovePlaylist.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[PlaylistCoursePopupMenu.PlaylistCourseMenuItem.OpenCourse.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            f25481a = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(PlaylistCoursePopupMenu.PlaylistCourseMenuItem playlistCourseMenuItem) {
                        PlaylistCoursePopupMenu.PlaylistCourseMenuItem playlistCourseMenuItem2 = playlistCourseMenuItem;
                        C5207g.m11111f(playlistCourseMenuItem2, "it");
                        int i13 = C3898a.f25481a[playlistCourseMenuItem2.ordinal()];
                        int i14 = i12;
                        PlaylistFragment playlistFragment2 = playlistFragment;
                        if (i13 == 1) {
                            InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistFragment.f25457H0;
                            PlaylistViewModel playlistViewModelM9984r0 = playlistFragment2.m9984r0();
                            playlistViewModelM9984r0.getClass();
                            C7499b.m14933c0(C8573r0.m16767w0(playlistViewModelM9984r0), playlistViewModelM9984r0.f25617k, playlistViewModelM9984r0.f25613i, C0166e.m761g("removeCourseFromPlaylist ", i14), new PlaylistViewModel$removeCourseFromPlaylist$1(playlistViewModelM9984r0, i14, null));
                        } else if (i13 == 2) {
                            C4924a.m10447Z(C8573r0.m16725g0(playlistFragment2), new C6678e(i14, LessonPath.Playlist.f22162a));
                        }
                        return C9072e.f47360a;
                    }
                });
            }

            @Override // com.lingq.p055ui.home.playlist.PlaylistAdapter.InterfaceC3891d
            /* JADX INFO: renamed from: f */
            public final void mo9880f() {
                this.f25478a.m9983q0().m9420w0();
            }

            @Override // com.lingq.p055ui.home.playlist.PlaylistAdapter.InterfaceC3891d
            /* JADX INFO: renamed from: g */
            public final void mo9881g(C6697c c6697c, boolean z10) {
                C5207g.m11111f(c6697c, "playlistLesson");
                InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistFragment.f25457H0;
                PlaylistFragment playlistFragment = this.f25478a;
                PlaylistViewModel playlistViewModelM9984r0 = playlistFragment.m9984r0();
                int i12 = c6697c.f37856a;
                if (playlistViewModelM9984r0.m9995p2(i12)) {
                    playlistFragment.m9984r0().m9998s2(i12);
                    return;
                }
                String str = c6697c.f37869n;
                if ((str == null || C7661i.m15250P2(str)) && !z10 && c6697c.f37870o == null) {
                    PlaylistViewModel playlistViewModelM9984r1 = playlistFragment.m9984r0();
                    if (C5207g.m11106a(playlistViewModelM9984r1.f25580F0.getValue(), Boolean.TRUE)) {
                        playlistViewModelM9984r1.f25631w0.mo14371k(Integer.valueOf(i12));
                    }
                } else {
                    playlistFragment.m9984r0().m9996q2(i12, false);
                }
            }

            @Override // com.lingq.p055ui.home.playlist.PlaylistAdapter.InterfaceC3891d
            /* JADX INFO: renamed from: h */
            public final void mo9882h() {
            }

            @Override // com.lingq.p055ui.home.playlist.PlaylistAdapter.InterfaceC3891d
            /* JADX INFO: renamed from: i */
            public final void mo9883i(View view2, final C6697c c6697c) {
                C5207g.m11111f(view2, "view");
                C5207g.m11111f(c6697c, "lesson");
                InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistFragment.f25457H0;
                final PlaylistFragment playlistFragment = this.f25478a;
                PlaylistViewModel playlistViewModelM9984r0 = playlistFragment.m9984r0();
                int i12 = c6697c.f37856a;
                if (playlistViewModelM9984r0.m9995p2(i12)) {
                    playlistFragment.m9984r0().m9998s2(i12);
                    return;
                }
                boolean z10 = !c6697c.f37873r;
                boolean z11 = c6697c.f37870o == null || c6697c.f37869n != null;
                InterfaceC2052l<PlaylistPopupMenu$PlaylistMenuItem, C9072e> interfaceC2052l = new InterfaceC2052l<PlaylistPopupMenu$PlaylistMenuItem, C9072e>() { // from class: com.lingq.ui.home.playlist.PlaylistFragment$onViewCreated$1$9$onMenuSelected$1

                    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistFragment$onViewCreated$1$9$onMenuSelected$1$a */
                    public /* synthetic */ class C3899a {

                        /* JADX INFO: renamed from: a */
                        public static final /* synthetic */ int[] f25484a;

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
                            f25484a = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(PlaylistPopupMenu$PlaylistMenuItem playlistPopupMenu$PlaylistMenuItem) {
                        int i13;
                        PlaylistPopupMenu$PlaylistMenuItem playlistPopupMenu$PlaylistMenuItem2 = playlistPopupMenu$PlaylistMenuItem;
                        C5207g.m11111f(playlistPopupMenu$PlaylistMenuItem2, "it");
                        int i14 = C3899a.f25484a[playlistPopupMenu$PlaylistMenuItem2.ordinal()];
                        Object obj = null;
                        C6697c c6697c2 = c6697c;
                        PlaylistFragment playlistFragment2 = playlistFragment;
                        if (i14 == 1) {
                            InterfaceC6727j<Object>[] interfaceC6727jArr2 = PlaylistFragment.f25457H0;
                            PlaylistViewModel playlistViewModelM9984r1 = playlistFragment2.m9984r0();
                            String str = c6697c2.f37857b;
                            String str2 = str != null ? str : "";
                            InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(playlistViewModelM9984r1);
                            StringBuilder sb2 = new StringBuilder("removeLessonFromPlaylist ");
                            int i15 = c6697c2.f37856a;
                            sb2.append(i15);
                            C7499b.m14933c0(interfaceC7882zM16767w0, playlistViewModelM9984r1.f25617k, playlistViewModelM9984r1.f25613i, sb2.toString(), new PlaylistViewModel$removeLessonFromPlaylist$1(i15, playlistViewModelM9984r1, str2, null));
                        } else if (i14 == 2) {
                            InterfaceC6727j<Object>[] interfaceC6727jArr3 = PlaylistFragment.f25457H0;
                            playlistFragment2.m9982p0().m9776l2(c6697c2.f37856a, 0, "", LessonPath.Playlist.f22162a);
                        } else if (i14 == 3) {
                            int i16 = c6697c2.f37856a;
                            String str3 = c6697c2.f37861f;
                            String str4 = str3 == null ? "" : str3;
                            String str5 = c6697c2.f37860e;
                            String str6 = str5 == null ? "" : str5;
                            String str7 = c6697c2.f37858c;
                            String str8 = str7 == null ? "" : str7;
                            LessonInfoParent lessonInfoParent = LessonInfoParent.Playlist;
                            String str9 = c6697c2.f37863h;
                            C5207g.m11111f(str9, "title");
                            C5207g.m11111f(lessonInfoParent, "from");
                            C4924a.m10447Z(C8573r0.m16725g0(playlistFragment2), new C6682i(i16, str9, str4, str6, str8, lessonInfoParent));
                        } else if (i14 == 4) {
                            InterfaceC6727j<Object>[] interfaceC6727jArr4 = PlaylistFragment.f25457H0;
                            PlaylistViewModel playlistViewModelM9984r2 = playlistFragment2.m9984r0();
                            C5207g.m11111f(c6697c2, "lesson");
                            playlistViewModelM9984r2.f25633y0.setValue(Boolean.TRUE);
                            Iterator it = ((Iterable) playlistViewModelM9984r2.f25618k0.getValue()).iterator();
                            while (true) {
                                boolean zHasNext = it.hasNext();
                                i13 = c6697c2.f37856a;
                                if (!zHasNext) {
                                    break;
                                }
                                Object next = it.next();
                                if (((PlayerContentController.PlayerContentItem) next).f17600a == i13) {
                                    obj = next;
                                    break;
                                }
                            }
                            PlayerContentController.PlayerContentItem playerContentItem = (PlayerContentController.PlayerContentItem) obj;
                            if (playerContentItem != null) {
                                String str10 = playerContentItem.f17601b;
                                boolean zM15250P2 = C7661i.m15250P2(str10);
                                boolean z12 = playerContentItem.f17606g;
                                if (!zM15250P2 || z12) {
                                    playlistViewModelM9984r2.mo9391A0(i13);
                                    playlistViewModelM9984r2.f25588O.mo9406X0(new DownloadItem(playerContentItem.f17608i, playerContentItem.f17600a, str10, z12), false);
                                } else if (c6697c2.f37870o == null && C5207g.m11106a(playlistViewModelM9984r2.f25580F0.getValue(), Boolean.TRUE)) {
                                    playlistViewModelM9984r2.f25631w0.mo14371k(Integer.valueOf(i13));
                                }
                            }
                        }
                        return C9072e.f47360a;
                    }
                };
                Object systemService = view2.getContext().getSystemService("layout_inflater");
                C5207g.m11109d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.menu_playlist, (ViewGroup) null, false);
                int i13 = R.id.tvDownload;
                LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(viewInflate, R.id.tvDownload);
                if (linearLayout != null) {
                    i13 = R.id.tvLessonInfo;
                    LinearLayout linearLayout2 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.tvLessonInfo);
                    if (linearLayout2 != null) {
                        i13 = R.id.tvOpenLesson;
                        LinearLayout linearLayout3 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.tvOpenLesson);
                        if (linearLayout3 != null) {
                            i13 = R.id.tvRemovePlaylist;
                            LinearLayout linearLayout4 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.tvRemovePlaylist);
                            if (linearLayout4 != null) {
                                PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2, true);
                                if (!z10) {
                                    C4924a.m10442U(linearLayout4);
                                }
                                if (!z11) {
                                    C4924a.m10442U(linearLayout);
                                }
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
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
            }
        });
        m9981o0().f45448a.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        RecyclerView recyclerView = c8379xM9981o0.f45454g;
        recyclerView.setLayoutManager(linearLayoutManager);
        Context contextM3578a0 = m3578a0();
        Object obj = C7472a.f41322a;
        recyclerView.m4199g(new C8043b(C7472a.c.m14849b(contextM3578a0, R.drawable.dr_item_divider), 0));
        PlaylistAdapter playlistAdapter = this.f25462E0;
        if (playlistAdapter == null) {
            C5207g.m11117l("playlistAdapter");
            throw null;
        }
        this.f25458A0 = new C1165p(new C8044c(playlistAdapter, C7499b.m14921S(Integer.valueOf(PlaylistAdapter.PlaylistAdapterItemType.Actions.ordinal())), new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.home.playlist.PlaylistFragment$onViewCreated$1$callback$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C9072e mo807E() {
                InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistFragment.f25457H0;
                this.f25485b.m9984r0().f25625q0.setValue(Boolean.FALSE);
                return C9072e.f47360a;
            }
        }));
        RecyclerView.AbstractC1117j itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f7080f = 0L;
        }
        PlaylistAdapter playlistAdapter2 = this.f25462E0;
        if (playlistAdapter2 == null) {
            C5207g.m11117l("playlistAdapter");
            throw null;
        }
        recyclerView.setAdapter(playlistAdapter2);
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C3897x7e3a1325(this, Lifecycle.State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: o0 */
    public final C8379x m9981o0() {
        return (C8379x) this.f25459B0.m10489a(this, f25457H0[0]);
    }

    /* JADX INFO: renamed from: p0 */
    public final HomeViewModel m9982p0() {
        return (HomeViewModel) this.f25461D0.getValue();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: q0 */
    public final PlayerController m9983q0() {
        PlayerController playerController = this.f25464G0;
        if (playerController != null) {
            return playerController;
        }
        C5207g.m11117l("playerController");
        throw null;
    }

    /* JADX INFO: renamed from: r0 */
    public final PlaylistViewModel m9984r0() {
        return (PlaylistViewModel) this.f25460C0.getValue();
    }
}
