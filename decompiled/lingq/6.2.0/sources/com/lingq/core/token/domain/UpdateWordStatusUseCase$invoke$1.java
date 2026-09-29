package com.lingq.core.token.domain;

import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.domain.UpdateWordStatusUseCase", m4291f = "UpdateWordStatusUseCase.kt", m4292l = {14}, m4293m = "invoke-yxL6bBk", m4294v = 2)
final class UpdateWordStatusUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f23851a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f23852b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1904a f23853c;

    /* JADX INFO: renamed from: d */
    public int f23854d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateWordStatusUseCase$invoke$1(C1904a c1904a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23853c = c1904a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23852b = obj;
        this.f23854d |= Integer.MIN_VALUE;
        Serializable serializableM8713d = this.f23853c.m8713d(0, null, null, null, this);
        return serializableM8713d == CoroutineSingletons.COROUTINE_SUSPENDED ? serializableM8713d : new Result(serializableM8713d);
    }
}
