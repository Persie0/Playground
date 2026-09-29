package com.lingq.feature.chat;

import com.lingq.core.common.util.AbstractC1263a;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.lda;
import p000.m83;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$21", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$21 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24867a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24868b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$21(C2009m c2009m, Continuation continuation) {
        super(2, continuation);
        this.f24868b = c2009m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$21 chatViewModel$21 = new ChatViewModel$21(this.f24868b, continuation);
        chatViewModel$21.f24867a = obj;
        return chatViewModel$21;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ChatViewModel$21 chatViewModel$21 = (ChatViewModel$21) create((Triple) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        chatViewModel$21.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Triple triple = (Triple) this.f24867a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String str = (String) triple.f47633a;
        Map map = (Map) triple.f47635c;
        C2009m c2009m = this.f24868b;
        AbstractC1263a.m7050e(new m83(c2009m.f25297j.m8862b(str, map), new ChatViewModel$observeSuggestedPhraseCards$1(c2009m, null), 2), lda.m16103C(c2009m), "suggestedPhraseCards");
        return xfa.f68157a;
    }
}
