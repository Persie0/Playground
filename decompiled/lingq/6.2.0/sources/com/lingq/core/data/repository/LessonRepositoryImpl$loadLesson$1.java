package com.lingq.core.data.repository;

import com.lingq.core.database.entity.LessonEntity;
import com.lingq.core.domain.model.lesson.LessonBookmark;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {190, 191, 192, 199, 200, 202, 203, 204}, m4293m = "loadLesson", m4294v = 2)
final class LessonRepositoryImpl$loadLesson$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15453a;

    /* JADX INFO: renamed from: b */
    public LessonEntity f15454b;

    /* JADX INFO: renamed from: c */
    public List f15455c;

    /* JADX INFO: renamed from: d */
    public LessonBookmark f15456d;

    /* JADX INFO: renamed from: e */
    public LessonEntity f15457e;

    /* JADX INFO: renamed from: f */
    public List f15458f;

    /* JADX INFO: renamed from: g */
    public int f15459g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f15460h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1295k f15461i;

    /* JADX INFO: renamed from: j */
    public int f15462j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$loadLesson$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15461i = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15460h = obj;
        this.f15462j |= Integer.MIN_VALUE;
        return this.f15461i.m7251I(0, null, this);
    }
}
