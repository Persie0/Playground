package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.ResultLipp;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {2604, 2625, 2649, 2657, 2698, 2710}, m4293m = "fetchLippData", m4294v = 2)
final class LessonRepositoryImpl$fetchLippData$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: H */
    public int f15381H;

    /* JADX INFO: renamed from: a */
    public String f15382a;

    /* JADX INFO: renamed from: b */
    public ResultLipp f15383b;

    /* JADX INFO: renamed from: c */
    public String f15384c;

    /* JADX INFO: renamed from: d */
    public Map f15385d;

    /* JADX INFO: renamed from: e */
    public LinkedHashMap f15386e;

    /* JADX INFO: renamed from: f */
    public int f15387f;

    /* JADX INFO: renamed from: g */
    public int f15388g;

    /* JADX INFO: renamed from: h */
    public int f15389h;

    /* JADX INFO: renamed from: i */
    public int f15390i;

    /* JADX INFO: renamed from: j */
    public int f15391j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f15392k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C1295k f15393l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$fetchLippData$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15393l = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15392k = obj;
        this.f15381H |= Integer.MIN_VALUE;
        return this.f15393l.m7305y(null, 0, 0, 0, this);
    }
}
