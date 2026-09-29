package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.ResultLesson;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {1474, 1483, 1497, 1499}, m4293m = "importYoutubeLesson", m4294v = 2)
final class LessonRepositoryImpl$importYoutubeLesson$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15437a;

    /* JADX INFO: renamed from: b */
    public String f15438b;

    /* JADX INFO: renamed from: c */
    public String f15439c;

    /* JADX INFO: renamed from: d */
    public String f15440d;

    /* JADX INFO: renamed from: e */
    public Integer f15441e;

    /* JADX INFO: renamed from: f */
    public List f15442f;

    /* JADX INFO: renamed from: g */
    public ResultLesson f15443g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f15444h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1295k f15445i;

    /* JADX INFO: renamed from: j */
    public int f15446j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$importYoutubeLesson$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15445i = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15444h = obj;
        this.f15446j |= Integer.MIN_VALUE;
        return this.f15445i.m7250H(null, null, null, null, null, null, null, this);
    }
}
