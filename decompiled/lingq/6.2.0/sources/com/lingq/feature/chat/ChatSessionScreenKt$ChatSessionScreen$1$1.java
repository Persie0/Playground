package com.lingq.feature.chat;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.t66;
import p000.tx0;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatSessionScreenKt$ChatSessionScreen$1$1", m4291f = "ChatSessionScreen.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatSessionScreenKt$ChatSessionScreen$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tx0 f24819a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f24820b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSessionScreenKt$ChatSessionScreen$1$1(tx0 tx0Var, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f24819a = tx0Var;
        this.f24820b = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatSessionScreenKt$ChatSessionScreen$1$1(this.f24819a, this.f24820b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ChatSessionScreenKt$ChatSessionScreen$1$1 chatSessionScreenKt$ChatSessionScreen$1$1 = (ChatSessionScreenKt$ChatSessionScreen$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        chatSessionScreenKt$ChatSessionScreen$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        tx0 tx0Var = this.f24819a;
        if (!tx0Var.f63037b.isEmpty()) {
            this.f24820b.setValue(tx0Var.f63037b);
        }
        return xfa.f68157a;
    }
}
