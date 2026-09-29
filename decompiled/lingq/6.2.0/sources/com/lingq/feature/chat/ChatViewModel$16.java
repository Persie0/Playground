package com.lingq.feature.chat;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.iv0;
import p000.ux0;
import p000.v94;
import p000.wx0;
import p000.xfa;
import p000.xx0;
import p000.yx0;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$16", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$16 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2009m f24860a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$16(C2009m c2009m, Continuation continuation) {
        super(2, continuation);
        this.f24860a = c2009m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatViewModel$16(this.f24860a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ChatViewModel$16 chatViewModel$16 = (ChatViewModel$16) create((v94) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        chatViewModel$16.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        v94 v94Var;
        yx0 yx0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f24860a.f25281U;
        do {
            value = c3244l.getValue();
            v94Var = (v94) value;
            iv0 iv0Var = v94Var.f65057e;
            int i = v94Var.f65059g;
            boolean zIsEmpty = iv0Var.f44629a.isEmpty();
            yx0Var = ux0.f64483a;
            if ((zIsEmpty && iv0Var.f44642n == null) || i == -1) {
                if (v94Var.f65062j && iv0Var.f44629a.isEmpty()) {
                    yx0Var = wx0.f67466a;
                } else if (i == -1) {
                    yx0Var = xx0.f68916a;
                }
            }
        } while (!c3244l.m15570h(value, v94.m23191a(v94Var, null, null, false, false, null, yx0Var, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -33, 1023)));
        return xfa.f68157a;
    }
}
