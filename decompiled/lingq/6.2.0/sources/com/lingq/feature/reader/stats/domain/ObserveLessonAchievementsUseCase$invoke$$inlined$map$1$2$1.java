package com.lingq.feature.reader.stats.domain;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.bn3;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.domain.ObserveLessonAchievementsUseCase$invoke$$inlined$map$1$2", m4291f = "ObserveLessonAchievementsUseCase.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ObserveLessonAchievementsUseCase$invoke$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30774a;

    /* JADX INFO: renamed from: b */
    public int f30775b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bn3 f30776c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveLessonAchievementsUseCase$invoke$$inlined$map$1$2$1(bn3 bn3Var, Continuation continuation) {
        super(continuation);
        this.f30776c = bn3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30774a = obj;
        this.f30775b |= Integer.MIN_VALUE;
        return this.f30776c.emit(null, this);
    }
}
