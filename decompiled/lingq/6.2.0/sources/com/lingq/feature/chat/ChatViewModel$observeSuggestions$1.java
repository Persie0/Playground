package com.lingq.feature.chat;

import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.v94;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$observeSuggestions$1", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$observeSuggestions$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24982a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$observeSuggestions$1 chatViewModel$observeSuggestions$1 = new ChatViewModel$observeSuggestions$1(2, continuation);
        chatViewModel$observeSuggestions$1.f24982a = obj;
        return chatViewModel$observeSuggestions$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatViewModel$observeSuggestions$1) create((v94) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        v94 v94Var = (v94) this.f24982a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String str = v94Var.f65073u;
        int i = v94Var.f65057e.f44630b;
        Integer numValueOf = Integer.valueOf(i);
        Integer num = null;
        if (i <= 0) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            int i2 = v94Var.f65059g;
            Integer numValueOf2 = Integer.valueOf(i2);
            if (i2 > 0) {
                num = numValueOf2;
            }
        } else {
            num = numValueOf;
        }
        return new Pair(str, num);
    }
}
