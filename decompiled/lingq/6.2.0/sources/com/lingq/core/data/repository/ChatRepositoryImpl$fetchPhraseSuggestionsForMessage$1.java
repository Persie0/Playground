package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChatRepositoryImpl", m4291f = "ChatRepositoryImpl.kt", m4292l = {409, 413, 414}, m4293m = "fetchPhraseSuggestionsForMessage", m4294v = 2)
final class ChatRepositoryImpl$fetchPhraseSuggestionsForMessage$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14932a;

    /* JADX INFO: renamed from: b */
    public int f14933b;

    /* JADX INFO: renamed from: c */
    public int f14934c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f14935d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1289e f14936e;

    /* JADX INFO: renamed from: f */
    public int f14937f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRepositoryImpl$fetchPhraseSuggestionsForMessage$1(C1289e c1289e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14936e = c1289e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14935d = obj;
        this.f14937f |= Integer.MIN_VALUE;
        return this.f14936e.m7162l(0, 0, null, this);
    }
}
