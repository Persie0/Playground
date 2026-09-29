package com.lingq.feature.chat;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatSessionScreenKt$ChatSessionScreen$2$1", m4291f = "ChatSessionScreen.kt", m4292l = {169}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatSessionScreenKt$ChatSessionScreen$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24821a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f24822b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f24823c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSessionScreenKt$ChatSessionScreen$2$1(boolean z, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f24822b = z;
        this.f24823c = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatSessionScreenKt$ChatSessionScreen$2$1(this.f24822b, this.f24823c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatSessionScreenKt$ChatSessionScreen$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24821a;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f24823c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (!this.f24822b) {
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            }
            this.f24821a = 1;
            if (AbstractC3208a.m15437d(260L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        t66Var.setValue(Boolean.TRUE);
        return xfaVar;
    }
}
