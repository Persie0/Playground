package com.lingq.player;

import android.app.Notification;
import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.bumptech.glide.ComponentCallbacks2C2080b;
import com.linguist.R;
import dm.C5207g;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.C7828f;
import no.C7832g0;
import no.InterfaceC7882z;
import p171i6.InterfaceFutureC6198c;
import p232l2.C7236o;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.player.PlayerService$showNotification$1", m19206f = "PlayerService.kt", m19207l = {468, 483}, m19208m = "invokeSuspend")
final class PlayerService$showNotification$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f17717e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlayerService f17718f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceFutureC6198c<Bitmap> f17719g;

    /* JADX INFO: renamed from: com.lingq.player.PlayerService$showNotification$1$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.player.PlayerService$showNotification$1$1", m19206f = "PlayerService.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C32951 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ PlayerService f17720e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InterfaceFutureC6198c<Bitmap> f17721f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Bitmap f17722g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32951(PlayerService playerService, InterfaceFutureC6198c<Bitmap> interfaceFutureC6198c, Bitmap bitmap, InterfaceC9968c<? super C32951> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f17720e = playerService;
            this.f17721f = interfaceFutureC6198c;
            this.f17722g = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C32951(this.f17720e, this.f17721f, this.f17722g, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C32951) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            PlayerService playerService = this.f17720e;
            ComponentCallbacks2C2080b.m6238e(playerService.getApplicationContext()).m6256f(this.f17721f);
            C7236o c7236o = playerService.f17692L;
            if (c7236o == null) {
                C5207g.m11117l("builder");
                throw null;
            }
            c7236o.m14581f(this.f17722g);
            C7236o c7236o2 = playerService.f17692L;
            if (c7236o2 == null) {
                C5207g.m11117l("builder");
                throw null;
            }
            Notification notificationM14578b = c7236o2.m14578b();
            C5207g.m11110e(notificationM14578b, "builder.build()");
            Object systemService = playerService.getSystemService("notification");
            C5207g.m11109d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            playerService.f17688H = notificationManager;
            notificationManager.notify(12355, notificationM14578b);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerService$showNotification$1(PlayerService playerService, InterfaceFutureC6198c<Bitmap> interfaceFutureC6198c, InterfaceC9968c<? super PlayerService$showNotification$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f17718f = playerService;
        this.f17719g = interfaceFutureC6198c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlayerService$showNotification$1(this.f17718f, this.f17719g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlayerService$showNotification$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Bitmap bitmapDecodeResource;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f17717e;
        InterfaceFutureC6198c<Bitmap> interfaceFutureC6198c = this.f17719g;
        PlayerService playerService = this.f17718f;
        try {
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
            ExecutorC7177a executorC7177a = C7832g0.f42931b;
            PlayerService$showNotification$1$bitmap$1 playerService$showNotification$1$bitmap$1 = new PlayerService$showNotification$1$bitmap$1(interfaceFutureC6198c, null);
            this.f17717e = 1;
            obj = C7828f.m15574h(this, executorC7177a, playerService$showNotification$1$bitmap$1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            bitmapDecodeResource = (Bitmap) obj;
        } catch (InterruptedException unused) {
            bitmapDecodeResource = BitmapFactory.decodeResource(playerService.getResources(), R.drawable.ic_lingq);
        } catch (ExecutionException unused2) {
            bitmapDecodeResource = BitmapFactory.decodeResource(playerService.getResources(), R.drawable.ic_lingq);
        }
        CoroutineDispatcher coroutineDispatcher = playerService.f17701f;
        if (coroutineDispatcher == null) {
            C5207g.m11117l("mainDispatcher");
            throw null;
        }
        C32951 c32951 = new C32951(playerService, interfaceFutureC6198c, bitmapDecodeResource, null);
        this.f17717e = 2;
        if (C7828f.m15574h(this, coroutineDispatcher, c32951) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}
