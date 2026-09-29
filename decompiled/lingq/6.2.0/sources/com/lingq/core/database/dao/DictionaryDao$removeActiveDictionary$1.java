package com.lingq.core.database.dao;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.database.dao.DictionaryDao", m4291f = "DictionaryDao.kt", m4292l = {114, 115}, m4293m = "removeActiveDictionary$suspendImpl", m4294v = 2)
final class DictionaryDao$removeActiveDictionary$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C1318f f16916a;

    /* JADX INFO: renamed from: b */
    public String f16917b;

    /* JADX INFO: renamed from: c */
    public int f16918c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f16919d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1318f f16920e;

    /* JADX INFO: renamed from: f */
    public int f16921f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryDao$removeActiveDictionary$1(C1318f c1318f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16920e = c1318f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16919d = obj;
        this.f16921f |= Integer.MIN_VALUE;
        return C1318f.m7473B0(this.f16920e, 0, null, this);
    }
}
