package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChatRepositoryImpl", m4291f = "ChatRepositoryImpl.kt", m4292l = {436, 441}, m4293m = "fetchChatSuggestions", m4294v = 2)
final class ChatRepositoryImpl$fetchChatSuggestions$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14903a;

    /* JADX INFO: renamed from: b */
    public Integer f14904b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f14905c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1289e f14906d;

    /* JADX INFO: renamed from: e */
    public int f14907e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRepositoryImpl$fetchChatSuggestions$1(C1289e c1289e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14906d = c1289e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14905c = obj;
        this.f14907e |= Integer.MIN_VALUE;
        return this.f14906d.m7158h(null, null, this);
    }
}
