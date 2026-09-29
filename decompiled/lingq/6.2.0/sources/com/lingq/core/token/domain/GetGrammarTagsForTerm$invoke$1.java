package com.lingq.core.token.domain;

import com.lingq.core.domain.model.lesson.LessonWord;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.domain.GetGrammarTagsForTerm$invoke$1", m4291f = "GetGrammarTagsForTerm.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetGrammarTagsForTerm$invoke$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23801a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetGrammarTagsForTerm$invoke$1 getGrammarTagsForTerm$invoke$1 = new GetGrammarTagsForTerm$invoke$1(2, continuation);
        getGrammarTagsForTerm$invoke$1.f23801a = obj;
        return getGrammarTagsForTerm$invoke$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GetGrammarTagsForTerm$invoke$1) create((LessonWord) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LessonWord lessonWord = (LessonWord) this.f23801a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return lessonWord.f19316c;
    }
}
