package com.lingq.core.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3475pw;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChatRepositoryImpl$observableChatSuggestions$$inlined$map$1$2", m4291f = "ChatRepositoryImpl.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class ChatRepositoryImpl$observableChatSuggestions$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f14953a;

    /* JADX INFO: renamed from: b */
    public int f14954b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3475pw f14955c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRepositoryImpl$observableChatSuggestions$$inlined$map$1$2$1(C3475pw c3475pw, Continuation continuation) {
        super(continuation);
        this.f14955c = c3475pw;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14953a = obj;
        this.f14954b |= Integer.MIN_VALUE;
        return this.f14955c.emit(null, this);
    }
}
