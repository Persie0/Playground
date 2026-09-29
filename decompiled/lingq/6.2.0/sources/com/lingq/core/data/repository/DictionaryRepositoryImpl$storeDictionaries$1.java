package com.lingq.core.data.repository;

import com.lingq.core.database.entity.DictionaryDataEntity;
import com.lingq.core.network.api.result.ResultDictionariesForUser;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.DictionaryRepositoryImpl", m4291f = "DictionaryRepositoryImpl.kt", m4292l = {103, 111, 112, 126, 127, 130, 147, 150}, m4293m = "storeDictionaries", m4294v = 2)
final class DictionaryRepositoryImpl$storeDictionaries$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: H */
    public /* synthetic */ Object f15144H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C1292h f15145I;

    /* JADX INFO: renamed from: J */
    public int f15146J;

    /* JADX INFO: renamed from: a */
    public String f15147a;

    /* JADX INFO: renamed from: b */
    public ResultDictionariesForUser f15148b;

    /* JADX INFO: renamed from: c */
    public List f15149c;

    /* JADX INFO: renamed from: d */
    public Map f15150d;

    /* JADX INFO: renamed from: e */
    public Collection f15151e;

    /* JADX INFO: renamed from: f */
    public Object f15152f;

    /* JADX INFO: renamed from: g */
    public Iterator f15153g;

    /* JADX INFO: renamed from: h */
    public Iterator f15154h;

    /* JADX INFO: renamed from: i */
    public DictionaryDataEntity f15155i;

    /* JADX INFO: renamed from: j */
    public Collection f15156j;

    /* JADX INFO: renamed from: k */
    public int f15157k;

    /* JADX INFO: renamed from: l */
    public int f15158l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryRepositoryImpl$storeDictionaries$1(C1292h c1292h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15145I = c1292h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15144H = obj;
        this.f15146J |= Integer.MIN_VALUE;
        return this.f15145I.m7203i(null, null, this);
    }
}
