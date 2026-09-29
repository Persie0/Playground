package com.lingq.core.player.service;

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
import android.media.Rating;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.C0027a;
import android.support.v4.media.session.C0030d;
import android.view.KeyEvent;
import com.lingq.core.designsystem.R$drawable;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.playlist.Playlist;
import com.lingq.core.domain.playlist.C1521d;
import com.lingq.core.domain.playlist.C1524g;
import com.lingq.core.player.C1808b;
import com.lingq.core.player.data.PlayerType;
import com.lingq.core.player.data.PlayingSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3244l;
import p000.C3092hy;
import p000.C3275kv;
import p000.C3386nv;
import p000.C3693vp;
import p000.bc7;
import p000.c32;
import p000.c83;
import p000.cc7;
import p000.ck6;
import p000.cma;
import p000.dc7;
import p000.eh9;
import p000.fa4;
import p000.fc7;
import p000.fv5;
import p000.gv5;
import p000.l55;
import p000.mt6;
import p000.nn1;
import p000.pm6;
import p000.pt5;
import p000.q2c;
import p000.tb7;
import p000.tt3;
import p000.ud7;
import p000.un1;
import p000.v91;
import p000.vj6;
import p000.vm6;
import p000.wfb;
import p000.wm6;
import p000.wq1;
import p000.xfa;
import p000.y38;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
public final class PlayerService extends tt3 {
    public static final bc7 Companion = new bc7();

    /* JADX INFO: renamed from: V */
    public static gv5 f21974V;

    /* JADX INFO: renamed from: H */
    public Object f21975H;

    /* JADX INFO: renamed from: I */
    public AudioFocusRequest f21976I;

    /* JADX INFO: renamed from: J */
    public C0030d f21977J;

    /* JADX INFO: renamed from: K */
    public NotificationManager f21978K;

    /* JADX INFO: renamed from: L */
    public C3693vp f21979L;

    /* JADX INFO: renamed from: M */
    public AudioManager f21980M;

    /* JADX INFO: renamed from: N */
    public NotificationChannel f21981N;

    /* JADX INFO: renamed from: O */
    public vm6 f21982O;

    /* JADX INFO: renamed from: R */
    public float f21985R;

    /* JADX INFO: renamed from: S */
    public int f21986S;

    /* JADX INFO: renamed from: d */
    public C1808b f21989d;

    /* JADX INFO: renamed from: e */
    public cma f21990e;

    /* JADX INFO: renamed from: f */
    public C1521d f21991f;

    /* JADX INFO: renamed from: g */
    public C1524g f21992g;

    /* JADX INFO: renamed from: h */
    public un1 f21993h;

    /* JADX INFO: renamed from: i */
    public nn1 f21994i;

    /* JADX INFO: renamed from: j */
    public dc7 f21995j;

    /* JADX INFO: renamed from: k */
    public boolean f21996k;

    /* JADX INFO: renamed from: l */
    public boolean f21997l;

    /* JADX INFO: renamed from: P */
    public final Handler f21983P = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: Q */
    public final mt6 f21984Q = new mt6(this, 3);

    /* JADX INFO: renamed from: T */
    public int f21987T = 1;

    /* JADX INFO: renamed from: U */
    public final C3092hy f21988U = new C3092hy(this, 1);

    public static final class MediaReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            context.getClass();
            intent.getClass();
            gv5 gv5Var = PlayerService.f21974V;
            if (gv5Var != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
                KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                vj6 vj6Var = (vj6) gv5Var.f41393c;
                if (keyEvent != null) {
                    ((C0027a) vj6Var.f65506b).f983a.dispatchMediaButtonEvent(keyEvent);
                } else {
                    vj6Var.getClass();
                    C3386nv.m17626m("KeyEvent may not be null");
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.core.player.service.PlayerService$onCreate$1 */
    @c32(m4290c = "com.lingq.core.player.service.PlayerService$onCreate$1", m4291f = "PlayerService.kt", m4292l = {701}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18091 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f21998a;

        /* JADX INFO: renamed from: com.lingq.core.player.service.PlayerService$onCreate$1$1, reason: invalid class name */
        @c32(m4290c = "com.lingq.core.player.service.PlayerService$onCreate$1$1", m4291f = "PlayerService.kt", m4292l = {171}, m4293m = "invokeSuspend", m4294v = 2)
        final class AnonymousClass1 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public int f22000a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f22001b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ PlayerService f22002c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlayerService playerService, Continuation continuation) {
                super(2, continuation);
                this.f22002c = playerService;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f22002c, continuation);
                anonymousClass1.f22001b = obj;
                return anonymousClass1;
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((fc7) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                fc7 fc7Var = (fc7) this.f22001b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f22000a;
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    if (fc7Var != null) {
                        PlayerService playerService = this.f22002c;
                        nn1 nn1Var = playerService.f21994i;
                        if (nn1Var == null) {
                            fa4.m11636J("mainDispatcher");
                            throw null;
                        }
                        PlayerService$onCreate$1$1$1$1 playerService$onCreate$1$1$1$1 = new PlayerService$onCreate$1$1$1$1(playerService, fc7Var, null);
                        this.f22001b = null;
                        this.f22000a = 1;
                        if (wfb.m23905G(playerService$onCreate$1$1$1$1, nn1Var, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                }
                return xfa.f68157a;
            }
        }

        public C18091(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return PlayerService.this.new C18091(continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C18091) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f21998a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                PlayerService playerService = PlayerService.this;
                dc7 dc7Var = playerService.f21995j;
                if (dc7Var == null) {
                    fa4.m11636J("serviceController");
                    throw null;
                }
                eh9 eh9VarMo9201M0 = dc7Var.mo9201M0();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playerService, null);
                eh9VarMo9201M0.getClass();
                this.f21998a = 1;
                if (AbstractC3224d.m15529h(eh9VarMo9201M0, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            C3386nv.m17633t("SharedFlow never completes, this call should never return.");
            return null;
        }
    }

    /* JADX INFO: renamed from: com.lingq.core.player.service.PlayerService$onStartCommand$1 */
    @c32(m4290c = "com.lingq.core.player.service.PlayerService$onStartCommand$1", m4291f = "PlayerService.kt", m4292l = {191}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18101 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f22005a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f22007c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18101(int i, Continuation continuation) {
            super(2, continuation);
            this.f22007c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return PlayerService.this.new C18101(this.f22007c, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C18101) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f22005a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                this.f22005a = 1;
                if (PlayerService.m8470a(PlayerService.this, this.f22007c, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00af  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:57:0x0104  */
    /* JADX WARN: Code duplicated, block: B:60:0x010b  */
    /* JADX WARN: Code duplicated, block: B:61:0x010e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0114  */
    /* JADX WARN: Code duplicated, block: B:65:0x0117  */
    /* JADX WARN: Code duplicated, block: B:68:0x011f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0122  */
    /* JADX WARN: Code duplicated, block: B:72:0x012e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x0135  */
    /* JADX WARN: Code duplicated, block: B:79:0x0158  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x016e  */
    /* JADX WARN: Code duplicated, block: B:85:0x017a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0190  */
    /* JADX WARN: Code duplicated, block: B:90:0x0195  */
    /* JADX WARN: Code duplicated, block: B:92:0x019a  */
    /* JADX WARN: Instruction removed from duplicated block: B:54:0x00ef, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public static final Object m8470a(PlayerService playerService, int i, ContinuationImpl continuationImpl) throws Throwable {
        PlayerService$prepareAndPlay$1 playerService$prepareAndPlay$1;
        int i2;
        String str;
        String str2;
        Playlist playlist;
        C1524g c1524g;
        String str3;
        List list;
        ArrayList arrayList;
        Iterator it;
        nn1 nn1Var;
        PlayerService$prepareAndPlay$2 playerService$prepareAndPlay$2;
        ArrayList arrayList2;
        ud7 ud7Var;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        PlayerType playerType;
        nn1 nn1Var2;
        if (continuationImpl instanceof PlayerService$prepareAndPlay$1) {
            playerService$prepareAndPlay$1 = (PlayerService$prepareAndPlay$1) continuationImpl;
            int i3 = playerService$prepareAndPlay$1.f22013f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                playerService$prepareAndPlay$1.f22013f = i3 - Integer.MIN_VALUE;
            } else {
                playerService$prepareAndPlay$1 = new PlayerService$prepareAndPlay$1(playerService, continuationImpl);
            }
        } else {
            playerService$prepareAndPlay$1 = new PlayerService$prepareAndPlay$1(playerService, continuationImpl);
        }
        Object objM15541t = playerService$prepareAndPlay$1.f22011d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = playerService$prepareAndPlay$1.f22013f;
        xfa xfaVar = xfa.f68157a;
        if (i4 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            cma cmaVar = playerService.f21990e;
            if (cmaVar == null) {
                fa4.m11636J("userSessionDelegate");
                throw null;
            }
            eh9 eh9VarMo4572B0 = cmaVar.mo4572B0();
            i2 = i;
            playerService$prepareAndPlay$1.f22008a = i2;
            playerService$prepareAndPlay$1.f22013f = 1;
            objM15541t = AbstractC3224d.m15541t(eh9VarMo4572B0, playerService$prepareAndPlay$1);
            if (objM15541t != coroutineSingletons) {
            }
        }
        if (i4 == 1) {
            i2 = playerService$prepareAndPlay$1.f22008a;
            AbstractC3193b.m15359b(objM15541t);
        } else {
            if (i4 == 2) {
                i2 = playerService$prepareAndPlay$1.f22008a;
                str2 = playerService$prepareAndPlay$1.f22009b;
                AbstractC3193b.m15359b(objM15541t);
                playlist = (Playlist) objM15541t;
                if (playlist != null) {
                    c1524g = playerService.f21992g;
                    if (c1524g != null) {
                        fa4.m11636J("getPlaylistLessonsUseCase");
                        throw null;
                    }
                    c83 c83VarM8201a = c1524g.m8201a(playlist.f19556d, playlist.f19553a);
                    playerService$prepareAndPlay$1.f22009b = str2;
                    playerService$prepareAndPlay$1.f22008a = i2;
                    playerService$prepareAndPlay$1.f22013f = 3;
                    objM15541t = AbstractC3224d.m15541t(c83VarM8201a, playerService$prepareAndPlay$1);
                    if (objM15541t != coroutineSingletons) {
                        str3 = str2;
                        list = (List) objM15541t;
                        if (!list.isEmpty()) {
                            ArrayList arrayListM19624a = q2c.m19624a(list);
                            arrayList = new ArrayList(v91.m23189q0(arrayListM19624a, 10));
                            it = arrayListM19624a.iterator();
                            while (it.hasNext()) {
                                ud7Var = ((l55) it.next()).f49081a;
                                int i5 = ud7Var.f63767a;
                                String str10 = ud7Var.f63779m;
                                if (str10 != null) {
                                }
                                String str11 = ud7Var.f63774h;
                                str4 = ud7Var.f63785s;
                                if (str4 == null) {
                                    str5 = "";
                                } else {
                                    str5 = str4;
                                }
                                str6 = ud7Var.f63775i;
                                if (str6 == null) {
                                    str7 = "";
                                } else {
                                    str7 = str6;
                                }
                                int i6 = ud7Var.f63778l;
                                str8 = ud7Var.f63772f;
                                if (str8 == null) {
                                    str9 = "";
                                } else {
                                    str9 = str8;
                                }
                                int i7 = ud7Var.f63776j;
                                PlayingSource playingSource = PlayingSource.Playlist;
                                Iterator it2 = it;
                                if (ud7Var.f63780n == null) {
                                    playerType = PlayerType.Audio;
                                } else {
                                    playerType = PlayerType.Audio;
                                }
                                arrayList.add(new tb7(i5, str, str11, str5, str7, i6, str9, false, i7, str3, playingSource, playerType, ud7Var.f63789w, ud7Var.f63790x));
                                it = it2;
                            }
                            nn1Var = playerService.f21994i;
                            if (nn1Var == null) {
                                fa4.m11636J("mainDispatcher");
                                throw null;
                            }
                            playerService$prepareAndPlay$2 = new PlayerService$prepareAndPlay$2(playerService, i2, null);
                            playerService$prepareAndPlay$1.f22009b = null;
                            playerService$prepareAndPlay$1.f22010c = arrayList;
                            playerService$prepareAndPlay$1.f22008a = i2;
                            playerService$prepareAndPlay$1.f22013f = 4;
                            if (wfb.m23905G(playerService$prepareAndPlay$2, nn1Var, playerService$prepareAndPlay$1) != coroutineSingletons) {
                                arrayList2 = arrayList;
                            }
                        }
                    }
                }
            }
            if (i4 == 3) {
                i2 = playerService$prepareAndPlay$1.f22008a;
                String str12 = playerService$prepareAndPlay$1.f22009b;
                AbstractC3193b.m15359b(objM15541t);
                str3 = str12;
                list = (List) objM15541t;
                if (!list.isEmpty()) {
                    ArrayList arrayListM19624a2 = q2c.m19624a(list);
                    arrayList = new ArrayList(v91.m23189q0(arrayListM19624a2, 10));
                    it = arrayListM19624a2.iterator();
                    while (it.hasNext()) {
                        ud7Var = ((l55) it.next()).f49081a;
                        int i8 = ud7Var.f63767a;
                        String str13 = ud7Var.f63779m;
                        String str14 = str13 != null ? str13 : "";
                        String str15 = ud7Var.f63774h;
                        str4 = ud7Var.f63785s;
                        if (str4 == null) {
                            str5 = "";
                        } else {
                            str5 = str4;
                        }
                        str6 = ud7Var.f63775i;
                        if (str6 == null) {
                            str7 = "";
                        } else {
                            str7 = str6;
                        }
                        int i9 = ud7Var.f63778l;
                        str8 = ud7Var.f63772f;
                        if (str8 == null) {
                            str9 = "";
                        } else {
                            str9 = str8;
                        }
                        int i10 = ud7Var.f63776j;
                        PlayingSource playingSource2 = PlayingSource.Playlist;
                        Iterator it3 = it;
                        if (ud7Var.f63780n == null && str13 == null) {
                            playerType = PlayerType.Video;
                        } else {
                            playerType = PlayerType.Audio;
                        }
                        arrayList.add(new tb7(i8, str14, str15, str5, str7, i9, str9, false, i10, str3, playingSource2, playerType, ud7Var.f63789w, ud7Var.f63790x));
                        it = it3;
                    }
                    nn1Var = playerService.f21994i;
                    if (nn1Var == null) {
                        fa4.m11636J("mainDispatcher");
                        throw null;
                    }
                    playerService$prepareAndPlay$2 = new PlayerService$prepareAndPlay$2(playerService, i2, null);
                    playerService$prepareAndPlay$1.f22009b = null;
                    playerService$prepareAndPlay$1.f22010c = arrayList;
                    playerService$prepareAndPlay$1.f22008a = i2;
                    playerService$prepareAndPlay$1.f22013f = 4;
                    if (wfb.m23905G(playerService$prepareAndPlay$2, nn1Var, playerService$prepareAndPlay$1) != coroutineSingletons) {
                        arrayList2 = arrayList;
                    }
                }
            }
            if (i4 != 4) {
                if (i4 == 5) {
                    AbstractC3193b.m15359b(objM15541t);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = playerService$prepareAndPlay$1.f22008a;
            arrayList2 = playerService$prepareAndPlay$1.f22010c;
            AbstractC3193b.m15359b(objM15541t);
        }
        playerService.m8471c().m8461a0(arrayList2);
        nn1Var2 = playerService.f21994i;
        if (nn1Var2 != null) {
            fa4.m11636J("mainDispatcher");
            throw null;
        }
        PlayerService$prepareAndPlay$3 playerService$prepareAndPlay$3 = new PlayerService$prepareAndPlay$3(playerService, null);
        playerService$prepareAndPlay$1.f22009b = null;
        playerService$prepareAndPlay$1.f22010c = null;
        playerService$prepareAndPlay$1.f22008a = i2;
        playerService$prepareAndPlay$1.f22013f = 5;
        return wfb.m23905G(playerService$prepareAndPlay$3, nn1Var2, playerService$prepareAndPlay$1) == coroutineSingletons ? coroutineSingletons : xfaVar;
        Language language = (Language) objM15541t;
        if (language != null && (str = language.f19024a) != null) {
            dc7 dc7Var = playerService.f21995j;
            if (dc7Var == null) {
                fa4.m11636J("serviceController");
                throw null;
            }
            dc7Var.mo9211g0(PlayingFrom.Widget);
            C1521d c1521d = playerService.f21991f;
            if (c1521d == null) {
                fa4.m11636J("getActivePlaylistUseCase");
                throw null;
            }
            C3228h c3228hM8197a = c1521d.m8197a(str);
            playerService$prepareAndPlay$1.f22009b = str;
            playerService$prepareAndPlay$1.f22008a = i2;
            playerService$prepareAndPlay$1.f22013f = 2;
            Object objM15542u = AbstractC3224d.m15542u(c3228hM8197a, playerService$prepareAndPlay$1);
            if (objM15542u != coroutineSingletons) {
                str2 = str;
                objM15541t = objM15542u;
                playlist = (Playlist) objM15541t;
                if (playlist != null) {
                    c1524g = playerService.f21992g;
                    if (c1524g != null) {
                        fa4.m11636J("getPlaylistLessonsUseCase");
                        throw null;
                    }
                    c83 c83VarM8201a2 = c1524g.m8201a(playlist.f19556d, playlist.f19553a);
                    playerService$prepareAndPlay$1.f22009b = str2;
                    playerService$prepareAndPlay$1.f22008a = i2;
                    playerService$prepareAndPlay$1.f22013f = 3;
                    objM15541t = AbstractC3224d.m15541t(c83VarM8201a2, playerService$prepareAndPlay$1);
                    if (objM15541t != coroutineSingletons) {
                        str3 = str2;
                        list = (List) objM15541t;
                        if (!list.isEmpty()) {
                            ArrayList arrayListM19624a3 = q2c.m19624a(list);
                            arrayList = new ArrayList(v91.m23189q0(arrayListM19624a3, 10));
                            it = arrayListM19624a3.iterator();
                            while (it.hasNext()) {
                                ud7Var = ((l55) it.next()).f49081a;
                                int i11 = ud7Var.f63767a;
                                String str16 = ud7Var.f63779m;
                                if (str16 != null) {
                                }
                                String str17 = ud7Var.f63774h;
                                str4 = ud7Var.f63785s;
                                if (str4 == null) {
                                    str5 = "";
                                } else {
                                    str5 = str4;
                                }
                                str6 = ud7Var.f63775i;
                                if (str6 == null) {
                                    str7 = "";
                                } else {
                                    str7 = str6;
                                }
                                int i12 = ud7Var.f63778l;
                                str8 = ud7Var.f63772f;
                                if (str8 == null) {
                                    str9 = "";
                                } else {
                                    str9 = str8;
                                }
                                int i13 = ud7Var.f63776j;
                                PlayingSource playingSource3 = PlayingSource.Playlist;
                                Iterator it4 = it;
                                if (ud7Var.f63780n == null) {
                                    playerType = PlayerType.Audio;
                                } else {
                                    playerType = PlayerType.Audio;
                                }
                                arrayList.add(new tb7(i11, str14, str17, str5, str7, i12, str9, false, i13, str3, playingSource3, playerType, ud7Var.f63789w, ud7Var.f63790x));
                                it = it4;
                            }
                            nn1Var = playerService.f21994i;
                            if (nn1Var == null) {
                                fa4.m11636J("mainDispatcher");
                                throw null;
                            }
                            playerService$prepareAndPlay$2 = new PlayerService$prepareAndPlay$2(playerService, i2, null);
                            playerService$prepareAndPlay$1.f22009b = null;
                            playerService$prepareAndPlay$1.f22010c = arrayList;
                            playerService$prepareAndPlay$1.f22008a = i2;
                            playerService$prepareAndPlay$1.f22013f = 4;
                            if (wfb.m23905G(playerService$prepareAndPlay$2, nn1Var, playerService$prepareAndPlay$1) != coroutineSingletons) {
                                arrayList2 = arrayList;
                                playerService.m8471c().m8461a0(arrayList2);
                                nn1Var2 = playerService.f21994i;
                                if (nn1Var2 != null) {
                                    fa4.m11636J("mainDispatcher");
                                    throw null;
                                }
                                PlayerService$prepareAndPlay$3 playerService$prepareAndPlay$4 = new PlayerService$prepareAndPlay$3(playerService, null);
                                playerService$prepareAndPlay$1.f22009b = null;
                                playerService$prepareAndPlay$1.f22010c = null;
                                playerService$prepareAndPlay$1.f22008a = i2;
                                playerService$prepareAndPlay$1.f22013f = 5;
                                if (wfb.m23905G(playerService$prepareAndPlay$4, nn1Var2, playerService$prepareAndPlay$1) == coroutineSingletons) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final C1808b m8471c() {
        C1808b c1808b = this.f21989d;
        if (c1808b != null) {
            return c1808b;
        }
        fa4.m11636J("playerController");
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final void m8472d() {
        this.f21981N = new NotificationChannel("LingQ", "LingQ Player", 1);
        Object systemService = getSystemService("notification");
        systemService.getClass();
        NotificationManager notificationManager = (NotificationManager) systemService;
        this.f21978K = notificationManager;
        NotificationChannel notificationChannel = this.f21981N;
        if (notificationChannel == null) {
            fa4.m11636J("channel");
            throw null;
        }
        notificationManager.createNotificationChannel(notificationChannel);
        m8474f();
        vm6 vm6Var = this.f21982O;
        if (vm6Var == null) {
            fa4.m11636J("builder");
            throw null;
        }
        Notification notificationMo15108c = vm6Var.mo15108c();
        notificationMo15108c.getClass();
        Object systemService2 = getSystemService("notification");
        systemService2.getClass();
        NotificationManager notificationManager2 = (NotificationManager) systemService2;
        this.f21978K = notificationManager2;
        notificationManager2.notify(12355, notificationMo15108c);
        try {
            startForeground(12355, notificationMo15108c);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8473e() {
        try {
            unregisterReceiver(this.f21979L);
        } catch (IllegalArgumentException unused) {
        }
        AudioManager audioManager = this.f21980M;
        if (audioManager != null) {
            AudioFocusRequest audioFocusRequest = this.f21976I;
            if (audioFocusRequest == null) {
                fa4.m11636J("focusRequest");
                throw null;
            }
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }
        m8471c().m8447J();
        NotificationManager notificationManager = this.f21978K;
        if (notificationManager != null) {
            notificationManager.cancelAll();
        }
        gv5 gv5Var = f21974V;
        if (gv5Var != null) {
            ((fv5) gv5Var.f41392b).f39749a.setActive(false);
            Iterator it = ((ArrayList) gv5Var.f41394d).iterator();
            if (it.hasNext()) {
                throw wq1.m24110f(it);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m8474f() {
        gv5 gv5Var = f21974V;
        if (gv5Var != null) {
            C0030d c0030d = this.f21977J;
            if (c0030d == null) {
                fa4.m11636J("stateBuilder");
                throw null;
            }
            gv5Var.m12894X(c0030d.m630a());
        }
        C0030d c0030d2 = this.f21977J;
        if (c0030d2 == null) {
            fa4.m11636J("stateBuilder");
            throw null;
        }
        int i = c0030d2.m630a().f967a;
        tb7 tb7VarM12625d = m8471c().f21961n.m12625d();
        if (tb7VarM12625d == null) {
            vm6 vm6Var = new vm6(this, "LingQ");
            this.f21982O = vm6Var;
            vm6Var.f65582b.clear();
            vm6 vm6Var2 = this.f21982O;
            if (vm6Var2 == null) {
                fa4.m11636J("builder");
                throw null;
            }
            vm6Var2.f65585e = vm6.m23410d("LingQ Player");
            vm6Var2.f65600t.icon = R$drawable.ic_lingq;
            vm6Var2.m23418j(16, false);
            vm6Var2.m23418j(8, true);
            vm6Var2.m23418j(2, i == 3);
            vm6Var2.f65598r = 1;
            return;
        }
        String str = tb7VarM12625d.f62103c;
        String str2 = tb7VarM12625d.f62105e;
        int i2 = tb7VarM12625d.f62101a;
        pm6 pm6Var = new pm6(com.lingq.feature.player.R$drawable.ic_player_play, "Play", pt5.m19475a(this, 4L));
        pm6 pm6Var2 = new pm6(com.lingq.feature.player.R$drawable.ic_player_pause, "Pause", pt5.m19475a(this, 2L));
        if (i == 3) {
            pm6Var = pm6Var2;
        }
        pm6 pm6Var3 = new pm6(com.lingq.feature.player.R$drawable.ic_player_previous, "Previous", pt5.m19475a(this, 16L));
        pm6 pm6Var4 = new pm6(com.lingq.feature.player.R$drawable.ic_player_next, "Next", pt5.m19475a(this, 32L));
        pm6 pm6Var5 = new pm6(com.lingq.feature.player.R$drawable.ic_player_backwards, "Rewind", pt5.m19475a(this, 8L));
        pm6 pm6Var6 = new pm6(com.lingq.feature.player.R$drawable.ic_player_forward, "Foward", pt5.m19475a(this, 64L));
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (((PlayingFrom) m8471c().f21953f.mo9214t2().getValue()) == PlayingFrom.Lesson) {
            if (launchIntentForPackage != null) {
                launchIntentForPackage.putExtra("lessonTrack", i2);
            }
        } else if (((PlayingFrom) m8471c().f21953f.mo9214t2().getValue()) == PlayingFrom.CoursePlaylist) {
            new Bundle();
            if (launchIntentForPackage != null) {
                launchIntentForPackage.putExtra("currentCourse", tb7VarM12625d.f62109i);
            }
            if (launchIntentForPackage != null) {
                launchIntentForPackage.putExtra("currentCourseTitle", str2);
            }
        } else if (launchIntentForPackage != null) {
            launchIntentForPackage.putExtra("currentTrack", i2);
        }
        vm6 vm6Var3 = new vm6(this, "LingQ");
        this.f21982O = vm6Var3;
        vm6Var3.f65582b.clear();
        vm6 vm6Var4 = this.f21982O;
        if (vm6Var4 == null) {
            fa4.m11636J("builder");
            throw null;
        }
        vm6Var4.f65585e = vm6.m23410d(str);
        vm6Var4.f65587g = PendingIntent.getActivity(this, 1, launchIntentForPackage, 67108864);
        vm6Var4.f65600t.icon = R$drawable.ic_lingq;
        vm6Var4.m23418j(16, false);
        vm6Var4.m23418j(8, true);
        vm6Var4.m23418j(2, i == 3);
        vm6Var4.f65598r = 1;
        int size = ((List) ((C3244l) m8471c().f21944B.f9311a).getValue()).size();
        vm6 vm6Var5 = this.f21982O;
        if (size == 1) {
            if (vm6Var5 == null) {
                fa4.m11636J("builder");
                throw null;
            }
            vm6Var5.m23412b(pm6Var5);
            vm6Var5.m23412b(pm6Var);
            vm6Var5.m23412b(pm6Var6);
        } else {
            if (vm6Var5 == null) {
                fa4.m11636J("builder");
                throw null;
            }
            vm6Var5.m23412b(pm6Var5);
            vm6Var5.m23412b(pm6Var3);
            vm6Var5.m23412b(pm6Var);
            vm6Var5.m23412b(pm6Var4);
            vm6Var5.m23412b(pm6Var6);
        }
        gv5 gv5Var2 = f21974V;
        if (gv5Var2 != null) {
            ck6 ck6Var = new ck6(20);
            Bundle bundle = (Bundle) ck6Var.f10194b;
            ck6Var.m4794E("android.media.metadata.TITLE", str);
            ck6Var.m4794E("android.media.metadata.ARTIST", str2);
            ck6Var.m4794E("android.media.metadata.ALBUM_ART_URI", tb7VarM12625d.f62107g);
            long jM8468j = m8471c().m8468j();
            C3275kv c3275kv = MediaMetadataCompat.f949c;
            if (c3275kv.containsKey("android.media.metadata.DURATION") && ((Integer) c3275kv.get("android.media.metadata.DURATION")).intValue() != 0) {
                C3386nv.m17626m("The android.media.metadata.DURATION key cannot be used to put a long");
                return;
            }
            bundle.putLong("android.media.metadata.DURATION", jM8468j);
            MediaMetadataCompat mediaMetadataCompat = new MediaMetadataCompat(bundle);
            fv5 fv5Var = (fv5) gv5Var2.f41392b;
            fv5Var.f39754f = mediaMetadataCompat;
            MediaSession mediaSession = fv5Var.f39749a;
            if (mediaMetadataCompat.f951b == null) {
                MediaMetadata.Builder builder = new MediaMetadata.Builder();
                Bundle bundle2 = mediaMetadataCompat.f950a;
                for (String str3 : bundle2.keySet()) {
                    Integer num = (Integer) MediaMetadataCompat.f949c.get(str3);
                    if (num == null) {
                        num = -1;
                    }
                    int iIntValue = num.intValue();
                    if (iIntValue == 0) {
                        builder.putLong(str3, bundle2.getLong(str3, 0L));
                    } else if (iIntValue == 1) {
                        builder.putText(str3, bundle2.getCharSequence(str3));
                    } else if (iIntValue == 2) {
                        builder.putBitmap(str3, (Bitmap) bundle2.getParcelable(str3));
                    } else if (iIntValue != 3) {
                        Object obj = bundle2.get(str3);
                        if (obj == null || (obj instanceof CharSequence)) {
                            builder.putText(str3, (CharSequence) obj);
                        } else if (obj instanceof Long) {
                            builder.putLong(str3, ((Long) obj).longValue());
                        } else if (obj instanceof Bitmap) {
                            builder.putBitmap(str3, (Bitmap) obj);
                        } else if (obj instanceof Rating) {
                            builder.putRating(str3, (Rating) obj);
                        }
                    } else {
                        builder.putRating(str3, (Rating) bundle2.getParcelable(str3));
                    }
                }
                mediaMetadataCompat.f951b = builder.build();
            }
            mediaSession.setMetadata(mediaMetadataCompat.f951b);
        }
        int size2 = ((List) ((C3244l) m8471c().f21944B.f9311a).getValue()).size();
        vm6 vm6Var6 = this.f21982O;
        if (size2 > 1) {
            if (vm6Var6 == null) {
                fa4.m11636J("builder");
                throw null;
            }
            wm6 wm6Var = new wm6();
            gv5 gv5Var3 = f21974V;
            wm6Var.f67056e = gv5Var3 != null ? ((fv5) gv5Var3.f41392b).f39750b : null;
            wm6Var.f67055d = new int[]{1, 2, 3};
            vm6Var6.m23423o(wm6Var);
        } else {
            if (vm6Var6 == null) {
                fa4.m11636J("builder");
                throw null;
            }
            wm6 wm6Var2 = new wm6();
            gv5 gv5Var4 = f21974V;
            wm6Var2.f67056e = gv5Var4 != null ? ((fv5) gv5Var4.f41392b).f39750b : null;
            vm6Var6.m23423o(wm6Var2);
        }
        un1 un1Var = this.f21993h;
        if (un1Var == null) {
            fa4.m11636J("coroutineScope");
            throw null;
        }
        wfb.m23926u(un1Var, null, null, new PlayerService$showNotification$1(this, tb7VarM12625d, null), 3);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // p000.tt3, android.app.Service
    public final void onCreate() {
        super.onCreate();
        new IntentFilter("android.media.AUDIO_BECOMING_NOISY");
        this.f21979L = new C3693vp(this, 4);
        String strM25414c = y38.m24933a(PlayerService.class).m25414c();
        if (strM25414c == null) {
            strM25414c = "PlayerService";
        }
        gv5 gv5Var = new gv5(this, strM25414c);
        f21974V = gv5Var;
        ((fv5) gv5Var.f41392b).f39749a.setMediaButtonReceiver(null);
        C0030d c0030d = new C0030d();
        c0030d.f994e = 894L;
        this.f21977J = c0030d;
        gv5 gv5Var2 = f21974V;
        if (gv5Var2 != null) {
            gv5Var2.m12894X(c0030d.m630a());
        }
        gv5 gv5Var3 = f21974V;
        if (gv5Var3 != null) {
            ((fv5) gv5Var3.f41392b).m12212a(new cc7(this), new Handler());
        }
        gv5 gv5Var4 = f21974V;
        if (gv5Var4 != null) {
            ((fv5) gv5Var4.f41392b).f39749a.setActive(true);
            Iterator it = ((ArrayList) gv5Var4.f41394d).iterator();
            if (it.hasNext()) {
                throw wq1.m24110f(it);
            }
        }
        Object systemService = getSystemService("audio");
        systemService.getClass();
        this.f21980M = (AudioManager) systemService;
        AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(1);
        AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
        builder2.setUsage(1);
        builder2.setContentType(2);
        builder.setAudioAttributes(builder2.build());
        builder.setAcceptsDelayedFocusGain(true);
        builder.setOnAudioFocusChangeListener(this.f21988U, this.f21983P);
        AudioFocusRequest audioFocusRequestBuild = builder.build();
        audioFocusRequestBuild.getClass();
        this.f21976I = audioFocusRequestBuild;
        un1 un1Var = this.f21993h;
        if (un1Var == null) {
            fa4.m11636J("coroutineScope");
            throw null;
        }
        wfb.m23926u(un1Var, null, null, new C18091(null), 3);
        m8472d();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        stopForeground(1);
        m8473e();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int intExtra;
        if (fa4.m11650l(intent != null ? intent.getAction() : null, "com.lingq.action.PLAY_FROM_WIDGET") && (intExtra = intent.getIntExtra("com.lingq.extra.LESSON_ID", -1)) != -1) {
            un1 un1Var = this.f21993h;
            if (un1Var == null) {
                fa4.m11636J("coroutineScope");
                throw null;
            }
            wfb.m23926u(un1Var, null, null, new C18101(intExtra, null), 3);
        }
        m8472d();
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        intent.getClass();
        super.onTaskRemoved(intent);
        stopForeground(1);
        m8473e();
    }
}
