package com.lingq.player;

import ae.C0062b;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import androidx.activity.RunnableC0193l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.bumptech.glide.C2089k;
import com.bumptech.glide.ComponentCallbacks2C2080b;
import com.google.android.exoplayer2.C2413j;
import com.lingq.player.PlayerController;
import com.lingq.player.PlayerService;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.InterfaceC7142w;
import no.C7828f;
import no.InterfaceC7882z;
import p005a4.C0017b;
import p025b4.C1307a;
import p040c4.C1686k;
import p155he.C6041e;
import p171i6.C6200e;
import p232l2.C7233l;
import p232l2.C7236o;
import p258m6.C7485e;
import p260m8.C7499b;
import p326q.C8446b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sh.AbstractServiceC9005a;
import sh.C9012h;
import sh.C9015k;
import sh.InterfaceC9013i;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/player/PlayerService;", "Landroid/app/Service;", "<init>", "()V", "a", "MediaReceiver", "b", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class PlayerService extends AbstractServiceC9005a {

    /* JADX INFO: renamed from: S */
    public static MediaSessionCompat f17687S;

    /* JADX INFO: renamed from: H */
    public NotificationManager f17688H;

    /* JADX INFO: renamed from: I */
    public C3292a f17689I;

    /* JADX INFO: renamed from: J */
    public AudioManager f17690J;

    /* JADX INFO: renamed from: K */
    public NotificationChannel f17691K;

    /* JADX INFO: renamed from: L */
    public C7236o f17692L;

    /* JADX INFO: renamed from: O */
    public float f17695O;

    /* JADX INFO: renamed from: P */
    public int f17696P;

    /* JADX INFO: renamed from: d */
    public PlayerController f17699d;

    /* JADX INFO: renamed from: e */
    public InterfaceC7882z f17700e;

    /* JADX INFO: renamed from: f */
    public CoroutineDispatcher f17701f;

    /* JADX INFO: renamed from: g */
    public InterfaceC9013i f17702g;

    /* JADX INFO: renamed from: h */
    public boolean f17703h;

    /* JADX INFO: renamed from: i */
    public boolean f17704i;

    /* JADX INFO: renamed from: j */
    public Object f17705j;

    /* JADX INFO: renamed from: k */
    public AudioFocusRequest f17706k;

    /* JADX INFO: renamed from: l */
    public PlaybackStateCompat.C0161d f17707l;

    /* JADX INFO: renamed from: M */
    public final Handler f17693M = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: N */
    public final RunnableC0193l f17694N = new RunnableC0193l(12, this);

    /* JADX INFO: renamed from: Q */
    public int f17697Q = 1;

    /* JADX INFO: renamed from: R */
    public final C9012h f17698R = new AudioManager.OnAudioFocusChangeListener() { // from class: sh.h
        /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i10) {
            PlayerService playerService = this.f47234a;
            MediaSessionCompat mediaSessionCompat = PlayerService.f17687S;
            C5207g.m11111f(playerService, "this$0");
            if (i10 == -3) {
                playerService.f17696P = -3;
                C2413j c2413j = playerService.m9427b().f17639l;
                if (c2413j == null) {
                    C5207g.m11117l("player");
                    throw null;
                }
                c2413j.m7021D();
                playerService.f17695O = c2413j.f12310i0;
                C2413j c2413j2 = playerService.m9427b().f17639l;
                if (c2413j2 != null) {
                    c2413j2.setVolume(0.1f);
                    return;
                } else {
                    C5207g.m11117l("player");
                    throw null;
                }
            }
            if (i10 == -2) {
                playerService.f17696P = -2;
                Object obj = playerService.f17705j;
                if (obj == null) {
                    C5207g.m11117l("focusLock");
                    throw null;
                }
                synchronized (obj) {
                    try {
                        playerService.f17703h = playerService.m9427b().isPlaying();
                        playerService.f17704i = false;
                        C9072e c9072e = C9072e.f47360a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                playerService.m9427b().pause();
                return;
            }
            if (i10 == -1) {
                playerService.f17696P = -1;
                if (playerService.f17704i || playerService.f17703h) {
                    Object obj2 = playerService.f17705j;
                    if (obj2 == null) {
                        C5207g.m11117l("focusLock");
                        throw null;
                    }
                    synchronized (obj2) {
                        try {
                            playerService.f17704i = false;
                            playerService.f17703h = false;
                            C9072e c9072e2 = C9072e.f47360a;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                playerService.m9427b().pause();
                return;
            }
            if (i10 != 1) {
                return;
            }
            if (playerService.f17696P == -3) {
                PlayerController playerControllerM9427b = playerService.m9427b();
                float f3 = playerService.f17695O;
                C2413j c2413j3 = playerControllerM9427b.f17639l;
                if (c2413j3 == null) {
                    C5207g.m11117l("player");
                    throw null;
                }
                c2413j3.setVolume(f3);
            }
            playerService.f17696P = 1;
            if (playerService.f17704i || playerService.f17703h) {
                Object obj3 = playerService.f17705j;
                if (obj3 == null) {
                    C5207g.m11117l("focusLock");
                    throw null;
                }
                synchronized (obj3) {
                    try {
                        playerService.f17704i = false;
                        playerService.f17703h = false;
                        C9072e c9072e3 = C9072e.f47360a;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                playerService.m9427b().start();
            }
        }
    };

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/player/PlayerService$MediaReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    public static final class MediaReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            C5207g.m11111f(context, "context");
            C5207g.m11111f(intent, "intent");
            MediaSessionCompat mediaSessionCompat = PlayerService.f17687S;
            if (mediaSessionCompat == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
                return;
            }
            if (intent.hasExtra("android.intent.extra.KEY_EVENT")) {
                KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                MediaControllerCompat mediaControllerCompat = mediaSessionCompat.f369b;
                if (keyEvent != null) {
                    mediaControllerCompat.f357a.f358a.dispatchMediaButtonEvent(keyEvent);
                } else {
                    mediaControllerCompat.getClass();
                    throw new IllegalArgumentException("KeyEvent may not be null");
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.player.PlayerService$a */
    public final class C3292a extends BroadcastReceiver {
        public C3292a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            C5207g.m11111f(context, "context");
            C5207g.m11111f(intent, "intent");
            if (C5207g.m11106a("android.media.AUDIO_BECOMING_NOISY", intent.getAction())) {
                PlayerService.this.m9427b().pause();
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.player.PlayerService$b */
    public final class C3293b extends MediaSessionCompat.AbstractC0149a {
        public C3293b() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0149a
        /* JADX INFO: renamed from: b */
        public final void mo642b() {
            PlayerService playerService = PlayerService.this;
            PlayerService.m9426a(playerService);
            playerService.m9427b().m9410d0(5000);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0149a
        /* JADX INFO: renamed from: d */
        public final void mo644d() {
            PlayerService playerService = PlayerService.this;
            try {
                playerService.unregisterReceiver(playerService.f17689I);
            } catch (IllegalArgumentException e10) {
                e10.printStackTrace();
            }
            PlayerService.m9426a(playerService);
            playerService.m9427b().pause();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0149a
        /* JADX INFO: renamed from: e */
        public final void mo645e() {
            Integer numValueOf;
            PlayerService playerService = PlayerService.this;
            MediaSessionCompat mediaSessionCompat = PlayerService.f17687S;
            playerService.f17705j = new Object();
            playerService.f17704i = false;
            AudioManager audioManager = playerService.f17690J;
            if (audioManager != null) {
                AudioFocusRequest audioFocusRequest = playerService.f17706k;
                if (audioFocusRequest == null) {
                    C5207g.m11117l("focusRequest");
                    throw null;
                }
                numValueOf = Integer.valueOf(audioManager.requestAudioFocus(audioFocusRequest));
            } else {
                numValueOf = null;
            }
            Object obj = playerService.f17705j;
            if (obj == null) {
                C5207g.m11117l("focusLock");
                throw null;
            }
            synchronized (obj) {
                if (numValueOf != null) {
                    try {
                        if (numValueOf.intValue() != 0) {
                            if (numValueOf != null) {
                            }
                            if (numValueOf != null) {
                                playerService.f17704i = true;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else if (numValueOf != null || numValueOf.intValue() != 1) {
                    if (numValueOf != null && numValueOf.intValue() == 2) {
                        playerService.f17704i = true;
                    }
                }
                C9072e c9072e = C9072e.f47360a;
            }
            PlayerService.m9426a(PlayerService.this);
            PlayerService.this.m9427b().start();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0149a
        /* JADX INFO: renamed from: f */
        public final void mo646f() {
            PlayerService playerService = PlayerService.this;
            PlayerService.m9426a(playerService);
            playerService.m9427b().m9410d0(-5000);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0149a
        /* JADX INFO: renamed from: g */
        public final void mo647g(long j10) {
            PlayerService playerService = PlayerService.this;
            PlayerService.m9426a(playerService);
            playerService.m9427b().seekTo((int) j10);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0149a
        /* JADX INFO: renamed from: h */
        public final void mo648h() {
            PlayerService playerService = PlayerService.this;
            PlayerService.m9426a(playerService);
            playerService.m9427b().m9392B0();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0149a
        /* JADX INFO: renamed from: i */
        public final void mo649i() {
            PlayerService playerService = PlayerService.this;
            PlayerService.m9426a(playerService);
            playerService.m9427b().m9393C0();
        }
    }

    /* JADX INFO: renamed from: com.lingq.player.PlayerService$onCreate$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.player.PlayerService$onCreate$1", m19206f = "PlayerService.kt", m19207l = {141}, m19208m = "invokeSuspend")
    public static final class C32941 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f17710e;

        /* JADX INFO: renamed from: com.lingq.player.PlayerService$onCreate$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lsh/k;", "state", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.player.PlayerService$onCreate$1$1", m19206f = "PlayerService.kt", m19207l = {143}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<C9015k, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f17712e;

            /* JADX INFO: renamed from: f */
            public /* synthetic */ Object f17713f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ PlayerService f17714g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlayerService playerService, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f17714g = playerService;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f17714g, interfaceC9968c);
                anonymousClass1.f17713f = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(C9015k c9015k, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(c9015k, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f17712e;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    C9015k c9015k = (C9015k) this.f17713f;
                    if (c9015k != null) {
                        PlayerService playerService = this.f17714g;
                        CoroutineDispatcher coroutineDispatcher = playerService.f17701f;
                        if (coroutineDispatcher == null) {
                            C5207g.m11117l("mainDispatcher");
                            throw null;
                        }
                        PlayerService$onCreate$1$1$1$1 playerService$onCreate$1$1$1$1 = new PlayerService$onCreate$1$1$1$1(playerService, c9015k, null);
                        this.f17712e = 1;
                        if (C7828f.m15574h(this, coroutineDispatcher, playerService$onCreate$1$1$1$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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

        public C32941(InterfaceC9968c<? super C32941> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return PlayerService.this.new C32941(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C32941) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f17710e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                PlayerService playerService = PlayerService.this;
                InterfaceC9013i interfaceC9013i = playerService.f17702g;
                if (interfaceC9013i == null) {
                    C5207g.m11117l("serviceController");
                    throw null;
                }
                InterfaceC7142w<C9015k> interfaceC7142wMo9721F0 = interfaceC9013i.mo9721F0();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playerService, null);
                this.f17710e = 1;
                if (C0062b.m369m0(interfaceC7142wMo9721F0, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: a */
    public static final void m9426a(PlayerService playerService) {
        playerService.f17693M.removeCallbacks(playerService.f17694N);
    }

    /* JADX INFO: renamed from: b */
    public final PlayerController m9427b() {
        PlayerController playerController = this.f17699d;
        if (playerController != null) {
            return playerController;
        }
        C5207g.m11117l("playerController");
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: c */
    public final void m9428c() {
        this.f17691K = new NotificationChannel("LingQ", "LingQ Player", 1);
        Object systemService = getSystemService("notification");
        C5207g.m11109d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        this.f17688H = notificationManager;
        NotificationChannel notificationChannel = this.f17691K;
        if (notificationChannel == null) {
            C5207g.m11117l("channel");
            throw null;
        }
        notificationManager.createNotificationChannel(notificationChannel);
        m9430f();
        C7236o c7236o = this.f17692L;
        if (c7236o == null) {
            C5207g.m11117l("builder");
            throw null;
        }
        Notification notificationM14578b = c7236o.m14578b();
        C5207g.m11110e(notificationM14578b, "builder.build()");
        Object systemService2 = getSystemService("notification");
        C5207g.m11109d(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager2 = (NotificationManager) systemService2;
        this.f17688H = notificationManager2;
        notificationManager2.notify(12355, notificationM14578b);
        try {
            startForeground(12355, notificationM14578b);
        } catch (Exception e10) {
            C6041e.m12476a().m12477b(e10);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final void m9429e() {
        try {
            unregisterReceiver(this.f17689I);
        } catch (IllegalArgumentException unused) {
        }
        AudioManager audioManager = this.f17690J;
        if (audioManager != null) {
            AudioFocusRequest audioFocusRequest = this.f17706k;
            if (audioFocusRequest == null) {
                C5207g.m11117l("focusRequest");
                throw null;
            }
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }
        m9427b().pause();
        NotificationManager notificationManager = this.f17688H;
        if (notificationManager != null) {
            notificationManager.cancelAll();
        }
        MediaSessionCompat mediaSessionCompat = f17687S;
        if (mediaSessionCompat == null) {
            return;
        }
        mediaSessionCompat.m636c(false);
    }

    /* JADX INFO: renamed from: f */
    public final void m9430f() {
        PendingIntent pendingIntentM5408a;
        MediaSessionCompat mediaSessionCompat = f17687S;
        if (mediaSessionCompat != null) {
            PlaybackStateCompat.C0161d c0161d = this.f17707l;
            if (c0161d == null) {
                C5207g.m11117l("stateBuilder");
                throw null;
            }
            mediaSessionCompat.m637d(c0161d.m726a());
        }
        PlaybackStateCompat.C0161d c0161d2 = this.f17707l;
        if (c0161d2 == null) {
            C5207g.m11117l("stateBuilder");
            throw null;
        }
        PlaybackStateCompat playbackStateCompatM726a = c0161d2.m726a();
        PlayerContentController.PlayerContentItem playerContentItemM9400L = m9427b().m9400L();
        int i10 = playbackStateCompatM726a.f400a;
        if (playerContentItemM9400L == null) {
            C7236o c7236o = new C7236o(this, "LingQ");
            this.f17692L = c7236o;
            c7236o.f40642b.clear();
            C7236o c7236o2 = this.f17692L;
            if (c7236o2 == null) {
                C5207g.m11117l("builder");
                throw null;
            }
            c7236o2.m14579d("LingQ Player");
            c7236o2.f40664x.icon = R.drawable.ic_lingq;
            c7236o2.m14580e(16, false);
            c7236o2.m14580e(8, true);
            c7236o2.m14580e(2, i10 == 3);
            c7236o2.f40662v = 1;
            return;
        }
        C7233l c7233l = new C7233l(R.drawable.ic_player_play, "Play", C1307a.m4865a(this, 4L));
        C7233l c7233l2 = new C7233l(R.drawable.ic_player_pause, "Pause", C1307a.m4865a(this, 2L));
        if (i10 == 3) {
            c7233l = c7233l2;
        }
        C7233l c7233l3 = new C7233l(R.drawable.ic_playlist_previous, "Previous", C1307a.m4865a(this, 16L));
        C7233l c7233l4 = new C7233l(R.drawable.ic_player_next, "Next", C1307a.m4865a(this, 32L));
        C7233l c7233l5 = new C7233l(R.drawable.ic_player_backwards, "Rewind", C1307a.m4865a(this, 8L));
        C7233l c7233l6 = new C7233l(R.drawable.ic_playlist_forward, "Foward", C1307a.m4865a(this, 64L));
        PlayingFrom playingFromM9414o0 = m9427b().m9414o0();
        PlayingFrom playingFrom = PlayingFrom.Lesson;
        String str = playerContentItemM9400L.f17603d;
        int i11 = playerContentItemM9400L.f17600a;
        if (playingFromM9414o0 == playingFrom) {
            Bundle bundle = new Bundle();
            bundle.putInt("lessonTrack", i11);
            C1686k c1686k = new C1686k(this);
            c1686k.m5411d();
            c1686k.m5412f();
            C1686k.m5407e(c1686k, R.id.fragment_start);
            c1686k.f9418e = bundle;
            c1686k.f9415b.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
            pendingIntentM5408a = c1686k.m5408a();
        } else if (m9427b().m9414o0() == PlayingFrom.CoursePlaylist) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("currentCourse", playerContentItemM9400L.f17607h);
            bundle2.putString("currentCourseTitle", str);
            C1686k c1686k2 = new C1686k(this);
            c1686k2.m5411d();
            c1686k2.m5412f();
            C1686k.m5407e(c1686k2, R.id.fragment_start);
            c1686k2.f9418e = bundle2;
            c1686k2.f9415b.putExtra("android-support-nav:controller:deepLinkExtras", bundle2);
            pendingIntentM5408a = c1686k2.m5408a();
        } else {
            Bundle bundle3 = new Bundle();
            bundle3.putInt("currentTrack", i11);
            C1686k c1686k3 = new C1686k(this);
            c1686k3.m5411d();
            c1686k3.m5412f();
            C1686k.m5407e(c1686k3, R.id.fragment_start);
            c1686k3.f9418e = bundle3;
            c1686k3.f9415b.putExtra("android-support-nav:controller:deepLinkExtras", bundle3);
            pendingIntentM5408a = c1686k3.m5408a();
        }
        C7236o c7236o3 = new C7236o(this, "LingQ");
        this.f17692L = c7236o3;
        c7236o3.f40642b.clear();
        C7236o c7236o4 = this.f17692L;
        if (c7236o4 == null) {
            C5207g.m11117l("builder");
            throw null;
        }
        String str2 = playerContentItemM9400L.f17602c;
        c7236o4.m14579d(str2);
        c7236o4.f40647g = pendingIntentM5408a;
        c7236o4.f40664x.icon = R.drawable.ic_lingq;
        c7236o4.m14580e(16, false);
        c7236o4.m14580e(8, true);
        c7236o4.m14580e(2, i10 == 3);
        c7236o4.f40662v = 1;
        if (m9427b().mo9396G().getValue().size() == 1) {
            C7236o c7236o5 = this.f17692L;
            if (c7236o5 == null) {
                C5207g.m11117l("builder");
                throw null;
            }
            c7236o5.m14577a(c7233l5);
            c7236o5.m14577a(c7233l);
            c7236o5.m14577a(c7233l6);
        } else {
            C7236o c7236o6 = this.f17692L;
            if (c7236o6 == null) {
                C5207g.m11117l("builder");
                throw null;
            }
            c7236o6.m14577a(c7233l5);
            c7236o6.m14577a(c7233l3);
            c7236o6.m14577a(c7233l);
            c7236o6.m14577a(c7233l4);
            c7236o6.m14577a(c7233l6);
        }
        MediaSessionCompat mediaSessionCompat2 = f17687S;
        String str3 = playerContentItemM9400L.f17605f;
        if (mediaSessionCompat2 != null) {
            MediaMetadataCompat.C0137b c0137b = new MediaMetadataCompat.C0137b();
            c0137b.m554a("android.media.metadata.TITLE", str2);
            c0137b.m554a("android.media.metadata.ARTIST", str);
            c0137b.m554a("android.media.metadata.ALBUM_ART_URI", str3);
            long duration = m9427b().getDuration();
            C8446b<String, Integer> c8446b = MediaMetadataCompat.f350c;
            if (c8446b.containsKey("android.media.metadata.DURATION") && c8446b.getOrDefault("android.media.metadata.DURATION", null).intValue() != 0) {
                throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
            }
            Bundle bundle4 = c0137b.f353a;
            bundle4.putLong("android.media.metadata.DURATION", duration);
            MediaMetadataCompat mediaMetadataCompat = new MediaMetadataCompat(bundle4);
            MediaSessionCompat.C0152d c0152d = mediaSessionCompat2.f368a;
            c0152d.f391g = mediaMetadataCompat;
            if (mediaMetadataCompat.f352b == null) {
                Parcel parcelObtain = Parcel.obtain();
                mediaMetadataCompat.writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                mediaMetadataCompat.f352b = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(parcelObtain);
                parcelObtain.recycle();
            }
            c0152d.f385a.setMetadata(mediaMetadataCompat.f352b);
        }
        if (m9427b().mo9396G().getValue().size() > 1) {
            C7236o c7236o7 = this.f17692L;
            if (c7236o7 == null) {
                C5207g.m11117l("builder");
                throw null;
            }
            C0017b c0017b = new C0017b();
            MediaSessionCompat mediaSessionCompat3 = f17687S;
            c0017b.f11e = mediaSessionCompat3 != null ? mediaSessionCompat3.f368a.f386b : null;
            c0017b.f10d = new int[]{1, 2, 3};
            c7236o7.m14583h(c0017b);
        } else {
            C7236o c7236o8 = this.f17692L;
            if (c7236o8 == null) {
                C5207g.m11117l("builder");
                throw null;
            }
            C0017b c0017b2 = new C0017b();
            MediaSessionCompat mediaSessionCompat4 = f17687S;
            c0017b2.f11e = mediaSessionCompat4 != null ? mediaSessionCompat4.f368a.f386b : null;
            c7236o8.m14583h(c0017b2);
        }
        C2089k<Bitmap> c2089kM6247G = ComponentCallbacks2C2080b.m6236b(this).m6375f(this).m6254c().m6247G(str3);
        c2089kM6247G.getClass();
        C6200e c6200e = new C6200e();
        c2089kM6247G.m6246F(c6200e, c6200e, c2089kM6247G, C7485e.f41369b);
        InterfaceC7882z interfaceC7882z = this.f17700e;
        if (interfaceC7882z != null) {
            C7828f.m15570d(interfaceC7882z, null, null, new PlayerService$showNotification$1(this, c6200e, null), 3);
        } else {
            C5207g.m11117l("coroutineScope");
            throw null;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // sh.AbstractServiceC9005a, android.app.Service
    public final void onCreate() {
        super.onCreate();
        new IntentFilter("android.media.AUDIO_BECOMING_NOISY");
        this.f17689I = new C3292a();
        String strMo10976p = C5209i.m11118a(PlayerService.class).mo10976p();
        if (strMo10976p == null) {
            strMo10976p = "PlayerService";
        }
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(this, strMo10976p);
        f17687S = mediaSessionCompat;
        mediaSessionCompat.f368a.f385a.setMediaButtonReceiver(null);
        PlaybackStateCompat.C0161d c0161d = new PlaybackStateCompat.C0161d();
        c0161d.f421e = 894L;
        this.f17707l = c0161d;
        MediaSessionCompat mediaSessionCompat2 = f17687S;
        if (mediaSessionCompat2 != null) {
            mediaSessionCompat2.m637d(c0161d.m726a());
        }
        MediaSessionCompat mediaSessionCompat3 = f17687S;
        if (mediaSessionCompat3 != null) {
            mediaSessionCompat3.f368a.m658f(new C3293b(), new Handler());
        }
        MediaSessionCompat mediaSessionCompat4 = f17687S;
        if (mediaSessionCompat4 != null) {
            mediaSessionCompat4.m636c(true);
        }
        Object systemService = getSystemService("audio");
        C5207g.m11109d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f17690J = (AudioManager) systemService;
        AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(1);
        AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
        builder2.setUsage(1);
        builder2.setContentType(2);
        builder.setAudioAttributes(builder2.build());
        builder.setAcceptsDelayedFocusGain(true);
        builder.setOnAudioFocusChangeListener(this.f17698R, this.f17693M);
        AudioFocusRequest audioFocusRequestBuild = builder.build();
        C5207g.m11110e(audioFocusRequestBuild, "Builder(AudioManager.AUD…        build()\n        }");
        this.f17706k = audioFocusRequestBuild;
        InterfaceC7882z interfaceC7882z = this.f17700e;
        if (interfaceC7882z == null) {
            C5207g.m11117l("coroutineScope");
            throw null;
        }
        C7828f.m15570d(interfaceC7882z, null, null, new C32941(null), 3);
        m9428c();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        stopForeground(1);
        m9429e();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        m9428c();
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        C5207g.m11111f(intent, "rootIntent");
        super.onTaskRemoved(intent);
        stopForeground(1);
        m9429e();
    }
}
