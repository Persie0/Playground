package com.lingq.feature.chat;

import com.lingq.core.domain.model.chat.ChatMessage;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.v94;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$40", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$40 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24897a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$40 chatViewModel$40 = new ChatViewModel$40(2, continuation);
        chatViewModel$40.f24897a = obj;
        return chatViewModel$40;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatViewModel$40) create((v94) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objPrevious;
        v94 v94Var = (v94) this.f24897a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        List list = v94Var.f65057e.f44629a;
        Map map = v94Var.f65039C;
        list.getClass();
        ListIterator listIterator = list.listIterator(list.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((ChatMessage) objPrevious).m8014b());
        ChatMessage chatMessage = (ChatMessage) objPrevious;
        if (chatMessage != null) {
            CharSequence charSequence = (CharSequence) map.get(Integer.valueOf(chatMessage.f18920a));
            if (charSequence == null || charSequence.length() == 0) {
                chatMessage = null;
            }
            if (chatMessage != null) {
                return Integer.valueOf(chatMessage.f18920a);
            }
        }
        return null;
    }
}
