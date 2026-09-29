package com.lingq.feature.chat;

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
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$25", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$25 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f24875a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24876b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$25(C2009m c2009m, Continuation continuation) {
        super(2, continuation);
        this.f24876b = c2009m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$25 chatViewModel$25 = new ChatViewModel$25(this.f24876b, continuation);
        chatViewModel$25.f24875a = ((Boolean) obj).booleanValue();
        return chatViewModel$25;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        ChatViewModel$25 chatViewModel$25 = (ChatViewModel$25) create(bool, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        chatViewModel$25.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f24875a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f24876b.f25281U;
        while (true) {
            Object value = c3244l.getValue();
            boolean z2 = z;
            if (c3244l.m15570h(value, v94.m23191a((v94) value, null, null, false, false, null, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, z2, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -33554433, 1023))) {
                return xfa.f68157a;
            }
            z = z2;
        }
    }
}
