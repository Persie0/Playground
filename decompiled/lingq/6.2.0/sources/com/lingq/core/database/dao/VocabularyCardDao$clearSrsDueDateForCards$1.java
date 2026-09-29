package com.lingq.core.database.dao;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.database.dao.VocabularyCardDao", m4291f = "VocabularyCardDao.kt", m4292l = {629, 631}, m4293m = "clearSrsDueDateForCards", m4294v = 2)
final class VocabularyCardDao$clearSrsDueDateForCards$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16992a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f16993b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC1323k f16994c;

    /* JADX INFO: renamed from: d */
    public int f16995d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyCardDao$clearSrsDueDateForCards$1(AbstractC1323k abstractC1323k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16994c = abstractC1323k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16993b = obj;
        this.f16995d |= Integer.MIN_VALUE;
        return this.f16994c.m7516y0(null, null, this);
    }
}
