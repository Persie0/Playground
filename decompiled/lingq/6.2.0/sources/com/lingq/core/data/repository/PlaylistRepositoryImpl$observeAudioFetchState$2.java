package com.lingq.core.data.repository;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.InterfaceC3055gy;
import p000.aj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl$observeAudioFetchState$2", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistRepositoryImpl$observeAudioFetchState$2 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ InterfaceC3055gy f16000a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ InterfaceC3055gy f16001b;

    public PlaylistRepositoryImpl$observeAudioFetchState$2() {
        super(3, null);
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlaylistRepositoryImpl$observeAudioFetchState$2 playlistRepositoryImpl$observeAudioFetchState$2 = new PlaylistRepositoryImpl$observeAudioFetchState$2(3, (Continuation) obj3);
        playlistRepositoryImpl$observeAudioFetchState$2.f16000a = (InterfaceC3055gy) obj;
        playlistRepositoryImpl$observeAudioFetchState$2.f16001b = (InterfaceC3055gy) obj2;
        return playlistRepositoryImpl$observeAudioFetchState$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC3055gy interfaceC3055gy = this.f16000a;
        InterfaceC3055gy interfaceC3055gy2 = this.f16001b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return interfaceC3055gy == null ? interfaceC3055gy2 : interfaceC3055gy;
    }
}
