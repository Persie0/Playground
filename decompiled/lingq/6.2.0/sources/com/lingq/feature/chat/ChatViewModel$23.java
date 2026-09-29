package com.lingq.feature.chat;

import com.lingq.core.premium.UpgradeUserType;
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
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$23", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$23 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24871a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24872b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$23(C2009m c2009m, Continuation continuation) {
        super(2, continuation);
        this.f24872b = c2009m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$23 chatViewModel$23 = new ChatViewModel$23(this.f24872b, continuation);
        chatViewModel$23.f24871a = obj;
        return chatViewModel$23;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ChatViewModel$23 chatViewModel$23 = (ChatViewModel$23) create((UpgradeUserType) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        chatViewModel$23.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        UpgradeUserType upgradeUserType = (UpgradeUserType) this.f24871a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f24872b.f25281U;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, v94.m23191a((v94) value, null, null, false, false, null, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, upgradeUserType, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -67108865, 1023)));
        return xfa.f68157a;
    }
}
