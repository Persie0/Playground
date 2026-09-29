package com.lingq.core.token.domain;

import com.lingq.core.data.repository.C1293i;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lm4;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.domain.GetAvailableTagsUseCase$invoke$2", m4291f = "GetAvailableTagsUseCase.kt", m4292l = {15}, m4293m = "invokeSuspend", m4294v = 2)
final class GetAvailableTagsUseCase$invoke$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f23798a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1906c f23799b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f23800c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAvailableTagsUseCase$invoke$2(C1906c c1906c, String str, Continuation continuation) {
        super(1, continuation);
        this.f23799b = c1906c;
        this.f23800c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GetAvailableTagsUseCase$invoke$2(this.f23799b, this.f23800c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((GetAvailableTagsUseCase$invoke$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23798a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            lm4 lm4Var = (lm4) this.f23799b.f23860a;
            this.f23798a = 1;
            if (((C1293i) lm4Var).m7210g(this.f23800c, this) == coroutineSingletons) {
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
