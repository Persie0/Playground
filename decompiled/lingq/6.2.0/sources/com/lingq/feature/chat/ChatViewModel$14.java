package com.lingq.feature.chat;

import com.lingq.core.data.repository.C1289e;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.a23;
import p000.c32;
import p000.iv0;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$14", m4291f = "ChatViewModel.kt", m4292l = {624}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$14 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24856a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f24857b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2009m f24858c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$14(C2009m c2009m, Continuation continuation) {
        super(2, continuation);
        this.f24858c = c2009m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$14 chatViewModel$14 = new ChatViewModel$14(this.f24858c, continuation);
        chatViewModel$14.f24857b = obj;
        return chatViewModel$14;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatViewModel$14) create((Pair) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Pair pair = (Pair) this.f24857b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24856a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            iv0 iv0Var = (iv0) pair.f47623a;
            String str = (String) pair.f47624b;
            int i2 = iv0Var.f44630b;
            if (i2 != -1 && i2 != -2) {
                a23 a23Var = this.f24858c.f25299l;
                this.f24857b = null;
                this.f24856a = 1;
                Object objM7159i = ((C1289e) a23Var.f90a).m7159i(i2, str, this);
                if (objM7159i != coroutineSingletons) {
                    objM7159i = xfaVar;
                }
                if (objM7159i == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfaVar;
    }
}
