package com.lingq.feature.chat;

import androidx.compose.material3.C0253l;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.b34;
import p000.c32;
import p000.tf4;
import p000.ui3;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatScreenKt$ChatScreen$2$1", m4291f = "ChatScreen.kt", m4292l = {909}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatScreenKt$ChatScreen$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24788a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0253l f24789b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f24790c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatScreenKt$ChatScreen$2$1(C0253l c0253l, ui3 ui3Var, Continuation continuation) {
        super(2, continuation);
        this.f24789b = c0253l;
        this.f24790c = ui3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatScreenKt$ChatScreen$2$1(this.f24789b, this.f24790c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatScreenKt$ChatScreen$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24788a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (this.f24789b.m1182c()) {
                tf4 tf4Var = new tf4(29);
                this.f24788a = 1;
                if (b34.m3250q(getContext()).mo1250e(tf4Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return xfa.f68157a;
        }
        if (i != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        this.f24790c.mo0a();
        return xfa.f68157a;
    }
}
