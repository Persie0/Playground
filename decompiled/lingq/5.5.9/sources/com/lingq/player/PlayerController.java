package com.lingq.player;

import ae.C0062b;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.C0166e;
import android.widget.MediaController;
import androidx.activity.RunnableC0190i;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.C2413j;
import com.google.android.exoplayer2.C2466p;
import com.google.android.exoplayer2.C2505u;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.InterfaceC2532v;
import com.google.android.exoplayer2.drm.C2397a;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.InterfaceC2399c;
import com.google.android.exoplayer2.source.C2497n;
import com.google.android.exoplayer2.upstream.C2527a;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.lingq.p055ui.lesson.AbstractC4267a;
import com.lingq.shared.download.AbstractC3312a;
import com.lingq.shared.download.DownloadItem;
import com.lingq.shared.uimodel.language.AppUsageType;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.InterfaceC7133n;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7142w;
import mo.C7661i;
import ni.C7796d;
import no.C7828f;
import no.InterfaceC7875v0;
import no.InterfaceC7882z;
import p076di.InterfaceC5182d;
import p118fe.C5509a;
import p225kk.C6704a;
import p244lh.InterfaceC7364a;
import p260m8.C7499b;
import p261m9.C7505f;
import p385sf.C9000b;
import p416uh.InterfaceC9527a;
import p454wa.C9884i;
import p454wa.InterfaceC9882g;
import p464wl.InterfaceC9968c;
import p479xa.C10134c0;
import p479xa.C10140i;
import p490xl.InterfaceC10224c;
import sh.C9009e;
import sh.InterfaceC9013i;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class PlayerController implements InterfaceC2532v.c, MediaController.MediaPlayerControl, InterfaceC3301f, InterfaceC9527a, InterfaceC7364a {

    /* JADX INFO: renamed from: H */
    public final PlayerContentController f17616H = new PlayerContentController();

    /* JADX INFO: renamed from: I */
    public final RunnableC0190i f17617I = new RunnableC0190i(20, this);

    /* JADX INFO: renamed from: J */
    public final Handler f17618J = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: K */
    public final File f17619K;

    /* JADX INFO: renamed from: L */
    public long f17620L;

    /* JADX INFO: renamed from: M */
    public boolean f17621M;

    /* JADX INFO: renamed from: N */
    public int f17622N;

    /* JADX INFO: renamed from: O */
    public InterfaceC7875v0 f17623O;

    /* JADX INFO: renamed from: P */
    public final List<C9009e> f17624P;

    /* JADX INFO: renamed from: Q */
    public int f17625Q;

    /* JADX INFO: renamed from: R */
    public final List<C9009e> f17626R;

    /* JADX INFO: renamed from: S */
    public int f17627S;

    /* JADX INFO: renamed from: a */
    public final Context f17628a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7882z f17629b;

    /* JADX INFO: renamed from: c */
    public final CoroutineDispatcher f17630c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5182d f17631d;

    /* JADX INFO: renamed from: e */
    public final C7796d f17632e;

    /* JADX INFO: renamed from: f */
    public final C6704a f17633f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC9013i f17634g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC3301f f17635h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC9527a f17636i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC7364a f17637j;

    /* JADX INFO: renamed from: k */
    public int f17638k;

    /* JADX INFO: renamed from: l */
    public C2413j f17639l;

    /* JADX INFO: renamed from: com.lingq.player.PlayerController$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.player.PlayerController$1", m19206f = "PlayerController.kt", m19207l = {138}, m19208m = "invokeSuspend")
    final class C32861 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f17640e;

        /* JADX INFO: renamed from: com.lingq.player.PlayerController$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/player/PlayerContentController$PlayerContentItem;", "tracks", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.player.PlayerController$1$1", m19206f = "PlayerController.kt", m19207l = {139}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends PlayerContentController.PlayerContentItem>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f17642e;

            /* JADX INFO: renamed from: f */
            public /* synthetic */ Object f17643f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ PlayerController f17644g;

            /* JADX INFO: renamed from: com.lingq.player.PlayerController$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.player.PlayerController$1$1$1", m19206f = "PlayerController.kt", m19207l = {}, m19208m = "invokeSuspend")
            public static final class C106031 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ List<PlayerContentController.PlayerContentItem> f17645e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ PlayerController f17646f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C106031(List<PlayerContentController.PlayerContentItem> list, PlayerController playerController, InterfaceC9968c<? super C106031> interfaceC9968c) {
                    super(2, interfaceC9968c);
                    this.f17645e = list;
                    this.f17646f = playerController;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: a */
                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                    return new C106031(this.f17645e, this.f17646f, interfaceC9968c);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    return ((C106031) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    C7499b.m14977z0(obj);
                    List<PlayerContentController.PlayerContentItem> list = this.f17645e;
                    boolean z10 = true;
                    boolean z11 = !list.isEmpty();
                    PlayerController playerController = this.f17646f;
                    if (z11) {
                        if (!C6752c.m13415I(list, playerController.m9400L()) || !playerController.isPlaying()) {
                            z10 = false;
                        }
                        if (!z10) {
                            C2413j c2413j = playerController.f17639l;
                            if (c2413j == null) {
                                C5207g.m11117l("player");
                                throw null;
                            }
                            c2413j.pause();
                        }
                        PlayerContentController playerContentController = playerController.f17616H;
                        playerContentController.getClass();
                        ArrayList arrayList = playerContentController.f17596a;
                        arrayList.clear();
                        arrayList.addAll(list);
                        PlayerContentController.PlayerContentItem playerContentItemM9389a = playerContentController.m9389a();
                        if (playerContentItemM9389a != null) {
                            playerController.m9395F0(playerContentItemM9389a, z10);
                        }
                        playerController.f17634g.mo9732b1();
                    } else {
                        PlayerContentController playerContentController2 = playerController.f17616H;
                        playerContentController2.getClass();
                        ArrayList arrayList2 = playerContentController2.f17596a;
                        arrayList2.clear();
                        arrayList2.addAll(list);
                    }
                    return C9072e.f47360a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlayerController playerController, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f17644g = playerController;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f17644g, interfaceC9968c);
                anonymousClass1.f17643f = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends PlayerContentController.PlayerContentItem> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f17642e;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    List list = (List) this.f17643f;
                    PlayerController playerController = this.f17644g;
                    CoroutineDispatcher coroutineDispatcher = playerController.f17630c;
                    C106031 c106031 = new C106031(list, playerController, null);
                    this.f17642e = 1;
                    if (C7828f.m15574h(this, coroutineDispatcher, c106031) == coroutineSingletons) {
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

        public C32861(InterfaceC9968c<? super C32861> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return PlayerController.this.new C32861(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C32861) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f17640e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                PlayerController playerController = PlayerController.this;
                InterfaceC7142w<List<PlayerContentController.PlayerContentItem>> interfaceC7142wMo9396G = playerController.mo9396G();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playerController, null);
                this.f17640e = 1;
                if (C0062b.m369m0(interfaceC7142wMo9396G, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.player.PlayerController$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.player.PlayerController$2", m19206f = "PlayerController.kt", m19207l = {158}, m19208m = "invokeSuspend")
    final class C32872 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f17647e;

        /* JADX INFO: renamed from: com.lingq.player.PlayerController$2$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/download/a;", "Lcom/lingq/shared/download/DownloadItem;", "state", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.player.PlayerController$2$1", m19206f = "PlayerController.kt", m19207l = {159}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<AbstractC3312a<? extends DownloadItem>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f17649e;

            /* JADX INFO: renamed from: f */
            public /* synthetic */ Object f17650f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ PlayerController f17651g;

            /* JADX INFO: renamed from: com.lingq.player.PlayerController$2$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.player.PlayerController$2$1$1", m19206f = "PlayerController.kt", m19207l = {}, m19208m = "invokeSuspend")
            public static final class C106041 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ AbstractC3312a<DownloadItem> f17652e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ PlayerController f17653f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C106041(AbstractC3312a<DownloadItem> abstractC3312a, PlayerController playerController, InterfaceC9968c<? super C106041> interfaceC9968c) {
                    super(2, interfaceC9968c);
                    this.f17652e = abstractC3312a;
                    this.f17653f = playerController;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: a */
                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                    return new C106041(this.f17652e, this.f17653f, interfaceC9968c);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    return ((C106041) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    C7499b.m14977z0(obj);
                    AbstractC3312a<DownloadItem> abstractC3312a = this.f17652e;
                    boolean z10 = abstractC3312a instanceof AbstractC3312a.a;
                    PlayerController playerController = this.f17653f;
                    if (z10) {
                        playerController.m9413k0(((AbstractC3312a.a) abstractC3312a).f17997b, ((DownloadItem) ((AbstractC3312a.a) abstractC3312a).f17996a).f17866b, ((AbstractC3312a.a) abstractC3312a).f17998c);
                    } else if (!(abstractC3312a instanceof AbstractC3312a.b) && (abstractC3312a instanceof AbstractC3312a.c)) {
                        playerController.pause();
                    }
                    return C9072e.f47360a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlayerController playerController, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f17651g = playerController;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f17651g, interfaceC9968c);
                anonymousClass1.f17650f = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(AbstractC3312a<? extends DownloadItem> abstractC3312a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(abstractC3312a, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f17649e;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    AbstractC3312a abstractC3312a = (AbstractC3312a) this.f17650f;
                    PlayerController playerController = this.f17651g;
                    CoroutineDispatcher coroutineDispatcher = playerController.f17630c;
                    C106041 c106041 = new C106041(abstractC3312a, playerController, null);
                    this.f17649e = 1;
                    if (C7828f.m15574h(this, coroutineDispatcher, c106041) == coroutineSingletons) {
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

        public C32872(InterfaceC9968c<? super C32872> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return PlayerController.this.new C32872(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C32872) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f17647e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                PlayerController playerController = PlayerController.this;
                InterfaceC7137r<AbstractC3312a<DownloadItem>> interfaceC7137rMo9409a2 = playerController.mo9409a2();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playerController, null);
                this.f17647e = 1;
                if (C0062b.m369m0(interfaceC7137rMo9409a2, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.player.PlayerController$3 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.player.PlayerController$3", m19206f = "PlayerController.kt", m19207l = {184}, m19208m = "invokeSuspend")
    final class C32883 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f17654e;

        /* JADX INFO: renamed from: com.lingq.player.PlayerController$3$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/player/e;", "state", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.player.PlayerController$3$1", m19206f = "PlayerController.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<C3300e, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f17656e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ PlayerController f17657f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlayerController playerController, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f17657f = playerController;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f17657f, interfaceC9968c);
                anonymousClass1.f17656e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(C3300e c3300e, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(c3300e, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                C3300e c3300e = (C3300e) this.f17656e;
                boolean z10 = c3300e.f17758b instanceof AbstractC3298c.b;
                PlayerController playerController = this.f17657f;
                if (z10 && (c3300e.f17757a instanceof AbstractC3299d.a)) {
                    InterfaceC7875v0 interfaceC7875v0 = playerController.f17623O;
                    if (interfaceC7875v0 != null) {
                        C4924a.m10450b(interfaceC7875v0);
                    }
                    playerController.f17623O = C7828f.m15570d(playerController.f17629b, playerController.f17630c, null, new PlayerController$playerPooling$1(playerController, null), 2);
                } else {
                    InterfaceC7875v0 interfaceC7875v1 = playerController.f17623O;
                    if (interfaceC7875v1 != null) {
                        C4924a.m10450b(interfaceC7875v1);
                    }
                }
                return C9072e.f47360a;
            }
        }

        public C32883(InterfaceC9968c<? super C32883> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return PlayerController.this.new C32883(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C32883) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f17654e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                PlayerController playerController = PlayerController.this;
                InterfaceC7133n<C3300e> interfaceC7133nMo9424y0 = playerController.mo9424y0();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playerController, null);
                this.f17654e = 1;
                if (C0062b.m369m0(interfaceC7133nMo9424y0, anonymousClass1, this) == coroutineSingletons) {
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

    public PlayerController(Context context, InterfaceC7364a interfaceC7364a, InterfaceC9013i interfaceC9013i, InterfaceC3301f interfaceC3301f, InterfaceC9527a interfaceC9527a, InterfaceC5182d interfaceC5182d, C7796d c7796d, C6704a c6704a, CoroutineDispatcher coroutineDispatcher, InterfaceC7882z interfaceC7882z) {
        this.f17628a = context;
        this.f17629b = interfaceC7882z;
        this.f17630c = coroutineDispatcher;
        this.f17631d = interfaceC5182d;
        this.f17632e = c7796d;
        this.f17633f = c6704a;
        this.f17634g = interfaceC9013i;
        this.f17635h = interfaceC3301f;
        this.f17636i = interfaceC9527a;
        this.f17637j = interfaceC7364a;
        this.f17619K = new File(C0166e.m765k(context.getFilesDir().toString(), "/tracks/"));
        List<C9009e> listM17252r = C9000b.m17252r(new C9009e(1.0f, "1x"), new C9009e(0.9f, ".9x"), new C9009e(0.75f, ".75x"), new C9009e(0.66f, ".66x"), new C9009e(0.5f, ".5x"), new C9009e(2.0f, "2x"), new C9009e(1.5f, "1.5x"), new C9009e(1.25f, "1.25x"), new C9009e(1.1f, "1.1x"));
        this.f17624P = listM17252r;
        this.f17626R = C9000b.m17252r(new C9009e(1.0f, "1x"), new C9009e(0.5f, ".5x"), new C9009e(0.25f, ".25x"), new C9009e(2.0f, "2x"), new C9009e(1.5f, "1.5x"));
        this.f17625Q = 0;
        C2413j c2413jM6769a = new ExoPlayer.C2348c(context).m6769a();
        this.f17639l = c2413jM6769a;
        c2413jM6769a.addListener(this);
        C2413j c2413j = this.f17639l;
        if (c2413j == null) {
            C5207g.m11117l("player");
            throw null;
        }
        c2413j.f12327r.mo12743K(new C10140i());
        float f3 = listM17252r.get(0).f47230a;
        C2413j c2413j2 = this.f17639l;
        if (c2413j2 == null) {
            C5207g.m11117l("player");
            throw null;
        }
        C2505u c2505u = new C2505u(f3, c2413j2.getPlaybackParameters().f13475b);
        C2413j c2413j3 = this.f17639l;
        if (c2413j3 == null) {
            C5207g.m11117l("player");
            throw null;
        }
        c2413j3.setPlaybackParameters(c2505u);
        C7828f.m15570d(interfaceC7882z, null, null, new C32861(null), 3);
        C7828f.m15570d(interfaceC7882z, null, null, new C32872(null), 3);
        this.f17623O = C7828f.m15570d(interfaceC7882z, coroutineDispatcher, null, new PlayerController$playerPooling$1(this, null), 2);
        C7828f.m15570d(interfaceC7882z, null, null, new C32883(null), 3);
    }

    /* JADX INFO: renamed from: E0 */
    public static void m9390E0(PlayerController playerController, boolean z10, boolean z11, int i10) {
        C3296a c3296a;
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        boolean z12 = (i10 & 2) != 0 ? false : z11;
        PlayerContentController playerContentController = playerController.f17616H;
        if (playerContentController.m9389a() == null || z10) {
            c3296a = new C3296a(0);
        } else {
            C3300e value = playerController.mo9424y0().getValue();
            C2413j c2413j = playerController.f17639l;
            if (c2413j == null) {
                C5207g.m11117l("player");
                throw null;
            }
            c2413j.m7021D();
            boolean z13 = c2413j.f12274G;
            boolean z14 = playerController.f17621M;
            C9009e c9009e = C5207g.m11106a(playerController.mo9424y0().getValue().f17757a, AbstractC3299d.c.f17756a) ? playerController.f17626R.get(playerController.f17627S) : playerController.f17624P.get(playerController.f17625Q);
            int duration = playerController.getDuration();
            int currentPosition = playerController.getCurrentPosition();
            C2413j c2413j2 = playerController.f17639l;
            if (c2413j2 == null) {
                C5207g.m11117l("player");
                throw null;
            }
            c3296a = new C3296a(value, z13, z14, c9009e, duration, currentPosition, (int) c2413j2.getBufferedPosition(), playerContentController.m9389a(), z12);
        }
        playerController.mo9399J0().mo14371k(c3296a);
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: A0 */
    public final void mo9391A0(int i10) {
        this.f17636i.mo9391A0(i10);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m9392B0() {
        pause();
        boolean z10 = true;
        m9390E0(this, true, false, 2);
        C2413j c2413j = this.f17639l;
        PlayerContentController.PlayerContentItem playerContentItem = null;
        if (c2413j == null) {
            C5207g.m11117l("player");
            throw null;
        }
        c2413j.m7021D();
        boolean z11 = c2413j.f12274G;
        PlayerContentController playerContentController = this.f17616H;
        if (!z11) {
            PlayerContentController.PlayerContentItem playerContentItemM9400L = m9400L();
            boolean z12 = this.f17621M;
            ArrayList arrayList = playerContentController.f17596a;
            if (arrayList.size() > 0) {
                int i10 = playerContentController.f17598c;
                int i11 = i10 + 1;
                playerContentController.f17598c = i11;
                if (i11 > arrayList.size() - 1) {
                    if (z12) {
                        i10 = 0;
                    }
                    playerContentController.f17598c = i10;
                }
                playerContentItem = (PlayerContentController.PlayerContentItem) arrayList.get(playerContentController.f17598c);
            }
            if (playerContentItem != null) {
                if (!this.f17621M && C5207g.m11106a(playerContentItemM9400L, playerContentItem)) {
                    z10 = false;
                }
                m9395F0(playerContentItem, z10);
            }
            if (playerContentItem != null && !C5207g.m11106a(playerContentItemM9400L, playerContentItem)) {
                return;
            }
            mo9421x(AppUsageType.Listening);
            return;
        }
        ArrayList arrayList2 = playerContentController.f17596a;
        if (!arrayList2.isEmpty()) {
            ArrayList arrayList3 = playerContentController.f17597b;
            if (arrayList3.size() != arrayList2.size()) {
                arrayList3.clear();
                int size = arrayList2.size();
                for (int i12 = 0; i12 < size; i12++) {
                    arrayList3.add(Integer.valueOf(i12));
                }
                Collections.shuffle(arrayList3);
                playerContentController.f17599d = 0;
            } else if (playerContentController.f17599d + 1 < arrayList3.size()) {
                playerContentController.f17599d++;
            } else {
                Collections.shuffle(arrayList3);
                playerContentController.f17599d = 0;
            }
            int iIntValue = ((Number) arrayList3.get(playerContentController.f17599d)).intValue();
            playerContentController.f17598c = iIntValue;
            playerContentItem = (PlayerContentController.PlayerContentItem) arrayList2.get(iIntValue);
        }
        if (playerContentItem != null) {
            m9395F0(playerContentItem, true);
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: C */
    public final void mo7485C() {
    }

    /* JADX INFO: renamed from: C0 */
    public final void m9393C0() {
        PlayerContentController.PlayerContentItem playerContentItem;
        pause();
        m9390E0(this, true, false, 2);
        boolean z10 = this.f17621M;
        PlayerContentController playerContentController = this.f17616H;
        ArrayList arrayList = playerContentController.f17596a;
        if (!arrayList.isEmpty()) {
            int size = playerContentController.f17598c;
            int i10 = size - 1;
            playerContentController.f17598c = i10;
            if (i10 < 0) {
                if (z10) {
                    size = arrayList.size() - 1;
                }
                playerContentController.f17598c = size;
            }
            playerContentItem = (PlayerContentController.PlayerContentItem) arrayList.get(playerContentController.f17598c);
        } else {
            playerContentItem = null;
        }
        if (playerContentItem != null) {
            m9395F0(playerContentItem, true);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m9394D0() {
        PlayerContentController.PlayerContentItem playerContentItemM9400L = m9400L();
        if (playerContentItemM9400L != null) {
            C7828f.m15570d(this.f17629b, null, null, new PlayerController$skipVideoToNext$1$1(this, playerContentItemM9400L, null), 3);
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m9395F0(PlayerContentController.PlayerContentItem playerContentItem, boolean z10) {
        C3300e value;
        C3300e value2;
        C3300e value3;
        C3300e value4;
        SharedPreferences.Editor editorEdit = this.f17633f.f37891b.edit();
        int i10 = playerContentItem.f17600a;
        editorEdit.putInt("playlistTrack", i10).apply();
        InterfaceC7133n<C3300e> interfaceC7133nMo9424y0 = mo9424y0();
        do {
            value = interfaceC7133nMo9424y0.getValue();
        } while (!interfaceC7133nMo9424y0.mo14366c(value, C3300e.m9433b(value, null, AbstractC3298c.a.f17752a, 1)));
        InterfaceC7133n<C3297b> interfaceC7133nMo9423y = mo9423y();
        while (!interfaceC7133nMo9423y.mo14366c(interfaceC7133nMo9423y.getValue(), new C3297b(0))) {
        }
        m9390E0(this, true, false, 2);
        this.f17618J.removeCallbacks(this.f17617I);
        C7828f.m15570d(this.f17629b, null, null, new PlayerController$updateTrack$3(this, playerContentItem, z10, null), 3);
        AbstractC3299d.c cVar = AbstractC3299d.c.f17756a;
        AbstractC3299d abstractC3299d = playerContentItem.f17609j;
        if (C5207g.m11106a(abstractC3299d, cVar)) {
            InterfaceC7133n<C3300e> interfaceC7133nMo9424y1 = mo9424y0();
            do {
                value4 = interfaceC7133nMo9424y1.getValue();
            } while (!interfaceC7133nMo9424y1.mo14366c(value4, C3300e.m9433b(value4, AbstractC3299d.c.f17756a, null, 2)));
        } else if (C5207g.m11106a(abstractC3299d, AbstractC3299d.a.f17754a)) {
            InterfaceC7133n<C3300e> interfaceC7133nMo9424y2 = mo9424y0();
            do {
                value3 = interfaceC7133nMo9424y2.getValue();
            } while (!interfaceC7133nMo9424y2.mo14366c(value3, C3300e.m9433b(value3, AbstractC3299d.a.f17754a, null, 2)));
        } else {
            InterfaceC7133n<C3300e> interfaceC7133nMo9424y3 = mo9424y0();
            do {
                value2 = interfaceC7133nMo9424y3.getValue();
            } while (!interfaceC7133nMo9424y3.mo14366c(value2, C3300e.m9433b(value2, AbstractC3299d.a.f17754a, null, 2)));
        }
        Context context = this.f17628a;
        C5207g.m11111f(context, "context");
        File file = new File(new File(C0166e.m765k(context.getFilesDir().toString(), "/tracks/")) + "/" + i10 + ".mp3");
        String str = playerContentItem.f17601b;
        if ((!C7661i.m15250P2(str)) || file.exists()) {
            this.f17636i.mo9406X0(new DownloadItem(playerContentItem.f17608i, i10, str, playerContentItem.f17606g), z10);
        } else {
            pause();
            m9390E0(this, false, false, 3);
        }
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: G */
    public final InterfaceC7142w<List<PlayerContentController.PlayerContentItem>> mo9396G() {
        return this.f17635h.mo9396G();
    }

    /* JADX INFO: renamed from: G0 */
    public final void m9397G0(AbstractC3298c.a aVar) {
        C3300e value;
        C5207g.m11111f(aVar, "state");
        PlayerContentController.PlayerContentItem playerContentItemM9400L = m9400L();
        if (C5207g.m11106a(playerContentItemM9400L != null ? playerContentItemM9400L.f17609j : null, AbstractC3299d.c.f17756a)) {
            InterfaceC7133n<C3300e> interfaceC7133nMo9424y0 = mo9424y0();
            do {
                value = interfaceC7133nMo9424y0.getValue();
            } while (!interfaceC7133nMo9424y0.mo14366c(value, C3300e.m9433b(value, null, aVar, 1)));
        }
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: I1 */
    public final InterfaceC7133n<AbstractC4267a> mo9398I1() {
        return this.f17635h.mo9398I1();
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: J0 */
    public final InterfaceC7133n<C3296a> mo9399J0() {
        return this.f17635h.mo9399J0();
    }

    /* JADX INFO: renamed from: L */
    public final PlayerContentController.PlayerContentItem m9400L() {
        return this.f17616H.m9389a();
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: L1 */
    public final void mo9401L1(List<PlayerContentController.PlayerContentItem> list) {
        C5207g.m11111f(list, "tracks");
        this.f17635h.mo9401L1(list);
    }

    @Override // p244lh.InterfaceC7364a
    /* JADX INFO: renamed from: N */
    public final void mo9402N(AppUsageType appUsageType) {
        C5207g.m11111f(appUsageType, "appUsageType");
        this.f17637j.mo9402N(appUsageType);
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: O0 */
    public final void mo9403O0(String str, int i10, double d10) {
        C5207g.m11111f(str, "language");
        this.f17635h.mo9403O0(str, i10, d10);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: R */
    public final void mo7492R(boolean z10) {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: S */
    public final int m9404S() {
        C2413j c2413j = this.f17639l;
        if (c2413j != null) {
            return c2413j.getPlaybackState();
        }
        C5207g.m11117l("player");
        throw null;
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: S1 */
    public final Object mo9405S1(DownloadItem downloadItem, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f17636i.mo9405S1(downloadItem, interfaceC9968c);
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: X0 */
    public final void mo9406X0(DownloadItem downloadItem, boolean z10) {
        this.f17636i.mo9406X0(downloadItem, z10);
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: X1 */
    public final Object mo9407X1(String str, List<Pair<String, Integer>> list, int i10, boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f17636i.mo9407X1(str, list, i10, false, interfaceC9968c);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m9408a0() {
        if (!this.f17616H.f17596a.isEmpty()) {
            if (isPlaying()) {
                pause();
            } else {
                this.f17632e.m15505b(null, "audio_play");
                start();
            }
        }
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: a2 */
    public final InterfaceC7137r<AbstractC3312a<DownloadItem>> mo9409a2() {
        return this.f17636i.mo9409a2();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: b0 */
    public final void mo7497b0() {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: c0 */
    public final void mo7498c0(int i10) {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return true;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m9410d0(int i10) {
        if (i10 < 0) {
            this.f17632e.m15505b(null, "audio_rewind");
        }
        seekTo(getCurrentPosition() + i10);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m9411g0(int i10) {
        PlayerContentController.PlayerContentItem playerContentItem;
        PlayerContentController playerContentController = this.f17616H;
        ArrayList arrayList = playerContentController.f17596a;
        if (!(!arrayList.isEmpty())) {
            playerContentItem = null;
            break;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                playerContentItem = null;
                break;
            }
            playerContentItem = (PlayerContentController.PlayerContentItem) arrayList.get(i11);
            if (i10 == playerContentItem.f17600a) {
                playerContentController.f17598c = i11;
                break;
            }
            i11++;
        }
        if (playerContentItem != null) {
            m9395F0(playerContentItem, true);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        C2413j c2413j = this.f17639l;
        if (c2413j != null) {
            return c2413j.getBufferedPercentage();
        }
        C5207g.m11117l("player");
        throw null;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return mo9423y().getValue().f17750c;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return (int) mo9423y().getValue().f17749b;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: i0 */
    public final void mo7501i0(int i10, boolean z10) {
        C3300e value;
        AbstractC3299d.a aVar;
        AbstractC3298c.a aVar2;
        C3300e value2;
        AbstractC3299d.a aVar3;
        AbstractC3298c.a aVar4;
        C3297b value3;
        C3300e value4;
        AbstractC3299d.a aVar5;
        AbstractC3298c.a aVar6;
        C3297b value5;
        C3300e value6;
        AbstractC3299d.a aVar7;
        AbstractC3298c.b bVar;
        C2413j c2413j = this.f17639l;
        if (c2413j == null) {
            C5207g.m11117l("player");
            throw null;
        }
        this.f17634g.mo9747z1(i10, c2413j.getCurrentPosition(), z10);
        if (i10 == 3 && z10) {
            InterfaceC7133n<C3297b> interfaceC7133nMo9423y = mo9423y();
            do {
                value5 = interfaceC7133nMo9423y.getValue();
            } while (!interfaceC7133nMo9423y.mo14366c(value5, C3297b.m9431a(value5, m9419v0(), 0, 13)));
            InterfaceC7133n<C3300e> interfaceC7133nMo9424y0 = mo9424y0();
            do {
                value6 = interfaceC7133nMo9424y0.getValue();
                aVar7 = AbstractC3299d.a.f17754a;
                bVar = AbstractC3298c.b.f17753a;
                value6.getClass();
            } while (!interfaceC7133nMo9424y0.mo14366c(value6, C3300e.m9432a(aVar7, bVar)));
            this.f17638k = 3;
        } else if (i10 == 3) {
            InterfaceC7133n<C3297b> interfaceC7133nMo9423y2 = mo9423y();
            do {
                value3 = interfaceC7133nMo9423y2.getValue();
            } while (!interfaceC7133nMo9423y2.mo14366c(value3, C3297b.m9431a(value3, m9419v0(), 0, 13)));
            InterfaceC7133n<C3300e> interfaceC7133nMo9424y1 = mo9424y0();
            do {
                value4 = interfaceC7133nMo9424y1.getValue();
                aVar5 = AbstractC3299d.a.f17754a;
                aVar6 = AbstractC3298c.a.f17752a;
                value4.getClass();
            } while (!interfaceC7133nMo9424y1.mo14366c(value4, C3300e.m9432a(aVar5, aVar6)));
            this.f17638k = 3;
        } else if (i10 == 2) {
            this.f17638k = 2;
        } else {
            PlayerContentController playerContentController = this.f17616H;
            if (i10 == 4) {
                InterfaceC7133n<C3300e> interfaceC7133nMo9424y2 = mo9424y0();
                do {
                    value2 = interfaceC7133nMo9424y2.getValue();
                    aVar3 = AbstractC3299d.a.f17754a;
                    aVar4 = AbstractC3298c.a.f17752a;
                    value2.getClass();
                } while (!interfaceC7133nMo9424y2.mo14366c(value2, C3300e.m9432a(aVar3, aVar4)));
                if (this.f17638k != 4) {
                    if (playerContentController.m9389a() != null) {
                        seekTo(0);
                        pause();
                        PlayerContentController.PlayerContentItem playerContentItemM9389a = playerContentController.m9389a();
                        if (playerContentItemM9389a != null) {
                            C7828f.m15570d(this.f17629b, null, null, new PlayerController$trackEnded$1(this, playerContentItemM9389a.f17600a, null), 3);
                        }
                        m9417t0(this.f17620L);
                    }
                    m9392B0();
                }
                this.f17638k = 4;
            } else if (i10 == 1) {
                InterfaceC7133n<C3300e> interfaceC7133nMo9424y3 = mo9424y0();
                do {
                    value = interfaceC7133nMo9424y3.getValue();
                    aVar = AbstractC3299d.a.f17754a;
                    aVar2 = AbstractC3298c.a.f17752a;
                    value.getClass();
                } while (!interfaceC7133nMo9424y3.mo14366c(value, C3300e.m9432a(aVar, aVar2)));
                PlayerContentController.PlayerContentItem playerContentItemM9389a2 = playerContentController.m9389a();
                if (playerContentItemM9389a2 != null) {
                    m9395F0(playerContentItemM9389a2, true);
                }
            }
        }
        m9416r0();
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: i1 */
    public final void mo9412i1(ArrayList arrayList, String str) {
        C5207g.m11111f(str, "language");
        this.f17636i.mo9412i1(arrayList, str);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        return mo9424y0().getValue().f17758b instanceof AbstractC3298c.b;
    }

    /* JADX WARN: Unreachable blocks removed: 7, instructions: 7 */
    /* JADX INFO: renamed from: k0 */
    public final void m9413k0(String str, int i10, boolean z10) {
        InterfaceC2399c interfaceC2399c;
        C3300e value;
        AbstractC3299d.a aVar;
        AbstractC3298c.a aVar2;
        C3297b value2;
        DefaultDrmSessionManager defaultDrmSessionManagerM6959b;
        if (mo9424y0().getValue().f17757a instanceof AbstractC3299d.a) {
            Uri uri = Uri.parse(str);
            C5207g.m11110e(uri, "parse(fileName)");
            this.f17618J.removeCallbacks(this.f17617I);
            m9390E0(this, true, false, 2);
            C9884i c9884i = new C9884i(uri);
            final FileDataSource fileDataSource = new FileDataSource();
            try {
                fileDataSource.mo7273e(c9884i);
                InterfaceC9882g.a aVar3 = new InterfaceC9882g.a() { // from class: sh.c
                    @Override // p454wa.InterfaceC9882g.a
                    /* JADX INFO: renamed from: a */
                    public final InterfaceC9882g mo14771a() {
                        FileDataSource fileDataSource2 = fileDataSource;
                        C5207g.m11111f(fileDataSource2, "$fileDataSource");
                        return fileDataSource2;
                    }
                };
                C2466p c2466p = C2466p.f12765g;
                C2466p.a aVar4 = new C2466p.a();
                aVar4.f12778b = uri;
                C2466p c2466pM7213a = aVar4.m7213a();
                C7505f c7505f = new C7505f();
                synchronized (c7505f) {
                    try {
                        c7505f.f41485b = 4;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                synchronized (c7505f) {
                    try {
                        c7505f.f41484a = false;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                C5509a c5509a = new C5509a(6, c7505f);
                Object obj = new Object();
                C2527a c2527a = new C2527a();
                c2466pM7213a.f12772b.getClass();
                c2466pM7213a.f12772b.getClass();
                C2466p.d dVar = c2466pM7213a.f12772b.f12842c;
                if (dVar == null || C10134c0.f51354a < 18) {
                    interfaceC2399c = InterfaceC2399c.f12205a;
                } else {
                    synchronized (obj) {
                        try {
                            defaultDrmSessionManagerM6959b = !C10134c0.m19034a(dVar, null) ? C2397a.m6959b(dVar) : null;
                            defaultDrmSessionManagerM6959b.getClass();
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    interfaceC2399c = defaultDrmSessionManagerM6959b;
                }
                C2497n c2497n = new C2497n(c2466pM7213a, aVar3, c5509a, interfaceC2399c, c2527a, 1048576);
                this.f17622N = 0;
                C2413j c2413j = this.f17639l;
                if (c2413j == null) {
                    C5207g.m11117l("player");
                    throw null;
                }
                c2413j.pause();
                C2413j c2413j2 = this.f17639l;
                if (c2413j2 == null) {
                    C5207g.m11117l("player");
                    throw null;
                }
                c2413j2.setMediaSource(c2497n);
                C2413j c2413j3 = this.f17639l;
                if (c2413j3 == null) {
                    C5207g.m11117l("player");
                    throw null;
                }
                c2413j3.prepare();
                InterfaceC7133n<C3300e> interfaceC7133nMo9424y0 = mo9424y0();
                do {
                    value = interfaceC7133nMo9424y0.getValue();
                    aVar = AbstractC3299d.a.f17754a;
                    aVar2 = AbstractC3298c.a.f17752a;
                    value.getClass();
                } while (!interfaceC7133nMo9424y0.mo14366c(value, C3300e.m9432a(aVar, aVar2)));
                InterfaceC7133n<C3297b> interfaceC7133nMo9423y = mo9423y();
                do {
                    value2 = interfaceC7133nMo9423y.getValue();
                } while (!interfaceC7133nMo9423y.mo14366c(value2, C3297b.m9431a(value2, m9419v0(), 0, 13)));
                Integer num = (Integer) C7828f.m15572f(EmptyCoroutineContext.f38093a, new PlayerController$setupAudioInPlayer$progress$1(this, i10, null));
                if (num == null) {
                    num = 0;
                }
                C2413j c2413j4 = this.f17639l;
                if (c2413j4 == null) {
                    C5207g.m11117l("player");
                    throw null;
                }
                c2413j4.m6922b(5, num.intValue());
                float f3 = this.f17624P.get(this.f17625Q).f47230a;
                C2413j c2413j5 = this.f17639l;
                if (c2413j5 == null) {
                    C5207g.m11117l("player");
                    throw null;
                }
                C2505u c2505u = new C2505u(f3, c2413j5.getPlaybackParameters().f13475b);
                C2413j c2413j6 = this.f17639l;
                if (c2413j6 == null) {
                    C5207g.m11117l("player");
                    throw null;
                }
                c2413j6.setPlaybackParameters(c2505u);
                if (z10) {
                    C2413j c2413j7 = this.f17639l;
                    if (c2413j7 == null) {
                        C5207g.m11117l("player");
                        throw null;
                    }
                    c2413j7.play();
                } else {
                    C2413j c2413j8 = this.f17639l;
                    if (c2413j8 == null) {
                        C5207g.m11117l("player");
                        throw null;
                    }
                    c2413j8.pause();
                }
                m9416r0();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: l0 */
    public final void mo7504l0() {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: n0 */
    public final void mo7506n0(C2505u c2505u) {
        C5207g.m11111f(c2505u, "playbackParameters");
    }

    /* JADX INFO: renamed from: o0 */
    public final PlayingFrom m9414o0() {
        return this.f17634g.mo9726R1().getValue();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m9415p0(boolean z10) {
        pause();
        mo9401L1(EmptyList.f38032a);
        if (z10) {
            m9390E0(this, false, false, 3);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        C3300e value;
        C2413j c2413j = this.f17639l;
        if (c2413j == null) {
            C5207g.m11117l("player");
            throw null;
        }
        c2413j.pause();
        InterfaceC7133n<C3300e> interfaceC7133nMo9424y0 = mo9424y0();
        do {
            value = interfaceC7133nMo9424y0.getValue();
        } while (!interfaceC7133nMo9424y0.mo14366c(value, C3300e.m9433b(value, null, AbstractC3298c.a.f17752a, 1)));
        m9416r0();
        mo9421x(AppUsageType.Listening);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m9416r0() {
        C3297b value;
        long j10;
        PlayerContentController.PlayerContentItem playerContentItemM9389a = this.f17616H.m9389a();
        if (playerContentItemM9389a != null) {
            m9390E0(this, false, false, 3);
            long currentPosition = getCurrentPosition();
            InterfaceC7133n<C3297b> interfaceC7133nMo9423y = mo9423y();
            do {
                value = interfaceC7133nMo9423y.getValue();
            } while (!interfaceC7133nMo9423y.mo14366c(value, C3297b.m9431a(value, 0L, (int) currentPosition, 11)));
            Handler handler = this.f17618J;
            RunnableC0190i runnableC0190i = this.f17617I;
            handler.removeCallbacks(runnableC0190i);
            if (m9404S() == 1 || m9404S() == 4) {
                return;
            }
            if (isPlaying() && m9404S() == 3) {
                long j11 = 125;
                j10 = j11 - (currentPosition % j11);
                long j12 = this.f17620L + j10;
                this.f17620L = j12;
                if (j12 >= 5000) {
                    m9417t0(j12);
                    this.f17620L = 0L;
                }
                C7828f.m15570d(this.f17629b, null, null, new PlayerController$scheduledUpdate$1$2(this, playerContentItemM9389a, currentPosition, null), 3);
            } else {
                j10 = 125;
            }
            handler.postDelayed(runnableC0190i, j10);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i10) {
        C3297b value;
        PlayerContentController.PlayerContentItem playerContentItemM9389a = this.f17616H.m9389a();
        long jMin = Math.min(Math.max(0, i10), getDuration());
        InterfaceC7133n<C3297b> interfaceC7133nMo9423y = mo9423y();
        do {
            value = interfaceC7133nMo9423y.getValue();
        } while (!interfaceC7133nMo9423y.mo14366c(value, C3297b.m9431a(value, 0L, (int) jMin, 11)));
        if (mo9424y0().getValue().f17757a instanceof AbstractC3299d.a) {
            C2413j c2413j = this.f17639l;
            if (c2413j == null) {
                C5207g.m11117l("player");
                throw null;
            }
            c2413j.m6922b(5, jMin);
        }
        if (!isPlaying() && playerContentItemM9389a != null) {
            C7828f.m15570d(this.f17629b, null, null, new PlayerController$seekTo$2$1(this, playerContentItemM9389a, getCurrentPosition(), null), 3);
        }
        m9390E0(this, false, true, 1);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        C3300e value;
        if (getCurrentPosition() >= getDuration() || getCurrentPosition() < 0) {
            seekTo(0);
            pause();
            PlayerContentController.PlayerContentItem playerContentItemM9400L = m9400L();
            if (playerContentItemM9400L != null) {
                C7828f.m15570d(this.f17629b, null, null, new PlayerController$start$1$1(this, playerContentItemM9400L.f17600a, null), 3);
            }
        }
        PlayerContentController.PlayerContentItem playerContentItemM9400L2 = m9400L();
        if (playerContentItemM9400L2 != null) {
            File file = this.f17619K;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(file);
            sb2.append("/");
            int i10 = playerContentItemM9400L2.f17600a;
            m9413k0(C0166e.m768o(sb2, i10, ".mp3"), i10, true);
        }
        InterfaceC7133n<C3300e> interfaceC7133nMo9424y0 = mo9424y0();
        do {
            value = interfaceC7133nMo9424y0.getValue();
        } while (!interfaceC7133nMo9424y0.mo14366c(value, C3300e.m9433b(value, null, AbstractC3298c.b.f17753a, 1)));
        mo9402N(AppUsageType.Listening);
        m9416r0();
    }

    /* JADX INFO: renamed from: t0 */
    public final void m9417t0(long j10) {
        PlayerContentController.PlayerContentItem playerContentItemM9400L = m9400L();
        if (playerContentItemM9400L != null && getDuration() > 0) {
            C2413j c2413j = this.f17639l;
            if (c2413j == null) {
                C5207g.m11117l("player");
                throw null;
            }
            double duration = ((j10 / 1000.0d) * ((double) c2413j.getPlaybackParameters().f13474a)) / ((double) (getDuration() / 1000));
            if (!Double.isNaN(duration) && !Double.isInfinite(duration) && duration <= 1.0d) {
                mo9403O0(playerContentItemM9400L.f17608i, playerContentItemM9400L.f17600a, (duration * 100.0d) / 100.0d);
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m9418u0() {
        if (m9400L() != null) {
            if (mo9424y0().getValue().f17757a instanceof AbstractC3299d.c) {
                if (this.f17627S == this.f17626R.size() - 1) {
                    this.f17627S = -1;
                }
                this.f17627S++;
            } else {
                int i10 = this.f17625Q;
                List<C9009e> list = this.f17624P;
                if (i10 == list.size() - 1) {
                    this.f17625Q = -1;
                }
                int i11 = this.f17625Q + 1;
                this.f17625Q = i11;
                float f3 = list.get(i11).f47230a;
                C2413j c2413j = this.f17639l;
                if (c2413j == null) {
                    C5207g.m11117l("player");
                    throw null;
                }
                C2505u c2505u = new C2505u(f3, c2413j.getPlaybackParameters().f13475b);
                C2413j c2413j2 = this.f17639l;
                if (c2413j2 == null) {
                    C5207g.m11117l("player");
                    throw null;
                }
                c2413j2.setPlaybackParameters(c2505u);
            }
            this.f17632e.m15505b(null, "audio_speed");
            m9416r0();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final int m9419v0() {
        int duration;
        C2413j c2413j = this.f17639l;
        Integer numValueOf = null;
        if (c2413j == null) {
            C5207g.m11117l("player");
            throw null;
        }
        if (c2413j.getDuration() == -9223372036854775807L) {
            PlayerContentController.PlayerContentItem playerContentItemM9400L = m9400L();
            if (playerContentItemM9400L != null) {
                int i10 = playerContentItemM9400L.f17604e;
                if (i10 != 0) {
                    return i10;
                }
                duration = this.f17622N;
                if (duration == 0) {
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        File file = this.f17619K;
                        PlayerContentController.PlayerContentItem playerContentItemM9400L2 = m9400L();
                        if (playerContentItemM9400L2 != null) {
                            numValueOf = Integer.valueOf(playerContentItemM9400L2.f17600a);
                        }
                        mediaMetadataRetriever.setDataSource(file + "/" + numValueOf + ".mp3");
                        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                        mediaMetadataRetriever.release();
                        if (strExtractMetadata != null) {
                            this.f17622N = Integer.parseInt(strExtractMetadata);
                        }
                        return this.f17622N;
                    } catch (Exception unused) {
                    }
                }
            }
            return 0;
        }
        C2413j c2413j2 = this.f17639l;
        if (c2413j2 == null) {
            C5207g.m11117l("player");
            throw null;
        }
        duration = (int) c2413j2.getDuration();
        return duration;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m9420w0() {
        C2413j c2413j = this.f17639l;
        if (c2413j == null) {
            C5207g.m11117l("player");
            throw null;
        }
        c2413j.m7021D();
        c2413j.setShuffleModeEnabled(!c2413j.f12274G);
        C2413j c2413j2 = this.f17639l;
        if (c2413j2 == null) {
            C5207g.m11117l("player");
            throw null;
        }
        c2413j2.m7021D();
        if (c2413j2.f12274G) {
            this.f17632e.m15505b(null, "audio_shuffle");
        }
        m9416r0();
    }

    @Override // p244lh.InterfaceC7364a
    /* JADX INFO: renamed from: x */
    public final void mo9421x(AppUsageType appUsageType) {
        C5207g.m11111f(appUsageType, "appUsageType");
        this.f17637j.mo9421x(appUsageType);
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: x0 */
    public final Object mo9422x0(DownloadItem downloadItem, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f17636i.mo9422x0(downloadItem, interfaceC9968c);
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: y */
    public final InterfaceC7133n<C3297b> mo9423y() {
        return this.f17635h.mo9423y();
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: y0 */
    public final InterfaceC7133n<C3300e> mo9424y0() {
        return this.f17635h.mo9424y0();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v.c
    /* JADX INFO: renamed from: z */
    public final void mo7510z(ExoPlaybackException exoPlaybackException) {
        C5207g.m11111f(exoPlaybackException, "error");
        exoPlaybackException.printStackTrace();
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: z0 */
    public final InterfaceC7133n<Triple<PlayerContentController.PlayerContentItem, Boolean, Integer>> mo9425z0() {
        return this.f17635h.mo9425z0();
    }
}
