package com.lingq.feature.chat;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$39", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$39 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24894a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24895b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$39(C2009m c2009m, Continuation continuation) {
        super(2, continuation);
        this.f24895b = c2009m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$39 chatViewModel$39 = new ChatViewModel$39(this.f24895b, continuation);
        chatViewModel$39.f24894a = obj;
        return chatViewModel$39;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ChatViewModel$39 chatViewModel$39 = (ChatViewModel$39) create((String) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        chatViewModel$39.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str = (String) this.f24894a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        str.getClass();
        this.f24895b.m8927d3(new Regex("[\\u2190-\\u21FF]|[\\u2300-\\u23FF]|[\\u2600-\\u26FF]|[\\u2700-\\u27BF]|[\\u3000-\\u303F]|[\\uD83C\\uDC00-\\uD83C\\uDFFF]|[\\uD83D\\uDC00-\\uD83D\\uDFFF]|[\\uD83E\\uDD00-\\uD83E\\uDFFF]").m15428g(str, ""));
        return xfa.f68157a;
    }
}
