package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.ResultLesson;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChatRepositoryImpl", m4291f = "ChatRepositoryImpl.kt", m4292l = {562, 565}, m4293m = "importChat", m4294v = 2)
final class ChatRepositoryImpl$importChat$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ResultLesson f14948a;

    /* JADX INFO: renamed from: b */
    public int f14949b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f14950c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1289e f14951d;

    /* JADX INFO: renamed from: e */
    public int f14952e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRepositoryImpl$importChat$1(C1289e c1289e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14951d = c1289e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14950c = obj;
        this.f14952e |= Integer.MIN_VALUE;
        return this.f14951d.m7165o(0, null, this);
    }
}
