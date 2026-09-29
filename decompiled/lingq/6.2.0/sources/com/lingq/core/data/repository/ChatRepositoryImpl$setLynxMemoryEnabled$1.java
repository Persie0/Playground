package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChatRepositoryImpl", m4291f = "ChatRepositoryImpl.kt", m4292l = {736}, m4293m = "setLynxMemoryEnabled", m4294v = 2)
final class ChatRepositoryImpl$setLynxMemoryEnabled$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15001a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1289e f15002b;

    /* JADX INFO: renamed from: c */
    public int f15003c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRepositoryImpl$setLynxMemoryEnabled$1(C1289e c1289e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15002b = c1289e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15001a = obj;
        this.f15003c |= Integer.MIN_VALUE;
        return this.f15002b.m7172v(null, false, this);
    }
}
