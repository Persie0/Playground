package com.lingq.p055ui.home.playlist;

import ae.C0062b;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.activity.result.C0204c;
import androidx.fragment.app.C0987y;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import bj.AbstractC1580c;
import bj.C1602y;
import bj.ViewOnClickListenerC1581d;
import bj.ViewOnClickListenerC1588k;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lingq.p055ui.home.playlist.PlaylistsFragment;
import com.lingq.p055ui.upgrade.UpgradeReason;
import com.lingq.shared.uimodel.playlist.UserPlaylist;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.internal.C7162l;
import kotlinx.coroutines.scheduling.C7178b;
import mo.C7661i;
import ni.C7793a;
import no.AbstractC7821c1;
import no.C7828f;
import no.C7832g0;
import no.InterfaceC7882z;
import p003a2.C0009a;
import p040c4.C1681f;
import p254m2.C7472a;
import p260m8.C7499b;
import p278nh.C7777d;
import p301oh.C8043b;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import ph.C8384y;
import sl.C9072e;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/playlist/PlaylistsFragment;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class PlaylistsFragment extends AbstractC1580c {

    /* JADX INFO: renamed from: U0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f25858U0 = {C0204c.m857q(PlaylistsFragment.class, "getBinding()Lcom/lingq/databinding/FragmentHomePlaylistsBinding;")};

    /* JADX INFO: renamed from: Q0 */
    public final FragmentViewBindingDelegate f25859Q0 = C4924a.m10477o0(this, PlaylistsFragment$binding$2.f25863j);

    /* JADX INFO: renamed from: R0 */
    public final C1038i0 f25860R0;

    /* JADX INFO: renamed from: S0 */
    public final C1681f f25861S0;

    /* JADX INFO: renamed from: T0 */
    public PlaylistsAdapter f25862T0;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.lingq.ui.home.playlist.PlaylistsFragment$special$$inlined$viewModels$default$1] */
    public PlaylistsFragment() {
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.home.playlist.PlaylistsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.playlist.PlaylistsFragment$special$$inlined$viewModels$default$2
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
        this.f25860R0 = C8573r0.m16711Z(this, C5209i.m11118a(PlaylistsViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.playlist.PlaylistsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.playlist.PlaylistsFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.playlist.PlaylistsFragment$special$$inlined$viewModels$default$5
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
        this.f25861S0 = new C1681f(C5209i.m11118a(C1602y.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.home.playlist.PlaylistsFragment$special$$inlined$navArgs$1
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

    /* JADX INFO: renamed from: u0 */
    public static final PlaylistsViewModel m10003u0(PlaylistsFragment playlistsFragment) {
        return (PlaylistsViewModel) playlistsFragment.f25860R0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C5207g.m11111f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_home_playlists, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.lingq.ui.home.playlist.PlaylistsFragment$onViewCreated$3$2] */
    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        Dialog dialog = this.f6328G0;
        View viewFindViewById = dialog != null ? dialog.findViewById(R.id.design_bottom_sheet) : null;
        if (viewFindViewById != null) {
            BottomSheetBehavior bottomSheetBehaviorM8602w = BottomSheetBehavior.m8602w(viewFindViewById);
            C5207g.m11110e(bottomSheetBehaviorM8602w, "from(it)");
            bottomSheetBehaviorM8602w.m8606D(6);
        }
        C0987y.m3825g(this, "shouldCloseAfterAdding", new InterfaceC2056p<String, Bundle, C9072e>() { // from class: com.lingq.ui.home.playlist.PlaylistsFragment$onViewCreated$2

            /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistsFragment$onViewCreated$2$1 */
            @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistsFragment$onViewCreated$2$1", m19206f = "PlaylistsFragment.kt", m19207l = {70, 71}, m19208m = "invokeSuspend")
            final class C39541 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public int f25871e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ PlaylistsFragment f25872f;

                /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistsFragment$onViewCreated$2$1$1, reason: invalid class name */
                @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistsFragment$onViewCreated$2$1$1", m19206f = "PlaylistsFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
                public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                    /* JADX INFO: renamed from: e */
                    public final /* synthetic */ PlaylistsFragment f25873e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(PlaylistsFragment playlistsFragment, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                        super(2, interfaceC9968c);
                        this.f25873e = playlistsFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: a */
                    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                        return new AnonymousClass1(this.f25873e, interfaceC9968c);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                        return ((AnonymousClass1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) throws Throwable {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        C7499b.m14977z0(obj);
                        C8573r0.m16725g0(this.f25873e).m3995p();
                        return C9072e.f47360a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C39541(PlaylistsFragment playlistsFragment, InterfaceC9968c<? super C39541> interfaceC9968c) {
                    super(2, interfaceC9968c);
                    this.f25872f = playlistsFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: a */
                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                    return new C39541(this.f25872f, interfaceC9968c);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    return ((C39541) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                }

                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f25871e;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            C7499b.m14977z0(obj);
                        } else {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C7499b.m14977z0(obj);
                        }
                        return C9072e.f47360a;
                    }
                    C7499b.m14977z0(obj);
                    this.f25871e = 1;
                    if (C7828f.m15567a(100L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    C7178b c7178b = C7832g0.f42930a;
                    AbstractC7821c1 abstractC7821c1 = C7162l.f40438a;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f25872f, null);
                    this.f25871e = 2;
                    if (C7828f.m15574h(this, abstractC7821c1, anonymousClass1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return C9072e.f47360a;
                }
            }

            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(String str, Bundle bundle2) {
                Bundle bundle3 = bundle2;
                C5207g.m11111f(str, "requestKey");
                C5207g.m11111f(bundle3, "result");
                if (bundle3.getBoolean("value")) {
                    PlaylistsFragment playlistsFragment = this.f25870b;
                    C7828f.m15570d(C7499b.m14906H(playlistsFragment), null, null, new C39541(playlistsFragment, null), 3);
                }
                return C9072e.f47360a;
            }
        });
        C8384y c8384y = (C8384y) this.f25859Q0.m10489a(this, f25858U0[0]);
        c8384y.f45470a.setOnTouchListener(new View.OnTouchListener() { // from class: bj.x
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistsFragment.f25858U0;
                view2.getParent().requestDisallowInterceptTouchEvent(true);
                view2.onTouchEvent(motionEvent);
                return true;
            }
        });
        Context contextM3578a0 = m3578a0();
        Object obj = C7472a.f41322a;
        C8043b c8043b = new C8043b(C7472a.c.m14849b(contextM3578a0, R.drawable.dr_item_divider), 0);
        RecyclerView recyclerView = c8384y.f45470a;
        recyclerView.m4199g(c8043b);
        this.f25862T0 = new PlaylistsAdapter(m10004v0().f9090d, new PlaylistsAdapter.InterfaceC3950b() { // from class: com.lingq.ui.home.playlist.PlaylistsFragment$onViewCreated$3$2
            @Override // com.lingq.p055ui.home.playlist.PlaylistsAdapter.InterfaceC3950b
            /* JADX INFO: renamed from: a */
            public final void mo10000a(UserPlaylist userPlaylist) {
                C5207g.m11111f(userPlaylist, "userPlaylist");
                InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistsFragment.f25858U0;
                PlaylistsFragment playlistsFragment = this.f25874a;
                boolean z10 = playlistsFragment.m10004v0().f9090d;
                C1038i0 c1038i0 = playlistsFragment.f25860R0;
                if (z10) {
                    PlaylistsViewModel playlistsViewModel = (PlaylistsViewModel) c1038i0.getValue();
                    String str = playlistsFragment.m10004v0().f9088b;
                    int i10 = playlistsFragment.m10004v0().f9087a;
                    int i11 = userPlaylist.f22080d;
                    C5207g.m11111f(str, "lessonURL");
                    C7828f.m15570d(C8573r0.m16767w0(playlistsViewModel), null, null, new PlaylistsViewModel$removeLessonFromPlaylist$1(playlistsViewModel, str, i10, i11, null), 3);
                } else if (C7661i.m15250P2(playlistsFragment.m10004v0().f9088b)) {
                    ((PlaylistsViewModel) c1038i0.getValue()).mo5248F1(userPlaylist);
                } else {
                    boolean z11 = playlistsFragment.m10004v0().f9089c;
                    String str2 = userPlaylist.f22077a;
                    if (z11) {
                        PlaylistsViewModel playlistsViewModel2 = (PlaylistsViewModel) c1038i0.getValue();
                        int i12 = userPlaylist.f22080d;
                        String str3 = playlistsFragment.m10004v0().f9088b;
                        int i13 = playlistsFragment.m10004v0().f9087a;
                        C5207g.m11111f(str2, "nameWithLanguage");
                        C5207g.m11111f(str3, "courseURL");
                        C7828f.m15570d(C8573r0.m16767w0(playlistsViewModel2), null, null, new PlaylistsViewModel$addCourseToPlaylist$1(playlistsViewModel2, str2, i12, str3, i13, null), 3);
                    } else {
                        PlaylistsViewModel playlistsViewModel3 = (PlaylistsViewModel) c1038i0.getValue();
                        int i14 = userPlaylist.f22080d;
                        String str4 = playlistsFragment.m10004v0().f9088b;
                        int i15 = playlistsFragment.m10004v0().f9087a;
                        C5207g.m11111f(str2, "nameWithLanguage");
                        C5207g.m11111f(str4, "lessonURL");
                        C7828f.m15570d(C8573r0.m16767w0(playlistsViewModel3), null, null, new PlaylistsViewModel$addToPlaylist$1(playlistsViewModel3, str2, i14, str4, i15, null), 3);
                    }
                }
                if (C7777d.m15480a(playlistsFragment)) {
                    return;
                }
                C8573r0.m16725g0(playlistsFragment).m3995p();
            }

            @Override // com.lingq.p055ui.home.playlist.PlaylistsAdapter.InterfaceC3950b
            /* JADX INFO: renamed from: b */
            public final void mo10001b() {
                PlaylistsFragment playlistsFragment = this.f25874a;
                if (PlaylistsFragment.m10003u0(playlistsFragment).mo502f0()) {
                    C4924a.m10447Z(C8573r0.m16725g0(playlistsFragment), C8573r0.m16772z(null, playlistsFragment.m10004v0().f9087a, playlistsFragment.m10004v0().f9088b, 3));
                } else {
                    C8573r0.m16725g0(playlistsFragment).m3995p();
                    ((PlaylistsViewModel) playlistsFragment.f25860R0.getValue()).mo9771A(UpgradeReason.PLAYLISTS);
                }
            }

            @Override // com.lingq.p055ui.home.playlist.PlaylistsAdapter.InterfaceC3950b
            /* JADX INFO: renamed from: c */
            public final void mo10002c(View view2, final UserPlaylist userPlaylist) {
                C5207g.m11111f(view2, "view");
                C5207g.m11111f(userPlaylist, "userPlaylist");
                final PlaylistsFragment playlistsFragment = this.f25874a;
                InterfaceC2052l<PlaylistsMenuItem, C9072e> interfaceC2052l = new InterfaceC2052l<PlaylistsMenuItem, C9072e>() { // from class: com.lingq.ui.home.playlist.PlaylistsFragment$onViewCreated$3$2$onPlaylistMenuClicked$1

                    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistsFragment$onViewCreated$3$2$onPlaylistMenuClicked$1$a */
                    public /* synthetic */ class C3955a {

                        /* JADX INFO: renamed from: a */
                        public static final /* synthetic */ int[] f25877a;

                        static {
                            int[] iArr = new int[PlaylistsMenuItem.values().length];
                            try {
                                iArr[PlaylistsMenuItem.EditPlaylist.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[PlaylistsMenuItem.DeletePlaylist.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            f25877a = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(PlaylistsMenuItem playlistsMenuItem) {
                        PlaylistsMenuItem playlistsMenuItem2 = playlistsMenuItem;
                        C5207g.m11111f(playlistsMenuItem2, "item");
                        int i10 = C3955a.f25877a[playlistsMenuItem2.ordinal()];
                        PlaylistsFragment playlistsFragment2 = playlistsFragment;
                        UserPlaylist userPlaylist2 = userPlaylist;
                        if (i10 == 1) {
                            C4924a.m10447Z(C8573r0.m16725g0(playlistsFragment2), C8573r0.m16772z(userPlaylist2.f22079c, 0, null, 12));
                        } else if (i10 == 2) {
                            PlaylistsViewModel playlistsViewModelM10003u0 = PlaylistsFragment.m10003u0(playlistsFragment2);
                            String str = userPlaylist2.f22078b;
                            int i11 = userPlaylist2.f22080d;
                            C5207g.m11111f(str, "language");
                            String str2 = userPlaylist2.f22079c;
                            C5207g.m11111f(str2, "name");
                            C7828f.m15570d(C8573r0.m16767w0(playlistsViewModelM10003u0), null, null, new PlaylistsViewModel$deletePlaylist$1(playlistsViewModelM10003u0, str, str2, i11, null), 3);
                            ((PlaylistsViewModel) playlistsFragment2.f25860R0.getValue()).f25895f.mo5250M(userPlaylist2);
                        }
                        return C9072e.f47360a;
                    }
                };
                Object systemService = view2.getContext().getSystemService("layout_inflater");
                C5207g.m11109d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.menu_playlists, (ViewGroup) null, false);
                int i10 = R.id.btnDelete;
                LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(viewInflate, R.id.btnDelete);
                if (linearLayout != null) {
                    i10 = R.id.btnEdit;
                    LinearLayout linearLayout2 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.btnEdit);
                    if (linearLayout2 != null) {
                        PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2, true);
                        linearLayout2.setOnClickListener(new ViewOnClickListenerC1588k(popupWindow, interfaceC2052l, 2));
                        linearLayout.setOnClickListener(new ViewOnClickListenerC1581d(popupWindow, interfaceC2052l, 2));
                        C7793a.m15503g(popupWindow);
                        popupWindow.showAsDropDown(view2);
                        return;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
            }
        });
        m3578a0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        PlaylistsAdapter playlistsAdapter = this.f25862T0;
        if (playlistsAdapter == null) {
            C5207g.m11117l("playlistsAdapter");
            throw null;
        }
        recyclerView.setAdapter(playlistsAdapter);
        RecyclerView.AbstractC1117j itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f7080f = 0L;
        }
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C3953x88531734(this, Lifecycle.State.STARTED, null, this), 3);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: o0 */
    public final int mo3768o0() {
        return R.style.AppTheme_BottomSheetDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v0 */
    public final C1602y m10004v0() {
        return (C1602y) this.f25861S0.getValue();
    }
}
