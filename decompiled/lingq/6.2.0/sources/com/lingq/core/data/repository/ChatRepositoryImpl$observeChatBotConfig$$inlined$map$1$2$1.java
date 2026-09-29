package com.lingq.core.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.cx0;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChatRepositoryImpl$observeChatBotConfig$$inlined$map$1$2", m4291f = "ChatRepositoryImpl.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class ChatRepositoryImpl$observeChatBotConfig$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f14956a;

    /* JADX INFO: renamed from: b */
    public int f14957b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cx0 f14958c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRepositoryImpl$observeChatBotConfig$$inlined$map$1$2$1(cx0 cx0Var, Continuation continuation) {
        super(continuation);
        this.f14958c = cx0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14956a = obj;
        this.f14957b |= Integer.MIN_VALUE;
        return this.f14958c.emit(null, this);
    }
}
