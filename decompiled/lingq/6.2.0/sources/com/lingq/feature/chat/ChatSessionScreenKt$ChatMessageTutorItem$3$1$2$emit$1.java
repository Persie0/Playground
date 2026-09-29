package com.lingq.feature.chat;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatSessionScreenKt$ChatMessageTutorItem$3$1$2", m4291f = "ChatSessionScreen.kt", m4292l = {721, 725}, m4293m = "emit", m4294v = 2)
final class ChatSessionScreenKt$ChatMessageTutorItem$3$1$2$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f24812a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f24813b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2007k f24814c;

    /* JADX INFO: renamed from: d */
    public int f24815d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSessionScreenKt$ChatMessageTutorItem$3$1$2$emit$1(C2007k c2007k, Continuation continuation) {
        super(continuation);
        this.f24814c = c2007k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24813b = obj;
        this.f24815d |= Integer.MIN_VALUE;
        return this.f24814c.m8909a(0, this);
    }
}
