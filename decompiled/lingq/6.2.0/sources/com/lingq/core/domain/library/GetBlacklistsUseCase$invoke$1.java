package com.lingq.core.domain.library;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.domain.library.GetBlacklistsUseCase$invoke$1", m4291f = "GetBlacklistsUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetBlacklistsUseCase$invoke$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f18740a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f18741b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetBlacklistsUseCase$invoke$1 getBlacklistsUseCase$invoke$1 = new GetBlacklistsUseCase$invoke$1(3, (Continuation) obj3);
        getBlacklistsUseCase$invoke$1.f18740a = (List) obj;
        getBlacklistsUseCase$invoke$1.f18741b = (List) obj2;
        return getBlacklistsUseCase$invoke$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f18740a;
        List list2 = this.f18741b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new Pair(list, list2);
    }
}
