package com.lingq.core.data.repository;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.WordRepositoryImpl", m4291f = "WordRepositoryImpl.kt", m4292l = {208, 212, 214}, m4293m = "updateWordsMoveAllKnown", m4294v = 2)
final class WordRepositoryImpl$updateWordsMoveAllKnown$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16437a;

    /* JADX INFO: renamed from: b */
    public String f16438b;

    /* JADX INFO: renamed from: c */
    public Iterator f16439c;

    /* JADX INFO: renamed from: d */
    public List f16440d;

    /* JADX INFO: renamed from: e */
    public int f16441e;

    /* JADX INFO: renamed from: f */
    public int f16442f;

    /* JADX INFO: renamed from: g */
    public int f16443g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f16444h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1310z f16445i;

    /* JADX INFO: renamed from: j */
    public int f16446j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WordRepositoryImpl$updateWordsMoveAllKnown$1(C1310z c1310z, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16445i = c1310z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16444h = obj;
        this.f16446j |= Integer.MIN_VALUE;
        return this.f16445i.m7430i(null, 0, null, this);
    }
}
