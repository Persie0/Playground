package com.lingq.feature.vocabulary.domain;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.e83;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.domain.GetVocabularySearchQueryForUseCase$invoke$1", m4291f = "GetVocabularySearchQueryForUseCase.kt", m4292l = {18}, m4293m = "invokeSuspend", m4294v = 2)
final class GetVocabularySearchQueryForUseCase$invoke$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33560a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2826b f33561b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f33562c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetVocabularySearchQueryForUseCase$invoke$1(C2826b c2826b, String str, Continuation continuation) {
        super(2, continuation);
        this.f33561b = c2826b;
        this.f33562c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetVocabularySearchQueryForUseCase$invoke$1(this.f33561b, this.f33562c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GetVocabularySearchQueryForUseCase$invoke$1) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33560a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f33560a = 1;
            if (this.f33561b.m9748b(this.f33562c, this) == coroutineSingletons) {
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
