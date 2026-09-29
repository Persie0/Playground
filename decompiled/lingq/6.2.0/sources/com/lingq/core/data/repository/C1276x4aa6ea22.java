package com.lingq.core.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.cx0;

/* JADX INFO: renamed from: com.lingq.core.data.repository.LessonRepositoryImpl$observeLessonTokenTranslations$$inlined$map$1$2$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl$observeLessonTokenTranslations$$inlined$map$1$2", m4291f = "LessonRepositoryImpl.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class C1276x4aa6ea22 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15475a;

    /* JADX INFO: renamed from: b */
    public int f15476b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cx0 f15477c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1276x4aa6ea22(cx0 cx0Var, Continuation continuation) {
        super(continuation);
        this.f15477c = cx0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15475a = obj;
        this.f15476b |= Integer.MIN_VALUE;
        return this.f15477c.emit(null, this);
    }
}
