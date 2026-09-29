package com.lingq.feature.chat;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1289e;
import kotlin.AbstractC3193b;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.c32;
import p000.lda;
import p000.m83;
import p000.mv0;
import p000.nr2;
import p000.vk9;
import p000.wq1;
import p000.xfa;
import p000.z13;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$8", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$8 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24911a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24912b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$8(C2009m c2009m, Continuation continuation) {
        super(2, continuation);
        this.f24912b = c2009m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$8 chatViewModel$8 = new ChatViewModel$8(this.f24912b, continuation);
        chatViewModel$8.f24911a = obj;
        return chatViewModel$8;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ChatViewModel$8 chatViewModel$8 = (ChatViewModel$8) create((Triple) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        chatViewModel$8.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Triple triple = (Triple) this.f24911a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String str = (String) triple.f47633a;
        String str2 = (String) triple.f47634b;
        int iIntValue = ((Number) triple.f47635c).intValue();
        if (str.length() > 0 && str2.length() > 0 && iIntValue != -1) {
            C2009m c2009m = this.f24912b;
            AbstractC1263a.m7050e(new m83(c2009m.f25290c.m7980a(str, iIntValue, str2), new ChatViewModel$observeChatHistory$1(c2009m, str, iIntValue, null), 2), lda.m16103C(c2009m), wq1.m24119o("observeChatHistory_", str, "_", str2));
            if (iIntValue != -2) {
                z13 z13Var = c2009m.f25305r;
                z13Var.getClass();
                AbstractC1263a.m7050e(new m83((vk9.m23391n0(str) || iIntValue <= 0) ? nr2.f53163a : AbstractC3224d.m15536o(AbstractC3224d.m15536o(AbstractC3584sr.m21590A(((C1289e) z13Var.f70745a).f16467a.f17001K, false, new String[]{"ChatStatsEntity"}, new mv0(iIntValue, 1)))), new ChatViewModel$observeChatStats$1(c2009m, null), 2), lda.m16103C(c2009m), "chatStats");
            }
        }
        return xfa.f68157a;
    }
}
