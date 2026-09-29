package com.lingq.core.data.repository;

import com.lingq.core.database.entity.LessonEntity;
import com.lingq.core.database.entity.LibraryCounterEntity;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.u85;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {1192, 1195, 1197, 1240, 1248, 1257, 1276, 1278, 1310, 1318}, m4293m = "updateLessonStats", m4294v = 2)
final class LessonRepositoryImpl$updateLessonStats$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: H */
    public double f15654H;

    /* JADX INFO: renamed from: I */
    public double f15655I;

    /* JADX INFO: renamed from: J */
    public double f15656J;

    /* JADX INFO: renamed from: K */
    public double f15657K;

    /* JADX INFO: renamed from: L */
    public double f15658L;

    /* JADX INFO: renamed from: M */
    public boolean f15659M;

    /* JADX INFO: renamed from: N */
    public /* synthetic */ Object f15660N;

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ C1295k f15661O;

    /* JADX INFO: renamed from: P */
    public int f15662P;

    /* JADX INFO: renamed from: a */
    public String f15663a;

    /* JADX INFO: renamed from: b */
    public LessonEntity f15664b;

    /* JADX INFO: renamed from: c */
    public u85 f15665c;

    /* JADX INFO: renamed from: d */
    public Object f15666d;

    /* JADX INFO: renamed from: e */
    public LibraryCounterEntity f15667e;

    /* JADX INFO: renamed from: f */
    public int f15668f;

    /* JADX INFO: renamed from: g */
    public int f15669g;

    /* JADX INFO: renamed from: h */
    public double f15670h;

    /* JADX INFO: renamed from: i */
    public double f15671i;

    /* JADX INFO: renamed from: j */
    public double f15672j;

    /* JADX INFO: renamed from: k */
    public double f15673k;

    /* JADX INFO: renamed from: l */
    public double f15674l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$updateLessonStats$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15661O = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15660N = obj;
        this.f15662P |= Integer.MIN_VALUE;
        return this.f15661O.m7293o0(null, 0, 0.0d, 0.0d, false, this);
    }
}
