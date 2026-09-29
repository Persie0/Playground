package com.lingq.feature.chat;

import android.content.ClipData;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.C3610tg;
import p000.c32;
import p000.t31;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatSessionScreenKt$ChatMessageUserItem$1$1$1", m4291f = "ChatSessionScreen.kt", m4292l = {491}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatSessionScreenKt$ChatMessageUserItem$1$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24816a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t31 f24817b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f24818c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSessionScreenKt$ChatMessageUserItem$1$1$1(t31 t31Var, String str, Continuation continuation) {
        super(2, continuation);
        this.f24817b = t31Var;
        this.f24818c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatSessionScreenKt$ChatMessageUserItem$1$1$1(this.f24817b, this.f24818c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatSessionScreenKt$ChatMessageUserItem$1$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24816a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        ClipData clipDataNewPlainText = ClipData.newPlainText("", this.f24818c);
        clipDataNewPlainText.getClass();
        this.f24816a = 1;
        ((C3610tg) this.f24817b).f62240a.m3360m().setPrimaryClip(clipDataNewPlainText);
        return xfaVar == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
