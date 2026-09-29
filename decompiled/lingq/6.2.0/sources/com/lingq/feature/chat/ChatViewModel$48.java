package com.lingq.feature.chat;

import kotlin.AbstractC3193b;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.lda;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$48", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$48 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24906a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24907b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$48(C2009m c2009m, Continuation continuation) {
        super(2, continuation);
        this.f24907b = c2009m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$48 chatViewModel$48 = new ChatViewModel$48(this.f24907b, continuation);
        chatViewModel$48.f24906a = obj;
        return chatViewModel$48;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ChatViewModel$48 chatViewModel$48 = (ChatViewModel$48) create((Triple) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        chatViewModel$48.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Triple triple = (Triple) this.f24906a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        int iIntValue = ((Number) triple.f47633a).intValue();
        String str = (String) triple.f47634b;
        if (((Boolean) triple.f47635c).booleanValue() && str.length() > 0) {
            C2009m c2009m = this.f24907b;
            wfb.m23926u(lda.m16103C(c2009m), null, null, new ChatViewModel$fetchLynxModelConfig$1(c2009m, str, iIntValue, null), 3);
        }
        return xfa.f68157a;
    }
}
