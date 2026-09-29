package com.lingq.p055ui.home.playlist;

import ae.C0062b;
import android.support.v4.media.session.C0166e;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import bj.C1592o;
import bj.C1600w;
import bj.InterfaceC1598u;
import ci.InterfaceC2010c;
import ci.InterfaceC2014g;
import ci.InterfaceC2019l;
import ci.InterfaceC2024q;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.AbstractC4267a;
import com.lingq.p055ui.upgrade.UpgradeReason;
import com.lingq.player.C3296a;
import com.lingq.player.C3297b;
import com.lingq.player.C3300e;
import com.lingq.player.InterfaceC3301f;
import com.lingq.player.PlayerContentController;
import com.lingq.player.PlayerController;
import com.lingq.player.PlayingFrom;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.download.AbstractC3312a;
import com.lingq.shared.download.DownloadItem;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$23;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.shared.uimodel.playlist.UserPlaylist;
import com.lingq.util.C4924a;
import com.lingq.util.CoroutineJobManager;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import ki.C6696b;
import ki.C6697c;
import ki.C6698d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7133n;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import mo.C7661i;
import ni.C7793a;
import no.C7828f;
import no.InterfaceC7882z;
import p003a2.C0009a;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5179a;
import p076di.InterfaceC5180b;
import p076di.InterfaceC5182d;
import p205jk.InterfaceC6515k;
import p225kk.C6704a;
import p225kk.C6715l;
import p260m8.C7499b;
import p338qd.C8573r0;
import p416uh.InterfaceC9527a;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sh.C9015k;
import sh.InterfaceC9013i;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b¨\u0006\t"}, m13365d2 = {"Lcom/lingq/ui/home/playlist/PlaylistViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "Lcom/lingq/player/f;", "Lsh/i;", "Luh/a;", "Lbj/u;", "Ljk/k;", "", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class PlaylistViewModel extends AbstractC1036h0 implements InterfaceC0113j, InterfaceC3301f, InterfaceC9013i, InterfaceC9527a, InterfaceC1598u, InterfaceC6515k {

    /* JADX INFO: renamed from: A0 */
    public final C7134o f25575A0;

    /* JADX INFO: renamed from: B0 */
    public final C7138s f25576B0;

    /* JADX INFO: renamed from: C0 */
    public final C7134o f25577C0;

    /* JADX INFO: renamed from: D0 */
    public final C7138s f25578D0;

    /* JADX INFO: renamed from: E0 */
    public final C7134o f25579E0;

    /* JADX INFO: renamed from: F0 */
    public final StateFlowImpl f25580F0;

    /* JADX INFO: renamed from: H */
    public final InterfaceC5182d f25581H;

    /* JADX INFO: renamed from: I */
    public final InterfaceC5180b f25582I;

    /* JADX INFO: renamed from: J */
    public final PlayerController f25583J;

    /* JADX INFO: renamed from: K */
    public final C6704a f25584K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ InterfaceC0113j f25585L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ InterfaceC3301f f25586M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ InterfaceC9013i f25587N;

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ InterfaceC9527a f25588O;

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ InterfaceC1598u f25589P;

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ InterfaceC6515k f25590Q;

    /* JADX INFO: renamed from: R */
    public final C1592o f25591R;

    /* JADX INFO: renamed from: S */
    public final StateFlowImpl f25592S;

    /* JADX INFO: renamed from: T */
    public final StateFlowImpl f25593T;

    /* JADX INFO: renamed from: U */
    public final C7138s f25594U;

    /* JADX INFO: renamed from: V */
    public final C7138s f25595V;

    /* JADX INFO: renamed from: W */
    public final C7138s f25596W;

    /* JADX INFO: renamed from: X */
    public final C7138s f25597X;

    /* JADX INFO: renamed from: Y */
    public final C7138s f25598Y;

    /* JADX INFO: renamed from: Z */
    public final C7134o f25599Z;

    /* JADX INFO: renamed from: a0 */
    public final LinkedHashMap f25600a0;

    /* JADX INFO: renamed from: b0 */
    public final StateFlowImpl f25601b0;

    /* JADX INFO: renamed from: c0 */
    public final LinkedHashMap f25602c0;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2019l f25603d;

    /* JADX INFO: renamed from: d0 */
    public final StateFlowImpl f25604d0;

    /* JADX INFO: renamed from: e */
    public final InterfaceC3324a f25605e;

    /* JADX INFO: renamed from: e0 */
    public final StateFlowImpl f25606e0;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2010c f25607f;

    /* JADX INFO: renamed from: f0 */
    public final C7138s f25608f0;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2014g f25609g;

    /* JADX INFO: renamed from: g0 */
    public final StateFlowImpl f25610g0;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2024q f25611h;

    /* JADX INFO: renamed from: h0 */
    public final C7135p f25612h0;

    /* JADX INFO: renamed from: i */
    public final CoroutineDispatcher f25613i;

    /* JADX INFO: renamed from: i0 */
    public final StateFlowImpl f25614i0;

    /* JADX INFO: renamed from: j */
    public final CoroutineDispatcher f25615j;

    /* JADX INFO: renamed from: j0 */
    public final C7135p f25616j0;

    /* JADX INFO: renamed from: k */
    public final CoroutineJobManager f25617k;

    /* JADX INFO: renamed from: k0 */
    public final C7135p f25618k0;

    /* JADX INFO: renamed from: l */
    public final InterfaceC5179a f25619l;

    /* JADX INFO: renamed from: l0 */
    public final StateFlowImpl f25620l0;

    /* JADX INFO: renamed from: m0 */
    public final C7135p f25621m0;

    /* JADX INFO: renamed from: n0 */
    public final StateFlowImpl f25622n0;

    /* JADX INFO: renamed from: o0 */
    public final StateFlowImpl f25623o0;

    /* JADX INFO: renamed from: p0 */
    public final StateFlowImpl f25624p0;

    /* JADX INFO: renamed from: q0 */
    public final StateFlowImpl f25625q0;

    /* JADX INFO: renamed from: r0 */
    public final StateFlowImpl f25626r0;

    /* JADX INFO: renamed from: s0 */
    public final C7135p f25627s0;

    /* JADX INFO: renamed from: t0 */
    public final C7135p f25628t0;

    /* JADX INFO: renamed from: u0 */
    public final StateFlowImpl f25629u0;

    /* JADX INFO: renamed from: v0 */
    public final C7135p f25630v0;

    /* JADX INFO: renamed from: w0 */
    public final C7138s f25631w0;

    /* JADX INFO: renamed from: x0 */
    public final C7134o f25632x0;

    /* JADX INFO: renamed from: y0 */
    public final StateFlowImpl f25633y0;

    /* JADX INFO: renamed from: z0 */
    public final C7138s f25634z0;

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$1", m19206f = "PlaylistViewModel.kt", m19207l = {255}, m19208m = "invokeSuspend")
    final class C39201 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f25635e;

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguage;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$1$1", m19206f = "PlaylistViewModel.kt", m19207l = {257}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<UserLanguage, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f25637e;

            /* JADX INFO: renamed from: f */
            public /* synthetic */ Object f25638f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ PlaylistViewModel f25639g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f25639g = playlistViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f25639g, interfaceC9968c);
                anonymousClass1.f25638f = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(UserLanguage userLanguage, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(userLanguage, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f25637e;
                PlaylistViewModel playlistViewModel = this.f25639g;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    UserLanguage userLanguage = (UserLanguage) this.f25638f;
                    if (!C7661i.m15250P2(playlistViewModel.f25591R.f9078a)) {
                        String str = userLanguage != null ? userLanguage.f21726a : null;
                        C1592o c1592o = playlistViewModel.f25591R;
                        if (!C5207g.m11106a(str, c1592o.f9078a)) {
                            String str2 = c1592o.f9078a;
                            this.f25637e = 1;
                            if (playlistViewModel.mo501d(str2, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return C9072e.f47360a;
                    }
                    playlistViewModel.m9993n2();
                    InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(playlistViewModel);
                    PlaylistViewModel$getLessonDownloadsObservable$1 playlistViewModel$getLessonDownloadsObservable$1 = new PlaylistViewModel$getLessonDownloadsObservable$1(playlistViewModel, null);
                    CoroutineJobManager coroutineJobManager = playlistViewModel.f25617k;
                    C7499b.m14935d0(interfaceC7882zM16767w0, coroutineJobManager, "lessonDownloadsObservable", playlistViewModel$getLessonDownloadsObservable$1);
                    InterfaceC7882z interfaceC7882zM16767w1 = C8573r0.m16767w0(playlistViewModel);
                    PlaylistViewModel$getPlaylists$1 playlistViewModel$getPlaylists$1 = new PlaylistViewModel$getPlaylists$1(playlistViewModel, null);
                    CoroutineDispatcher coroutineDispatcher = playlistViewModel.f25613i;
                    C7499b.m14933c0(interfaceC7882zM16767w1, coroutineJobManager, coroutineDispatcher, "playlists", playlistViewModel$getPlaylists$1);
                    C7499b.m14933c0(C8573r0.m16767w0(playlistViewModel), coroutineJobManager, coroutineDispatcher, "updatePlaylists", new PlaylistViewModel$updatePlaylists$1(playlistViewModel, null));
                    C7828f.m15570d(C8573r0.m16767w0(playlistViewModel), null, null, new PlaylistViewModel$checkHasTTS$1(playlistViewModel, null), 3);
                    return C9072e.f47360a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
                playlistViewModel.f25629u0.setValue(Resource.Status.LOADING);
                return C9072e.f47360a;
            }
        }

        public C39201(InterfaceC9968c<? super C39201> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return PlaylistViewModel.this.new C39201(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39201) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f25635e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                PlaylistViewModel playlistViewModel = PlaylistViewModel.this;
                InterfaceC7142w<UserLanguage> interfaceC7142wMo509w0 = playlistViewModel.mo509w0();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playlistViewModel, null);
                this.f25635e = 1;
                if (C0062b.m369m0(interfaceC7142wMo509w0, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$10 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$10", m19206f = "PlaylistViewModel.kt", m19207l = {327}, m19208m = "invokeSuspend")
    final class C392110 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f25640e;

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$10$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lki/b;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$10$1", m19206f = "PlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends C6696b>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ PlaylistViewModel f25642e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f25642e = playlistViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f25642e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends C6696b> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                PlaylistViewModel playlistViewModel = this.f25642e;
                if (!((Boolean) playlistViewModel.f25625q0.getValue()).booleanValue()) {
                    playlistViewModel.f25614i0.setValue(PlaylistViewModel.m9992m2(playlistViewModel));
                }
                return C9072e.f47360a;
            }
        }

        public C392110(InterfaceC9968c<? super C392110> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return PlaylistViewModel.this.new C392110(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C392110) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f25640e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                PlaylistViewModel playlistViewModel = PlaylistViewModel.this;
                StateFlowImpl stateFlowImpl = playlistViewModel.f25601b0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playlistViewModel, null);
                this.f25640e = 1;
                if (C0062b.m369m0(stateFlowImpl, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$11 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$11", m19206f = "PlaylistViewModel.kt", m19207l = {335}, m19208m = "invokeSuspend")
    final class C392211 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f25643e;

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$11$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/library/LibraryItemCounter;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$11$1", m19206f = "PlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends LibraryItemCounter>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ PlaylistViewModel f25645e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f25645e = playlistViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f25645e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends LibraryItemCounter> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                PlaylistViewModel playlistViewModel = this.f25645e;
                if (!((Boolean) playlistViewModel.f25625q0.getValue()).booleanValue()) {
                    playlistViewModel.f25614i0.setValue(PlaylistViewModel.m9992m2(playlistViewModel));
                }
                return C9072e.f47360a;
            }
        }

        public C392211(InterfaceC9968c<? super C392211> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return PlaylistViewModel.this.new C392211(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C392211) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f25643e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                PlaylistViewModel playlistViewModel = PlaylistViewModel.this;
                StateFlowImpl stateFlowImpl = playlistViewModel.f25606e0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playlistViewModel, null);
                this.f25643e = 1;
                if (C0062b.m369m0(stateFlowImpl, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$12 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$12", m19206f = "PlaylistViewModel.kt", m19207l = {343}, m19208m = "invokeSuspend")
    final class C392312 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f25646e;

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$12$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$12$1", m19206f = "PlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Pair<? extends String, ? extends String>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f25648e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ PlaylistViewModel f25649f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f25649f = playlistViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f25649f, interfaceC9968c);
                anonymousClass1.f25648e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Pair<? extends String, ? extends String> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                Pair pair = (Pair) this.f25648e;
                String str = (String) pair.f38012a;
                String str2 = (String) pair.f38013b;
                PlaylistViewModel playlistViewModel = this.f25649f;
                playlistViewModel.getClass();
                C5207g.m11111f(str, "oldName");
                C5207g.m11111f(str2, "newName");
                UserPlaylist userPlaylist = (UserPlaylist) playlistViewModel.f25620l0.getValue();
                if (userPlaylist != null && C5207g.m11106a(userPlaylist.f22079c, str)) {
                    C7828f.m15570d(C8573r0.m16767w0(playlistViewModel), null, null, new PlaylistViewModel$onPlaylistEdited$1$1(playlistViewModel, new UserPlaylist(C7793a.m15498b(str2, userPlaylist.f22078b), userPlaylist.f22078b, str2, userPlaylist.f22080d, userPlaylist.f22081e, userPlaylist.f22082f), null), 3);
                }
                return C9072e.f47360a;
            }
        }

        public C392312(InterfaceC9968c<? super C392312> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return PlaylistViewModel.this.new C392312(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C392312) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f25646e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                PlaylistViewModel playlistViewModel = PlaylistViewModel.this;
                InterfaceC7137r<Pair<String, String>> interfaceC7137rMo5253v = playlistViewModel.mo5253v();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playlistViewModel, null);
                this.f25646e = 1;
                if (C0062b.m369m0(interfaceC7137rMo5253v, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$13 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$13", m19206f = "PlaylistViewModel.kt", m19207l = {349}, m19208m = "invokeSuspend")
    final class C392413 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f25650e;

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$13$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/playlist/UserPlaylist;", "playlist", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$13$1", m19206f = "PlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<UserPlaylist, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f25652e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ PlaylistViewModel f25653f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f25653f = playlistViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f25653f, interfaceC9968c);
                anonymousClass1.f25652e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(UserPlaylist userPlaylist, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(userPlaylist, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                UserPlaylist userPlaylist = (UserPlaylist) this.f25652e;
                PlaylistViewModel playlistViewModel = this.f25653f;
                playlistViewModel.getClass();
                C5207g.m11111f(userPlaylist, "playlist");
                playlistViewModel.m9993n2();
                playlistViewModel.mo9401L1(EmptyList.f38032a);
                C7828f.m15570d(C8573r0.m16767w0(playlistViewModel), null, null, new PlaylistViewModel$onPlaylistSelected$1(playlistViewModel, userPlaylist, null), 3);
                return C9072e.f47360a;
            }
        }

        public C392413(InterfaceC9968c<? super C392413> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return PlaylistViewModel.this.new C392413(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C392413) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f25650e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                PlaylistViewModel playlistViewModel = PlaylistViewModel.this;
                InterfaceC7137r<UserPlaylist> interfaceC7137rMo5251d1 = playlistViewModel.mo5251d1();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playlistViewModel, null);
                this.f25650e = 1;
                if (C0062b.m369m0(interfaceC7137rMo5251d1, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$14 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$14", m19206f = "PlaylistViewModel.kt", m19207l = {355}, m19208m = "invokeSuspend")
    final class C392514 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f25654e;

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$14$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/playlist/UserPlaylist;", "playlist", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$14$1", m19206f = "PlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<UserPlaylist, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f25656e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ PlaylistViewModel f25657f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f25657f = playlistViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f25657f, interfaceC9968c);
                anonymousClass1.f25656e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(UserPlaylist userPlaylist, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(userPlaylist, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                UserPlaylist userPlaylist = (UserPlaylist) this.f25656e;
                PlaylistViewModel playlistViewModel = this.f25657f;
                playlistViewModel.getClass();
                C5207g.m11111f(userPlaylist, "playlist");
                UserPlaylist userPlaylist2 = (UserPlaylist) playlistViewModel.f25620l0.getValue();
                if (userPlaylist2 != null && C5207g.m11106a(userPlaylist2.f22079c, userPlaylist.f22079c)) {
                    playlistViewModel.m9993n2();
                    playlistViewModel.f25583J.m9415p0(false);
                    C7828f.m15570d(C8573r0.m16767w0(playlistViewModel), playlistViewModel.f25613i, null, new PlaylistViewModel$getDefaultPlaylist$1(playlistViewModel, null), 2);
                }
                return C9072e.f47360a;
            }
        }

        public C392514(InterfaceC9968c<? super C392514> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return PlaylistViewModel.this.new C392514(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C392514) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f25654e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                PlaylistViewModel playlistViewModel = PlaylistViewModel.this;
                InterfaceC7137r<UserPlaylist> interfaceC7137rMo5249J1 = playlistViewModel.mo5249J1();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playlistViewModel, null);
                this.f25654e = 1;
                if (C0062b.m369m0(interfaceC7137rMo5249J1, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$15 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$15", m19206f = "PlaylistViewModel.kt", m19207l = {361}, m19208m = "invokeSuspend")
    final class C392615 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f25658e;

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$15$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$15$1", m19206f = "PlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ PlaylistViewModel f25660e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f25660e = playlistViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f25660e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                PlaylistViewModel playlistViewModel = this.f25660e;
                if (!((Boolean) playlistViewModel.f25625q0.getValue()).booleanValue()) {
                    playlistViewModel.f25614i0.setValue(PlaylistViewModel.m9992m2(playlistViewModel));
                }
                return C9072e.f47360a;
            }
        }

        public C392615(InterfaceC9968c<? super C392615> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return PlaylistViewModel.this.new C392615(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C392615) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f25658e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                PlaylistViewModel playlistViewModel = PlaylistViewModel.this;
                StateFlowImpl stateFlowImpl = playlistViewModel.f25623o0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playlistViewModel, null);
                this.f25658e = 1;
                if (C0062b.m369m0(stateFlowImpl, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$16 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$16", m19206f = "PlaylistViewModel.kt", m19207l = {369}, m19208m = "invokeSuspend")
    final class C392716 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f25661e;

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$16$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$16$1", m19206f = "PlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ boolean f25663e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ PlaylistViewModel f25664f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f25664f = playlistViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f25664f, interfaceC9968c);
                anonymousClass1.f25663e = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f25664f.f25610g0.setValue(Boolean.valueOf(this.f25663e));
                return C9072e.f47360a;
            }
        }

        public C392716(InterfaceC9968c<? super C392716> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return PlaylistViewModel.this.new C392716(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C392716) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f25661e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                PlaylistViewModel playlistViewModel = PlaylistViewModel.this;
                PreferenceStoreImpl$special$$inlined$map$23 preferenceStoreImpl$special$$inlined$map$23Mo9578Y = playlistViewModel.f25619l.mo9578Y();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playlistViewModel, null);
                this.f25661e = 1;
                if (C0062b.m369m0(preferenceStoreImpl$special$$inlined$map$23Mo9578Y, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$2", m19206f = "PlaylistViewModel.kt", m19207l = {270}, m19208m = "invokeSuspend")
    final class C39282 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f25665e;

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$2$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/ui/home/playlist/PlaylistAdapter$c$e;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$2$1", m19206f = "PlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends PlaylistAdapter.AbstractC3890c.e>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ PlaylistViewModel f25667e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f25667e = playlistViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f25667e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends PlaylistAdapter.AbstractC3890c.e> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                PlaylistViewModel playlistViewModel = this.f25667e;
                playlistViewModel.f25614i0.setValue(PlaylistViewModel.m9992m2(playlistViewModel));
                return C9072e.f47360a;
            }
        }

        public C39282(InterfaceC9968c<? super C39282> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return PlaylistViewModel.this.new C39282(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39282) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f25665e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                PlaylistViewModel playlistViewModel = PlaylistViewModel.this;
                C7135p c7135p = playlistViewModel.f25630v0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playlistViewModel, null);
                this.f25665e = 1;
                if (C0062b.m369m0(c7135p, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$3 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$3", m19206f = "PlaylistViewModel.kt", m19207l = {276}, m19208m = "invokeSuspend")
    final class C39293 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f25668e;

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$3$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lki/c;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$3$1", m19206f = "PlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends C6697c>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f25670e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ PlaylistViewModel f25671f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f25671f = playlistViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f25671f, interfaceC9968c);
                anonymousClass1.f25670e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends C6697c> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                List list = (List) this.f25670e;
                PlaylistViewModel playlistViewModel = this.f25671f;
                if (!((Boolean) playlistViewModel.f25625q0.getValue()).booleanValue()) {
                    playlistViewModel.f25614i0.setValue(PlaylistViewModel.m9992m2(playlistViewModel));
                }
                ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C0009a.m30s(((C6697c) it.next()).f37856a, arrayList);
                }
                C7828f.m15570d(C8573r0.m16767w0(playlistViewModel), null, null, new PlaylistViewModel$getLessonCounters$1(playlistViewModel, arrayList, null), 3);
                C7828f.m15570d(C8573r0.m16767w0(playlistViewModel), playlistViewModel.f25613i, null, new PlaylistViewModel$fetchLessonCounters$1(playlistViewModel, arrayList, null), 2);
                return C9072e.f47360a;
            }
        }

        public C39293(InterfaceC9968c<? super C39293> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return PlaylistViewModel.this.new C39293(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39293) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f25668e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                PlaylistViewModel playlistViewModel = PlaylistViewModel.this;
                C7135p c7135p = playlistViewModel.f25612h0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playlistViewModel, null);
                this.f25668e = 1;
                if (C0062b.m369m0(c7135p, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$4 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$4", m19206f = "PlaylistViewModel.kt", m19207l = {285}, m19208m = "invokeSuspend")
    final class C39304 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f25672e;

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$4$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lki/d;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$4$1", m19206f = "PlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends C6698d>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ PlaylistViewModel f25674e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f25674e = playlistViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f25674e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends C6698d> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                PlaylistViewModel playlistViewModel = this.f25674e;
                if (!((Boolean) playlistViewModel.f25625q0.getValue()).booleanValue()) {
                    playlistViewModel.f25614i0.setValue(PlaylistViewModel.m9992m2(playlistViewModel));
                }
                return C9072e.f47360a;
            }
        }

        public C39304(InterfaceC9968c<? super C39304> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return PlaylistViewModel.this.new C39304(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39304) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f25672e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                PlaylistViewModel playlistViewModel = PlaylistViewModel.this;
                StateFlowImpl stateFlowImpl = playlistViewModel.f25592S;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playlistViewModel, null);
                this.f25672e = 1;
                if (C0062b.m369m0(stateFlowImpl, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$5 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$5", m19206f = "PlaylistViewModel.kt", m19207l = {293}, m19208m = "invokeSuspend")
    final class C39315 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f25675e;

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$5$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$5$1", m19206f = "PlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ PlaylistViewModel f25677e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f25677e = playlistViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f25677e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                PlaylistViewModel playlistViewModel = this.f25677e;
                playlistViewModel.f25614i0.setValue(PlaylistViewModel.m9992m2(playlistViewModel));
                return C9072e.f47360a;
            }
        }

        public C39315(InterfaceC9968c<? super C39315> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return PlaylistViewModel.this.new C39315(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39315) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f25675e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                PlaylistViewModel playlistViewModel = PlaylistViewModel.this;
                StateFlowImpl stateFlowImpl = playlistViewModel.f25626r0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playlistViewModel, null);
                this.f25675e = 1;
                if (C0062b.m369m0(stateFlowImpl, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$6 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$6", m19206f = "PlaylistViewModel.kt", m19207l = {299}, m19208m = "invokeSuspend")
    final class C39326 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f25678e;

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$6$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$6$1", m19206f = "PlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ PlaylistViewModel f25680e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f25680e = playlistViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f25680e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                PlaylistViewModel playlistViewModel = this.f25680e;
                playlistViewModel.f25614i0.setValue(PlaylistViewModel.m9992m2(playlistViewModel));
                return C9072e.f47360a;
            }
        }

        public C39326(InterfaceC9968c<? super C39326> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return PlaylistViewModel.this.new C39326(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39326) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f25678e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                PlaylistViewModel playlistViewModel = PlaylistViewModel.this;
                StateFlowImpl stateFlowImpl = playlistViewModel.f25622n0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playlistViewModel, null);
                this.f25678e = 1;
                if (C0062b.m369m0(stateFlowImpl, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$7 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$7", m19206f = "PlaylistViewModel.kt", m19207l = {305}, m19208m = "invokeSuspend")
    final class C39337 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f25681e;

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$7$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$7$1", m19206f = "PlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ PlaylistViewModel f25683e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f25683e = playlistViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f25683e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                PlaylistViewModel playlistViewModel = this.f25683e;
                playlistViewModel.f25614i0.setValue(PlaylistViewModel.m9992m2(playlistViewModel));
                return C9072e.f47360a;
            }
        }

        public C39337(InterfaceC9968c<? super C39337> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return PlaylistViewModel.this.new C39337(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39337) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f25681e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                PlaylistViewModel playlistViewModel = PlaylistViewModel.this;
                StateFlowImpl stateFlowImpl = playlistViewModel.f25624p0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playlistViewModel, null);
                this.f25681e = 1;
                if (C0062b.m369m0(stateFlowImpl, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$8 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$8", m19206f = "PlaylistViewModel.kt", m19207l = {311}, m19208m = "invokeSuspend")
    final class C39348 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f25684e;

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$8$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Triple;", "Lcom/lingq/player/PlayerContentController$PlayerContentItem;", "", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$8$1", m19206f = "PlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Triple<? extends PlayerContentController.PlayerContentItem, ? extends Boolean, ? extends Integer>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ PlaylistViewModel f25686e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f25686e = playlistViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f25686e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Triple<? extends PlayerContentController.PlayerContentItem, ? extends Boolean, ? extends Integer> triple, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(triple, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                PlaylistViewModel playlistViewModel = this.f25686e;
                if (!((Boolean) playlistViewModel.f25625q0.getValue()).booleanValue()) {
                    playlistViewModel.f25614i0.setValue(PlaylistViewModel.m9992m2(playlistViewModel));
                }
                return C9072e.f47360a;
            }
        }

        public C39348(InterfaceC9968c<? super C39348> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return PlaylistViewModel.this.new C39348(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39348) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f25684e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                PlaylistViewModel playlistViewModel = PlaylistViewModel.this;
                InterfaceC7133n<Triple<PlayerContentController.PlayerContentItem, Boolean, Integer>> interfaceC7133nMo9425z0 = playlistViewModel.mo9425z0();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playlistViewModel, null);
                this.f25684e = 1;
                if (C0062b.m369m0(interfaceC7133nMo9425z0, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$9 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$9", m19206f = "PlaylistViewModel.kt", m19207l = {319}, m19208m = "invokeSuspend")
    final class C39359 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f25687e;

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$9$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$9$1", m19206f = "PlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ boolean f25689e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ PlaylistViewModel f25690f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f25690f = playlistViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f25690f, interfaceC9968c);
                anonymousClass1.f25689e = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                if (!this.f25689e) {
                    PlaylistViewModel playlistViewModel = this.f25690f;
                    playlistViewModel.f25614i0.setValue(PlaylistViewModel.m9992m2(playlistViewModel));
                }
                return C9072e.f47360a;
            }
        }

        public C39359(InterfaceC9968c<? super C39359> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return PlaylistViewModel.this.new C39359(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39359) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f25687e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                PlaylistViewModel playlistViewModel = PlaylistViewModel.this;
                StateFlowImpl stateFlowImpl = playlistViewModel.f25625q0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playlistViewModel, null);
                this.f25687e = 1;
                if (C0062b.m369m0(stateFlowImpl, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
    }

    public PlaylistViewModel(InterfaceC2019l interfaceC2019l, InterfaceC3324a interfaceC3324a, InterfaceC2010c interfaceC2010c, InterfaceC2014g interfaceC2014g, InterfaceC2024q interfaceC2024q, ExecutorC7177a executorC7177a, CoroutineDispatcher coroutineDispatcher, CoroutineJobManager coroutineJobManager, InterfaceC5179a interfaceC5179a, InterfaceC5182d interfaceC5182d, InterfaceC5180b interfaceC5180b, PlayerController playerController, C6704a c6704a, InterfaceC0113j interfaceC0113j, InterfaceC3301f interfaceC3301f, InterfaceC9013i interfaceC9013i, InterfaceC9527a interfaceC9527a, InterfaceC1598u interfaceC1598u, InterfaceC6515k interfaceC6515k, C1024c0 c1024c0) {
        String str;
        C5207g.m11111f(interfaceC2019l, "playlistRepository");
        C5207g.m11111f(interfaceC3324a, "lessonRepository");
        C5207g.m11111f(interfaceC2010c, "courseRepository");
        C5207g.m11111f(interfaceC2014g, "libraryRepository");
        C5207g.m11111f(interfaceC2024q, "ttsRepository");
        C5207g.m11111f(interfaceC5179a, "preferenceStore");
        C5207g.m11111f(interfaceC5182d, "utilStore");
        C5207g.m11111f(interfaceC5180b, "profileStore");
        C5207g.m11111f(playerController, "playerController");
        C5207g.m11111f(c6704a, "appSettings");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC3301f, "playerViewModelDelegate");
        C5207g.m11111f(interfaceC9013i, "playerServiceControllerDelegate");
        C5207g.m11111f(interfaceC9527a, "downloadManagerDelegate");
        C5207g.m11111f(interfaceC1598u, "playlistUpdatesDelegate");
        C5207g.m11111f(interfaceC6515k, "upgradePopupDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f25603d = interfaceC2019l;
        this.f25605e = interfaceC3324a;
        this.f25607f = interfaceC2010c;
        this.f25609g = interfaceC2014g;
        this.f25611h = interfaceC2024q;
        this.f25613i = executorC7177a;
        this.f25615j = coroutineDispatcher;
        this.f25617k = coroutineJobManager;
        this.f25619l = interfaceC5179a;
        this.f25581H = interfaceC5182d;
        this.f25582I = interfaceC5180b;
        this.f25583J = playerController;
        this.f25584K = c6704a;
        this.f25585L = interfaceC0113j;
        this.f25586M = interfaceC3301f;
        this.f25587N = interfaceC9013i;
        this.f25588O = interfaceC9527a;
        this.f25589P = interfaceC1598u;
        this.f25590Q = interfaceC6515k;
        if (c1024c0.f6616a.containsKey("playlistLanguageFromDeeplink")) {
            str = (String) c1024c0.m3929b("playlistLanguageFromDeeplink");
            if (str == null) {
                throw new IllegalArgumentException("Argument \"playlistLanguageFromDeeplink\" is marked as non-null but was passed a null value");
            }
        } else {
            str = "";
        }
        this.f25591R = new C1592o(str);
        EmptyList emptyList = EmptyList.f38032a;
        this.f25592S = C7120g.m14379a(emptyList);
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(emptyList);
        this.f25593T = stateFlowImplM14379a;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        C7138s c7138sM372n = C0062b.m372n(0, 1, bufferOverflow, 1);
        this.f25594U = c7138sM372n;
        this.f25595V = c7138sM372n;
        C7138s c7138sM372n2 = C0062b.m372n(0, 1, bufferOverflow, 1);
        this.f25596W = c7138sM372n2;
        this.f25597X = c7138sM372n2;
        C7138s c7138sM372n3 = C0062b.m372n(0, 1, bufferOverflow, 1);
        this.f25598Y = c7138sM372n3;
        this.f25599Z = C0062b.m303R(c7138sM372n3);
        this.f25600a0 = new LinkedHashMap();
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(emptyList);
        this.f25601b0 = stateFlowImplM14379a2;
        this.f25602c0 = new LinkedHashMap();
        StateFlowImpl stateFlowImplM14379a3 = C7120g.m14379a(emptyList);
        this.f25604d0 = stateFlowImplM14379a3;
        StateFlowImpl stateFlowImplM14379a4 = C7120g.m14379a(emptyList);
        this.f25606e0 = stateFlowImplM14379a4;
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f25608f0 = c7138sM10448a;
        Boolean bool = Boolean.FALSE;
        this.f25610g0 = C7120g.m14379a(bool);
        C7136q c7136qM389r0 = C0062b.m389r0(stateFlowImplM14379a3, stateFlowImplM14379a2, c7138sM10448a, new PlaylistViewModel$_lessonsAll$1(this, null));
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        C7135p c7135pM353h2 = C0062b.m353h2(c7136qM389r0, interfaceC7882zM16767w0, startedWhileSubscribed, emptyList);
        this.f25612h0 = c7135pM353h2;
        StateFlowImpl stateFlowImplM14379a5 = C7120g.m14379a(emptyList);
        this.f25614i0 = stateFlowImplM14379a5;
        this.f25616j0 = C0062b.m353h2(stateFlowImplM14379a5, C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        this.f25618k0 = C0062b.m353h2(C0062b.m389r0(c7135pM353h2, stateFlowImplM14379a, stateFlowImplM14379a4, new PlaylistViewModel$audioSources$1(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        StateFlowImpl stateFlowImplM14379a6 = C7120g.m14379a(null);
        this.f25620l0 = stateFlowImplM14379a6;
        this.f25621m0 = C0062b.m353h2(stateFlowImplM14379a6, C8573r0.m16767w0(this), startedWhileSubscribed, null);
        this.f25622n0 = C7120g.m14379a(bool);
        this.f25623o0 = C7120g.m14379a(bool);
        this.f25624p0 = C7120g.m14379a(bool);
        this.f25625q0 = C7120g.m14379a(bool);
        StateFlowImpl stateFlowImplM14379a7 = C7120g.m14379a(bool);
        this.f25626r0 = stateFlowImplM14379a7;
        this.f25627s0 = C0062b.m353h2(stateFlowImplM14379a7, C8573r0.m16767w0(this), startedWhileSubscribed, bool);
        this.f25628t0 = C0062b.m353h2(C0062b.m377o0(stateFlowImplM14379a3, stateFlowImplM14379a2, stateFlowImplM14379a7, new PlaylistViewModel$showPlayer$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, bool);
        StateFlowImpl stateFlowImplM14379a8 = C7120g.m14379a(Resource.Status.EMPTY);
        this.f25629u0 = stateFlowImplM14379a8;
        this.f25630v0 = C0062b.m353h2(C0062b.m399t2(stateFlowImplM14379a8, new PlaylistViewModel$_loadingPlaylistsItems$1(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        C7138s c7138sM10448a2 = C4924a.m10448a();
        this.f25631w0 = c7138sM10448a2;
        this.f25632x0 = C0062b.m341d2(c7138sM10448a2, C8573r0.m16767w0(this), startedWhileSubscribed);
        this.f25633y0 = C7120g.m14379a(Boolean.TRUE);
        C7138s c7138sM10448a3 = C4924a.m10448a();
        this.f25634z0 = c7138sM10448a3;
        this.f25575A0 = C0062b.m341d2(c7138sM10448a3, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a4 = C4924a.m10448a();
        this.f25576B0 = c7138sM10448a4;
        this.f25577C0 = C0062b.m341d2(c7138sM10448a4, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a5 = C4924a.m10448a();
        this.f25578D0 = c7138sM10448a5;
        this.f25579E0 = C0062b.m341d2(c7138sM10448a5, C8573r0.m16767w0(this), startedWhileSubscribed);
        StateFlowImpl stateFlowImplM14379a9 = C7120g.m14379a(null);
        this.f25580F0 = stateFlowImplM14379a9;
        C0062b.m353h2(stateFlowImplM14379a9, C8573r0.m16767w0(this), startedWhileSubscribed, null);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C39201(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C39282(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C39293(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C39304(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C39315(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C39326(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C39337(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C39348(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C39359(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C392110(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C392211(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C392312(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C392413(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C392514(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C392615(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C392716(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:43:0x0165  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l2 */
    public static final Object m9991l2(PlaylistViewModel playlistViewModel, UserPlaylist userPlaylist, InterfaceC9968c interfaceC9968c) throws Throwable {
        PlaylistViewModel$setCurrentPlaylist$1 playlistViewModel$setCurrentPlaylist$1;
        Object obj;
        UserPlaylist userPlaylist2;
        LinkedHashMap linkedHashMapM13467T0;
        LinkedHashMap linkedHashMapM13467T1;
        PlaylistViewModel playlistViewModel2;
        UserPlaylist userPlaylist3;
        PlaylistViewModel playlistViewModel3 = playlistViewModel;
        playlistViewModel3.getClass();
        if (interfaceC9968c instanceof PlaylistViewModel$setCurrentPlaylist$1) {
            playlistViewModel$setCurrentPlaylist$1 = (PlaylistViewModel$setCurrentPlaylist$1) interfaceC9968c;
            int i10 = playlistViewModel$setCurrentPlaylist$1.f25819i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                playlistViewModel$setCurrentPlaylist$1.f25819i = i10 - Integer.MIN_VALUE;
            } else {
                playlistViewModel$setCurrentPlaylist$1 = new PlaylistViewModel$setCurrentPlaylist$1(playlistViewModel3, interfaceC9968c);
            }
        } else {
            playlistViewModel$setCurrentPlaylist$1 = new PlaylistViewModel$setCurrentPlaylist$1(playlistViewModel3, interfaceC9968c);
        }
        Object objM14360a = playlistViewModel$setCurrentPlaylist$1.f25817g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = playlistViewModel$setCurrentPlaylist$1.f25819i;
        if (i11 != 0) {
            if (i11 == 1) {
                playlistViewModel3 = playlistViewModel$setCurrentPlaylist$1.f25814d;
                C7499b.m14977z0(objM14360a);
                linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a);
                linkedHashMapM13467T0.put(playlistViewModel3.mo498E1(), "");
                playlistViewModel$setCurrentPlaylist$1.f25814d = playlistViewModel3;
                playlistViewModel$setCurrentPlaylist$1.f25819i = 2;
                if (playlistViewModel3.f25581H.mo9691o(linkedHashMapM13467T0, playlistViewModel$setCurrentPlaylist$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i11 != 2) {
                if (i11 == 3) {
                    UserPlaylist userPlaylist4 = playlistViewModel$setCurrentPlaylist$1.f25816f;
                    UserPlaylist userPlaylist5 = playlistViewModel$setCurrentPlaylist$1.f25815e;
                    PlaylistViewModel playlistViewModel4 = playlistViewModel$setCurrentPlaylist$1.f25814d;
                    C7499b.m14977z0(objM14360a);
                    userPlaylist = userPlaylist5;
                    playlistViewModel3 = playlistViewModel4;
                    obj = objM14360a;
                    userPlaylist2 = userPlaylist4;
                    linkedHashMapM13467T1 = C6753d.m13467T0((Map) obj);
                    linkedHashMapM13467T1.put(playlistViewModel3.mo498E1(), userPlaylist.f22077a);
                    playlistViewModel$setCurrentPlaylist$1.f25814d = playlistViewModel3;
                    playlistViewModel$setCurrentPlaylist$1.f25815e = userPlaylist2;
                    playlistViewModel$setCurrentPlaylist$1.f25816f = null;
                    playlistViewModel$setCurrentPlaylist$1.f25819i = 4;
                    if (playlistViewModel3.f25581H.mo9691o(linkedHashMapM13467T1, playlistViewModel$setCurrentPlaylist$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    playlistViewModel2 = playlistViewModel3;
                    userPlaylist3 = userPlaylist2;
                } else {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    userPlaylist3 = playlistViewModel$setCurrentPlaylist$1.f25815e;
                    playlistViewModel2 = playlistViewModel$setCurrentPlaylist$1.f25814d;
                    C7499b.m14977z0(objM14360a);
                }
                playlistViewModel2.f25620l0.setValue(userPlaylist3);
                String str = userPlaylist3.f22077a;
                InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(playlistViewModel2);
                PlaylistViewModel$getPlaylistCourseIds$1 playlistViewModel$getPlaylistCourseIds$1 = new PlaylistViewModel$getPlaylistCourseIds$1(playlistViewModel2, str, null);
                CoroutineJobManager coroutineJobManager = playlistViewModel2.f25617k;
                CoroutineDispatcher coroutineDispatcher = playlistViewModel2.f25613i;
                C7499b.m14933c0(interfaceC7882zM16767w0, coroutineJobManager, coroutineDispatcher, "getPlaylistCourseIds", playlistViewModel$getPlaylistCourseIds$1);
                InterfaceC7882z interfaceC7882zM16767w1 = C8573r0.m16767w0(playlistViewModel2);
                int i12 = userPlaylist3.f22080d;
                String str2 = userPlaylist3.f22077a;
                C7499b.m14933c0(interfaceC7882zM16767w1, coroutineJobManager, coroutineDispatcher, "playlistCourses", new PlaylistViewModel$getPlaylistCourses$1(i12, playlistViewModel2, str2, null));
                playlistViewModel2.m9999t2(str2, i12);
                playlistViewModel2.m9994o2();
                C7499b.m14935d0(C8573r0.m16767w0(playlistViewModel2), coroutineJobManager, "lessonDownloadsObservable", new PlaylistViewModel$getLessonDownloadsObservable$1(playlistViewModel2, null));
                C7499b.m14933c0(C8573r0.m16767w0(playlistViewModel2), coroutineJobManager, coroutineDispatcher, "playlistLessons", new PlaylistViewModel$getPlaylistLessons$1(i12, playlistViewModel2, str2, null));
            } else {
                playlistViewModel3 = playlistViewModel$setCurrentPlaylist$1.f25814d;
                C7499b.m14977z0(objM14360a);
            }
            playlistViewModel3.getClass();
            InterfaceC7882z interfaceC7882zM16767w2 = C8573r0.m16767w0(playlistViewModel3);
            PlaylistViewModel$getPlaylists$1 playlistViewModel$getPlaylists$1 = new PlaylistViewModel$getPlaylists$1(playlistViewModel3, null);
            C7499b.m14933c0(interfaceC7882zM16767w2, playlistViewModel3.f25617k, playlistViewModel3.f25613i, "playlists", playlistViewModel$getPlaylists$1);
        } else {
            C7499b.m14977z0(objM14360a);
            InterfaceC5182d interfaceC5182d = playlistViewModel3.f25581H;
            if (userPlaylist == null || C7661i.m15250P2(userPlaylist.f22079c)) {
                InterfaceC7116c<Map<String, String>> interfaceC7116cMo9690n = interfaceC5182d.mo9690n();
                playlistViewModel$setCurrentPlaylist$1.f25814d = playlistViewModel3;
                playlistViewModel$setCurrentPlaylist$1.f25819i = 1;
                objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9690n, playlistViewModel$setCurrentPlaylist$1);
                if (objM14360a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a);
                linkedHashMapM13467T0.put(playlistViewModel3.mo498E1(), "");
                playlistViewModel$setCurrentPlaylist$1.f25814d = playlistViewModel3;
                playlistViewModel$setCurrentPlaylist$1.f25819i = 2;
                if (playlistViewModel3.f25581H.mo9691o(linkedHashMapM13467T0, playlistViewModel$setCurrentPlaylist$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                playlistViewModel3.getClass();
                InterfaceC7882z interfaceC7882zM16767w3 = C8573r0.m16767w0(playlistViewModel3);
                PlaylistViewModel$getPlaylists$1 playlistViewModel$getPlaylists$2 = new PlaylistViewModel$getPlaylists$1(playlistViewModel3, null);
                C7499b.m14933c0(interfaceC7882zM16767w3, playlistViewModel3.f25617k, playlistViewModel3.f25613i, "playlists", playlistViewModel$getPlaylists$2);
            } else {
                InterfaceC7116c<Map<String, String>> interfaceC7116cMo9690n2 = interfaceC5182d.mo9690n();
                playlistViewModel$setCurrentPlaylist$1.f25814d = playlistViewModel3;
                playlistViewModel$setCurrentPlaylist$1.f25815e = userPlaylist;
                playlistViewModel$setCurrentPlaylist$1.f25816f = userPlaylist;
                playlistViewModel$setCurrentPlaylist$1.f25819i = 3;
                Object objM14360a2 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9690n2, playlistViewModel$setCurrentPlaylist$1);
                if (objM14360a2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = objM14360a2;
                userPlaylist2 = userPlaylist;
                linkedHashMapM13467T1 = C6753d.m13467T0((Map) obj);
                linkedHashMapM13467T1.put(playlistViewModel3.mo498E1(), userPlaylist.f22077a);
                playlistViewModel$setCurrentPlaylist$1.f25814d = playlistViewModel3;
                playlistViewModel$setCurrentPlaylist$1.f25815e = userPlaylist2;
                playlistViewModel$setCurrentPlaylist$1.f25816f = null;
                playlistViewModel$setCurrentPlaylist$1.f25819i = 4;
                if (playlistViewModel3.f25581H.mo9691o(linkedHashMapM13467T1, playlistViewModel$setCurrentPlaylist$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                playlistViewModel2 = playlistViewModel3;
                userPlaylist3 = userPlaylist2;
                playlistViewModel2.f25620l0.setValue(userPlaylist3);
                String str3 = userPlaylist3.f22077a;
                InterfaceC7882z interfaceC7882zM16767w4 = C8573r0.m16767w0(playlistViewModel2);
                PlaylistViewModel$getPlaylistCourseIds$1 playlistViewModel$getPlaylistCourseIds$2 = new PlaylistViewModel$getPlaylistCourseIds$1(playlistViewModel2, str3, null);
                CoroutineJobManager coroutineJobManager2 = playlistViewModel2.f25617k;
                CoroutineDispatcher coroutineDispatcher2 = playlistViewModel2.f25613i;
                C7499b.m14933c0(interfaceC7882zM16767w4, coroutineJobManager2, coroutineDispatcher2, "getPlaylistCourseIds", playlistViewModel$getPlaylistCourseIds$2);
                InterfaceC7882z interfaceC7882zM16767w5 = C8573r0.m16767w0(playlistViewModel2);
                int i13 = userPlaylist3.f22080d;
                String str4 = userPlaylist3.f22077a;
                C7499b.m14933c0(interfaceC7882zM16767w5, coroutineJobManager2, coroutineDispatcher2, "playlistCourses", new PlaylistViewModel$getPlaylistCourses$1(i13, playlistViewModel2, str4, null));
                playlistViewModel2.m9999t2(str4, i13);
                playlistViewModel2.m9994o2();
                C7499b.m14935d0(C8573r0.m16767w0(playlistViewModel2), coroutineJobManager2, "lessonDownloadsObservable", new PlaylistViewModel$getLessonDownloadsObservable$1(playlistViewModel2, null));
                C7499b.m14933c0(C8573r0.m16767w0(playlistViewModel2), coroutineJobManager2, coroutineDispatcher2, "playlistLessons", new PlaylistViewModel$getPlaylistLessons$1(i13, playlistViewModel2, str4, null));
            }
        }
        return C9072e.f47360a;
    }

    /* JADX INFO: renamed from: m2 */
    public static final ArrayList m9992m2(PlaylistViewModel playlistViewModel) {
        Object next;
        StateFlowImpl stateFlowImpl;
        StateFlowImpl stateFlowImpl2;
        StateFlowImpl stateFlowImpl3;
        Object next2;
        int i10;
        Object next3;
        Object obj;
        C6698d c6698d;
        Integer num;
        List<C6697c> list;
        Object next4;
        Object next5;
        C6698d c6698d2;
        C6696b c6696b;
        playlistViewModel.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PlaylistAdapter.AbstractC3890c.d(((Boolean) playlistViewModel.f25622n0.getValue()).booleanValue(), ((Boolean) playlistViewModel.f25624p0.getValue()).booleanValue()));
        C7135p c7135p = playlistViewModel.f25612h0;
        List list2 = (List) c7135p.getValue();
        int i11 = 10;
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C6697c) it.next()).f37871p);
        }
        StateFlowImpl stateFlowImpl4 = playlistViewModel.f25601b0;
        Iterable<C6696b> iterable = (Iterable) stateFlowImpl4.getValue();
        ArrayList arrayList3 = new ArrayList(C9325m.m17681z(iterable, 10));
        for (C6696b c6696b2 : iterable) {
            arrayList3.add(Integer.valueOf(c6696b2 != null ? c6696b2.f37855c : 0));
        }
        ArrayList arrayListM13438f0 = C6752c.m13438f0(arrayList3, arrayList2);
        TreeSet treeSet = new TreeSet(new C1600w());
        C6752c.m13450r0(arrayListM13438f0, treeSet);
        Iterator it2 = C6752c.m13421O(treeSet).iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            Iterator it3 = ((Iterable) stateFlowImpl4.getValue()).iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                c6696b = (C6696b) next;
            } while (!(c6696b != null && c6696b.f37855c == iIntValue));
            C6696b c6696b3 = (C6696b) next;
            StateFlowImpl stateFlowImpl5 = playlistViewModel.f25592S;
            StateFlowImpl stateFlowImpl6 = playlistViewModel.f25606e0;
            StateFlowImpl stateFlowImpl7 = playlistViewModel.f25626r0;
            if (c6696b3 != null) {
                stateFlowImpl = stateFlowImpl7;
                stateFlowImpl2 = stateFlowImpl6;
                stateFlowImpl3 = stateFlowImpl5;
                arrayList.add(new PlaylistAdapter.AbstractC3890c.a(null, c6696b3, null, null, ((Boolean) stateFlowImpl7.getValue()).booleanValue(), null, 45));
                if (!((Boolean) stateFlowImpl.getValue()).booleanValue() && (list = (List) playlistViewModel.f25600a0.get(Integer.valueOf(c6696b3.f37853a))) != null) {
                    ArrayList arrayList4 = new ArrayList(C9325m.m17681z(list, i11));
                    for (C6697c c6697c : list) {
                        Iterator it4 = ((Iterable) stateFlowImpl2.getValue()).iterator();
                        do {
                            if (!it4.hasNext()) {
                                next4 = null;
                                break;
                            }
                            next4 = it4.next();
                        } while (!(((LibraryItemCounter) next4).f22004a == c6697c.f37856a));
                        LibraryItemCounter libraryItemCounter = (LibraryItemCounter) next4;
                        String str = c6697c.f37869n;
                        int i12 = c6697c.f37856a;
                        if (str != null || c6697c.f37870o == null) {
                            Iterator it5 = C6752c.m13421O((Iterable) stateFlowImpl3.getValue()).iterator();
                            do {
                                if (!it5.hasNext()) {
                                    next5 = null;
                                    break;
                                }
                                next5 = it5.next();
                            } while (!(i12 == ((C6698d) next5).f37875a));
                            c6698d2 = (C6698d) next5;
                        } else {
                            c6698d2 = new C6698d(i12, 100, true);
                        }
                        boolean zBooleanValue = ((Boolean) stateFlowImpl.getValue()).booleanValue();
                        PlayerContentController.PlayerContentItem playerContentItem = playlistViewModel.mo9425z0().getValue().f38021a;
                        arrayList4.add(new PlaylistAdapter.AbstractC3890c.a(c6697c, null, libraryItemCounter, c6698d2, zBooleanValue, Boolean.valueOf(playerContentItem != null && i12 == playerContentItem.f17600a), 2));
                    }
                    arrayList.addAll(arrayList4);
                }
            } else {
                stateFlowImpl = stateFlowImpl7;
                stateFlowImpl2 = stateFlowImpl6;
                stateFlowImpl3 = stateFlowImpl5;
            }
            Iterator it6 = list2.iterator();
            do {
                if (!it6.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it6.next();
                num = ((C6697c) next2).f37871p;
            } while (!(num != null && num.intValue() == iIntValue));
            C6697c c6697c2 = (C6697c) next2;
            if (c6697c2 != null) {
                Iterator it7 = ((Iterable) stateFlowImpl2.getValue()).iterator();
                do {
                    boolean zHasNext = it7.hasNext();
                    i10 = c6697c2.f37856a;
                    if (!zHasNext) {
                        next3 = null;
                        break;
                    }
                    next3 = it7.next();
                } while (!(((LibraryItemCounter) next3).f22004a == i10));
                LibraryItemCounter libraryItemCounter2 = (LibraryItemCounter) next3;
                if (c6697c2.f37869n != null || c6697c2.f37870o == null) {
                    Iterator it8 = C6752c.m13421O((Iterable) stateFlowImpl3.getValue()).iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            obj = null;
                            break;
                        }
                        Object next6 = it8.next();
                        if (i10 == ((C6698d) next6).f37875a) {
                            obj = next6;
                            break;
                        }
                    }
                    c6698d = (C6698d) obj;
                } else {
                    c6698d = new C6698d(i10, 100, true);
                }
                boolean zBooleanValue2 = ((Boolean) stateFlowImpl.getValue()).booleanValue();
                PlayerContentController.PlayerContentItem playerContentItem2 = playlistViewModel.mo9425z0().getValue().f38021a;
                arrayList.add(new PlaylistAdapter.AbstractC3890c.a(c6697c2, null, libraryItemCounter2, c6698d, zBooleanValue2, Boolean.valueOf(playerContentItem2 != null && i10 == playerContentItem2.f17600a), 2));
            }
            i11 = 10;
        }
        if (((List) c7135p.getValue()).isEmpty()) {
            arrayList.addAll((Collection) playlistViewModel.f25630v0.getValue());
        }
        if (((Boolean) playlistViewModel.f25623o0.getValue()).booleanValue()) {
            arrayList.add(PlaylistAdapter.AbstractC3890c.b.f25411a);
        }
        return arrayList;
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: A */
    public final void mo9771A(UpgradeReason upgradeReason) {
        C5207g.m11111f(upgradeReason, "reason");
        this.f25590Q.mo9771A(upgradeReason);
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: A0 */
    public final void mo9391A0(int i10) {
        this.f25588O.mo9391A0(i10);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f25585L.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25585L.mo497B0(interfaceC9968c);
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: E */
    public final void mo9720E(PlayingFrom playingFrom) {
        C5207g.m11111f(playingFrom, "playingFrom");
        this.f25587N.mo9720E(playingFrom);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f25585L.mo498E1();
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: F0 */
    public final InterfaceC7142w<C9015k> mo9721F0() {
        return this.f25587N.mo9721F0();
    }

    @Override // bj.InterfaceC1598u
    /* JADX INFO: renamed from: F1 */
    public final void mo5248F1(UserPlaylist userPlaylist) {
        C5207g.m11111f(userPlaylist, "playlist");
        this.f25589P.mo5248F1(userPlaylist);
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: G */
    public final InterfaceC7142w<List<PlayerContentController.PlayerContentItem>> mo9396G() {
        return this.f25586M.mo9396G();
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: G1 */
    public final void mo9772G1(String str) {
        this.f25590Q.mo9772G1(str);
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: I1 */
    public final InterfaceC7133n<AbstractC4267a> mo9398I1() {
        return this.f25586M.mo9398I1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25585L.mo499J(profile, interfaceC9968c);
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: J0 */
    public final InterfaceC7133n<C3296a> mo9399J0() {
        return this.f25586M.mo9399J0();
    }

    @Override // bj.InterfaceC1598u
    /* JADX INFO: renamed from: J1 */
    public final InterfaceC7137r<UserPlaylist> mo5249J1() {
        return this.f25589P.mo5249J1();
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: L1 */
    public final void mo9401L1(List<PlayerContentController.PlayerContentItem> list) {
        C5207g.m11111f(list, "tracks");
        this.f25586M.mo9401L1(list);
    }

    @Override // bj.InterfaceC1598u
    /* JADX INFO: renamed from: M */
    public final void mo5250M(UserPlaylist userPlaylist) {
        this.f25589P.mo5250M(userPlaylist);
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: O0 */
    public final void mo9403O0(String str, int i10, double d10) {
        C5207g.m11111f(str, "language");
        this.f25586M.mo9403O0(str, i10, d10);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f25585L.mo500P();
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: R1 */
    public final InterfaceC7142w<PlayingFrom> mo9726R1() {
        return this.f25587N.mo9726R1();
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: S0 */
    public final InterfaceC7116c<UpgradeReason> mo9773S0() {
        return this.f25590Q.mo9773S0();
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: S1 */
    public final Object mo9405S1(DownloadItem downloadItem, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25588O.mo9405S1(downloadItem, interfaceC9968c);
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: X */
    public final InterfaceC7116c<String> mo9774X() {
        return this.f25590Q.mo9774X();
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: X0 */
    public final void mo9406X0(DownloadItem downloadItem, boolean z10) {
        this.f25588O.mo9406X0(downloadItem, z10);
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: X1 */
    public final Object mo9407X1(String str, List<Pair<String, Integer>> list, int i10, boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25588O.mo9407X1(str, list, i10, false, interfaceC9968c);
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: a2 */
    public final InterfaceC7137r<AbstractC3312a<DownloadItem>> mo9409a2() {
        return this.f25588O.mo9409a2();
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: b1 */
    public final void mo9732b1() {
        this.f25587N.mo9732b1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25585L.mo501d(str, interfaceC9968c);
    }

    @Override // bj.InterfaceC1598u
    /* JADX INFO: renamed from: d1 */
    public final InterfaceC7137r<UserPlaylist> mo5251d1() {
        return this.f25589P.mo5251d1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f25585L;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25585L.mo503f1(interfaceC9968c);
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: i0 */
    public final InterfaceC7116c<C9072e> mo9775i0() {
        return this.f25590Q.mo9775i0();
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: i1 */
    public final void mo9412i1(ArrayList arrayList, String str) {
        C5207g.m11111f(str, "language");
        this.f25588O.mo9412i1(arrayList, str);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f25585L.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25585L.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f25585L.mo506l1();
    }

    /* JADX INFO: renamed from: n2 */
    public final void m9993n2() {
        if (mo9726R1().getValue() == null || mo9726R1().getValue() == PlayingFrom.Playlist) {
            m9996q2(-1, false);
            mo9401L1(EmptyList.f38032a);
        }
        EmptyList emptyList = EmptyList.f38032a;
        this.f25601b0.setValue(emptyList);
        this.f25604d0.setValue(emptyList);
        this.f25600a0.clear();
        this.f25602c0.clear();
        this.f25592S.setValue(emptyList);
        this.f25623o0.setValue(Boolean.FALSE);
        this.f25608f0.mo14371k(C9072e.f47360a);
    }

    /* JADX INFO: renamed from: o2 */
    public final void m9994o2() {
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new PlaylistViewModel$getLessonDownloadsForStart$1(this, null), 3);
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: p */
    public final InterfaceC7116c<C9072e> mo9740p() {
        return this.f25587N.mo9740p();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f25585L.mo507p1();
    }

    /* JADX INFO: renamed from: p2 */
    public final boolean m9995p2(int i10) {
        Object obj;
        Object next;
        Iterator it = ((Iterable) this.f25606e0.getValue()).iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((LibraryItemCounter) next).f22004a == i10));
        LibraryItemCounter libraryItemCounter = (LibraryItemCounter) next;
        for (Object obj2 : (Iterable) this.f25612h0.getValue()) {
            if (((C6697c) obj2).f37856a == i10) {
                obj = obj2;
                break;
            }
        }
        C6697c c6697c = (C6697c) obj;
        if ((libraryItemCounter == null || libraryItemCounter.f22009f) ? false : true) {
            if ((c6697c != null ? c6697c.f37874s : 0) > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // bj.InterfaceC1598u
    /* JADX INFO: renamed from: q0 */
    public final void mo5252q0(String str, String str2) {
        C5207g.m11111f(str, "oldName");
        C5207g.m11111f(str2, "newName");
        this.f25589P.mo5252q0(str, str2);
    }

    /* JADX INFO: renamed from: q2 */
    public final void m9996q2(int i10, boolean z10) {
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new PlaylistViewModel$setSelectedLesson$1(z10, this, i10, null), 3);
    }

    /* JADX INFO: renamed from: r2 */
    public final void m9997r2(List<PlayerContentController.PlayerContentItem> list) {
        C5207g.m11111f(list, "tracks");
        PlayingFrom value = mo9726R1().getValue();
        PlayingFrom playingFrom = PlayingFrom.Playlist;
        if (value == playingFrom || mo9726R1().getValue() == null) {
            mo9720E(playingFrom);
            if (!(!list.isEmpty())) {
                this.f25583J.m9415p0(true);
                return;
            }
            if (((Boolean) this.f25633y0.getValue()).booleanValue()) {
                mo9401L1(list);
                C7499b.m14935d0(C8573r0.m16767w0(this), this.f25617k, "tracksDownload", new PlaylistViewModel$setupAndDownloadTracks$1(this, list, null));
                m9996q2(this.f25584K.f37891b.getInt("playlistTrack", 0), false);
            }
        }
    }

    /* JADX INFO: renamed from: s2 */
    public final void m9998s2(int i10) {
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new PlaylistViewModel$showBuyPremiumLesson$1(this, i10, null), 3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f25585L.mo508t1();
    }

    /* JADX INFO: renamed from: t2 */
    public final void m9999t2(String str, int i10) {
        C7499b.m14933c0(C8573r0.m16767w0(this), this.f25617k, this.f25613i, C0166e.m761g("updatePlaylistLessons ", i10), new PlaylistViewModel$updatePlaylistLessons$2(i10, this, str, null));
    }

    @Override // bj.InterfaceC1598u
    /* JADX INFO: renamed from: v */
    public final InterfaceC7137r<Pair<String, String>> mo5253v() {
        return this.f25589P.mo5253v();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f25585L.mo509w0();
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: x0 */
    public final Object mo9422x0(DownloadItem downloadItem, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25588O.mo9422x0(downloadItem, interfaceC9968c);
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: y */
    public final InterfaceC7133n<C3297b> mo9423y() {
        return this.f25586M.mo9423y();
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: y0 */
    public final InterfaceC7133n<C3300e> mo9424y0() {
        return this.f25586M.mo9424y0();
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: z0 */
    public final InterfaceC7133n<Triple<PlayerContentController.PlayerContentItem, Boolean, Integer>> mo9425z0() {
        return this.f25586M.mo9425z0();
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: z1 */
    public final void mo9747z1(int i10, long j10, boolean z10) {
        this.f25587N.mo9747z1(i10, j10, z10);
    }
}
