package com.lingq.feature.chat;

import androidx.compose.foundation.gestures.AbstractC0095c;
import androidx.compose.foundation.lazy.C0127b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatSessionScreenKt$FollowConversationEnd$1$1", m4291f = "ChatSessionScreen.kt", m4292l = {367, 368}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatSessionScreenKt$FollowConversationEnd$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24828a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f24829b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0127b f24830c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f24831d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSessionScreenKt$FollowConversationEnd$1$1(boolean z, C0127b c0127b, int i, Continuation continuation) {
        super(2, continuation);
        this.f24829b = z;
        this.f24830c = c0127b;
        this.f24831d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatSessionScreenKt$FollowConversationEnd$1$1(this.f24829b, this.f24830c, this.f24831d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatSessionScreenKt$FollowConversationEnd$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24828a;
        C0127b c0127b = this.f24830c;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (this.f24829b) {
                this.f24828a = 1;
                if (C0127b.m973l(c0127b, this.f24831d, this) != coroutineSingletons) {
                }
            }
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        this.f24828a = 2;
        return AbstractC0095c.m837l(c0127b, 100000.0f, this) == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
