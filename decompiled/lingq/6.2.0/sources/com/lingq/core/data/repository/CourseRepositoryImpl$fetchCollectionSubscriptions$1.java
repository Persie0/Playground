package com.lingq.core.data.repository;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.CourseRepositoryImpl", m4291f = "CourseRepositoryImpl.kt", m4292l = {189, 196}, m4293m = "fetchCollectionSubscriptions", m4294v = 2)
final class CourseRepositoryImpl$fetchCollectionSubscriptions$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15030a;

    /* JADX INFO: renamed from: b */
    public List f15031b;

    /* JADX INFO: renamed from: c */
    public int f15032c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f15033d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1290f f15034e;

    /* JADX INFO: renamed from: f */
    public int f15035f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseRepositoryImpl$fetchCollectionSubscriptions$1(C1290f c1290f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15034e = c1290f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15033d = obj;
        this.f15035f |= Integer.MIN_VALUE;
        return this.f15034e.m7178b(null, this);
    }
}
