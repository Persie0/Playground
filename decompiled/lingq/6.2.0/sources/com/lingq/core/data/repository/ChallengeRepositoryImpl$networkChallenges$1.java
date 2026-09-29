package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.ResultChallenge;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChallengeRepositoryImpl", m4291f = "ChallengeRepositoryImpl.kt", m4292l = {114, 117, 119, 125, 126}, m4293m = "networkChallenges", m4294v = 2)
final class ChallengeRepositoryImpl$networkChallenges$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: H */
    public int f14804H;

    /* JADX INFO: renamed from: I */
    public /* synthetic */ Object f14805I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ C1288d f14806J;

    /* JADX INFO: renamed from: K */
    public int f14807K;

    /* JADX INFO: renamed from: a */
    public String f14808a;

    /* JADX INFO: renamed from: b */
    public String f14809b;

    /* JADX INFO: renamed from: c */
    public List f14810c;

    /* JADX INFO: renamed from: d */
    public List f14811d;

    /* JADX INFO: renamed from: e */
    public Collection f14812e;

    /* JADX INFO: renamed from: f */
    public Iterator f14813f;

    /* JADX INFO: renamed from: g */
    public ResultChallenge f14814g;

    /* JADX INFO: renamed from: h */
    public Collection f14815h;

    /* JADX INFO: renamed from: i */
    public int f14816i;

    /* JADX INFO: renamed from: j */
    public int f14817j;

    /* JADX INFO: renamed from: k */
    public int f14818k;

    /* JADX INFO: renamed from: l */
    public int f14819l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeRepositoryImpl$networkChallenges$1(C1288d c1288d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14806J = c1288d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14805I = obj;
        this.f14807K |= Integer.MIN_VALUE;
        return this.f14806J.m7139f(null, null, this);
    }
}
