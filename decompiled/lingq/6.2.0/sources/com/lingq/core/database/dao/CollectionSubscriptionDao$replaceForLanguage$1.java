package com.lingq.core.database.dao;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.database.dao.CollectionSubscriptionDao", m4291f = "CollectionSubscriptionDao.kt", m4292l = {32, 33}, m4293m = "replaceForLanguage$suspendImpl", m4294v = 2)
final class CollectionSubscriptionDao$replaceForLanguage$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C1316d f16872a;

    /* JADX INFO: renamed from: b */
    public List f16873b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f16874c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1316d f16875d;

    /* JADX INFO: renamed from: e */
    public int f16876e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionSubscriptionDao$replaceForLanguage$1(C1316d c1316d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16875d = c1316d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16874c = obj;
        this.f16876e |= Integer.MIN_VALUE;
        return C1316d.m7465z0(this.f16875d, null, null, this);
    }
}
