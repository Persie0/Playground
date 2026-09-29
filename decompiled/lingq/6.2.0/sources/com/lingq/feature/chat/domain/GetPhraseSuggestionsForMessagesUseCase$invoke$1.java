package com.lingq.feature.chat.domain;

import com.lingq.core.domain.model.chat.ChatMessagePhrases;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.v91;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.domain.GetPhraseSuggestionsForMessagesUseCase$invoke$1", m4291f = "GetPhraseSuggestionsForMessagesUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetPhraseSuggestionsForMessagesUseCase$invoke$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f25193a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetPhraseSuggestionsForMessagesUseCase$invoke$1 getPhraseSuggestionsForMessagesUseCase$invoke$1 = new GetPhraseSuggestionsForMessagesUseCase$invoke$1(2, continuation);
        getPhraseSuggestionsForMessagesUseCase$invoke$1.f25193a = obj;
        return getPhraseSuggestionsForMessagesUseCase$invoke$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GetPhraseSuggestionsForMessagesUseCase$invoke$1) create((List) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = (List) this.f25193a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        List list2 = list;
        int iM15363P = AbstractC3194a.m15363P(v91.m23189q0(list2, 10));
        if (iM15363P < 16) {
            iM15363P = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM15363P);
        for (Object obj2 : list2) {
            linkedHashMap.put(new Integer(((ChatMessagePhrases) obj2).f18931b), obj2);
        }
        return linkedHashMap;
    }
}
