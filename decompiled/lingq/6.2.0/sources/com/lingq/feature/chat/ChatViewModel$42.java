package com.lingq.feature.chat;

import kotlin.AbstractC3193b;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.v94;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$42", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$42 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24900a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$42 chatViewModel$42 = new ChatViewModel$42(2, continuation);
        chatViewModel$42.f24900a = obj;
        return chatViewModel$42;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatViewModel$42) create((v94) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        v94 v94Var = (v94) this.f24900a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new Triple(new Integer(v94Var.f65059g), v94Var.f65044H, v94Var.f65073u);
    }
}
