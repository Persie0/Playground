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
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$44", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$44 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24901a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24902b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$44(C2009m c2009m, Continuation continuation) {
        super(2, continuation);
        this.f24902b = c2009m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$44 chatViewModel$44 = new ChatViewModel$44(this.f24902b, continuation);
        chatViewModel$44.f24901a = obj;
        return chatViewModel$44;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ChatViewModel$44 chatViewModel$44 = (ChatViewModel$44) create((Triple) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        chatViewModel$44.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Triple triple = (Triple) this.f24901a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        int iIntValue = ((Number) triple.f47633a).intValue();
        ChatMode chatMode = (ChatMode) triple.f47634b;
        String str = (String) triple.f47635c;
        String serverId = chatMode.getServerId();
        C2009m c2009m = this.f24902b;
        wfb.m23926u(lda.m16103C(c2009m), null, null, new ChatViewModel$updateChatConfig$1(c2009m, str, iIntValue, serverId, null), 3);
        return xfa.f68157a;
    }
}
