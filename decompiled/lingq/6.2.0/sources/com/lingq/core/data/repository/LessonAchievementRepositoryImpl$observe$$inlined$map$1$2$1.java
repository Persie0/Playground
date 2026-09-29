package com.lingq.core.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3602t8;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonAchievementRepositoryImpl$observe$$inlined$map$1$2", m4291f = "LessonAchievementRepositoryImpl.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class LessonAchievementRepositoryImpl$observe$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15312a;

    /* JADX INFO: renamed from: b */
    public int f15313b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3602t8 f15314c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonAchievementRepositoryImpl$observe$$inlined$map$1$2$1(C3602t8 c3602t8, Continuation continuation) {
        super(continuation);
        this.f15314c = c3602t8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15312a = obj;
        this.f15313b |= Integer.MIN_VALUE;
        return this.f15314c.emit(null, this);
    }
}
