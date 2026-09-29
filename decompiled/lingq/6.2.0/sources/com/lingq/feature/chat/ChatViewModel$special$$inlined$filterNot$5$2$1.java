package com.lingq.feature.chat;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.xz0;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$special$$inlined$filterNot$5$2", m4291f = "ChatViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ChatViewModel$special$$inlined$filterNot$5$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f25041a;

    /* JADX INFO: renamed from: b */
    public int f25042b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xz0 f25043c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$special$$inlined$filterNot$5$2$1(xz0 xz0Var, Continuation continuation) {
        super(continuation);
        this.f25043c = xz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25041a = obj;
        this.f25042b |= Integer.MIN_VALUE;
        return this.f25043c.emit(null, this);
    }
}
