package com.lingq.core.player.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.IconCompat;
import com.lingq.core.designsystem.R$drawable;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.d04;
import p000.e04;
import p000.f04;
import p000.fa4;
import p000.hn9;
import p000.nn1;
import p000.ph2;
import p000.t62;
import p000.tb7;
import p000.un1;
import p000.v72;
import p000.vm6;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.player.service.PlayerService$showNotification$1", m4291f = "PlayerService.kt", m4292l = {541, 553}, m4293m = "invokeSuspend", m4294v = 2)
final class PlayerService$showNotification$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22017a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PlayerService f22018b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tb7 f22019c;

    /* JADX INFO: renamed from: com.lingq.core.player.service.PlayerService$showNotification$1$1 */
    @c32(m4290c = "com.lingq.core.player.service.PlayerService$showNotification$1$1", m4291f = "PlayerService.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18111 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PlayerService f22020a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Bitmap f22021b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18111(PlayerService playerService, Bitmap bitmap, Continuation continuation) {
            super(2, continuation);
            this.f22020a = playerService;
            this.f22021b = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C18111(this.f22020a, this.f22021b, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C18111 c18111 = (C18111) create((un1) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c18111.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IconCompat iconCompat;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            PlayerService playerService = this.f22020a;
            vm6 vm6Var = playerService.f21982O;
            if (vm6Var == null) {
                fa4.m11636J("builder");
                throw null;
            }
            Bitmap bitmap = this.f22021b;
            if (bitmap == null) {
                iconCompat = null;
            } else {
                iconCompat = new IconCompat(1);
                iconCompat.f5505b = bitmap;
            }
            vm6Var.f65588h = iconCompat;
            vm6 vm6Var2 = playerService.f21982O;
            if (vm6Var2 == null) {
                fa4.m11636J("builder");
                throw null;
            }
            Notification notificationMo15108c = vm6Var2.mo15108c();
            notificationMo15108c.getClass();
            Object systemService = playerService.getSystemService("notification");
            systemService.getClass();
            NotificationManager notificationManager = (NotificationManager) systemService;
            playerService.f21978K = notificationManager;
            notificationManager.notify(12355, notificationMo15108c);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerService$showNotification$1(PlayerService playerService, tb7 tb7Var, Continuation continuation) {
        super(2, continuation);
        this.f22018b = playerService;
        this.f22019c = tb7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlayerService$showNotification$1(this.f22018b, this.f22019c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerService$showNotification$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        if (p000.wfb.m23905G(r3, r1, r7) == r0) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Bitmap bitmapDecodeResource;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22017a;
        PlayerService playerService = this.f22018b;
        try {
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                } else {
                    if (i != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                }
                return xfa.f68157a;
            }
            AbstractC3193b.m15359b(obj);
            Context applicationContext = playerService.getApplicationContext();
            applicationContext.getClass();
            d04 d04Var = new d04(applicationContext);
            d04Var.f34778c = this.f22019c.f62107g;
            d04Var.f34786k = Boolean.FALSE;
            e04 e04VarM9960a = d04Var.m9960a();
            v72 v72Var = ph2.f56212a;
            t62 t62Var = t62.f61909c;
            PlayerService$showNotification$1$bitmap$result$1 playerService$showNotification$1$bitmap$result$1 = new PlayerService$showNotification$1$bitmap$result$1(playerService, e04VarM9960a, null);
            this.f22017a = 1;
            obj = wfb.m23905G(playerService$showNotification$1$bitmap$result$1, t62Var, this);
            if (obj == coroutineSingletons) {
            }
            return coroutineSingletons;
            f04 f04Var = (f04) obj;
            if (f04Var instanceof hn9) {
                Drawable drawable = ((hn9) f04Var).f42663a;
                BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
                if (bitmapDrawable != null) {
                    bitmapDecodeResource = bitmapDrawable.getBitmap();
                } else {
                    bitmapDecodeResource = null;
                }
            } else {
                bitmapDecodeResource = null;
            }
        } catch (Exception unused) {
        }
        if (bitmapDecodeResource == null) {
            bitmapDecodeResource = BitmapFactory.decodeResource(playerService.getResources(), R$drawable.ic_lingq);
        }
        nn1 nn1Var = playerService.f21994i;
        if (nn1Var == null) {
            fa4.m11636J("mainDispatcher");
            throw null;
        }
        C18111 c18111 = new C18111(playerService, bitmapDecodeResource, null);
        this.f22017a = 2;
    }
}
