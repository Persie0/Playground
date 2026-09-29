package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChatRepositoryImpl", m4291f = "ChatRepositoryImpl.kt", m4292l = {289, 297}, m4293m = "dummyMessage", m4294v = 2)
final class ChatRepositoryImpl$dummyMessage$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14885a;

    /* JADX INFO: renamed from: b */
    public String f14886b;

    /* JADX INFO: renamed from: c */
    public String f14887c;

    /* JADX INFO: renamed from: d */
    public int f14888d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f14889e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1289e f14890f;

    /* JADX INFO: renamed from: g */
    public int f14891g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRepositoryImpl$dummyMessage$1(C1289e c1289e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14890f = c1289e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14889e = obj;
        this.f14891g |= Integer.MIN_VALUE;
        return this.f14890f.m7155e(0, null, null, null, this);
    }
}
