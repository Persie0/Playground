package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.FastSearchResult;
import com.lingq.core.network.api.result.ResultFastSearch;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.SearchRepositoryImpl", m4291f = "SearchRepositoryImpl.kt", m4292l = {182, 183, 204, 249, 254, 266, 314}, m4293m = "networkFastSearch", m4294v = 2)
final class SearchRepositoryImpl$networkFastSearch$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C1305u f16099H;

    /* JADX INFO: renamed from: I */
    public int f16100I;

    /* JADX INFO: renamed from: a */
    public String f16101a;

    /* JADX INFO: renamed from: b */
    public String f16102b;

    /* JADX INFO: renamed from: c */
    public String f16103c;

    /* JADX INFO: renamed from: d */
    public ResultFastSearch f16104d;

    /* JADX INFO: renamed from: e */
    public List f16105e;

    /* JADX INFO: renamed from: f */
    public List f16106f;

    /* JADX INFO: renamed from: g */
    public List f16107g;

    /* JADX INFO: renamed from: h */
    public Iterator f16108h;

    /* JADX INFO: renamed from: i */
    public FastSearchResult f16109i;

    /* JADX INFO: renamed from: j */
    public int f16110j;

    /* JADX INFO: renamed from: k */
    public int f16111k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object f16112l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRepositoryImpl$networkFastSearch$1(C1305u c1305u, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16099H = c1305u;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16112l = obj;
        this.f16100I |= Integer.MIN_VALUE;
        return this.f16099H.m7372c(null, null, this);
    }
}
