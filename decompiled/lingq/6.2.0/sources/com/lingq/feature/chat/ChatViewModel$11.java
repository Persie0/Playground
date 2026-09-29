package com.lingq.feature.chat;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.v94;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$11", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$11 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24852a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$11 chatViewModel$11 = new ChatViewModel$11(2, continuation);
        chatViewModel$11.f24852a = obj;
        return chatViewModel$11;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatViewModel$11) create((v94) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        v94 v94Var = (v94) this.f24852a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return v94Var.f65076x;
    }
}
