package com.lingq.core.data.repository;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChatRepositoryImpl", m4291f = "ChatRepositoryImpl.kt", m4292l = {314, 318, 319}, m4293m = "searchChats", m4294v = 2)
final class ChatRepositoryImpl$searchChats$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14990a;

    /* JADX INFO: renamed from: b */
    public List f14991b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f14992c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1289e f14993d;

    /* JADX INFO: renamed from: e */
    public int f14994e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRepositoryImpl$searchChats$1(C1289e c1289e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14993d = c1289e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14992c = obj;
        this.f14994e |= Integer.MIN_VALUE;
        return this.f14993d.m7169s(null, null, this);
    }
}
