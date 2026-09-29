package com.lingq.feature.chat;

import com.lingq.core.domain.model.chat.ChatMessage;
import com.lingq.core.domain.model.chat.ChatMessagePhrases;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.e65;
import p000.v94;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$19", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$19 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24864a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$19 chatViewModel$19 = new ChatViewModel$19(2, continuation);
        chatViewModel$19.f24864a = obj;
        return chatViewModel$19;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatViewModel$19) create((v94) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ChatMessagePhrases chatMessagePhrases;
        v94 v94Var = (v94) this.f24864a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ChatMessage chatMessage : v94Var.f65057e.f44629a) {
            List list = chatMessage.f18924e;
            int i = chatMessage.f18920a;
            List list2 = list;
            if (list2.isEmpty() && ((chatMessagePhrases = (ChatMessagePhrases) e65.m10872d(i, v94Var.f65041E)) == null || (list2 = chatMessagePhrases.f18932c) == null)) {
                list2 = EmptyList.f47638a;
            }
            List list3 = list2;
            if (!list3.isEmpty()) {
                linkedHashMap.put(new Integer(i), list3);
            }
        }
        return new Triple(v94Var.f65073u, new Integer(v94Var.f65059g), linkedHashMap);
    }
}
