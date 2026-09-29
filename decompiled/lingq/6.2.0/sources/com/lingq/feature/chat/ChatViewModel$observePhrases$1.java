package com.lingq.feature.chat;

import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.v94;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$observePhrases$1", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$observePhrases$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24969a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24970b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$observePhrases$1(C2009m c2009m, Continuation continuation) {
        super(2, continuation);
        this.f24970b = c2009m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$observePhrases$1 chatViewModel$observePhrases$1 = new ChatViewModel$observePhrases$1(this.f24970b, continuation);
        chatViewModel$observePhrases$1.f24969a = obj;
        return chatViewModel$observePhrases$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ChatViewModel$observePhrases$1 chatViewModel$observePhrases$1 = (ChatViewModel$observePhrases$1) create((Pair) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        chatViewModel$observePhrases$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        Pair pair = (Pair) this.f24969a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2009m c2009m = this.f24970b;
        C3244l c3244l = c2009m.f25285Y;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, (Map) pair.f47624b));
        C3244l c3244l2 = c2009m.f25281U;
        do {
            value2 = c3244l2.getValue();
        } while (!c3244l2.m15570h(value2, v94.m23191a((v94) value2, null, null, false, false, null, null, 0, null, null, false, false, false, null, (Map) pair.f47623a, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -8193, 1023)));
        return xfa.f68157a;
    }
}
