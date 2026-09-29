package com.lingq.feature.chat;

import androidx.compose.foundation.lazy.C0127b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.tx0;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatSessionScreenKt$ChatSessionScreen$3$1$1", m4291f = "ChatSessionScreen.kt", m4292l = {216, 217}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatSessionScreenKt$ChatSessionScreen$3$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24824a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tx0 f24825b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0127b f24826c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f24827d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSessionScreenKt$ChatSessionScreen$3$1$1(tx0 tx0Var, C0127b c0127b, int i, Continuation continuation) {
        super(2, continuation);
        this.f24825b = tx0Var;
        this.f24826c = c0127b;
        this.f24827d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatSessionScreenKt$ChatSessionScreen$3$1$1(this.f24825b, this.f24826c, this.f24827d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatSessionScreenKt$ChatSessionScreen$3$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (androidx.compose.foundation.gestures.AbstractC0095c.m837l(r2, 100000.0f, r5) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24824a;
        C0127b c0127b = this.f24826c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (!this.f24825b.f63040e.isEmpty()) {
                this.f24824a = 1;
                if (C0127b.m973l(c0127b, this.f24827d, this) != coroutineSingletons) {
                    this.f24824a = 2;
                }
                return coroutineSingletons;
            }
            return xfa.f68157a;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
            this.f24824a = 2;
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
