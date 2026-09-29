package com.lingq.core.data.repository;

import com.lingq.core.database.entity.LessonEntity;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {1103, 1105, 1109, 1116, 1120, 1127, 1147, 1151}, m4293m = "updateLessonLike", m4294v = 2)
final class LessonRepositoryImpl$updateLessonLike$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15603a;

    /* JADX INFO: renamed from: b */
    public String f15604b;

    /* JADX INFO: renamed from: c */
    public LessonEntity f15605c;

    /* JADX INFO: renamed from: d */
    public int f15606d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f15607e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1295k f15608f;

    /* JADX INFO: renamed from: g */
    public int f15609g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$updateLessonLike$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15608f = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15607e = obj;
        this.f15609g |= Integer.MIN_VALUE;
        return this.f15608f.m7277g0(0, null, null, this);
    }
}
