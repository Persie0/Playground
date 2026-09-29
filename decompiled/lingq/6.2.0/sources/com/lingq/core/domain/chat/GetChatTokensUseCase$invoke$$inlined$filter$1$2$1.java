package com.lingq.core.domain.chat;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3475pw;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.chat.GetChatTokensUseCase$invoke$$inlined$filter$1$2", m4291f = "GetChatTokensUseCase.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class GetChatTokensUseCase$invoke$$inlined$filter$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18604a;

    /* JADX INFO: renamed from: b */
    public int f18605b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3475pw f18606c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetChatTokensUseCase$invoke$$inlined$filter$1$2$1(C3475pw c3475pw, Continuation continuation) {
        super(continuation);
        this.f18606c = c3475pw;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18604a = obj;
        this.f18605b |= Integer.MIN_VALUE;
        return this.f18606c.emit(null, this);
    }
}
