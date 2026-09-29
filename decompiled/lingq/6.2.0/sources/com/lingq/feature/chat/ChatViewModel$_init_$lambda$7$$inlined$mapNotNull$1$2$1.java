package com.lingq.feature.chat;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3602t8;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$_init_$lambda$7$$inlined$mapNotNull$1$2", m4291f = "ChatViewModel.kt", m4292l = {220}, m4293m = "emit", m4294v = 2)
public final class ChatViewModel$_init_$lambda$7$$inlined$mapNotNull$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24914a;

    /* JADX INFO: renamed from: b */
    public int f24915b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3602t8 f24916c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$_init_$lambda$7$$inlined$mapNotNull$1$2$1(C3602t8 c3602t8, Continuation continuation) {
        super(continuation);
        this.f24916c = c3602t8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24914a = obj;
        this.f24915b |= Integer.MIN_VALUE;
        return this.f24916c.emit(null, this);
    }
}
