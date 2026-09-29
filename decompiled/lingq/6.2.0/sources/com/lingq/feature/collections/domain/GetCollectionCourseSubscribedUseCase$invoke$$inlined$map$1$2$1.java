package com.lingq.feature.collections.domain;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ij2;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.domain.GetCollectionCourseSubscribedUseCase$invoke$$inlined$map$1$2", m4291f = "GetCollectionCourseSubscribedUseCase.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class GetCollectionCourseSubscribedUseCase$invoke$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f25623a;

    /* JADX INFO: renamed from: b */
    public int f25624b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ij2 f25625c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCollectionCourseSubscribedUseCase$invoke$$inlined$map$1$2$1(ij2 ij2Var, Continuation continuation) {
        super(continuation);
        this.f25625c = ij2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25623a = obj;
        this.f25624b |= Integer.MIN_VALUE;
        return this.f25625c.emit(null, this);
    }
}
