package com.lingq.feature.chat;

import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.v94;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$observePhraseSuggestionsForMessage$1", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$observePhraseSuggestionsForMessage$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24967a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24968b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$observePhraseSuggestionsForMessage$1(C2009m c2009m, Continuation continuation) {
        super(2, continuation);
        this.f24968b = c2009m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$observePhraseSuggestionsForMessage$1 chatViewModel$observePhraseSuggestionsForMessage$1 = new ChatViewModel$observePhraseSuggestionsForMessage$1(this.f24968b, continuation);
        chatViewModel$observePhraseSuggestionsForMessage$1.f24967a = obj;
        return chatViewModel$observePhraseSuggestionsForMessage$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ChatViewModel$observePhraseSuggestionsForMessage$1 chatViewModel$observePhraseSuggestionsForMessage$1 = (ChatViewModel$observePhraseSuggestionsForMessage$1) create((Map) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        chatViewModel$observePhraseSuggestionsForMessage$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Map map = (Map) this.f24967a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f24968b.f25281U;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, v94.m23191a((v94) value, null, null, false, false, null, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, map, false, false, null, null, null, false, null, false, null, null, null, -1073741825, 1023)));
        return xfa.f68157a;
    }
}
