package com.lingq.feature.chat;

import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$observeCards$1", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$observeCards$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24951a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24952b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$observeCards$1(C2009m c2009m, Continuation continuation) {
        super(2, continuation);
        this.f24952b = c2009m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$observeCards$1 chatViewModel$observeCards$1 = new ChatViewModel$observeCards$1(this.f24952b, continuation);
        chatViewModel$observeCards$1.f24951a = obj;
        return chatViewModel$observeCards$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ChatViewModel$observeCards$1 chatViewModel$observeCards$1 = (ChatViewModel$observeCards$1) create((Map) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        chatViewModel$observeCards$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Map map = (Map) this.f24951a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f24952b.f25283W;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, map));
        return xfa.f68157a;
    }
}
