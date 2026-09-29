package com.lingq.feature.chat;

import androidx.compose.p002ui.focus.InterfaceC0300b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.ld9;
import p000.pa2;
import p000.tz0;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatScreenKt$ChatScreen$1$1", m4291f = "ChatScreen.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatScreenKt$ChatScreen$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tz0 f24785a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ld9 f24786b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0300b f24787c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatScreenKt$ChatScreen$1$1(tz0 tz0Var, ld9 ld9Var, InterfaceC0300b interfaceC0300b, Continuation continuation) {
        super(2, continuation);
        this.f24785a = tz0Var;
        this.f24786b = ld9Var;
        this.f24787c = interfaceC0300b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatScreenKt$ChatScreen$1$1(this.f24785a, this.f24786b, this.f24787c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ChatScreenKt$ChatScreen$1$1 chatScreenKt$ChatScreen$1$1 = (ChatScreenKt$ChatScreen$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        chatScreenKt$ChatScreen$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (this.f24785a.f63116d.f63049n) {
            ld9 ld9Var = this.f24786b;
            if (ld9Var != null) {
                ((pa2) ld9Var).m19004a();
            }
            InterfaceC0300b.m1355a(this.f24787c);
        }
        return xfa.f68157a;
    }
}
