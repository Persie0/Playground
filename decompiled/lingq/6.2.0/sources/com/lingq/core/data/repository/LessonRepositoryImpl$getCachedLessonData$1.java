package com.lingq.core.data.repository;

import com.lingq.core.database.entity.LessonEntity;
import com.lingq.core.domain.model.lesson.Lesson;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {644, 645, 651}, m4293m = "getCachedLessonData", m4294v = 2)
final class LessonRepositoryImpl$getCachedLessonData$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f15406a;

    /* JADX INFO: renamed from: b */
    public LessonEntity f15407b;

    /* JADX INFO: renamed from: c */
    public Lesson f15408c;

    /* JADX INFO: renamed from: d */
    public List f15409d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f15410e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1295k f15411f;

    /* JADX INFO: renamed from: g */
    public int f15412g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$getCachedLessonData$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15411f = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15410e = obj;
        this.f15412g |= Integer.MIN_VALUE;
        return this.f15411f.m7244B(0, this);
    }
}
