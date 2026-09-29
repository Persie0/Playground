package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {170, 172}, m4293m = "setArchived", m4294v = 2)
final class LessonRepositoryImpl$setArchived$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15489a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1295k f15490b;

    /* JADX INFO: renamed from: c */
    public int f15491c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$setArchived$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15490b = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15489a = obj;
        this.f15491c |= Integer.MIN_VALUE;
        return this.f15490b.m7261S(null, 0, false, this);
    }
}
