package com.lingq.feature.reader.reader.domain;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.bn3;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.domain.ObserveCourseSubscriptionStateUseCase$invoke$$inlined$map$1$2", m4291f = "ObserveCourseSubscriptionStateUseCase.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ObserveCourseSubscriptionStateUseCase$invoke$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30268a;

    /* JADX INFO: renamed from: b */
    public int f30269b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bn3 f30270c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveCourseSubscriptionStateUseCase$invoke$$inlined$map$1$2$1(bn3 bn3Var, Continuation continuation) {
        super(continuation);
        this.f30270c = bn3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30268a = obj;
        this.f30269b |= Integer.MIN_VALUE;
        return this.f30270c.emit(null, this);
    }
}
