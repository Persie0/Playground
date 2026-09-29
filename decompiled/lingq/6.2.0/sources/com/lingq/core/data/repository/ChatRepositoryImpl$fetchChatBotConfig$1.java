package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChatRepositoryImpl", m4291f = "ChatRepositoryImpl.kt", m4292l = {768}, m4293m = "fetchChatBotConfig", m4294v = 2)
final class ChatRepositoryImpl$fetchChatBotConfig$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14892a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f14893b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1289e f14894c;

    /* JADX INFO: renamed from: d */
    public int f14895d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRepositoryImpl$fetchChatBotConfig$1(C1289e c1289e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14894c = c1289e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14893b = obj;
        this.f14895d |= Integer.MIN_VALUE;
        return this.f14894c.m7156f(null, this);
    }
}
