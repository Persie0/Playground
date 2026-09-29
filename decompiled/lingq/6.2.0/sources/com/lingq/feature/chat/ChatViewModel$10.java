package com.lingq.feature.chat;

import com.lingq.core.common.util.AbstractC1263a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.lda;
import p000.m83;
import p000.v94;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$10", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$10 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int f24850a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24851b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$10(C2009m c2009m, Continuation continuation) {
        super(2, continuation);
        this.f24851b = c2009m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$10 chatViewModel$10 = new ChatViewModel$10(this.f24851b, continuation);
        chatViewModel$10.f24850a = ((Number) obj).intValue();
        return chatViewModel$10;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ChatViewModel$10 chatViewModel$10 = (ChatViewModel$10) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        chatViewModel$10.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2009m c2009m = this.f24851b;
        C3244l c3244l = c2009m.f25281U;
        int i = this.f24850a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (i != -1 && i != -2) {
            String str = ((v94) c3244l.getValue()).f65073u;
            AbstractC1263a.m7050e(new m83(c2009m.f25295h.m7979a(str, i, ((v94) c3244l.getValue()).f65074v), new ChatViewModel$observeTokensData$1(c2009m, str, null), 2), lda.m16103C(c2009m), "lessonChatData");
        }
        return xfa.f68157a;
    }
}
