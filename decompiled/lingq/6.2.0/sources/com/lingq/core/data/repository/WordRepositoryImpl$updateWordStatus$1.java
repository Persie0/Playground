package com.lingq.core.data.repository;

import com.lingq.core.database.entity.WordEntity;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.WordRepositoryImpl", m4291f = "WordRepositoryImpl.kt", m4292l = {128, 164, 195}, m4293m = "updateWordStatus", m4294v = 2)
final class WordRepositoryImpl$updateWordStatus$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16427a;

    /* JADX INFO: renamed from: b */
    public String f16428b;

    /* JADX INFO: renamed from: c */
    public String f16429c;

    /* JADX INFO: renamed from: d */
    public Ref$IntRef f16430d;

    /* JADX INFO: renamed from: e */
    public WordEntity f16431e;

    /* JADX INFO: renamed from: f */
    public int f16432f;

    /* JADX INFO: renamed from: g */
    public int f16433g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f16434h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1310z f16435i;

    /* JADX INFO: renamed from: j */
    public int f16436j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WordRepositoryImpl$updateWordStatus$1(C1310z c1310z, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16435i = c1310z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16434h = obj;
        this.f16436j |= Integer.MIN_VALUE;
        return this.f16435i.m7429h(0, null, null, null, null, this);
    }
}
