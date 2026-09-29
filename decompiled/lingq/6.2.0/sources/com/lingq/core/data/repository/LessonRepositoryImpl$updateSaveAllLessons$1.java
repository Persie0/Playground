package com.lingq.core.data.repository;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {1750, 1752}, m4293m = "updateSaveAllLessons", m4294v = 2)
final class LessonRepositoryImpl$updateSaveAllLessons$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f15675a;

    /* JADX INFO: renamed from: b */
    public int f15676b;

    /* JADX INFO: renamed from: c */
    public int f15677c;

    /* JADX INFO: renamed from: d */
    public String f15678d;

    /* JADX INFO: renamed from: e */
    public Iterator f15679e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f15680f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1295k f15681g;

    /* JADX INFO: renamed from: h */
    public int f15682h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$updateSaveAllLessons$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15681g = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15680f = obj;
        this.f15682h |= Integer.MIN_VALUE;
        return this.f15681g.m7295p0(0, 0, null, this);
    }
}
