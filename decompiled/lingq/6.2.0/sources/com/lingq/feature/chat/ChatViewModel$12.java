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
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$12", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$12 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24853a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24854b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$12(C2009m c2009m, Continuation continuation) {
        super(2, continuation);
        this.f24854b = c2009m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$12 chatViewModel$12 = new ChatViewModel$12(this.f24854b, continuation);
        chatViewModel$12.f24853a = obj;
        return chatViewModel$12;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ChatViewModel$12 chatViewModel$12 = (ChatViewModel$12) create((String) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        chatViewModel$12.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str = (String) this.f24853a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2009m c2009m = this.f24854b;
        C3244l c3244l = c2009m.f25281U;
        c2009m.m8921Z2(((v94) c3244l.getValue()).f65073u, ((v94) c3244l.getValue()).f65074v, str);
        return xfa.f68157a;
    }
}
