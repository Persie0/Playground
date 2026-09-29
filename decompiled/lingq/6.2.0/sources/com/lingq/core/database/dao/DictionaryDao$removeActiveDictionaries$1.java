package com.lingq.core.database.dao;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.database.dao.DictionaryDao", m4291f = "DictionaryDao.kt", m4292l = {120, 122}, m4293m = "removeActiveDictionaries$suspendImpl", m4294v = 2)
final class DictionaryDao$removeActiveDictionaries$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C1318f f16909a;

    /* JADX INFO: renamed from: b */
    public String f16910b;

    /* JADX INFO: renamed from: c */
    public Iterator f16911c;

    /* JADX INFO: renamed from: d */
    public int f16912d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f16913e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1318f f16914f;

    /* JADX INFO: renamed from: g */
    public int f16915g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryDao$removeActiveDictionaries$1(C1318f c1318f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16914f = c1318f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16913e = obj;
        this.f16915g |= Integer.MIN_VALUE;
        return C1318f.m7474z0(this.f16914f, null, null, this);
    }
}
