package com.lingq.core.data.repository;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {704, 711}, m4293m = "fetchAllLippDataForLesson", m4294v = 2)
final class LessonRepositoryImpl$fetchAllLippDataForLesson$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15326a;

    /* JADX INFO: renamed from: b */
    public Iterator f15327b;

    /* JADX INFO: renamed from: c */
    public int f15328c;

    /* JADX INFO: renamed from: d */
    public int f15329d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f15330e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1295k f15331f;

    /* JADX INFO: renamed from: g */
    public int f15332g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$fetchAllLippDataForLesson$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15331f = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15330e = obj;
        this.f15332g |= Integer.MIN_VALUE;
        return this.f15331f.m7288m(0, null, this);
    }
}
