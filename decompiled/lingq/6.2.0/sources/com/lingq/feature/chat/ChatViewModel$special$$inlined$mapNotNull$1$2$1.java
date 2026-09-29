package com.lingq.feature.chat;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.xz0;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$special$$inlined$mapNotNull$1$2", m4291f = "ChatViewModel.kt", m4292l = {225}, m4293m = "emit", m4294v = 2)
public final class ChatViewModel$special$$inlined$mapNotNull$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f25048a;

    /* JADX INFO: renamed from: b */
    public int f25049b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xz0 f25050c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$special$$inlined$mapNotNull$1$2$1(xz0 xz0Var, Continuation continuation) {
        super(continuation);
        this.f25050c = xz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25048a = obj;
        this.f25049b |= Integer.MIN_VALUE;
        return this.f25050c.emit(null, this);
    }
}
