package com.lingq.core.domain.token;

import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.token.GetCwtUseCase$forLesson$2", m4291f = "GetCwtUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetCwtUseCase$forLesson$2 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Map f20025a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Map f20026b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetCwtUseCase$forLesson$2 getCwtUseCase$forLesson$2 = new GetCwtUseCase$forLesson$2(3, (Continuation) obj3);
        getCwtUseCase$forLesson$2.f20025a = (Map) obj;
        getCwtUseCase$forLesson$2.f20026b = (Map) obj2;
        return getCwtUseCase$forLesson$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map map = this.f20025a;
        Map map2 = this.f20026b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return AbstractC3194a.m15367T(map, map2);
    }
}
