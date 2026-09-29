package com.lingq.core.domain.dictionaries;

import com.lingq.core.data.repository.C1297m;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.dictionaries.GetAvailableDictionaryLocalesUseCase$invoke$2", m4291f = "GetAvailableDictionaryLocalesUseCase.kt", m4292l = {17}, m4293m = "invokeSuspend", m4294v = 2)
final class GetAvailableDictionaryLocalesUseCase$invoke$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f18626a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1375a f18627b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAvailableDictionaryLocalesUseCase$invoke$2(C1375a c1375a, Continuation continuation) {
        super(1, continuation);
        this.f18627b = c1375a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GetAvailableDictionaryLocalesUseCase$invoke$2(this.f18627b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((GetAvailableDictionaryLocalesUseCase$invoke$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f18626a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1297m c1297m = this.f18627b.f18634b;
            this.f18626a = 1;
            if (c1297m.m7328b(this) == coroutineSingletons) {
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
