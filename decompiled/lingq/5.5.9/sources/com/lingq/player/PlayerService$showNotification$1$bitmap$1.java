package com.lingq.player;

import android.graphics.Bitmap;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p171i6.InterfaceFutureC6198c;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.player.PlayerService$showNotification$1$bitmap$1", m19206f = "PlayerService.kt", m19207l = {}, m19208m = "invokeSuspend")
public final class PlayerService$showNotification$1$bitmap$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super Bitmap>, Object> {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceFutureC6198c<Bitmap> f17723e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerService$showNotification$1$bitmap$1(InterfaceFutureC6198c<Bitmap> interfaceFutureC6198c, InterfaceC9968c<? super PlayerService$showNotification$1$bitmap$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f17723e = interfaceFutureC6198c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlayerService$showNotification$1$bitmap$1(this.f17723e, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super Bitmap> interfaceC9968c) {
        return ((PlayerService$showNotification$1$bitmap$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        return this.f17723e.get();
    }
}
