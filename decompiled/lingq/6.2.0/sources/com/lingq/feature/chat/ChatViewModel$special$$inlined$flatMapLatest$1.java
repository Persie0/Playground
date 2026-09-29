package com.lingq.feature.chat;

import com.lingq.core.domain.model.chat.ChatMessage;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.C3540rl;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.wz0;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$special$$inlined$flatMapLatest$1", m4291f = "ChatViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class ChatViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f25044a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f25045b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f25046c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2009m f25047d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$special$$inlined$flatMapLatest$1(C2009m c2009m, Continuation continuation) {
        super(3, continuation);
        this.f25047d = c2009m;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChatViewModel$special$$inlined$flatMapLatest$1 chatViewModel$special$$inlined$flatMapLatest$1 = new ChatViewModel$special$$inlined$flatMapLatest$1(this.f25047d, (Continuation) obj3);
        chatViewModel$special$$inlined$flatMapLatest$1.f25045b = (e83) obj;
        chatViewModel$special$$inlined$flatMapLatest$1.f25046c = obj2;
        return chatViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f25045b;
        Object obj2 = this.f25046c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25044a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            int i2 = 0;
            C3540rl c3540rl = new C3540rl(new wz0(i2, this.f25047d.f25282V, (ChatMessage) obj2), 4);
            this.f25045b = null;
            this.f25046c = null;
            this.f25044a = 1;
            if (AbstractC3224d.m15537p(e83Var, c3540rl, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
