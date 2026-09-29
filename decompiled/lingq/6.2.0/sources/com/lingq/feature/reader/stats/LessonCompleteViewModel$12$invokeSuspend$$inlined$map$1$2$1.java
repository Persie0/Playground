package com.lingq.feature.reader.stats;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.bn3;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$12$invokeSuspend$$inlined$map$1$2", m4291f = "LessonCompleteViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class LessonCompleteViewModel$12$invokeSuspend$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30543a;

    /* JADX INFO: renamed from: b */
    public int f30544b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bn3 f30545c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$12$invokeSuspend$$inlined$map$1$2$1(bn3 bn3Var, Continuation continuation) {
        super(continuation);
        this.f30545c = bn3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30543a = obj;
        this.f30544b |= Integer.MIN_VALUE;
        return this.f30545c.emit(null, this);
    }
}
