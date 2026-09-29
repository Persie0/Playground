package com.lingq.feature.reader.reader.domain;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.bn3;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.domain.ObserveCourseImageUseCase$invoke$$inlined$map$1$2", m4291f = "ObserveCourseImageUseCase.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ObserveCourseImageUseCase$invoke$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30265a;

    /* JADX INFO: renamed from: b */
    public int f30266b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bn3 f30267c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveCourseImageUseCase$invoke$$inlined$map$1$2$1(bn3 bn3Var, Continuation continuation) {
        super(continuation);
        this.f30267c = bn3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30265a = obj;
        this.f30266b |= Integer.MIN_VALUE;
        return this.f30267c.emit(null, this);
    }
}
