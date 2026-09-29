package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.Results;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.VocabularyRepositoryImpl", m4291f = "VocabularyRepositoryImpl.kt", m4292l = {221, 225, 227, 236, 254, 257, 266}, m4293m = "syncVocabularyCards", m4294v = 2)
final class VocabularyRepositoryImpl$syncVocabularyCards$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: H */
    public /* synthetic */ Object f16380H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C1308x f16381I;

    /* JADX INFO: renamed from: J */
    public int f16382J;

    /* JADX INFO: renamed from: a */
    public String f16383a;

    /* JADX INFO: renamed from: b */
    public String f16384b;

    /* JADX INFO: renamed from: c */
    public String f16385c;

    /* JADX INFO: renamed from: d */
    public Ref$ObjectRef f16386d;

    /* JADX INFO: renamed from: e */
    public Ref$ObjectRef f16387e;

    /* JADX INFO: renamed from: f */
    public Results f16388f;

    /* JADX INFO: renamed from: g */
    public List f16389g;

    /* JADX INFO: renamed from: h */
    public int f16390h;

    /* JADX INFO: renamed from: i */
    public int f16391i;

    /* JADX INFO: renamed from: j */
    public int f16392j;

    /* JADX INFO: renamed from: k */
    public boolean f16393k;

    /* JADX INFO: renamed from: l */
    public boolean f16394l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyRepositoryImpl$syncVocabularyCards$1(C1308x c1308x, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16381I = c1308x;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16380H = obj;
        this.f16382J |= Integer.MIN_VALUE;
        return this.f16381I.m7418l(null, 0, null, false, false, null, 0, this);
    }
}
