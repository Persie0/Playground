package com.lingq.feature.chat;

import com.lingq.core.domain.model.chat.ChatPhrase;
import com.lingq.core.domain.model.token.TokenTranslationSimple;
import com.lingq.core.domain.model.token.TokenTranslations;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.u91;
import p000.v94;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$observeChatPhrasesTranslations$1$1", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$observeChatPhrasesTranslations$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24959a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24960b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ChatPhrase f24961c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$observeChatPhrasesTranslations$1$1(C2009m c2009m, ChatPhrase chatPhrase, Continuation continuation) {
        super(2, continuation);
        this.f24960b = c2009m;
        this.f24961c = chatPhrase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$observeChatPhrasesTranslations$1$1 chatViewModel$observeChatPhrasesTranslations$1$1 = new ChatViewModel$observeChatPhrasesTranslations$1$1(this.f24960b, this.f24961c, continuation);
        chatViewModel$observeChatPhrasesTranslations$1$1.f24959a = obj;
        return chatViewModel$observeChatPhrasesTranslations$1$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ChatViewModel$observeChatPhrasesTranslations$1$1 chatViewModel$observeChatPhrasesTranslations$1$1 = (ChatViewModel$observeChatPhrasesTranslations$1$1) create((TokenTranslations) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        chatViewModel$observeChatPhrasesTranslations$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        v94 v94Var;
        TokenTranslations tokenTranslations = (TokenTranslations) this.f24959a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (tokenTranslations != null) {
            List list = tokenTranslations.f19618b;
            if (!list.isEmpty()) {
                C2009m c2009m = this.f24960b;
                C3244l c3244l = c2009m.f25281U;
                do {
                    value = c3244l.getValue();
                    v94Var = (v94) value;
                } while (!c3244l.m15570h(value, v94.m23191a(v94Var, null, null, false, false, null, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, AbstractC3194a.m15368U(v94Var.f65038B, new Pair(vz1.m23609O(this.f24961c.f18937a, c2009m.f25273M.mo4589b2()), ((TokenTranslationSimple) u91.m22589G0(list)).f19615a)), null, null, null, false, false, null, null, null, false, null, false, null, null, null, -134217729, 1023)));
            }
        }
        return xfa.f68157a;
    }
}
