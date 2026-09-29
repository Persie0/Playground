package com.lingq.feature.chat;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3475pw;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$special$$inlined$filterNot$1$2", m4291f = "ChatViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ChatViewModel$special$$inlined$filterNot$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f25029a;

    /* JADX INFO: renamed from: b */
    public int f25030b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3475pw f25031c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$special$$inlined$filterNot$1$2$1(C3475pw c3475pw, Continuation continuation) {
        super(continuation);
        this.f25031c = c3475pw;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25029a = obj;
        this.f25030b |= Integer.MIN_VALUE;
        return this.f25031c.emit(null, this);
    }
}
